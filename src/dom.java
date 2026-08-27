import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dom extends doo {
   public static final Codec<dom> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dom::new));

   public dom(ja $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dhn $$0) {
      return $$0.r();
   }

   @Override
   public doe<?> a() {
      return doe.f;
   }
}
