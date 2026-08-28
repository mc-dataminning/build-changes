import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dhm {
   public static final MapCodec<dmv> a = b(dmv::new);
   public static final dvq<dvt> b = dvi.bf;
   public static final dvj c = dvi.w;
   public static final dvs d = dvi.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvt.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dus b(dek $$0, jf $$1, dus $$2) {
      dvt $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dvt $$4 = $$0.a_($$1.e()).E();
         dvt $$5 = $$4.e() ? dvt.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dus a(czn $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      boolean $$6 = $$1.o() == jk.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable btr $$0, dus $$1, dej $$2, jf $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dzp.H, $$3);
      }
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      return (brs)($$0.a(axe.bk) && $$6.c() == jk.b ? brs.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if (!$$1.B) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awq.ag);
      }

      return brs.a;
   }

   @Override
   protected void a_(dus $$0, dej $$1, jf $$2, cnx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awq.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dus $$0, dej $$1, jf $$2, int $$3, int $$4) {
      dvt $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lo.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jo<awf> $$10;
      if ($$5.d()) {
         ale $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jo.a(awf.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awh.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ale a(dej $$0, jf $$1) {
      return $$0.c_($$1.d()) instanceof dtj $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d);
   }
}
