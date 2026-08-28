import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezs(dde b) implements ezu {
   public static final MapCodec<ezs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dde.b.fieldOf("amount").forGetter(ezs::c)).apply($$0, ezs::new));

   @Override
   public float b(evp $$0) {
      int $$1 = $$0.b(eyj.k);
      return this.b.a($$1);
   }

   @Override
   public ezt b() {
      return ezv.g;
   }

   public static ezs a(dde $$0) {
      return new ezs($$0);
   }

   public dde c() {
      return this.b;
   }
}
