import com.mojang.serialization.Codec;

public class dyn extends dyo {
   public static final Codec<dyn> a = Codec.unit(() -> dyn.b);
   public static final dyn b = new dyn();

   private dyn() {
   }

   @Override
   public boolean a(gw $$0, gw $$1, gw $$2, asc $$3) {
      return true;
   }

   @Override
   protected dyp<?> a() {
      return dyp.a;
   }
}
