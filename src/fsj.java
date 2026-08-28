import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsj(int b, int c) implements fsn {
   public static final MapCodec<fsj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayw.l.optionalFieldOf("index", 0).forGetter(fsj::b), ayw.i.fieldOf("default").forGetter(fsj::c)).apply($$0, fsj::new)
   );

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      dch $$3 = $$0.a(kk.p);
      if ($$3 != null) {
         Integer $$4 = $$3.d(this.b);
         if ($$4 != null) {
            return axy.f($$4);
         }
      }

      return axy.f(this.c);
   }

   @Override
   public MapCodec<fsj> a() {
      return a;
   }
}
