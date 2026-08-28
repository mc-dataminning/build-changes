import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frh(int b) implements frd {
   public static final MapCodec<frh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(frh::b)).apply($$0, frh::new));

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      if ($$2 != null) {
         fgj $$3 = $$2.cp();
         if ($$3 != null) {
            o $$4 = $$3.o();
            if ($$4.f() != null) {
               return axw.f($$4.f());
            }
         }
      }

      return axw.f(this.b);
   }

   @Override
   public MapCodec<frh> a() {
      return a;
   }
}
