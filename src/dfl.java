import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfl(jq<ddz> c, bso d) implements dfh {
   public static final MapCodec<dfl> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddz.c.fieldOf("enchantment").forGetter(dfl::b), bso.c.fieldOf("level").forGetter(dfl::c)).apply($$0, dfl::new)
   );

   @Override
   public void a(cxp $$0, def.a $$1, bam $$2, bth $$3) {
      $$1.b(this.c, bae.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dfl> a() {
      return b;
   }

   public jq<ddz> b() {
      return this.c;
   }

   public bso c() {
      return this.d;
   }
}
