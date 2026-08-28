import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record far(ddy b) implements fat {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddy.b.fieldOf("amount").forGetter(far::c)).apply($$0, far::new));

   @Override
   public float b(ewo $$0) {
      int $$1 = $$0.b(ezi.k);
      return this.b.a($$1);
   }

   @Override
   public fas b() {
      return fau.g;
   }

   public static far a(ddy $$0) {
      return new far($$0);
   }

   public ddy c() {
      return this.b;
   }
}
