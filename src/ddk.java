import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddk(ddi f, ddi g) implements ddc {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddi.a.fieldOf("result").forGetter(ddk::d), ddi.a.fieldOf("crafting_station").forGetter(ddk::e)).apply($$0, ddk::new)
   );
   public static final zt<xg, ddk> b = zt.a(ddi.b, ddk::d, ddi.b, ddk::e, ddk::new);
   public static final ddc.a<ddk> c = new ddc.a<>(a, b);

   @Override
   public ddc.a<ddk> a() {
      return c;
   }

   @Override
   public ddi d() {
      return this.f;
   }

   @Override
   public ddi e() {
      return this.g;
   }
}
