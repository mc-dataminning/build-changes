import com.mojang.serialization.MapCodec;

public class dhn extends dgr {
   public static final MapCodec<dhn> a = b(dhn::new);
   private static final ws b = ws.c("container.loom");

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   protected dhn(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avj.ax);
         return boq.b;
      }
   }

   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return new bpa(($$2x, $$3, $$4) -> new com($$2x, $$3, cns.a($$1, $$2)), b);
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE);
   }
}
