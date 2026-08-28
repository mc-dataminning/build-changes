import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddq(ddx f, ddx g, ddx h, ddx i, int j, float k) implements ddr {
   public static final MapCodec<ddq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddx.a.fieldOf("ingredient").forGetter(ddq::b),
               ddx.a.fieldOf("fuel").forGetter(ddq::c),
               ddx.a.fieldOf("result").forGetter(ddq::d),
               ddx.a.fieldOf("crafting_station").forGetter(ddq::e),
               Codec.INT.fieldOf("duration").forGetter(ddq::f),
               Codec.FLOAT.fieldOf("experience").forGetter(ddq::g)
            )
            .apply($$0, ddq::new)
   );
   public static final yt<wg, ddq> b = yt.a(ddx.b, ddq::b, ddx.b, ddq::c, ddx.b, ddq::d, ddx.b, ddq::e, yr.h, ddq::f, yr.l, ddq::g, ddq::new);
   public static final ddr.a<ddq> c = new ddr.a<>(a, b);

   @Override
   public ddr.a<ddq> a() {
      return c;
   }

   @Override
   public boolean a(cte $$0) {
      return this.f.a($$0) && this.c().a($$0) && ddr.super.a($$0);
   }

   public ddx b() {
      return this.f;
   }

   public ddx c() {
      return this.g;
   }

   @Override
   public ddx d() {
      return this.h;
   }

   @Override
   public ddx e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
