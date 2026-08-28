import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcr(kl d, Optional<ecm> e, eiq f, Optional<jq<eag>> g) implements dcj {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dcr::b),
               ecm.b.optionalFieldOf("predicate").forGetter(dcr::c),
               eiq.a.fieldOf("block_state").forGetter(dcr::d),
               eag.aj.optionalFieldOf("trigger_game_event").forGetter(dcr::e)
            )
            .apply($$0, dcr::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.ea(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<ecm> c() {
      return this.e;
   }

   public eiq d() {
      return this.f;
   }

   public Optional<jq<eag>> e() {
      return this.g;
   }
}
