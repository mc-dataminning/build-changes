import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddn(ju<dcd> c, brp d) implements ddl {
   public static final MapCodec<ddn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(ma.aM).fieldOf("enchantments").forGetter(ddn::b), brp.c.fieldOf("cost").forGetter(ddn::c)).apply($$0, ddn::new)
   );

   @Override
   public void a(cwm $$0, dcj.a $$1, azu $$2, bsi $$3) {
      for (dcg $$5 : dcf.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<ddn> a() {
      return b;
   }

   public ju<dcd> b() {
      return this.c;
   }

   public brp c() {
      return this.d;
   }
}
