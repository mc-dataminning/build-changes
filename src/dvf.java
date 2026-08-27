import com.mojang.serialization.Codec;

public class dvf extends dvg {
   public static final Codec<dvf> a = Codec.unit(() -> dvf.b);
   public static final dvf b = new dvf();

   private dvf() {
   }

   @Override
   public boolean a(gu $$0, gu $$1, gu $$2, apf $$3) {
      return true;
   }

   @Override
   protected dvh<?> a() {
      return dvh.a;
   }
}
