import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddm(int f, int g, List<ddo> h, ddo i, ddo j) implements ddi {
   public static final MapCodec<ddm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(ddm::b),
               Codec.INT.fieldOf("height").forGetter(ddm::c),
               ddo.a.listOf().fieldOf("ingredients").forGetter(ddm::f),
               ddo.a.fieldOf("result").forGetter(ddm::d),
               ddo.a.fieldOf("crafting_station").forGetter(ddm::e)
            )
            .apply($$0, ddm::new)
   );
   public static final zt<xg, ddm> b = zt.a(zr.h, ddm::b, zr.h, ddm::c, ddo.b.a(zr.a()), ddm::f, ddo.b, ddm::d, ddo.b, ddm::e, ddm::new);
   public static final ddi.a<ddm> c = new ddi.a<>(a, b);

   public ddm(int f, int g, List<ddo> h, ddo i, ddo j) {
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
   public ddi.a<ddm> a() {
      return c;
   }

   @Override
   public boolean a(css $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && ddi.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<ddo> f() {
      return this.h;
   }

   @Override
   public ddo d() {
      return this.i;
   }

   @Override
   public ddo e() {
      return this.j;
   }
}
