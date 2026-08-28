import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmw(int b) implements fmu {
   public static final MapCodec<fmw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmw::b)).apply($$0, fmw::new));

   public fmw() {
      this(czm.c.a());
   }

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      czm $$3 = $$0.a(kv.K);
      return $$3 != null ? axk.f($$3.a()) : axk.f(this.b);
   }

   @Override
   public MapCodec<fmw> a() {
      return a;
   }
}
