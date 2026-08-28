import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpu(int b) implements fpq {
   public static final MapCodec<fpu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fpu::b)).apply($$0, fpu::new));

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      if ($$2 != null) {
         ffd $$3 = $$2.cr();
         if ($$3 != null) {
            n $$4 = $$3.n();
            if ($$4.f() != null) {
               return axu.f($$4.f());
            }
         }
      }

      return axu.f(this.b);
   }

   @Override
   public MapCodec<fpu> a() {
      return a;
   }
}
