import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcu(cyd d, kl e, Optional<jq<eag>> f) implements dcj {
   public static final MapCodec<dcu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cyd.b.fieldOf("properties").forGetter(dcu::b),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dcu::c),
               eag.aj.optionalFieldOf("trigger_game_event").forGetter(dcu::d)
            )
            .apply($$0, dcu::new)
   );

   public dcu(cyd $$0) {
      this($$0, kl.g, Optional.of(eag.c));
   }

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dvj $$6 = $$3.dX().a_($$5);
      dvj $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dX().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcu> a() {
      return a;
   }

   public cyd b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<eag>> d() {
      return this.f;
   }
}
