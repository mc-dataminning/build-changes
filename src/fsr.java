import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsr(int b) implements fsp {
   public static final MapCodec<fsr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.i.fieldOf("default").forGetter(fsr::b)).apply($$0, fsr::new));

   public fsr() {
      this(dcw.c.a());
   }

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      dcw $$3 = $$0.a(kl.L);
      return $$3 != null ? aya.f($$3.a()) : aya.f(this.b);
   }

   @Override
   public MapCodec<fsr> a() {
      return a;
   }
}
