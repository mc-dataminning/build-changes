import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deq(ddx d, ddx e, kl f, Optional<eeq> g, eku h, Optional<jq<eck>> i) implements deh {
   public static final MapCodec<deq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddx.b.fieldOf("radius").forGetter(deq::b),
               ddx.b.fieldOf("height").forGetter(deq::c),
               kl.g.optionalFieldOf("offset", kl.h).forGetter(deq::d),
               eeq.b.optionalFieldOf("predicate").forGetter(deq::e),
               eku.a.fieldOf("block_state").forGetter(deq::f),
               eck.aj.optionalFieldOf("trigger_game_event").forGetter(deq::g)
            )
            .apply($$0, deq::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      bac $$6 = $$3.dZ();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jh $$9 : jh.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azu.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public ddx b() {
      return this.d;
   }

   public ddx c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<eeq> e() {
      return this.g;
   }

   public eku f() {
      return this.h;
   }

   public Optional<jq<eck>> g() {
      return this.i;
   }
}
