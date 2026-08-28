import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dez(int f, int g, List<dfb> h, dfb i, dfb j) implements dev {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dez::b),
               Codec.INT.fieldOf("height").forGetter(dez::c),
               dfb.a.listOf().fieldOf("ingredients").forGetter(dez::f),
               dfb.a.fieldOf("result").forGetter(dez::d),
               dfb.a.fieldOf("crafting_station").forGetter(dez::e)
            )
            .apply($$0, dez::new)
   );
   public static final yw<wj, dez> b = yw.a(yu.h, dez::b, yu.h, dez::c, dfb.b.a(yu.a()), dez::f, dfb.b, dez::d, dfb.b, dez::e, dez::new);
   public static final dev.a<dez> c = new dev.a<>(a, b);

   public dez(int f, int g, List<dfb> h, dfb i, dfb j) {
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
   public dev.a<dez> a() {
      return c;
   }

   @Override
   public boolean a(cuh $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dev.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dfb> f() {
      return this.h;
   }

   @Override
   public dfb d() {
      return this.i;
   }

   @Override
   public dfb e() {
      return this.j;
   }
}
