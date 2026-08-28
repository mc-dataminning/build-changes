import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmw(int b) implements fmt {
   public static final MapCodec<fmw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmw::b)).apply($$0, fmw::new));

   public fmw() {
      this(-13083194);
   }

   @Override
   public int a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2) {
      cyo $$3 = $$0.a(kv.Q);
      return $$3 != null ? axk.f($$3.a(this.b)) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmw> a() {
      return a;
   }
}
