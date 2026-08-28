import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhv(jj<dgl> c, btw d) implements dht {
   public static final MapCodec<dhv> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ju.a(mh.aR).fieldOf("enchantments").forGetter(dhv::b), btw.c.fieldOf("cost").forGetter(dhv::c)).apply($$0, dhv::new)
   );

   @Override
   public void a(czy $$0, dgr.a $$1, azx $$2, bup $$3) {
      for (dgo $$5 : dgn.b($$2, $$0, this.d.a($$2), this.c.a())) {
         $$1.b($$5.b(), $$5.c());
      }
   }

   @Override
   public MapCodec<dhv> a() {
      return b;
   }

   public jj<dgl> b() {
      return this.c;
   }

   public btw c() {
      return this.d;
   }
}
