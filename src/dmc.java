import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmc extends dme {
   public static final Codec<dmc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dmc::new));

   public dmc(hy $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dfd $$0) {
      return $$0.r();
   }

   @Override
   public dlu<?> a() {
      return dlu.f;
   }
}
