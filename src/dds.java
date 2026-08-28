import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dds(ddp f, ddp g, ddp h, ddp i, ddp j) implements ddj {
   public static final MapCodec<dds> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddp.a.fieldOf("template").forGetter(dds::b),
               ddp.a.fieldOf("base").forGetter(dds::c),
               ddp.a.fieldOf("addition").forGetter(dds::f),
               ddp.a.fieldOf("result").forGetter(dds::d),
               ddp.a.fieldOf("crafting_station").forGetter(dds::e)
            )
            .apply($$0, dds::new)
   );
   public static final zt<xg, dds> b = zt.a(ddp.b, dds::b, ddp.b, dds::c, ddp.b, dds::f, ddp.b, dds::d, ddp.b, dds::e, dds::new);
   public static final ddj.a<dds> c = new ddj.a<>(a, b);

   @Override
   public ddj.a<dds> a() {
      return c;
   }

   public ddp b() {
      return this.f;
   }

   public ddp c() {
      return this.g;
   }

   public ddp f() {
      return this.h;
   }

   @Override
   public ddp d() {
      return this.i;
   }

   @Override
   public ddp e() {
      return this.j;
   }
}
