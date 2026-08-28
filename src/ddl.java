import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddl(ddi f, ddi g) implements ddc {
   public static final MapCodec<ddl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddi.a.fieldOf("result").forGetter(ddl::d), ddi.a.fieldOf("crafting_station").forGetter(ddl::e)).apply($$0, ddl::new)
   );
   public static final zt<xg, ddl> b = zt.a(ddi.b, ddl::d, ddi.b, ddl::e, ddl::new);
   public static final ddc.a<ddl> c = new ddc.a<>(a, b);

   @Override
   public ddc.a<ddl> a() {
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
