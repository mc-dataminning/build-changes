import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record exq(dbu b) implements exs {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("amount").forGetter(exq::c)).apply($$0, exq::new));

   @Override
   public float b(etl $$0) {
      int $$1 = $$0.b(ewh.k);
      return this.b.a($$1);
   }

   @Override
   public exr b() {
      return ext.g;
   }

   public static exq a(dbu $$0) {
      return new exq($$0);
   }

   public dbu c() {
      return this.b;
   }
}
