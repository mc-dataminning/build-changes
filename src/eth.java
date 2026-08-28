import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eth implements etd {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(etf.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eth::new)
   );
   public static final Codec<eth> b = etf.b.listOf().xmap(eth::new, $$0 -> $$0.c);
   private final List<etd> c;
   private final BiFunction<cuq, erp, cuq> d;

   private eth(List<etd> $$0) {
      this.c = $$0;
      this.d = etf.a($$0);
   }

   public static eth a(List<etd> $$0) {
      return new eth(List.copyOf($$0));
   }

   public cuq a(cuq $$0, erp $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(erv $$0) {
      etd.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public ete<eth> b() {
      return etf.I;
   }
}
