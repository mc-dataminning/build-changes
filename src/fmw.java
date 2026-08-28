import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmw(int b) implements fmt {
   public static final MapCodec<fmw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmw::b)).apply($$0, fmw::new));

   public fmw() {
      this(-13083194);
   }

   @Override
   public int a(cwp $$0) {
      cyo $$1 = $$0.a(kv.Q);
      return $$1 != null ? axk.f($$1.a(this.b)) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmw> a() {
      return a;
   }
}
