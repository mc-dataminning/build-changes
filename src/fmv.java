import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmv(int b) implements fmt {
   public static final MapCodec<fmv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmv::b)).apply($$0, fmv::new));

   public fmv() {
      this(czl.c.a());
   }

   @Override
   public int a(cwp $$0) {
      czl $$1 = $$0.a(kv.K);
      return $$1 != null ? axk.f($$1.a()) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmv> a() {
      return a;
   }
}
