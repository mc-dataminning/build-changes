import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddn(int f, int g, List<ddp> h, ddp i, ddp j) implements ddj {
   public static final MapCodec<ddn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(ddn::b),
               Codec.INT.fieldOf("height").forGetter(ddn::c),
               ddp.a.listOf().fieldOf("ingredients").forGetter(ddn::f),
               ddp.a.fieldOf("result").forGetter(ddn::d),
               ddp.a.fieldOf("crafting_station").forGetter(ddn::e)
            )
            .apply($$0, ddn::new)
   );
   public static final zt<xg, ddn> b = zt.a(zr.h, ddn::b, zr.h, ddn::c, ddp.b.a(zr.a()), ddn::f, ddp.b, ddn::d, ddp.b, ddn::e, ddn::new);
   public static final ddj.a<ddn> c = new ddj.a<>(a, b);

   public ddn(int f, int g, List<ddp> h, ddp i, ddp j) {
      if (h.size() != f * g) {
         throw new IllegalArgumentException("Invalid shaped recipe display contents");
      } else {
         this.f = f;
         this.g = g;
         this.h = h;
         this.i = i;
         this.j = j;
      }
   }

   @Override
   public ddj.a<ddn> a() {
      return c;
   }

   @Override
   public boolean a(cst $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && ddj.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<ddp> f() {
      return this.h;
   }

   @Override
   public ddp d() {
      return this.i;
   }

   @Override
   public ddp e() {
      return this.j;
   }
}
