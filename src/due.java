import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class due extends dug {
   public static final Codec<due> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, due::new));

   public due(jg $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dnb $$0) {
      return $$0.r();
   }

   @Override
   public dtw<?> a() {
      return dtw.f;
   }
}
