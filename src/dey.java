import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dey(kl d, Optional<eex> e, elb f, Optional<jq<ecr>> g) implements deq {
   public static final MapCodec<dey> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.g.optionalFieldOf("offset", kl.h).forGetter(dey::b),
               eex.b.optionalFieldOf("predicate").forGetter(dey::c),
               elb.a.fieldOf("block_state").forGetter(dey::d),
               ecr.aj.optionalFieldOf("trigger_game_event").forGetter(dey::e)
            )
            .apply($$0, dey::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dZ(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<eex> c() {
      return this.e;
   }

   public elb d() {
      return this.f;
   }

   public Optional<jq<ecr>> e() {
      return this.g;
   }
}
