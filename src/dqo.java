import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dqo extends dqq {
   public static final Codec<dqo> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dqo::new));

   public dqo(jb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(djp $$0) {
      return $$0.r();
   }

   @Override
   public dqg<?> a() {
      return dqg.f;
   }
}
