import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbx(dbu c) implements dcg {
   public static final MapCodec<dbx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbu.b.fieldOf("value").forGetter(dbx::b)).apply($$0, dbx::new));

   @Override
   public float a(int $$0, azn $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbu b() {
      return this.c;
   }
}
