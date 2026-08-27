import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddo extends dcv {
   public static final MapCodec<ddo> a = b(ddo::new);
   private static final ws b = ws.c("container.cartography_table");

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   protected ddo(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avj.aw);
         return boq.b;
      }
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return new bpa(($$2x, $$3, $$4) -> new cnn($$2x, $$3, cns.a($$1, $$2)), b);
   }
}
