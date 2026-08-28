import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfl(int f, int g, List<dfn> h, dfn i, dfn j) implements dfh {
   public static final MapCodec<dfl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dfl::b),
               Codec.INT.fieldOf("height").forGetter(dfl::c),
               dfn.a.listOf().fieldOf("ingredients").forGetter(dfl::f),
               dfn.a.fieldOf("result").forGetter(dfl::d),
               dfn.a.fieldOf("crafting_station").forGetter(dfl::e)
            )
            .apply($$0, dfl::new)
   );
   public static final yw<wj, dfl> b = yw.a(yu.h, dfl::b, yu.h, dfl::c, dfn.b.a(yu.a()), dfl::f, dfn.b, dfl::d, dfn.b, dfl::e, dfl::new);
   public static final dfh.a<dfl> c = new dfh.a<>(a, b);

   public dfl(int f, int g, List<dfn> h, dfn i, dfn j) {
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
   public dfh.a<dfl> a() {
      return c;
   }

   @Override
   public boolean a(cut $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dfh.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dfn> f() {
      return this.h;
   }

   @Override
   public dfn d() {
      return this.i;
   }

   @Override
   public dfn e() {
      return this.j;
   }
}
