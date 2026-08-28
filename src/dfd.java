import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfd(jq<ddr> c, bsj d) implements dez {
   public static final MapCodec<dfd> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddr.c.fieldOf("enchantment").forGetter(dfd::b), bsj.c.fieldOf("level").forGetter(dfd::c)).apply($$0, dfd::new)
   );

   @Override
   public void a(cxk $$0, ddx.a $$1, bam $$2, btc $$3) {
      $$1.b(this.c, bae.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dfd> a() {
      return b;
   }

   public jq<ddr> b() {
      return this.c;
   }

   public bsj c() {
      return this.d;
   }
}
