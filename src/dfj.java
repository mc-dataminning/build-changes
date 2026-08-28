import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfj(ju<ddz> c, bso d) implements dfh {
   public static final MapCodec<dfj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.aO).fieldOf("enchantments").forGetter(dfj::b), bso.c.fieldOf("cost").forGetter(dfj::c)).apply($$0, dfj::new)
   );

   @Override
   public void a(cxp $$0, def.a $$1, bam $$2, bth $$3) {
      for (dec $$5 : deb.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dfj> a() {
      return b;
   }

   public ju<ddz> b() {
      return this.c;
   }

   public bso c() {
      return this.d;
   }
}
