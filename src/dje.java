import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends dnb {
   public static final MapCodec<dje> a = b(dje::new);
   public static final dyk<jm> b = doc.aF;
   private static final fcm c = dke.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fcm d = dke.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fcm e = dke.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fcm f = dke.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fcm g = dke.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fcm h = dke.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fcm i = dke.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fcm j = fcj.a(c, d, e, f);
   private static final fcm k = fcj.a(c, g, h, i);
   private static final xv l = xv.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aC);
      }

      return bte.a;
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return new btm(($$2x, $$3, $$4) -> new cta($$2x, $$3, ctk.a($$1, $$2)), l);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      jm $$4 = $$0.c(b);
      return $$4.o() == jm.a.a ? j : k;
   }

   @Override
   protected void a(clv $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, dxn $$3, clv $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dha $$0, jh $$1, clv $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btv a(bvf $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dxn e(dxn $$0) {
      if ($$0.a(dkg.hi)) {
         return dkg.hj.m().b(b, $$0.c(b));
      } else {
         return $$0.a(dkg.hj) ? dkg.hk.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   @Override
   public int b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
