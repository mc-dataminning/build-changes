import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fal(ddx b) implements fan {
   public static final MapCodec<fal> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ddx.b.fieldOf("amount").forGetter(fal::c)).apply($$0, fal::new));

   @Override
   public float b(ewi $$0) {
      int $$1 = $$0.b(ezc.k);
      return this.b.a($$1);
   }

   @Override
   public fam b() {
      return fao.g;
   }

   public static fal a(ddx $$0) {
      return new fal($$0);
   }

   public ddx c() {
      return this.b;
   }
}
