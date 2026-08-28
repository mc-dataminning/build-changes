import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddw(List<ddx> f, ddx g, ddx h) implements ddr {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddx.a.listOf().fieldOf("ingredients").forGetter(ddw::b),
               ddx.a.fieldOf("result").forGetter(ddw::d),
               ddx.a.fieldOf("crafting_station").forGetter(ddw::e)
            )
            .apply($$0, ddw::new)
   );
   public static final yt<wg, ddw> b = yt.a(ddx.b.a(yr.a()), ddw::b, ddx.b, ddw::d, ddx.b, ddw::e, ddw::new);
   public static final ddr.a<ddw> c = new ddr.a<>(a, b);

   @Override
   public ddr.a<ddw> a() {
      return c;
   }

   @Override
   public boolean a(cte $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && ddr.super.a($$0);
   }

   public List<ddx> b() {
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
