import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddh(List<ddi> f, ddi g, ddi h) implements ddc {
   public static final MapCodec<ddh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddi.a.listOf().fieldOf("ingredients").forGetter(ddh::b),
               ddi.a.fieldOf("result").forGetter(ddh::d),
               ddi.a.fieldOf("crafting_station").forGetter(ddh::e)
            )
            .apply($$0, ddh::new)
   );
   public static final zt<xg, ddh> b = zt.a(ddi.b.a(zr.a()), ddh::b, ddi.b, ddh::d, ddi.b, ddh::e, ddh::new);
   public static final ddc.a<ddh> c = new ddc.a<>(a, b);

   @Override
   public ddc.a<ddh> a() {
      return c;
   }

   @Override
   public boolean a(cso $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && ddc.super.a($$0);
   }

   public List<ddi> b() {
      return this.f;
   }

   @Override
   public ddi d() {
      return this.g;
   }

   @Override
   public ddi e() {
      return this.h;
   }
}
