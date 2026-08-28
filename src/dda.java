import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dda(ddh f, ddh g, ddh h, ddh i, int j, float k) implements ddb {
   public static final MapCodec<dda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddh.a.fieldOf("ingredient").forGetter(dda::b),
               ddh.a.fieldOf("fuel").forGetter(dda::c),
               ddh.a.fieldOf("result").forGetter(dda::d),
               ddh.a.fieldOf("crafting_station").forGetter(dda::e),
               Codec.INT.fieldOf("duration").forGetter(dda::f),
               Codec.FLOAT.fieldOf("experience").forGetter(dda::g)
            )
            .apply($$0, dda::new)
   );
   public static final yn<wa, dda> b = yn.a(ddh.b, dda::b, ddh.b, dda::c, ddh.b, dda::d, ddh.b, dda::e, yl.h, dda::f, yl.l, dda::g, dda::new);
   public static final ddb.a<dda> c = new ddb.a<>(a, b);

   @Override
   public ddb.a<dda> a() {
      return c;
   }

   @Override
   public boolean a(csn $$0) {
      return this.f.a($$0) && this.c().a($$0) && ddb.super.a($$0);
   }

   public ddh b() {
      return this.f;
   }

   public ddh c() {
      return this.g;
   }

   @Override
   public ddh d() {
      return this.h;
   }

   @Override
   public ddh e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
