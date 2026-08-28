import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfq(dfn f, dfn g, dfn h, dfn i, dfn j) implements dfh {
   public static final MapCodec<dfq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfn.a.fieldOf("template").forGetter(dfq::b),
               dfn.a.fieldOf("base").forGetter(dfq::c),
               dfn.a.fieldOf("addition").forGetter(dfq::f),
               dfn.a.fieldOf("result").forGetter(dfq::d),
               dfn.a.fieldOf("crafting_station").forGetter(dfq::e)
            )
            .apply($$0, dfq::new)
   );
   public static final yw<wj, dfq> b = yw.a(dfn.b, dfq::b, dfn.b, dfq::c, dfn.b, dfq::f, dfn.b, dfq::d, dfn.b, dfq::e, dfq::new);
   public static final dfh.a<dfq> c = new dfh.a<>(a, b);

   @Override
   public dfh.a<dfq> a() {
      return c;
   }

   public dfn b() {
      return this.f;
   }

   public dfn c() {
      return this.g;
   }

   public dfn f() {
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
