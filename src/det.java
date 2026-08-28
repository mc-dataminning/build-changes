import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record det(int f, int g, List<dev> h, dev i, dev j) implements dep {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(det::b),
               Codec.INT.fieldOf("height").forGetter(det::c),
               dev.a.listOf().fieldOf("ingredients").forGetter(det::f),
               dev.a.fieldOf("result").forGetter(det::d),
               dev.a.fieldOf("crafting_station").forGetter(det::e)
            )
            .apply($$0, det::new)
   );
   public static final yu<wh, det> b = yu.a(ys.h, det::b, ys.h, det::c, dev.b.a(ys.a()), det::f, dev.b, det::d, dev.b, det::e, det::new);
   public static final dep.a<det> c = new dep.a<>(a, b);

   public det(int f, int g, List<dev> h, dev i, dev j) {
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
   public dep.a<det> a() {
      return c;
   }

   @Override
   public boolean a(cub $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dep.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dev> f() {
      return this.h;
   }

   @Override
   public dev d() {
      return this.i;
   }

   @Override
   public dev e() {
      return this.j;
   }
}
