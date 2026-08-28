import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddk(ddh f, ddh g, ddh h, ddh i, ddh j) implements ddb {
   public static final MapCodec<ddk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddh.a.fieldOf("template").forGetter(ddk::b),
               ddh.a.fieldOf("base").forGetter(ddk::c),
               ddh.a.fieldOf("addition").forGetter(ddk::f),
               ddh.a.fieldOf("result").forGetter(ddk::d),
               ddh.a.fieldOf("crafting_station").forGetter(ddk::e)
            )
            .apply($$0, ddk::new)
   );
   public static final yn<wa, ddk> b = yn.a(ddh.b, ddk::b, ddh.b, ddk::c, ddh.b, ddk::f, ddh.b, ddk::d, ddh.b, ddk::e, ddk::new);
   public static final ddb.a<ddk> c = new ddb.a<>(a, b);

   @Override
   public ddb.a<ddk> a() {
      return c;
   }

   public ddh b() {
      return this.f;
   }

   public ddh c() {
      return this.g;
   }

   public ddh f() {
      return this.h;
   }

   @Override
   public ddh d() {
      return this.i;
   }

   @Override
   public ddh e() {
      return this.j;
   }
}
