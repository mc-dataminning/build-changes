import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dcn(dbr c) implements dcd {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbr.b.fieldOf("value").forGetter(dcn::b)).apply($$0, dcn::new));

   @Override
   public float a(int $$0, azl $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dbr b() {
      return this.c;
   }
}
