import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlx extends dlz {
   public static final Codec<dlx> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, dlx::new));

   public dlx(ia $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dey $$0) {
      return $$0.r();
   }

   @Override
   public dlp<?> a() {
      return dlp.f;
   }
}
