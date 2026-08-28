import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class etj implements etf {
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eth.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, etj::new)
   );
   public static final Codec<etj> b = eth.b.listOf().xmap(etj::new, $$0 -> $$0.c);
   private final List<etf> c;
   private final BiFunction<cuq, err, cuq> d;

   private etj(List<etf> $$0) {
      this.c = $$0;
      this.d = eth.a($$0);
   }

   public static etj a(List<etf> $$0) {
      return new etj(List.copyOf($$0));
   }

   public cuq a(cuq $$0, err $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(erx $$0) {
      etf.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public etg<etj> b() {
      return eth.I;
   }
}
