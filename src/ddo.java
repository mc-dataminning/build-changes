import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddo(List<ddp> f, ddp g, ddp h) implements ddj {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddp.a.listOf().fieldOf("ingredients").forGetter(ddo::b),
               ddp.a.fieldOf("result").forGetter(ddo::d),
               ddp.a.fieldOf("crafting_station").forGetter(ddo::e)
            )
            .apply($$0, ddo::new)
   );
   public static final zt<xg, ddo> b = zt.a(ddp.b.a(zr.a()), ddo::b, ddp.b, ddo::d, ddp.b, ddo::e, ddo::new);
   public static final ddj.a<ddo> c = new ddj.a<>(a, b);

   @Override
   public ddj.a<ddo> a() {
      return c;
   }

   @Override
   public boolean a(cst $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && ddj.super.a($$0);
   }

   public List<ddp> b() {
      return this.f;
   }

   @Override
   public ddp d() {
      return this.g;
   }

   @Override
   public ddp e() {
      return this.h;
   }
}
