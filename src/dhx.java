import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhx(jf<dgl> c, btw d) implements dht {
   public static final MapCodec<dhx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgl.c.fieldOf("enchantment").forGetter(dhx::b), btw.c.fieldOf("level").forGetter(dhx::c)).apply($$0, dhx::new)
   );

   @Override
   public void a(czy $$0, dgr.a $$1, azx $$2, bup $$3) {
      $$1.b(this.c, azo.a(this.d.a($$2), this.c.a().d(), this.c.a().e()));
   }

   @Override
   public MapCodec<dhx> a() {
      return b;
   }

   public jf<dgl> b() {
      return this.c;
   }

   public btw c() {
      return this.d;
   }
}
