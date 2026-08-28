import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcc(dbz c) implements dcl {
   public static final MapCodec<dcc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbz.b.fieldOf("value").forGetter(dcc::b)).apply($$0, dcc::new));

   @Override
   public float a(int $$0, azs $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dcc> a() {
      return a;
   }

   public dbz b() {
      return this.c;
   }
}
