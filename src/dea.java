import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dea(ddh d, ddh e, km f, Optional<eea> g, eke h, Optional<jr<ebu>> i) implements ddr {
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddh.b.fieldOf("radius").forGetter(dea::b),
               ddh.b.fieldOf("height").forGetter(dea::c),
               km.g.optionalFieldOf("offset", km.h).forGetter(dea::d),
               eea.b.optionalFieldOf("predicate").forGetter(dea::e),
               eke.a.fieldOf("block_state").forGetter(dea::f),
               ebu.aj.optionalFieldOf("trigger_game_event").forGetter(dea::g)
            )
            .apply($$0, dea::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.f);
      azh $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (ji $$9 : ji.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayz.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public ddh b() {
      return this.d;
   }

   public ddh c() {
      return this.e;
   }

   public km d() {
      return this.f;
   }

   public Optional<eea> e() {
      return this.g;
   }

   public eke f() {
      return this.h;
   }

   public Optional<jr<ebu>> g() {
      return this.i;
   }
}
