import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doz extends djn {
   public static final MapCodec<doz> a = b(doz::new);
   public static final dxv<dxy> b = dxo.bi;
   public static final dxp c = dxo.B;
   public static final dxx d = dxo.aU;
   public static final int e = 3;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxy.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dwy a(dgm $$0, ji $$1, dwy $$2) {
      dxy $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dxy $$4 = $$0.a_($$1.e()).E();
         dxy $$5 = $$4.e() ? dxy.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dwy a(dah $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      boolean $$8 = $$4.o() == jn.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bum $$0, dwy $$1, dgj $$2, ji $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ebu.H, $$3);
      }
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      return (bsl)($$0.a(awy.bw) && $$6.c() == jn.b ? bsl.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.ag);
      }

      return bsl.a;
   }

   @Override
   protected void a_(dwy $$0, dgj $$1, ji $$2, coy $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dwy $$0, dgj $$1, ji $$2, int $$3, int $$4) {
      dxy $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lt.ac, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jr<avz> $$10;
      if ($$5.d()) {
         akv $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jr.a(avz.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awb.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private akv a(dgj $$0, ji $$1) {
      return $$0.c_($$1.d()) instanceof dvp $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d);
   }
}
