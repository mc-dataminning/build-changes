import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfr(dfn f, dfn g, dfn h) implements dfh {
   public static final MapCodec<dfr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfn.a.fieldOf("input").forGetter(dfr::b), dfn.a.fieldOf("result").forGetter(dfr::d), dfn.a.fieldOf("crafting_station").forGetter(dfr::e))
            .apply($$0, dfr::new)
   );
   public static final yw<wj, dfr> b = yw.a(dfn.b, dfr::b, dfn.b, dfr::d, dfn.b, dfr::e, dfr::new);
   public static final dfh.a<dfr> c = new dfh.a<>(a, b);

   @Override
   public dfh.a<dfr> a() {
      return c;
   }

   public dfn b() {
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
