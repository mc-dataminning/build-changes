import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmy(int b) implements fmu {
   public static final MapCodec<fmy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmy::b)).apply($$0, fmy::new));

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      if ($$2 != null) {
         fci $$3 = $$2.cr();
         if ($$3 != null) {
            n $$4 = $$3.n();
            if ($$4.f() != null) {
               return axk.f($$4.f());
            }
         }
      }

      return axk.f(this.b);
   }

   @Override
   public MapCodec<fmy> a() {
      return a;
   }
}
