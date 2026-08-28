import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpw extends dkl {
   public static final MapCodec<dpw> a = b(dpw::new);
   public static final dyr<dyu> b = dyk.bg;
   public static final dyl c = dyk.x;
   public static final dyt d = dyk.aS;
   public static final int e = 3;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   public dpw(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyu.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dxu b(dhk $$0, jh $$1, dxu $$2) {
      dyu $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dyu $$4 = $$0.a_($$1.e()).E();
         dyu $$5 = $$4.e() ? dyu.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dxu a(dbf $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      boolean $$8 = $$4.o() == jm.a.b;
      return $$8 ? this.b($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bvj $$0, dxu $$1, dhh $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ecq.H, $$3);
      }
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      return (bti)($$0.a(ayd.by) && $$6.c() == jm.b ? bti.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axp.ag);
      }

      return bti.a;
   }

   @Override
   protected void a_(dxu $$0, dhh $$1, jh $$2, cpw $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axp.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dxu $$0, dhh $$1, jh $$2, int $$3, int $$4) {
      dyu $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ls.ab, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jq<axe> $$10;
      if ($$5.d()) {
         alz $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jq.a(axe.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, axg.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alz a(dhh $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof dwl $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c, d);
   }
}
