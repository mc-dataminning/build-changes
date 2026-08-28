import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dse extends dke {
   public static final MapCodec<dse> a = b(dse::new);
   private static final xv d = xv.c("container.stonecutter");
   public static final dyk<jm> b = doc.aF;
   protected static final fcm c = dke.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   @Override
   public MapCodec<dse> a() {
      return a;
   }

   public dse(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c));
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.ay);
      }

      return bte.a;
   }

   @Nullable
   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return new btm(($$2x, $$3, $$4) -> new cva($$2x, $$3, ctk.a($$1, $$2)), d);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return c;
   }

   @Override
   protected boolean g_(dxn $$0) {
      return true;
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
