import com.mojang.serialization.Codec;

public class eit extends eiu {
   public static final Codec<eit> a = Codec.unit(() -> eit.b);
   public static final eit b = new eit();

   private eit() {
   }

   @Override
   public boolean a(ib $$0, ib $$1, ib $$2, axr $$3) {
      return true;
   }

   @Override
   protected eiv<?> a() {
      return eiv.a;
   }
}
