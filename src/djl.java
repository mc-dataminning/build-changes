import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dni {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dyr<jm> b = doj.aF;
   private static final fcr c = dkl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fcr d = dkl.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fcr e = dkl.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fcr f = dkl.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fcr g = dkl.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fcr h = dkl.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fcr i = dkl.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fcr j = fco.a(c, d, e, f);
   private static final fcr k = fco.a(c, g, h, i);
   private static final xv l = xv.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   public djl(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aC);
      }

      return bti.a;
   }

   @Nullable
   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return new btq(($$2x, $$3, $$4) -> new cte($$2x, $$3, cto.a($$1, $$2)), l);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(clz $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, dxu $$3, clz $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dhh $$0, jh $$1, clz $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btz a(bvj $$0) {
      return $$0.dX().b($$0);
   }

   @Nullable
   public static dxu e(dxu $$0) {
      if ($$0.a(dkn.hi)) {
         return dkn.hj.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dkn.hj) ? dkn.hk.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }

   @Override
   public int b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
