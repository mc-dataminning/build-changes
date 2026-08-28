import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dfm(List<dfn> f, dfn g, dfn h) implements dfh {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfn.a.listOf().fieldOf("ingredients").forGetter(dfm::b),
               dfn.a.fieldOf("result").forGetter(dfm::d),
               dfn.a.fieldOf("crafting_station").forGetter(dfm::e)
            )
            .apply($$0, dfm::new)
   );
   public static final yw<wj, dfm> b = yw.a(dfn.b.a(yu.a()), dfm::b, dfn.b, dfm::d, dfn.b, dfm::e, dfm::new);
   public static final dfh.a<dfm> c = new dfh.a<>(a, b);

   @Override
   public dfh.a<dfm> a() {
      return c;
   }

   @Override
   public boolean a(cut $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dfh.super.a($$0);
   }

   public List<dfn> b() {
      return this.f;
   }

   @Override
   public dfn d() {
      return this.g;
   }

   @Override
   public dfn e() {
      return this.h;
   }
}
