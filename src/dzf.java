import com.mojang.serialization.Codec;

public class dzf extends dzg {
   public static final Codec<dzf> a = Codec.unit(() -> dzf.b);
   public static final dzf b = new dzf();

   private dzf() {
   }

   @Override
   public boolean a(ht $$0, ht $$1, ht $$2, ate $$3) {
      return true;
   }

   @Override
   protected dzh<?> a() {
      return dzh.a;
   }
}
