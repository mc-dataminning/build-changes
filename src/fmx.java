import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmx(int b) implements fmt {
   public static final MapCodec<fmx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmx::b)).apply($$0, fmx::new));

   @Override
   public int a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2) {
      if ($$2 != null) {
         fch $$3 = $$2.cr();
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
   public MapCodec<fmx> a() {
      return a;
   }
}
