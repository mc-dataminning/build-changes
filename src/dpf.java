import com.mojang.serialization.MapCodec;

public class dpf extends doj {
   public static final MapCodec<dpf> a = b(dpf::new);
   private static final xv b = xv.c("container.loom");

   @Override
   public MapCodec<dpf> a() {
      return a;
   }

   protected dpf(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.ax);
      }

      return bti.a;
   }

   @Override
   protected btk b(dxu $$0, dhh $$1, jh $$2) {
      return new btq(($$2x, $$3, $$4) -> new cui($$2x, $$3, cto.a($$1, $$2)), b);
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(aF);
   }
}
