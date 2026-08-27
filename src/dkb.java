import com.mojang.serialization.MapCodec;

public class dkb extends dep {
   public static final MapCodec<dkb> b = b(dkb::new);
   private static final ws c = ws.c("container.upgrade");

   @Override
   public MapCodec<dkb> a() {
      return b;
   }

   protected dkb(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return new bpa(($$2x, $$3, $$4) -> new cpg($$2x, $$3, cns.a($$1, $$2)), c);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avj.aF);
         return boq.b;
      }
   }
}
