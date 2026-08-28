import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddg(int f, int g, List<ddi> h, ddi i, ddi j) implements ddc {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(ddg::b),
               Codec.INT.fieldOf("height").forGetter(ddg::c),
               ddi.a.listOf().fieldOf("ingredients").forGetter(ddg::f),
               ddi.a.fieldOf("result").forGetter(ddg::d),
               ddi.a.fieldOf("crafting_station").forGetter(ddg::e)
            )
            .apply($$0, ddg::new)
   );
   public static final zt<xg, ddg> b = zt.a(zr.h, ddg::b, zr.h, ddg::c, ddi.b.a(zr.a()), ddg::f, ddi.b, ddg::d, ddi.b, ddg::e, ddg::new);
   public static final ddc.a<ddg> c = new ddc.a<>(a, b);

   public ddg(int f, int g, List<ddi> h, ddi i, ddi j) {
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
   public ddc.a<ddg> a() {
      return c;
   }

   @Override
   public boolean a(cso $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && ddc.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<ddi> f() {
      return this.h;
   }

   @Override
   public ddi d() {
      return this.i;
   }

   @Override
   public ddi e() {
      return this.j;
   }
}
