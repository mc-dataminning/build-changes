import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record deu(List<dev> f, dev g, dev h) implements dep {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dev.a.listOf().fieldOf("ingredients").forGetter(deu::b),
               dev.a.fieldOf("result").forGetter(deu::d),
               dev.a.fieldOf("crafting_station").forGetter(deu::e)
            )
            .apply($$0, deu::new)
   );
   public static final yu<wh, deu> b = yu.a(dev.b.a(ys.a()), deu::b, dev.b, deu::d, dev.b, deu::e, deu::new);
   public static final dep.a<deu> c = new dep.a<>(a, b);

   @Override
   public dep.a<deu> a() {
      return c;
   }

   @Override
   public boolean a(cub $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dep.super.a($$0);
   }

   public List<dev> b() {
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
