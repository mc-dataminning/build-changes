import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwh extends dwj {
   public static final Codec<dwh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dwh::new));

   public dwh(jg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(doz $$0) {
      return $$0.r();
   }

   @Override
   public dvz<?> a() {
      return dvz.f;
   }
}
