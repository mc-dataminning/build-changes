import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dps extends dke {
   public static final MapCodec<dps> a = b(dps::new);
   public static final dyo<dyr> b = dyg.bi;
   public static final dyh c = dyg.A;
   public static final dyq d = dyg.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dyr.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dxq a(dhc $$0, ji $$1, dxq $$2) {
      dyr $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dyr $$4 = $$0.a_($$1.e()).E();
         dyr $$5 = $$4.e() ? dyr.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dxq a(dax $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      boolean $$8 = $$4.o() == jn.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bva $$0, dxq $$1, dgz $$2, ji $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ecp.H, $$3);
      }
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      return (bsy)($$0.a(awy.bw) && $$6.c() == jn.b ? bsy.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.ag);
      }

      return bsy.a;
   }

   @Override
   protected void a_(dxq $$0, dgz $$1, ji $$2, cpr $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dxq $$0, dgz $$1, ji $$2, int $$3, int $$4) {
      dyr $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lt.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jr<avz> $$10;
      if ($$5.d()) {
         aku $$9 = this.a($$1, $$2);
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
   private aku a(dgz $$0, ji $$1) {
      return $$0.c_($$1.d()) instanceof dwh $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }
}
