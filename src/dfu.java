import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfu(dfq f, dfq g, dfq h) implements dfk {
   public static final MapCodec<dfu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dfq.a.fieldOf("input").forGetter(dfu::b), dfq.a.fieldOf("result").forGetter(dfu::d), dfq.a.fieldOf("crafting_station").forGetter(dfu::e))
            .apply($$0, dfu::new)
   );
   public static final yw<wj, dfu> b = yw.a(dfq.b, dfu::b, dfq.b, dfu::d, dfq.b, dfu::e, dfu::new);
   public static final dfk.a<dfu> c = new dfk.a<>(a, b);

   @Override
   public dfk.a<dfu> a() {
      return c;
   }

   public dfq b() {
      return this.f;
   }

   @Override
   public dfq d() {
      return this.g;
   }

   @Override
   public dfq e() {
      return this.h;
   }
}
