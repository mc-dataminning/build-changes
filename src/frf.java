import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frf(int b) implements frd {
   public static final MapCodec<frf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(frf::b)).apply($$0, frf::new));

   public frf() {
      this(dcj.c.a());
   }

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      dcj $$3 = $$0.a(kk.L);
      return $$3 != null ? axw.f($$3.a()) : axw.f(this.b);
   }

   @Override
   public MapCodec<frf> a() {
      return a;
   }
}
