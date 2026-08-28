import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fss(int b) implements fsp {
   public static final MapCodec<fss> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.i.fieldOf("default").forGetter(fss::b)).apply($$0, fss::new));

   public fss() {
      this(-13083194);
   }

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      dbw $$3 = $$0.a(kl.R);
      return $$3 != null ? aya.f($$3.a(this.b)) : aya.f(this.b);
   }

   @Override
   public MapCodec<fss> a() {
      return a;
   }
}
