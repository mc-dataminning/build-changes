import com.mojang.serialization.MapCodec;

public class dom extends dmr {
   public static final MapCodec<dom> a = b(dom::new);
   private static final wy b = wy.c("container.crafting");

   @Override
   public MapCodec<? extends dom> a() {
      return a;
   }

   protected dom(eas.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.an);
      }

      return bug.a;
   }

   @Override
   protected bui b(eat $$0, djm $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cvy($$2x, $$3, cvs.a($$1, $$2)), b);
   }
}
