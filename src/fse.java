import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fse(int b) implements fsa {
   public static final MapCodec<fse> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.i.fieldOf("default").forGetter(fse::b)).apply($$0, fse::new));

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      if ($$2 != null) {
         fhj $$3 = $$2.cq();
         if ($$3 != null) {
            o $$4 = $$3.o();
            if ($$4.f() != null) {
               return ayh.f($$4.f());
            }
         }
      }

      return ayh.f(this.b);
   }

   @Override
   public MapCodec<fse> a() {
      return a;
   }
}
