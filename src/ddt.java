import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddt(ddp f, ddp g, ddp h) implements ddj {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddp.a.fieldOf("input").forGetter(ddt::b), ddp.a.fieldOf("result").forGetter(ddt::d), ddp.a.fieldOf("crafting_station").forGetter(ddt::e))
            .apply($$0, ddt::new)
   );
   public static final zt<xg, ddt> b = zt.a(ddp.b, ddt::b, ddp.b, ddt::d, ddp.b, ddt::e, ddt::new);
   public static final ddj.a<ddt> c = new ddj.a<>(a, b);

   @Override
   public ddj.a<ddt> a() {
      return c;
   }

   public ddp b() {
      return this.f;
   }

   @Override
   public ddp d() {
      return this.g;
   }

   @Override
   public ddp e() {
      return this.h;
   }
}
