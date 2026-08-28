import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frg(int b) implements frd {
   public static final MapCodec<frg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(frg::b)).apply($$0, frg::new));

   public frg() {
      this(-13083194);
   }

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      dbj $$3 = $$0.a(kk.R);
      return $$3 != null ? axw.f($$3.a(this.b)) : axw.f(this.b);
   }

   @Override
   public MapCodec<frg> a() {
      return a;
   }
}
