import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dey(dev f, dev g, dev h, dev i, dev j) implements dep {
   public static final MapCodec<dey> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dev.a.fieldOf("template").forGetter(dey::b),
               dev.a.fieldOf("base").forGetter(dey::c),
               dev.a.fieldOf("addition").forGetter(dey::f),
               dev.a.fieldOf("result").forGetter(dey::d),
               dev.a.fieldOf("crafting_station").forGetter(dey::e)
            )
            .apply($$0, dey::new)
   );
   public static final yu<wh, dey> b = yu.a(dev.b, dey::b, dev.b, dey::c, dev.b, dey::f, dev.b, dey::d, dev.b, dey::e, dey::new);
   public static final dep.a<dey> c = new dep.a<>(a, b);

   @Override
   public dep.a<dey> a() {
      return c;
   }

   public dev b() {
      return this.f;
   }

   public dev c() {
      return this.g;
   }

   public dev f() {
      return this.h;
   }

   @Override
   public dev d() {
      return this.i;
   }

   @Override
   public dev e() {
      return this.j;
   }
}
