import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmv(int b) implements fms {
   public static final MapCodec<fmv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmv::b)).apply($$0, fmv::new));

   public fmv() {
      this(-13083194);
   }

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      cyn $$3 = $$0.a(kv.Q);
      return $$3 != null ? axk.f($$3.a(this.b)) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmv> a() {
      return a;
   }
}
