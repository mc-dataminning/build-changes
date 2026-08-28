import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record deh(jv<dcx> c, brn d) implements def {
   public static final MapCodec<deh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.aO).fieldOf("enchantments").forGetter(deh::b), brn.c.fieldOf("cost").forGetter(deh::c)).apply($$0, deh::new)
   );

   @Override
   public void a(cwn $$0, ddd.a $$1, azg $$2, bsg $$3) {
      for (dda $$5 : dcz.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<deh> a() {
      return b;
   }

   public jv<dcx> b() {
      return this.c;
   }

   public brn c() {
      return this.d;
   }
}
