import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frc(int b) implements fqy {
   public static final MapCodec<frc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(frc::b)).apply($$0, frc::new));

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      if ($$2 != null) {
         fge $$3 = $$2.cp();
         if ($$3 != null) {
            o $$4 = $$3.o();
            if ($$4.f() != null) {
               return axw.f($$4.f());
            }
         }
      }

      return axw.f(this.b);
   }

   @Override
   public MapCodec<frc> a() {
      return a;
   }
}
