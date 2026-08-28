import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddh(ddo f, ddo g, ddo h, ddo i, int j, float k) implements ddi {
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddo.a.fieldOf("ingredient").forGetter(ddh::b),
               ddo.a.fieldOf("fuel").forGetter(ddh::c),
               ddo.a.fieldOf("result").forGetter(ddh::d),
               ddo.a.fieldOf("crafting_station").forGetter(ddh::e),
               Codec.INT.fieldOf("duration").forGetter(ddh::f),
               Codec.FLOAT.fieldOf("experience").forGetter(ddh::g)
            )
            .apply($$0, ddh::new)
   );
   public static final zt<xg, ddh> b = zt.a(ddo.b, ddh::b, ddo.b, ddh::c, ddo.b, ddh::d, ddo.b, ddh::e, zr.h, ddh::f, zr.l, ddh::g, ddh::new);
   public static final ddi.a<ddh> c = new ddi.a<>(a, b);

   @Override
   public ddi.a<ddh> a() {
      return c;
   }

   @Override
   public boolean a(css $$0) {
      return this.f.a($$0) && this.c().a($$0) && ddi.super.a($$0);
   }

   public ddo b() {
      return this.f;
   }

   public ddo c() {
      return this.g;
   }

   @Override
   public ddo d() {
      return this.h;
   }

   @Override
   public ddo e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
