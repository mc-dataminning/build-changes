import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfj(dfg f, dfg g, dfg h, dfg i, dfg j) implements dfa {
   public static final MapCodec<dfj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfg.a.fieldOf("template").forGetter(dfj::b),
               dfg.a.fieldOf("base").forGetter(dfj::c),
               dfg.a.fieldOf("addition").forGetter(dfj::f),
               dfg.a.fieldOf("result").forGetter(dfj::d),
               dfg.a.fieldOf("crafting_station").forGetter(dfj::e)
            )
            .apply($$0, dfj::new)
   );
   public static final yw<wj, dfj> b = yw.a(dfg.b, dfj::b, dfg.b, dfj::c, dfg.b, dfj::f, dfg.b, dfj::d, dfg.b, dfj::e, dfj::new);
   public static final dfa.a<dfj> c = new dfa.a<>(a, b);

   @Override
   public dfa.a<dfj> a() {
      return c;
   }

   public dfg b() {
      return this.f;
   }

   public dfg c() {
      return this.g;
   }

   public dfg f() {
      return this.h;
   }

   @Override
   public dfg d() {
      return this.i;
   }

   @Override
   public dfg e() {
      return this.j;
   }
}
