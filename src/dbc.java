import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbc(dah c) implements das {
   public static final MapCodec<dbc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dah.b.fieldOf("value").forGetter(dbc::b)).apply($$0, dbc::new));

   @Override
   public float a(int $$0, ayv $$1, float $$2) {
      return this.c.a($$0);
   }

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dah b() {
      return this.c;
   }
}
