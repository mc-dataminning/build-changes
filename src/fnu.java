import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fnu(int b) implements fnq {
   public static final MapCodec<fnu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fnu::b)).apply($$0, fnu::new));

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      if ($$2 != null) {
         fde $$3 = $$2.cq();
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
   public MapCodec<fnu> a() {
      return a;
   }
}
