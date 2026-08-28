import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmu(int b) implements fms {
   public static final MapCodec<fmu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmu::b)).apply($$0, fmu::new));

   public fmu() {
      this(czk.c.a());
   }

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      czk $$3 = $$0.a(kv.K);
      return $$3 != null ? axk.f($$3.a()) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmu> a() {
      return a;
   }
}
