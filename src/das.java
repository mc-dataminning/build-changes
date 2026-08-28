import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record das(jn<czj> c, bpi d) implements daq {
   public static final MapCodec<das> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a(lr.aK).fieldOf("enchantments").forGetter(das::b), bpi.c.fieldOf("cost").forGetter(das::c)).apply($$0, das::new)
   );

   @Override
   public void a(cua $$0, czp.a $$1, aym $$2, dcd $$3, ja $$4) {
      for (czm $$6 : czl.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$6.a, $$6.b);
      }
   }

   @Override
   public MapCodec<das> a() {
      return b;
   }

   public jn<czj> b() {
      return this.c;
   }

   public bpi c() {
      return this.d;
   }
}
