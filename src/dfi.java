import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfi(ju<ddy> c, bsn d) implements dfg {
   public static final MapCodec<dfi> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.aO).fieldOf("enchantments").forGetter(dfi::b), bsn.c.fieldOf("cost").forGetter(dfi::c)).apply($$0, dfi::new)
   );

   @Override
   public void a(cxo $$0, dee.a $$1, bam $$2, btg $$3) {
      for (deb $$5 : dea.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<dfi> a() {
      return b;
   }

   public ju<ddy> b() {
      return this.c;
   }

   public bsn c() {
      return this.d;
   }
}
