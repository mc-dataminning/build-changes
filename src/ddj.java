import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddj(ddg f, ddg g, ddg h, ddg i, ddg j) implements dda {
   public static final MapCodec<ddj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddg.a.fieldOf("template").forGetter(ddj::b),
               ddg.a.fieldOf("base").forGetter(ddj::c),
               ddg.a.fieldOf("addition").forGetter(ddj::f),
               ddg.a.fieldOf("result").forGetter(ddj::d),
               ddg.a.fieldOf("crafting_station").forGetter(ddj::e)
            )
            .apply($$0, ddj::new)
   );
   public static final zi<wv, ddj> b = zi.a(ddg.b, ddj::b, ddg.b, ddj::c, ddg.b, ddj::f, ddg.b, ddj::d, ddg.b, ddj::e, ddj::new);
   public static final dda.a<ddj> c = new dda.a<>(a, b);

   @Override
   public dda.a<ddj> a() {
      return c;
   }

   public ddg b() {
      return this.f;
   }

   public ddg c() {
      return this.g;
   }

   public ddg f() {
      return this.h;
   }

   @Override
   public ddg d() {
      return this.i;
   }

   @Override
   public ddg e() {
      return this.j;
   }
}
