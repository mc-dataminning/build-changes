import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcs(dbz d, dbz e, kl f, Optional<ecm> g, eiq h, Optional<jq<eag>> i) implements dcj {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbz.b.fieldOf("radius").forGetter(dcs::b),
               dbz.b.fieldOf("height").forGetter(dcs::c),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dcs::d),
               ecm.b.optionalFieldOf("predicate").forGetter(dcs::e),
               eiq.a.fieldOf("block_state").forGetter(dcs::f),
               eag.aj.optionalFieldOf("trigger_game_event").forGetter(dcs::g)
            )
            .apply($$0, dcs::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      azs $$6 = $$3.ea();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jh $$9 : jh.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azk.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public dbz b() {
      return this.d;
   }

   public dbz c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<ecm> e() {
      return this.g;
   }

   public eiq f() {
      return this.h;
   }

   public Optional<jq<eag>> g() {
      return this.i;
   }
}
