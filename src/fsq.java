import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsq(int b) implements fsn {
   public static final MapCodec<fsq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.i.fieldOf("default").forGetter(fsq::b)).apply($$0, fsq::new));

   public fsq() {
      this(-13083194);
   }

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      dbu $$3 = $$0.a(kk.R);
      return $$3 != null ? axy.f($$3.a(this.b)) : axy.f(this.b);
   }

   @Override
   public MapCodec<fsq> a() {
      return a;
   }
}
