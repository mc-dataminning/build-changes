import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fos(int b) implements fon {
   public static final MapCodec<fos> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("default").forGetter(fos::b)).apply($$0, fos::new));

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      if ($$2 != null) {
         feb $$3 = $$2.cr();
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
   public MapCodec<fos> a() {
      return a;
   }
}
