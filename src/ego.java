import com.mojang.serialization.Codec;

public class ego extends egp {
   public static final Codec<ego> a = Codec.unit(() -> ego.b);
   public static final ego b = new ego();

   private ego() {
   }

   @Override
   public boolean a(ib $$0, ib $$1, ib $$2, axd $$3) {
      return true;
   }

   @Override
   protected egq<?> a() {
      return egq.a;
   }
}
