import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dej(jr<dcx> c, brn d) implements def {
   public static final MapCodec<dej> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcx.c.fieldOf("enchantment").forGetter(dej::b), brn.c.fieldOf("level").forGetter(dej::c)).apply($$0, dej::new)
   );

   @Override
   public void a(cwn $$0, ddd.a $$1, azg $$2, bsg $$3) {
      $$1.b(this.c, ayy.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dej> a() {
      return b;
   }

   public jr<dcx> b() {
      return this.c;
   }

   public brn c() {
      return this.d;
   }
}
