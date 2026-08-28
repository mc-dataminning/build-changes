import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfg(dfn f, dfn g, dfn h, dfn i, int j, float k) implements dfh {
   public static final MapCodec<dfg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfn.a.fieldOf("ingredient").forGetter(dfg::b),
               dfn.a.fieldOf("fuel").forGetter(dfg::c),
               dfn.a.fieldOf("result").forGetter(dfg::d),
               dfn.a.fieldOf("crafting_station").forGetter(dfg::e),
               Codec.INT.fieldOf("duration").forGetter(dfg::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dfg::g)
            )
            .apply($$0, dfg::new)
   );
   public static final yw<wj, dfg> b = yw.a(dfn.b, dfg::b, dfn.b, dfg::c, dfn.b, dfg::d, dfn.b, dfg::e, yu.h, dfg::f, yu.l, dfg::g, dfg::new);
   public static final dfh.a<dfg> c = new dfh.a<>(a, b);

   @Override
   public dfh.a<dfg> a() {
      return c;
   }

   @Override
   public boolean a(cut $$0) {
      return this.f.a($$0) && this.c().a($$0) && dfh.super.a($$0);
   }

   public dfn b() {
      return this.f;
   }

   public dfn c() {
      return this.g;
   }

   @Override
   public dfn d() {
      return this.h;
   }

   @Override
   public dfn e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
