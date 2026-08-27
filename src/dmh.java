import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmh implements dlz {
   public static final Codec<dmh> a = RecordCodecBuilder.create($$0 -> $$0.group(dlz.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dmh::new));
   private final dlz e;

   public dmh(dlz $$0) {
      this.e = $$0;
   }

   public boolean a(cqp $$0, gw $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dma<?> a() {
      return dma.k;
   }
}
