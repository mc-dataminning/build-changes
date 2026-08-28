import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dct(dcq f, dcq g, dcq h, dcq i, dcq j) implements dck {
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcq.a.fieldOf("template").forGetter(dct::b),
               dcq.a.fieldOf("base").forGetter(dct::c),
               dcq.a.fieldOf("addition").forGetter(dct::f),
               dcq.a.fieldOf("result").forGetter(dct::d),
               dcq.a.fieldOf("crafting_station").forGetter(dct::e)
            )
            .apply($$0, dct::new)
   );
   public static final yn<wa, dct> b = yn.a(dcq.b, dct::b, dcq.b, dct::c, dcq.b, dct::f, dcq.b, dct::d, dcq.b, dct::e, dct::new);
   public static final dck.a<dct> c = new dck.a<>(a, b);

   @Override
   public dck.a<dct> a() {
      return c;
   }

   public dcq b() {
      return this.f;
   }

   public dcq c() {
      return this.g;
   }

   public dcq f() {
      return this.h;
   }

   @Override
   public dcq d() {
      return this.i;
   }

   @Override
   public dcq e() {
      return this.j;
   }
}
