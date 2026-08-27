import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlz extends dmb {
   public static final Codec<dlz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dlz::new));

   public dlz(hz $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfa $$0) {
      return $$0.r();
   }

   @Override
   public dlr<?> a() {
      return dlr.f;
   }
}
