import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dms extends dhj {
   public static final MapCodec<dms> a = b(dms::new);
   public static final dvm<dvp> b = dve.bf;
   public static final dvf c = dve.w;
   public static final dvo d = dve.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dms> a() {
      return a;
   }

   public dms(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dvp.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private duo b(deh $$0, je $$1, duo $$2) {
      dvp $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dvp $$4 = $$0.a_($$1.e()).E();
         dvp $$5 = $$4.e() ? dvp.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public duo a(czk $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      boolean $$6 = $$1.o() == jj.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bto $$0, duo $$1, deg $$2, je $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dzl.H, $$3);
      }
   }

   @Override
   protected brp a(cvp $$0, duo $$1, deg $$2, je $$3, cnu $$4, bro $$5, eyo $$6) {
      return (brp)($$0.a(axc.bk) && $$6.c() == jj.b ? brp.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected brp a(duo $$0, deg $$1, je $$2, cnu $$3, eyo $$4) {
      if (!$$1.B) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awo.ag);
      }

      return brp.a;
   }

   @Override
   protected void a_(duo $$0, deg $$1, je $$2, cnu $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awo.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(duo $$0, deg $$1, je $$2, int $$3, int $$4) {
      dvp $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ln.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jn<awd> $$10;
      if ($$5.d()) {
         alc $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jn.a(awd.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awf.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private alc a(deg $$0, je $$1) {
      return $$0.c_($$1.d()) instanceof dtg $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d);
   }
}
