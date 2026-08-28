import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpx extends dkm {
   public static final MapCodec<dpx> a = b(dpx::new);
   public static final dys<dyv> b = dyl.bg;
   public static final dym c = dyl.x;
   public static final dyu d = dyl.aS;
   public static final int e = 3;

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   public dpx(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyv.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dxv b(dhl $$0, jh $$1, dxv $$2) {
      dyv $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dyv $$4 = $$0.a_($$1.e()).E();
         dyv $$5 = $$4.e() ? dyv.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dxv a(dbg $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      boolean $$8 = $$4.o() == jm.a.b;
      return $$8 ? this.b($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bvk $$0, dxv $$1, dhi $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ecr.H, $$3);
      }
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      return (btj)($$0.a(ayd.by) && $$6.c() == jm.b ? btj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axp.ag);
      }

      return btj.a;
   }

   @Override
   protected void a_(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axp.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dxv $$0, dhi $$1, jh $$2, int $$3, int $$4) {
      dyv $$5 = $$0.c(b);
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
   private alz a(dhi $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof dwm $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d);
   }
}
