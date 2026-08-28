import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dft(js<deh> c, bsv d) implements dfp {
   public static final MapCodec<dft> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(deh.c.fieldOf("enchantment").forGetter(dft::b), bsv.c.fieldOf("level").forGetter(dft::c)).apply($$0, dft::new)
   );

   @Override
   public void a(cxy $$0, den.a $$1, azs $$2, bto $$3) {
      $$1.b(this.c, azk.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dft> a() {
      return b;
   }

   public js<deh> b() {
      return this.c;
   }

   public bsv c() {
      return this.d;
   }
}
