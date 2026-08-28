import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ddf(List<ddg> f, ddg g, ddg h) implements dda {
   public static final MapCodec<ddf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddg.a.listOf().fieldOf("ingredients").forGetter(ddf::b),
               ddg.a.fieldOf("result").forGetter(ddf::d),
               ddg.a.fieldOf("crafting_station").forGetter(ddf::e)
            )
            .apply($$0, ddf::new)
   );
   public static final zi<wv, ddf> b = zi.a(ddg.b.a(zg.a()), ddf::b, ddg.b, ddf::d, ddg.b, ddf::e, ddf::new);
   public static final dda.a<ddf> c = new dda.a<>(a, b);

   @Override
   public dda.a<ddf> a() {
      return c;
   }

   @Override
   public boolean a(csk $$0) {
      return this.f.stream().allMatch($$1 -> $$1.a($$0)) && dda.super.a($$0);
   }

   public List<ddg> b() {
      return this.f;
   }

   @Override
   public ddg d() {
      return this.g;
   }

   @Override
   public ddg e() {
      return this.h;
   }
}
