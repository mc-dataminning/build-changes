import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eak extends eam {
   public static final Codec<eak> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eak::new));

   public eak(jv $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dtc $$0) {
      return $$0.r();
   }

   @Override
   public eac<?> a() {
      return eac.f;
   }
}
