import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dpz extends dqb {
   public static final Codec<dpz> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dpz::new));

   public dpz(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dja $$0) {
      return $$0.r();
   }

   @Override
   public dpr<?> a() {
      return dpr.f;
   }
}
