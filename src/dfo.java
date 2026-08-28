import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfo(int f, int g, List<dfq> h, dfq i, dfq j) implements dfk {
   public static final MapCodec<dfo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dfo::b),
               Codec.INT.fieldOf("height").forGetter(dfo::c),
               dfq.a.listOf().fieldOf("ingredients").forGetter(dfo::f),
               dfq.a.fieldOf("result").forGetter(dfo::d),
               dfq.a.fieldOf("crafting_station").forGetter(dfo::e)
            )
            .apply($$0, dfo::new)
   );
   public static final yw<wj, dfo> b = yw.a(yu.h, dfo::b, yu.h, dfo::c, dfq.b.a(yu.a()), dfo::f, dfq.b, dfo::d, dfq.b, dfo::e, dfo::new);
   public static final dfk.a<dfo> c = new dfk.a<>(a, b);

   public dfo(int f, int g, List<dfq> h, dfq i, dfq j) {
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
   public dfk.a<dfo> a() {
      return c;
   }

   @Override
   public boolean a(cuw $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dfk.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dfq> f() {
      return this.h;
   }

   @Override
   public dfq d() {
      return this.i;
   }

   @Override
   public dfq e() {
      return this.j;
   }
}
