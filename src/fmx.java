import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmx(int b) implements fmu {
   public static final MapCodec<fmx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmx::b)).apply($$0, fmx::new));

   public fmx() {
      this(-13083194);
   }

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      cyp $$3 = $$0.a(kv.Q);
      return $$3 != null ? axk.f($$3.a(this.b)) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmx> a() {
      return a;
   }
}
