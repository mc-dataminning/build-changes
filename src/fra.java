import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fra(int b) implements fqy {
   public static final MapCodec<fra> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fra::b)).apply($$0, fra::new));

   public fra() {
      this(dcg.c.a());
   }

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      dcg $$3 = $$0.a(kk.L);
      return $$3 != null ? axw.f($$3.a()) : axw.f(this.b);
   }

   @Override
   public MapCodec<fra> a() {
      return a;
   }
}
