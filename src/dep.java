import com.mojang.serialization.MapCodec;

public class dep extends dcv {
   public static final MapCodec<dep> a = b(dep::new);
   private static final ws b = ws.c("container.crafting");

   @Override
   public MapCodec<? extends dep> a() {
      return a;
   }

   protected dep(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avj.an);
         return boq.b;
      }
   }

   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return new bpa(($$2x, $$3, $$4) -> new cny($$2x, $$3, cns.a($$1, $$2)), b);
   }
}
