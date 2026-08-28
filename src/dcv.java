import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcv(dbz c) implements dcl {
   public static final MapCodec<dcv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("value").forGetter(dcv::b)).apply($$0, dcv::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dcv> a() {
      return a;
   }

   public dbz b() {
      return this.c;
   }
}
