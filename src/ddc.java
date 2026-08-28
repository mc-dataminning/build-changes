import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddc(ju<dbs> c, bri d) implements dda {
   public static final MapCodec<ddc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(lz.aM).fieldOf("enchantments").forGetter(ddc::b), bri.c.fieldOf("cost").forGetter(ddc::c)).apply($$0, ddc::new)
   );

   @Override
   public void a(cwb $$0, dby.a $$1, azs $$2, bsb $$3) {
      for (dbv $$5 : dbu.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.a, $$5.b);
      }
   }

   @Override
   public MapCodec<ddc> a() {
      return b;
   }

   public ju<dbs> b() {
      return this.c;
   }

   public bri c() {
      return this.d;
   }
}
