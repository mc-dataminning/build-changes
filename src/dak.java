import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dak(czs d, czs e, ke f, Optional<dzm> g, efp h, Optional<jj<dxg>> i) implements dab {
   public static final MapCodec<dak> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czs.b.fieldOf("radius").forGetter(dak::b),
               czs.b.fieldOf("height").forGetter(dak::c),
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dak::d),
               dzm.b.optionalFieldOf("predicate").forGetter(dak::e),
               efp.a.fieldOf("block_state").forGetter(dak::f),
               dxg.aj.optionalFieldOf("trigger_game_event").forGetter(dak::g)
            )
            .apply($$0, dak::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ja $$5 = ja.a($$4).a(this.f);
      ayo $$6 = $$3.dT();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (ja $$9 : ja.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayg.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   public czs b() {
      return this.d;
   }

   public czs c() {
      return this.e;
   }

   public ke d() {
      return this.f;
   }

   public Optional<dzm> e() {
      return this.g;
   }

   public efp f() {
      return this.h;
   }

   public Optional<jj<dxg>> g() {
      return this.i;
   }
}
