import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ezu(ddg b) implements ezw {
   public static final MapCodec<ezu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddg.b.fieldOf("amount").forGetter(ezu::c)).apply($$0, ezu::new));

   @Override
   public float b(evr $$0) {
      int $$1 = $$0.b(eyl.k);
      return this.b.a($$1);
   }

   @Override
   public ezv b() {
      return ezx.g;
   }

   public static ezu a(ddg $$0) {
      return new ezu($$0);
   }

   public ddg c() {
      return this.b;
   }
}
