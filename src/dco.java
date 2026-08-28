import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dco(dbz c) implements dcl {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("factor").forGetter(dco::b)).apply($$0, dco::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
      return $$2 * this.c.a($$0);
   }

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   public dbz b() {
      return this.c;
   }
}
