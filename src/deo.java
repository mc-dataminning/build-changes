import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deo(dev f, dev g, dev h, dev i, int j, float k) implements dep {
   public static final MapCodec<deo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dev.a.fieldOf("ingredient").forGetter(deo::b),
               dev.a.fieldOf("fuel").forGetter(deo::c),
               dev.a.fieldOf("result").forGetter(deo::d),
               dev.a.fieldOf("crafting_station").forGetter(deo::e),
               Codec.INT.fieldOf("duration").forGetter(deo::f),
               Codec.FLOAT.fieldOf("experience").forGetter(deo::g)
            )
            .apply($$0, deo::new)
   );
   public static final yu<wh, deo> b = yu.a(dev.b, deo::b, dev.b, deo::c, dev.b, deo::d, dev.b, deo::e, ys.h, deo::f, ys.l, deo::g, deo::new);
   public static final dep.a<deo> c = new dep.a<>(a, b);

   @Override
   public dep.a<deo> a() {
      return c;
   }

   @Override
   public boolean a(cub $$0) {
      return this.f.a($$0) && this.c().a($$0) && dep.super.a($$0);
   }

   public dev b() {
      return this.f;
   }

   public dev c() {
      return this.g;
   }

   @Override
   public dev d() {
      return this.h;
   }

   @Override
   public dev e() {
      return this.i;
   }

   public int f() {
      return this.j;
   }

   public float g() {
      return this.k;
   }
}
