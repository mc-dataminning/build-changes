import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmw(int b) implements fms {
   public static final MapCodec<fmw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmw::b)).apply($$0, fmw::new));

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      if ($$2 != null) {
         fcg $$3 = $$2.cr();
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
   public MapCodec<fmw> a() {
      return a;
   }
}
