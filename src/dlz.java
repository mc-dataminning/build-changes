import com.mojang.serialization.MapCodec;

public class dlz extends dke {
   public static final MapCodec<dlz> a = b(dlz::new);
   private static final xv b = xv.c("container.crafting");

   @Override
   public MapCodec<? extends dlz> a() {
      return a;
   }

   protected dlz(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(axp.an);
      }

      return bte.a;
   }

   @Override
   protected btg b(dxn $$0, dha $$1, jh $$2) {
      return new btm(($$2x, $$3, $$4) -> new ctq($$2x, $$3, ctk.a($$1, $$2)), b);
   }
}
