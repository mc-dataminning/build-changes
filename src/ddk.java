import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddk(ddg f, ddg g, ddg h) implements dda {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddg.a.fieldOf("input").forGetter(ddk::b), ddg.a.fieldOf("result").forGetter(ddk::d), ddg.a.fieldOf("crafting_station").forGetter(ddk::e))
            .apply($$0, ddk::new)
   );
   public static final zi<wv, ddk> b = zi.a(ddg.b, ddk::b, ddg.b, ddk::d, ddg.b, ddk::e, ddk::new);
   public static final dda.a<ddk> c = new dda.a<>(a, b);

   @Override
   public dda.a<ddk> a() {
      return c;
   }

   public ddg b() {
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
