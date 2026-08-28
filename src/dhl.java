import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhl(dgs d, dgs e, ka f, Optional<eik> g, eoq h, Optional<jf<ege>> i) implements dhc {
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgs.b.fieldOf("radius").forGetter(dhl::b),
               dgs.b.fieldOf("height").forGetter(dhl::c),
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dhl::d),
               eik.b.optionalFieldOf("predicate").forGetter(dhl::e),
               eoq.a.fieldOf("block_state").forGetter(dhl::f),
               ege.aj.optionalFieldOf("trigger_game_event").forGetter(dhl::g)
            )
            .apply($$0, dhl::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.f);
      azx $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iv $$9 : iv.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azo.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dgs b() {
      return this.d;
   }

   public dgs c() {
      return this.e;
   }

   public ka d() {
      return this.f;
   }

   public Optional<eik> e() {
      return this.g;
   }

   public eoq f() {
      return this.h;
   }

   public Optional<jf<ege>> g() {
      return this.i;
   }
}
