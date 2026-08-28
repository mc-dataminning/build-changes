import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfa(List<dfb> f, dfb g, dfb h) implements dev {
   public static final MapCodec<dfa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfb.a.listOf().fieldOf("ingredients").forGetter(dfa::b),
               dfb.a.fieldOf("result").forGetter(dfa::d),
               dfb.a.fieldOf("crafting_station").forGetter(dfa::e)
            )
            .apply($$0, dfa::new)
   );
   public static final yw<wj, dfa> b = yw.a(dfb.b.a(yu.a()), dfa::b, dfb.b, dfa::d, dfb.b, dfa::e, dfa::new);
   public static final dev.a<dfa> c = new dev.a<>(a, b);

   @Override
   public dev.a<dfa> a() {
      return c;
   }

   @Override
   public boolean a(cuh $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dev.super.a($$0);
   }

   public List<dfb> b() {
      return this.f;
   }

   @Override
   public dfb d() {
      return this.g;
   }

   @Override
   public dfb e() {
      return this.h;
   }
}
