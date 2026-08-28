import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fst(int b) implements fsp {
   public static final MapCodec<fst> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.i.fieldOf("default").forGetter(fst::b)).apply($$0, fst::new));

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      if ($$2 != null) {
         fgz $$3 = $$2.cq();
         if ($$3 != null) {
            o $$4 = $$3.o();
            if ($$4.f() != null) {
               return aya.f($$4.f());
            }
         }
      }

      return aya.f(this.b);
   }

   @Override
   public MapCodec<fst> a() {
      return a;
   }
}
