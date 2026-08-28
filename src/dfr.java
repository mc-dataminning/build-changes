import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfr(jw<deh> c, bsv d) implements dfp {
   public static final MapCodec<dfr> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.a(me.aS).fieldOf("enchantments").forGetter(dfr::b), bsv.c.fieldOf("cost").forGetter(dfr::c)).apply($$0, dfr::new)
   );

   @Override
   public void a(cxy $$0, den.a $$1, azs $$2, bto $$3) {
      for (dek $$5 : dej.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dfr> a() {
      return b;
   }

   public jw<deh> b() {
      return this.c;
   }

   public bsv c() {
      return this.d;
   }
}
