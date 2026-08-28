import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dez(dfg f, dfg g, dfg h, dfg i, int j, float k) implements dfa {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfg.a.fieldOf("ingredient").forGetter(dez::b),
               dfg.a.fieldOf("fuel").forGetter(dez::c),
               dfg.a.fieldOf("result").forGetter(dez::d),
               dfg.a.fieldOf("crafting_station").forGetter(dez::e),
               Codec.INT.fieldOf("duration").forGetter(dez::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dez::g)
            )
            .apply($$0, dez::new)
   );
   public static final yw<wj, dez> b = yw.a(dfg.b, dez::b, dfg.b, dez::c, dfg.b, dez::d, dfg.b, dez::e, yu.h, dez::f, yu.l, dez::g, dez::new);
   public static final dfa.a<dez> c = new dfa.a<>(a, b);

   @Override
   public dfa.a<dez> a() {
      return c;
   }

   @Override
   public boolean a(cum $$0) {
      return this.f.a($$0) && this.c().a($$0) && dfa.super.a($$0);
   }

   public dfg b() {
      return this.f;
   }

   public dfg c() {
      return this.g;
   }

   @Override
   public dfg d() {
      return this.h;
   }

   @Override
   public dfg e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
