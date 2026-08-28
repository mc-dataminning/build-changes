import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgx(dge d, dge e, ka f, Optional<ehu> g, eny h, Optional<jf<efo>> i) implements dgo {
   public static final MapCodec<dgx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dge.b.fieldOf("radius").forGetter(dgx::b),
               dge.b.fieldOf("height").forGetter(dgx::c),
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dgx::d),
               ehu.b.optionalFieldOf("predicate").forGetter(dgx::e),
               eny.a.fieldOf("block_state").forGetter(dgx::f),
               efo.aj.optionalFieldOf("trigger_game_event").forGetter(dgx::g)
            )
            .apply($$0, dgx::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.f);
      azv $$6 = $$3.dX();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iv $$9 : iv.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azm.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgx> a() {
      return a;
   }

   public dge b() {
      return this.d;
   }

   public dge c() {
      return this.e;
   }

   public ka d() {
      return this.f;
   }

   public Optional<ehu> e() {
      return this.g;
   }

   public eny f() {
      return this.h;
   }

   public Optional<jf<efo>> g() {
      return this.i;
   }
}
