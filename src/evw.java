import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record evw(daj b) implements evy {
   public static final MapCodec<evw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(daj.b.fieldOf("amount").forGetter(evw::c)).apply($$0, evw::new));

   @Override
   public float b(err $$0) {
      int $$1 = $$0.b(eun.k);
      return this.b.a($$1);
   }

   @Override
   public evx b() {
      return evz.g;
   }

   public static evw a(daj $$0) {
      return new evw($$0);
   }

   public daj c() {
      return this.b;
   }
}
