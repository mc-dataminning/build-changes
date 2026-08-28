import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dej(jv<dcz> c, bro d) implements deh {
   public static final MapCodec<dej> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.aO).fieldOf("enchantments").forGetter(dej::b), bro.c.fieldOf("cost").forGetter(dej::c)).apply($$0, dej::new)
   );

   @Override
   public void a(cwp $$0, ddf.a $$1, azh $$2, bsh $$3) {
      for (ddc $$5 : ddb.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dej> a() {
      return b;
   }

   public jv<dcz> b() {
      return this.c;
   }

   public bro c() {
      return this.d;
   }
}
