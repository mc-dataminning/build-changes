import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dep(kl d, Optional<eeq> e, eku f, Optional<jq<eck>> g) implements deh {
   public static final MapCodec<dep> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.g.optionalFieldOf("offset", kl.h).forGetter(dep::b),
               eeq.b.optionalFieldOf("predicate").forGetter(dep::c),
               eku.a.fieldOf("block_state").forGetter(dep::d),
               eck.aj.optionalFieldOf("trigger_game_event").forGetter(dep::e)
            )
            .apply($$0, dep::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dZ(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dep> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<eeq> c() {
      return this.e;
   }

   public eku d() {
      return this.f;
   }

   public Optional<jq<eck>> e() {
      return this.g;
   }
}
