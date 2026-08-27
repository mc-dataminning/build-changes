import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class doh extends doj {
   public static final Codec<doh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, doh::new));

   public doh(iw $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dhi $$0) {
      return $$0.r();
   }

   @Override
   public dnz<?> a() {
      return dnz.f;
   }
}
