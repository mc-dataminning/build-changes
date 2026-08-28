import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsp(int b) implements fsn {
   public static final MapCodec<fsp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.i.fieldOf("default").forGetter(fsp::b)).apply($$0, fsp::new));

   public fsp() {
      this(dcu.c.a());
   }

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      dcu $$3 = $$0.a(kk.L);
      return $$3 != null ? axy.f($$3.a()) : axy.f(this.b);
   }

   @Override
   public MapCodec<fsp> a() {
      return a;
   }
}
