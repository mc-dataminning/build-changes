import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpm(int b, int c) implements fpq {
   public static final MapCodec<fpm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.l.optionalFieldOf("index", 0).forGetter(fpm::b), ays.i.fieldOf("default").forGetter(fpm::c)).apply($$0, fpm::new)
   );

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      dbb $$3 = $$0.a(kj.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axu.f($$4);
         }
      }

      return axu.f(this.c);
   }

   @Override
   public MapCodec<fpm> a() {
      return a;
   }
}
