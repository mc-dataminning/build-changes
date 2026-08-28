import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbl(jm<daa> c, bpv d) implements dbh {
   public static final MapCodec<dbl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(daa.c.fieldOf("enchantment").forGetter(dbl::b), bpv.c.fieldOf("level").forGetter(dbl::c)).apply($$0, dbl::new)
   );

   @Override
   public void a(cuo $$0, dag.a $$1, ayv $$2, bqo $$3) {
      $$1.b(this.c, ayn.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dbl> a() {
      return b;
   }

   public jm<daa> b() {
      return this.c;
   }

   public bpv c() {
      return this.d;
   }
}
