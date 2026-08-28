import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dff(dfb f, dfb g, dfb h) implements dev {
   public static final MapCodec<dff> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfb.a.fieldOf("input").forGetter(dff::b), dfb.a.fieldOf("result").forGetter(dff::d), dfb.a.fieldOf("crafting_station").forGetter(dff::e))
            .apply($$0, dff::new)
   );
   public static final yw<wj, dff> b = yw.a(dfb.b, dff::b, dfb.b, dff::d, dfb.b, dff::e, dff::new);
   public static final dev.a<dff> c = new dev.a<>(a, b);

   @Override
   public dev.a<dff> a() {
      return c;
   }

   public dfb b() {
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
