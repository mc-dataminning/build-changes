import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deb(ddx f, ddx g, ddx h) implements ddr {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddx.a.fieldOf("input").forGetter(deb::b), ddx.a.fieldOf("result").forGetter(deb::d), ddx.a.fieldOf("crafting_station").forGetter(deb::e))
            .apply($$0, deb::new)
   );
   public static final yt<wg, deb> b = yt.a(ddx.b, deb::b, ddx.b, deb::d, ddx.b, deb::e, deb::new);
   public static final ddr.a<deb> c = new ddr.a<>(a, b);

   @Override
   public ddr.a<deb> a() {
      return c;
   }

   public ddx b() {
      return this.f;
   }

   @Override
   public ddx d() {
      return this.g;
   }

   @Override
   public ddx e() {
      return this.h;
   }
}
