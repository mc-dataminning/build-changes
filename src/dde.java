import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dde(jq<dbs> c, bri d) implements dda {
   public static final MapCodec<dde> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbs.c.fieldOf("enchantment").forGetter(dde::b), bri.c.fieldOf("level").forGetter(dde::c)).apply($$0, dde::new)
   );

   @Override
   public void a(cwb $$0, dby.a $$1, azs $$2, bsb $$3) {
      $$1.b(this.c, azk.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dde> a() {
      return b;
   }

   public jq<dbs> b() {
      return this.c;
   }

   public bri c() {
      return this.d;
   }
}
