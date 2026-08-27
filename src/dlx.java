import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlx implements dlp {
   public static final Codec<dlx> a = RecordCodecBuilder.create($$0 -> $$0.group(dlp.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dlx::new));
   private final dlp e;

   public dlx(dlp $$0) {
      this.e = $$0;
   }

   public boolean a(cqf $$0, gu $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dlq<?> a() {
      return dlq.k;
   }
}
