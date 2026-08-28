import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dds(ddo f, ddo g, ddo h) implements ddi {
   public static final MapCodec<dds> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddo.a.fieldOf("input").forGetter(dds::b), ddo.a.fieldOf("result").forGetter(dds::d), ddo.a.fieldOf("crafting_station").forGetter(dds::e))
            .apply($$0, dds::new)
   );
   public static final zt<xg, dds> b = zt.a(ddo.b, dds::b, ddo.b, dds::d, ddo.b, dds::e, dds::new);
   public static final ddi.a<dds> c = new ddi.a<>(a, b);

   @Override
   public ddi.a<dds> a() {
      return c;
   }

   public ddo b() {
      return this.f;
   }

   @Override
   public ddo d() {
      return this.g;
   }

   @Override
   public ddo e() {
      return this.h;
   }
}
