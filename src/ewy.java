import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ewy(dbd b) implements exa {
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("amount").forGetter(ewy::c)).apply($$0, ewy::new));

   @Override
   public float b(est $$0) {
      int $$1 = $$0.b(evp.k);
      return this.b.a($$1);
   }

   @Override
   public ewz b() {
      return exb.g;
   }

   public static ewy a(dbd $$0) {
      return new ewy($$0);
   }

   public dbd c() {
      return this.b;
   }
}
