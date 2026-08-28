import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record foq(int b) implements fon {
   public static final MapCodec<foq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(foq::b)).apply($$0, foq::new));

   public foq() {
      this(-13083194);
   }

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      czu $$3 = $$0.a(kx.R);
      return $$3 != null ? axu.f($$3.a(this.b)) : axu.f(this.b);
   }

   @Override
   public MapCodec<foq> a() {
      return a;
   }
}
