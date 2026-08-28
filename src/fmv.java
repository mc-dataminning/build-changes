import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmv(int b) implements fmt {
   public static final MapCodec<fmv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmv::b)).apply($$0, fmv::new));

   public fmv() {
      this(czl.c.a());
   }

   @Override
   public int a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2) {
      czl $$3 = $$0.a(kv.K);
      return $$3 != null ? axk.f($$3.a()) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmv> a() {
      return a;
   }
}
