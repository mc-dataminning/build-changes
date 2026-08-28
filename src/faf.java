import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class faf implements fab {
   public static final MapCodec<faf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fad.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, faf::new)
   );
   public static final Codec<faf> b = fad.b.listOf().xmap(faf::new, $$0 -> $$0.c);
   private final List<fab> c;
   private final BiFunction<cys, eyn, cys> d;

   private faf(List<fab> $$0) {
      this.c = $$0;
      this.d = fad.a($$0);
   }

   public static faf a(List<fab> $$0) {
      return new faf(List.copyOf($$0));
   }

   public cys a(cys $$0, eyn $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eyt $$0) {
      fab.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fac<faf> b() {
      return fad.I;
   }
}
