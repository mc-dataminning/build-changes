import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dde(int f, int g, List<ddg> h, ddg i, ddg j) implements dda {
   public static final MapCodec<dde> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dde::b),
               Codec.INT.fieldOf("height").forGetter(dde::c),
               ddg.a.listOf().fieldOf("ingredients").forGetter(dde::f),
               ddg.a.fieldOf("result").forGetter(dde::d),
               ddg.a.fieldOf("crafting_station").forGetter(dde::e)
            )
            .apply($$0, dde::new)
   );
   public static final zi<wv, dde> b = zi.a(zg.h, dde::b, zg.h, dde::c, ddg.b.a(zg.a()), dde::f, ddg.b, dde::d, ddg.b, dde::e, dde::new);
   public static final dda.a<dde> c = new dda.a<>(a, b);

   public dde(int f, int g, List<ddg> h, ddg i, ddg j) {
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
   public dda.a<dde> a() {
      return c;
   }

   @Override
   public boolean a(csk $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dda.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<ddg> f() {
      return this.h;
   }

   @Override
   public ddg d() {
      return this.i;
   }

   @Override
   public ddg e() {
      return this.j;
   }
}
