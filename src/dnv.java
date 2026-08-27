import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dnv extends dnx {
   public static final Codec<dnv> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dnv::new));

   public dnv(iw $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dgw $$0) {
      return $$0.r();
   }

   @Override
   public dnn<?> a() {
      return dnn.f;
   }
}
