import com.mojang.serialization.Codec;

public class ekb extends ekc {
   public static final Codec<ekb> a = Codec.unit(() -> ekb.b);
   public static final ekb b = new ekb();

   private ekb() {
   }

   @Override
   public boolean a(in $$0, in $$1, in $$2, ayg $$3) {
      return true;
   }

   @Override
   protected ekd<?> a() {
      return ekd.a;
   }
}
