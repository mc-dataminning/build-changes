import com.mojang.serialization.Codec;

public class ejc extends ejd {
   public static final Codec<ejc> a = Codec.unit(() -> ejc.b);
   public static final ejc b = new ejc();

   private ejc() {
   }

   @Override
   public boolean a(id $$0, id $$1, id $$2, axt $$3) {
      return true;
   }

   @Override
   protected eje<?> a() {
      return eje.a;
   }
}
