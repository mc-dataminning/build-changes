import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfe(dfb f, dfb g, dfb h, dfb i, dfb j) implements dev {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfb.a.fieldOf("template").forGetter(dfe::b),
               dfb.a.fieldOf("base").forGetter(dfe::c),
               dfb.a.fieldOf("addition").forGetter(dfe::f),
               dfb.a.fieldOf("result").forGetter(dfe::d),
               dfb.a.fieldOf("crafting_station").forGetter(dfe::e)
            )
            .apply($$0, dfe::new)
   );
   public static final yw<wj, dfe> b = yw.a(dfb.b, dfe::b, dfb.b, dfe::c, dfb.b, dfe::f, dfb.b, dfe::d, dfb.b, dfe::e, dfe::new);
   public static final dev.a<dfe> c = new dev.a<>(a, b);

   @Override
   public dev.a<dfe> a() {
      return c;
   }

   public dfb b() {
      return this.f;
   }

   public dfb c() {
      return this.g;
   }

   public dfb f() {
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
