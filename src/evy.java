import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class evy implements evu {
   public static final MapCodec<evy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(evw.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, evy::new)
   );
   public static final Codec<evy> b = evw.b.listOf().xmap(evy::new, $$0 -> $$0.c);
   private final List<evu> c;
   private final BiFunction<cwf, eug, cwf> d;

   private evy(List<evu> $$0) {
      this.c = $$0;
      this.d = evw.a($$0);
   }

   public static evy a(List<evu> $$0) {
      return new evy(List.copyOf($$0));
   }

   public cwf a(cwf $$0, eug $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eum $$0) {
      evu.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public evv<evy> b() {
      return evw.I;
   }
}
