import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddp(jq<dcd> c, brp d) implements ddl {
   public static final MapCodec<ddp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcd.c.fieldOf("enchantment").forGetter(ddp::b), brp.c.fieldOf("level").forGetter(ddp::c)).apply($$0, ddp::new)
   );

   @Override
   public void a(cwm $$0, dcj.a $$1, azu $$2, bsi $$3) {
      $$1.b(this.c, azm.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<ddp> a() {
      return b;
   }

   public jq<dcd> b() {
      return this.c;
   }

   public brp c() {
      return this.d;
   }
}
