import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhn(dgu d, dgu e, kb f, Optional<eim> g, eos h, Optional<jg<egg>> i) implements dhe {
   public static final MapCodec<dhn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgu.b.fieldOf("radius").forGetter(dhn::b),
               dgu.b.fieldOf("height").forGetter(dhn::c),
               kb.g.optionalFieldOf("offset", kb.i).forGetter(dhn::d),
               eim.b.optionalFieldOf("predicate").forGetter(dhn::e),
               eos.a.fieldOf("block_state").forGetter(dhn::f),
               egg.aj.optionalFieldOf("trigger_game_event").forGetter(dhn::g)
            )
            .apply($$0, dhn::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      iw $$5 = iw.a((jq)$$4).a(this.f);
      azz $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iw $$9 : iw.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azq.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dgu b() {
      return this.d;
   }

   public dgu c() {
      return this.e;
   }

   public kb d() {
      return this.f;
   }

   public Optional<eim> e() {
      return this.g;
   }

   public eos f() {
      return this.h;
   }

   public Optional<jg<egg>> g() {
      return this.i;
   }
}
