import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frb(int b) implements fqy {
   public static final MapCodec<frb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(frb::b)).apply($$0, frb::new));

   public frb() {
      this(-13083194);
   }

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      dbg $$3 = $$0.a(kk.R);
      return $$3 != null ? axw.f($$3.a(this.b)) : axw.f(this.b);
   }

   @Override
   public MapCodec<frb> a() {
      return a;
   }
}
