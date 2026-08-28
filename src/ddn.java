import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddn(List<ddo> f, ddo g, ddo h) implements ddi {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddo.a.listOf().fieldOf("ingredients").forGetter(ddn::b),
               ddo.a.fieldOf("result").forGetter(ddn::d),
               ddo.a.fieldOf("crafting_station").forGetter(ddn::e)
            )
            .apply($$0, ddn::new)
   );
   public static final zt<xg, ddn> b = zt.a(ddo.b.a(zr.a()), ddn::b, ddo.b, ddn::d, ddo.b, ddn::e, ddn::new);
   public static final ddi.a<ddn> c = new ddi.a<>(a, b);

   @Override
   public ddi.a<ddn> a() {
      return c;
   }

   @Override
   public boolean a(css $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && ddi.super.a($$0);
   }

   public List<ddo> b() {
      return this.f;
   }

   @Override
   public ddo d() {
      return this.g;
   }

   @Override
   public ddo e() {
      return this.h;
   }
}
