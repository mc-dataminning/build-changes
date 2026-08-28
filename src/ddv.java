import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddv(int f, int g, List<ddx> h, ddx i, ddx j) implements ddr {
   public static final MapCodec<ddv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(ddv::b),
               Codec.INT.fieldOf("height").forGetter(ddv::c),
               ddx.a.listOf().fieldOf("ingredients").forGetter(ddv::f),
               ddx.a.fieldOf("result").forGetter(ddv::d),
               ddx.a.fieldOf("crafting_station").forGetter(ddv::e)
            )
            .apply($$0, ddv::new)
   );
   public static final yt<wg, ddv> b = yt.a(yr.h, ddv::b, yr.h, ddv::c, ddx.b.a(yr.a()), ddv::f, ddx.b, ddv::d, ddx.b, ddv::e, ddv::new);
   public static final ddr.a<ddv> c = new ddr.a<>(a, b);

   public ddv(int f, int g, List<ddx> h, ddx i, ddx j) {
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
   public ddr.a<ddv> a() {
      return c;
   }

   @Override
   public boolean a(cte $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && ddr.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<ddx> f() {
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
