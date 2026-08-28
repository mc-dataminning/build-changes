import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfc(jq<ddq> c, bsf d) implements dey {
   public static final MapCodec<dfc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddq.c.fieldOf("enchantment").forGetter(dfc::b), bsf.c.fieldOf("level").forGetter(dfc::c)).apply($$0, dfc::new)
   );

   @Override
   public void a(cxg $$0, ddw.a $$1, bac $$2, bsy $$3) {
      $$1.b(this.c, azu.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dfc> a() {
      return b;
   }

   public jq<ddq> b() {
      return this.c;
   }

   public bsf c() {
      return this.d;
   }
}
