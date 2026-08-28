import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddb(ddi f, ddi g, ddi h, ddi i) implements ddc {
   public static final MapCodec<ddb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddi.a.fieldOf("ingredient").forGetter(ddb::b),
               ddi.a.fieldOf("fuel").forGetter(ddb::c),
               ddi.a.fieldOf("result").forGetter(ddb::d),
               ddi.a.fieldOf("crafting_station").forGetter(ddb::e)
            )
            .apply($$0, ddb::new)
   );
   public static final zt<xg, ddb> b = zt.a(ddi.b, ddb::b, ddi.b, ddb::c, ddi.b, ddb::d, ddi.b, ddb::e, ddb::new);
   public static final ddc.a<ddb> c = new ddc.a<>(a, b);

   @Override
   public ddc.a<ddb> a() {
      return c;
   }

   @Override
   public boolean a(cso $$0) {
      return this.f.a($$0) && this.c().a($$0) && ddc.super.a($$0);
   }

   public ddi b() {
      return this.f;
   }

   public ddi c() {
      return this.g;
   }

   @Override
   public ddi d() {
      return this.h;
   }

   @Override
   public ddi e() {
      return this.i;
   }
}
