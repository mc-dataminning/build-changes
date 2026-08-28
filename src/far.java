import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record far(def b) implements fat {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(def.b.fieldOf("amount").forGetter(far::c)).apply($$0, far::new));

   @Override
   public float b(ewo $$0) {
      int $$1 = $$0.b(ezi.k);
      return this.b.a($$1);
   }

   @Override
   public fas b() {
      return fau.g;
   }

   public static far a(def $$0) {
      return new far($$0);
   }

   public def c() {
      return this.b;
   }
}
