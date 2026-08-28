import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpp extends dke {
   public static final MapCodec<dpp> a = b(dpp::new);
   public static final dyk<dyn> b = dyd.bg;
   public static final dye c = dyd.x;
   public static final dym d = dyd.aS;
   public static final int e = 3;

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   public dpp(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyn.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dxn b(dhd $$0, jh $$1, dxn $$2) {
      dyn $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dyn $$4 = $$0.a_($$1.e()).E();
         dyn $$5 = $$4.e() ? dyn.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dxn a(dbb $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      boolean $$8 = $$4.o() == jm.a.b;
      return $$8 ? this.b($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bvf $$0, dxn $$1, dha $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ecj.H, $$3);
      }
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      return (bte)($$0.a(ayd.by) && $$6.c() == jm.b ? bte.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axp.ag);
      }

      return bte.a;
   }

   @Override
   protected void a_(dxn $$0, dha $$1, jh $$2, cps $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axp.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dxn $$0, dha $$1, jh $$2, int $$3, int $$4) {
      dyn $$5 = $$0.c(b);
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
   private alz a(dha $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof dwe $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c, d);
   }
}
