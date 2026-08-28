import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmu(int b) implements fmr {
   public static final MapCodec<fmu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.i.fieldOf("default").forGetter(fmu::b)).apply($$0, fmu::new));

   public fmu() {
      this(-13083194);
   }

   @Override
   public int a(cwn $$0) {
      cym $$1 = $$0.a(kv.Q);
      return $$1 != null ? axj.f($$1.a(this.b)) : axj.f(this.b);
   }

   @Override
   public MapCodec<fmu> a() {
      return a;
   }
}
