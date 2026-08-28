import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dea(ddx f, ddx g, ddx h, ddx i, ddx j) implements ddr {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddx.a.fieldOf("template").forGetter(dea::b),
               ddx.a.fieldOf("base").forGetter(dea::c),
               ddx.a.fieldOf("addition").forGetter(dea::f),
               ddx.a.fieldOf("result").forGetter(dea::d),
               ddx.a.fieldOf("crafting_station").forGetter(dea::e)
            )
            .apply($$0, dea::new)
   );
   public static final yt<wg, dea> b = yt.a(ddx.b, dea::b, ddx.b, dea::c, ddx.b, dea::f, ddx.b, dea::d, ddx.b, dea::e, dea::new);
   public static final ddr.a<dea> c = new ddr.a<>(a, b);

   @Override
   public ddr.a<dea> a() {
      return c;
   }

   public ddx b() {
      return this.f;
   }

   public ddx c() {
      return this.g;
   }

   public ddx f() {
      return this.h;
   }

   @Override
   public ddx d() {
      return this.i;
   }

   @Override
   public ddx e() {
      return this.j;
   }
}
