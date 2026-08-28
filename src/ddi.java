import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddi(ddp f, ddp g, ddp h, ddp i, int j, float k) implements ddj {
   public static final MapCodec<ddi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddp.a.fieldOf("ingredient").forGetter(ddi::b),
               ddp.a.fieldOf("fuel").forGetter(ddi::c),
               ddp.a.fieldOf("result").forGetter(ddi::d),
               ddp.a.fieldOf("crafting_station").forGetter(ddi::e),
               Codec.INT.fieldOf("duration").forGetter(ddi::f),
               Codec.FLOAT.fieldOf("experience").forGetter(ddi::g)
            )
            .apply($$0, ddi::new)
   );
   public static final zt<xg, ddi> b = zt.a(ddp.b, ddi::b, ddp.b, ddi::c, ddp.b, ddi::d, ddp.b, ddi::e, zr.h, ddi::f, zr.l, ddi::g, ddi::new);
   public static final ddj.a<ddi> c = new ddj.a<>(a, b);

   @Override
   public ddj.a<ddi> a() {
      return c;
   }

   @Override
   public boolean a(cst $$0) {
      return this.f.a($$0) && this.c().a($$0) && ddj.super.a($$0);
   }

   public ddp b() {
      return this.f;
   }

   public ddp c() {
      return this.g;
   }

   @Override
   public ddp d() {
      return this.h;
   }

   @Override
   public ddp e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
