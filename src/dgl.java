import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dgl(dge d, dge e, jf<buz> f) implements dgo {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dge.b.fieldOf("min_damage").forGetter(dgl::b), dge.b.fieldOf("max_damage").forGetter(dgl::c), buz.b.fieldOf("damage_type").forGetter(dgl::d)
            )
            .apply($$0, dgl::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      float $$5 = azm.b($$3.dX(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bux(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dge b() {
      return this.d;
   }

   public dge c() {
      return this.e;
   }

   public jf<buz> d() {
      return this.f;
   }
}
