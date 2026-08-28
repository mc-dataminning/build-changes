import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqz(int b, int c) implements frd {
   public static final MapCodec<fqz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.l.optionalFieldOf("index", 0).forGetter(fqz::b), ayu.i.fieldOf("default").forGetter(fqz::c)).apply($$0, fqz::new)
   );

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      dbw $$3 = $$0.a(kk.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axw.f($$4);
         }
      }

      return axw.f(this.c);
   }

   @Override
   public MapCodec<fqz> a() {
      return a;
   }
}
