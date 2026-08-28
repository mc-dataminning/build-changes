import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deq(kl d, Optional<eep> e, ekt f, Optional<jq<ecj>> g) implements dei {
   public static final MapCodec<deq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.f.optionalFieldOf("offset", kl.g).forGetter(deq::b),
               eep.b.optionalFieldOf("predicate").forGetter(deq::c),
               ekt.a.fieldOf("block_state").forGetter(deq::d),
               ecj.aj.optionalFieldOf("trigger_game_event").forGetter(deq::e)
            )
            .apply($$0, deq::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<eep> c() {
      return this.e;
   }

   public ekt d() {
      return this.f;
   }

   public Optional<jq<ecj>> e() {
      return this.g;
   }
}
