import com.mojang.serialization.MapCodec;

public class doy extends doc {
   public static final MapCodec<doy> a = b(doy::new);
   private static final xv b = xv.c("container.loom");

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   protected doy(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.ax);
      }

      return bte.a;
   }

   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return new btm(($$2x, $$3, $$4) -> new cue($$2x, $$3, ctk.a($$1, $$2)), b);
   }

   @Override
   public dxn a(dbb $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF);
   }
}
