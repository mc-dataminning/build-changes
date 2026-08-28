import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dez(deg d, deg e, kl f, Optional<eex> g, elb h, Optional<jq<ecr>> i) implements deq {
   public static final MapCodec<dez> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               deg.b.fieldOf("radius").forGetter(dez::b),
               deg.b.fieldOf("height").forGetter(dez::c),
               kl.g.optionalFieldOf("offset", kl.h).forGetter(dez::d),
               eex.b.optionalFieldOf("predicate").forGetter(dez::e),
               elb.a.fieldOf("block_state").forGetter(dez::f),
               ecr.aj.optionalFieldOf("trigger_game_event").forGetter(dez::g)
            )
            .apply($$0, dez::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      bam $$6 = $$3.dZ();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jh $$9 : jh.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)bae.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dez> a() {
      return a;
   }

   public deg b() {
      return this.d;
   }

   public deg c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<eex> e() {
      return this.g;
   }

   public elb f() {
      return this.h;
   }

   public Optional<jq<ecr>> g() {
      return this.i;
   }
}
