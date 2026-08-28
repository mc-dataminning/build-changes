import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfa(czq d, kl e, Optional<jq<ecq>> f) implements dep {
   public static final MapCodec<dfa> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czq.b.fieldOf("properties").forGetter(dfa::b),
               kl.g.optionalFieldOf("offset", kl.h).forGetter(dfa::c),
               ecq.aj.optionalFieldOf("trigger_game_event").forGetter(dfa::d)
            )
            .apply($$0, dfa::new)
   );

   public dfa(czq $$0) {
      this($$0, kl.h, Optional.of(ecq.c));
   }

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dxu $$6 = $$3.dW().a_($$5);
      dxu $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dW().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public czq b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<ecq>> d() {
      return this.f;
   }
}
