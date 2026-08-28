import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deq(km d, Optional<eev> e, ekz f, Optional<jr<ecp>> g) implements dei {
   public static final MapCodec<deq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               km.g.optionalFieldOf("offset", km.h).forGetter(deq::b),
               eev.b.optionalFieldOf("predicate").forGetter(deq::c),
               ekz.a.fieldOf("block_state").forGetter(deq::d),
               ecp.aj.optionalFieldOf("trigger_game_event").forGetter(deq::e)
            )
            .apply($$0, deq::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dX(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<deq> a() {
      return a;
   }

   public km b() {
      return this.d;
   }

   public Optional<eev> c() {
      return this.e;
   }

   public ekz d() {
      return this.f;
   }

   public Optional<jr<ecp>> e() {
      return this.g;
   }
}
