import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqf extends dqh {
   public static final Codec<dqf> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqf::new));

   public dqf(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(djg $$0) {
      return $$0.r();
   }

   @Override
   public dpx<?> a() {
      return dpx.f;
   }
}
