import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfe(int f, int g, List<dfg> h, dfg i, dfg j) implements dfa {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.fieldOf("width").forGetter(dfe::b),
               Codec.INT.fieldOf("height").forGetter(dfe::c),
               dfg.a.listOf().fieldOf("ingredients").forGetter(dfe::f),
               dfg.a.fieldOf("result").forGetter(dfe::d),
               dfg.a.fieldOf("crafting_station").forGetter(dfe::e)
            )
            .apply($$0, dfe::new)
   );
   public static final yw<wj, dfe> b = yw.a(yu.h, dfe::b, yu.h, dfe::c, dfg.b.a(yu.a()), dfe::f, dfg.b, dfe::d, dfg.b, dfe::e, dfe::new);
   public static final dfa.a<dfe> c = new dfa.a<>(a, b);

   public dfe(int f, int g, List<dfg> h, dfg i, dfg j) {
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
   public dfa.a<dfe> a() {
      return c;
   }

   @Override
   public boolean a(cum $$0) {
      return this.h.stream().allMatch($$1 -> $$1.a($$0)) && dfa.super.a($$0);
   }

   public int b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }

   public List<dfg> f() {
      return this.h;
   }

   @Override
   public dfg d() {
      return this.i;
   }

   @Override
   public dfg e() {
      return this.j;
   }
}
