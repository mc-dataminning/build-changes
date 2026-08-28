import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dko extends dff {
   public static final MapCodec<dko> a = b(dko::new);
   public static final dtf<dti> b = dsx.bf;
   public static final dsy c = dsx.w;
   public static final dth d = dsx.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dko> a() {
      return a;
   }

   public dko(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dti.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dsh b(dce $$0, ja $$1, dsh $$2) {
      dti $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dti $$4 = $$0.a_($$1.d()).A();
         dti $$5 = $$4.e() ? dti.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dsh a(cxk $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      boolean $$6 = $$1.o() == jf.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsd $$0, dsh $$1, dcd $$2, ja $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dxa.H, $$3);
      }
   }

   @Override
   protected bqf a(cua $$0, dsh $$1, dcd $$2, ja $$3, cmh $$4, bqc $$5, evv $$6) {
      return $$0.a(awd.bg) && $$6.b() == jf.b ? bqf.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         return bqd.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avp.ag);
         return bqd.c;
      }
   }

   @Override
   protected void a_(dsh $$0, dcd $$1, ja $$2, cmh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avp.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dsh $$0, dcd $$1, ja $$2, int $$3, int $$4) {
      dti $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lj.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jj<ave> $$10;
      if ($$5.d()) {
         akk $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jj.a(ave.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avg.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akk a(dcd $$0, ja $$1) {
      return $$0.c_($$1.c()) instanceof dqz $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d);
   }
}
