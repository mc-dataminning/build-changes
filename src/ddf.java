import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddf(int f, int g, List<ddh> h, ddh i, ddh j) implements ddb {
   public static final MapCodec<ddf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(ddf::b),
               Codec.INT.fieldOf("height").forGetter(ddf::c),
               ddh.a.listOf().fieldOf("ingredients").forGetter(ddf::f),
               ddh.a.fieldOf("result").forGetter(ddf::d),
               ddh.a.fieldOf("crafting_station").forGetter(ddf::e)
            )
            .apply($$0, ddf::new)
   );
   public static final yn<wa, ddf> b = yn.a(yl.h, ddf::b, yl.h, ddf::c, ddh.b.a(yl.a()), ddf::f, ddh.b, ddf::d, ddh.b, ddf::e, ddf::new);
   public static final ddb.a<ddf> c = new ddb.a<>(a, b);

   public ddf(int f, int g, List<ddh> h, ddh i, ddh j) {
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
   public ddb.a<ddf> a() {
      return c;
   }

   @Override
   public boolean a(csn $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && ddb.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<ddh> f() {
      return this.h;
   }

   @Override
   public ddh d() {
      return this.i;
   }

   @Override
   public ddh e() {
      return this.j;
   }
}
