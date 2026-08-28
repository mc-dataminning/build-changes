import com.mojang.serialization.MapCodec;

public class dso extends dwo {
   public static final MapCodec<dso> a = b(dso::new);
   private static final fgk b = dnc.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   public dso(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(axe.aO) || $$0.a(dne.eo) || super.b($$0, $$1, $$2);
   }
}
