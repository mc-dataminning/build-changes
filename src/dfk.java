import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfk(dfg f, dfg g, dfg h) implements dfa {
   public static final MapCodec<dfk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfg.a.fieldOf("input").forGetter(dfk::b), dfg.a.fieldOf("result").forGetter(dfk::d), dfg.a.fieldOf("crafting_station").forGetter(dfk::e))
            .apply($$0, dfk::new)
   );
   public static final yw<wj, dfk> b = yw.a(dfg.b, dfk::b, dfg.b, dfk::d, dfg.b, dfk::e, dfk::new);
   public static final dfa.a<dfk> c = new dfa.a<>(a, b);

   @Override
   public dfa.a<dfk> a() {
      return c;
   }

   public dfg b() {
      return this.f;
   }

   @Override
   public dfg d() {
      return this.g;
   }

   @Override
   public dfg e() {
      return this.h;
   }
}
