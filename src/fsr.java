import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsr(int b) implements fsn {
   public static final MapCodec<fsr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.i.fieldOf("default").forGetter(fsr::b)).apply($$0, fsr::new));

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      if ($$2 != null) {
         fgx $$3 = $$2.cq();
         if ($$3 != null) {
            o $$4 = $$3.o();
            if ($$4.f() != null) {
               return axy.f($$4.f());
            }
         }
      }

      return axy.f(this.b);
   }

   @Override
   public MapCodec<fsr> a() {
      return a;
   }
}
