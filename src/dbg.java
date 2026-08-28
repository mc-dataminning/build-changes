import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbg(dbd c) implements dbp {
   public static final MapCodec<dbg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dbd.b.fieldOf("value").forGetter(dbg::b)).apply($$0, dbg::new));

   @Override
   public float a(int $$0, azk $$1, float $$2) {
      return $$2 + this.c.a($$0);
   }

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public dbd b() {
      return this.c;
   }
}
