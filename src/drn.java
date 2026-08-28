import com.mojang.serialization.MapCodec;

public class drn extends dlz {
   public static final MapCodec<drn> b = b(drn::new);
   private static final xv c = xv.c("container.upgrade");

   @Override
   public MapCodec<drn> a() {
      return b;
   }

   protected drn(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return new btm(($$2x, $$3, $$4) -> new cux($$2x, $$3, ctk.a($$1, $$2)), c);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.aF);
      }

      return bte.a;
   }
}
