import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgl(dfs d, dfs e, jz f, Optional<ehf> g, enj h, Optional<je<eez>> i) implements dgc {
   public static final MapCodec<dgl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfs.b.fieldOf("radius").forGetter(dgl::b),
               dfs.b.fieldOf("height").forGetter(dgl::c),
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgl::d),
               ehf.b.optionalFieldOf("predicate").forGetter(dgl::e),
               enj.a.fieldOf("block_state").forGetter(dgl::f),
               eez.aj.optionalFieldOf("trigger_game_event").forGetter(dgl::g)
            )
            .apply($$0, dgl::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.f);
      azv $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iu $$9 : iu.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azm.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   public dfs b() {
      return this.d;
   }

   public dfs c() {
      return this.e;
   }

   public jz d() {
      return this.f;
   }

   public Optional<ehf> e() {
      return this.g;
   }

   public enj f() {
      return this.h;
   }

   public Optional<je<eez>> g() {
      return this.i;
   }
}
