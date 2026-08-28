import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eys(dck b) implements eyu {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dck.b.fieldOf("amount").forGetter(eys::c)).apply($$0, eys::new));

   @Override
   public float b(eun $$0) {
      int $$1 = $$0.b(exj.k);
      return this.b.a($$1);
   }

   @Override
   public eyt b() {
      return eyv.g;
   }

   public static eys a(dck $$0) {
      return new eys($$0);
   }

   public dck c() {
      return this.b;
   }
}
