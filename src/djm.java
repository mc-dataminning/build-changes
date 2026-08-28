import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djm extends dnj {
   public static final MapCodec<djm> a = b(djm::new);
   public static final dys<jm> b = dok.aF;
   private static final fcs c = dkm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fcs d = dkm.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fcs e = dkm.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fcs f = dkm.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fcs g = dkm.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fcs h = dkm.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fcs i = dkm.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fcs j = fcp.a(c, d, e, f);
   private static final fcs k = fcp.a(c, g, h, i);
   private static final xv l = xv.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   public djm(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxv a(dbg $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aC);
      }

      return btj.a;
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return new btr(($$2x, $$3, $$4) -> new ctf($$2x, $$3, ctp.a($$1, $$2)), l);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(cma $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, dxv $$3, cma $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dhi $$0, jh $$1, cma $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bua a(bvk $$0) {
      return $$0.dX().b($$0);
   }

   @Nullable
   public static dxv e(dxv $$0) {
      if ($$0.a(dko.hi)) {
         return dko.hj.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dko.hj) ? dko.hk.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }

   @Override
   public int b(dxv $$0, dgn $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
