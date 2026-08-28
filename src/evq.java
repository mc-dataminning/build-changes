import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evq(dah b) implements evs {
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("amount").forGetter(evq::c)).apply($$0, evq::new));

   @Override
   public float b(erl $$0) {
      int $$1 = $$0.b(euh.k);
      return this.b.a($$1);
   }

   @Override
   public evr b() {
      return evt.g;
   }

   public static evq a(dah $$0) {
      return new evq($$0);
   }

   public dah c() {
      return this.b;
   }
}
