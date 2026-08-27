import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dly implements dlq {
   public static final Codec<dly> a = RecordCodecBuilder.create($$0 -> $$0.group(dlq.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dly::new));
   private final dlq e;

   public dly(dlq $$0) {
      this.e = $$0;
   }

   public boolean a(cqg $$0, gu $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dlr<?> a() {
      return dlr.k;
   }
}
