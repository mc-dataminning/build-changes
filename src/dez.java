import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dez(dev f, dev g, dev h) implements dep {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dev.a.fieldOf("input").forGetter(dez::b), dev.a.fieldOf("result").forGetter(dez::d), dev.a.fieldOf("crafting_station").forGetter(dez::e))
            .apply($$0, dez::new)
   );
   public static final yu<wh, dez> b = yu.a(dev.b, dez::b, dev.b, dez::d, dev.b, dez::e, dez::new);
   public static final dep.a<dez> c = new dep.a<>(a, b);

   @Override
   public dep.a<dez> a() {
      return c;
   }

   public dev b() {
      return this.f;
   }

   @Override
   public dev d() {
      return this.g;
   }

   @Override
   public dev e() {
      return this.h;
   }
}
