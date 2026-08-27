import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dwq extends dws {
   public static final Codec<dwq> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dwq::new));

   public dwq(ji $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dpi $$0) {
      return $$0.r();
   }

   @Override
   public dwi<?> a() {
      return dwi.f;
   }
}
