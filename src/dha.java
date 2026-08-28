import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dha(dgh d, dgh e, ka f, Optional<ehz> g, eod h, Optional<jf<eft>> i) implements dgr {
   public static final MapCodec<dha> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgh.b.fieldOf("radius").forGetter(dha::b),
               dgh.b.fieldOf("height").forGetter(dha::c),
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dha::d),
               ehz.b.optionalFieldOf("predicate").forGetter(dha::e),
               eod.a.fieldOf("block_state").forGetter(dha::f),
               eft.aj.optionalFieldOf("trigger_game_event").forGetter(dha::g)
            )
            .apply($$0, dha::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
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
   public MapCodec<dha> a() {
      return a;
   }

   public dgh b() {
      return this.d;
   }

   public dgh c() {
      return this.e;
   }

   public ka d() {
      return this.f;
   }

   public Optional<ehz> e() {
      return this.g;
   }

   public eod f() {
      return this.h;
   }

   public Optional<jf<eft>> g() {
      return this.i;
   }
}
