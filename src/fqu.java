import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqu(int b, int c) implements fqy {
   public static final MapCodec<fqu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(fqu::b), ayu.i.fieldOf("default").forGetter(fqu::c)).apply($$0, fqu::new)
   );

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      dbt $$3 = $$0.a(kk.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axw.f($$4);
         }
      }

      return axw.f(this.c);
   }

   @Override
   public MapCodec<fqu> a() {
      return a;
   }
}
