import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ery implements ert {
   public static final MapCodec<ery> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(erv.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ery::new)
   );
   public static final Codec<ery> b = erv.b.listOf().xmap(ery::new, $$0 -> $$0.c);
   private final List<ert> c;
   private final BiFunction<cun, eqg, cun> d;

   private ery(List<ert> $$0) {
      this.c = $$0;
      this.d = erv.a($$0);
   }

   public static ery a(List<ert> $$0) {
      return new ery(List.copyOf($$0));
   }

   public cun a(cun $$0, eqg $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eqm $$0) {
      ert.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eru<ery> b() {
      return erv.I;
   }
}
