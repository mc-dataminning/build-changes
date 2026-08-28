import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dff(List<dfg> f, dfg g, dfg h) implements dfa {
   public static final MapCodec<dff> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfg.a.listOf().fieldOf("ingredients").forGetter(dff::b),
               dfg.a.fieldOf("result").forGetter(dff::d),
               dfg.a.fieldOf("crafting_station").forGetter(dff::e)
            )
            .apply($$0, dff::new)
   );
   public static final yw<wj, dff> b = yw.a(dfg.b.a(yu.a()), dff::b, dfg.b, dff::d, dfg.b, dff::e, dff::new);
   public static final dfa.a<dff> c = new dfa.a<>(a, b);

   @Override
   public dfa.a<dff> a() {
      return c;
   }

   @Override
   public boolean a(cum $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dfa.super.a($$0);
   }

   public List<dfg> b() {
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
