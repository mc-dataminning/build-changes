import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmt(int b) implements fmr {
   public static final MapCodec<fmt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.i.fieldOf("default").forGetter(fmt::b)).apply($$0, fmt::new));

   public fmt() {
      this(czj.c.a());
   }

   @Override
   public int a(cwn $$0) {
      czj $$1 = $$0.a(kv.K);
      return $$1 != null ? axj.f($$1.a()) : axj.f(this.b);
   }

   @Override
   public MapCodec<fmt> a() {
      return a;
   }
}
