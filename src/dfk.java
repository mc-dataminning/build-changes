import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfk(jq<ddy> c, bsn d) implements dfg {
   public static final MapCodec<dfk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddy.c.fieldOf("enchantment").forGetter(dfk::b), bsn.c.fieldOf("level").forGetter(dfk::c)).apply($$0, dfk::new)
   );

   @Override
   public void a(cxo $$0, dee.a $$1, bam $$2, btg $$3) {
      $$1.b(this.c, bae.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dfk> a() {
      return b;
   }

   public jq<ddy> b() {
      return this.c;
   }

   public bsn c() {
      return this.d;
   }
}
