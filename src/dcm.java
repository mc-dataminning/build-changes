import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcm(kj d, Optional<ebv> e, ehz f, Optional<jo<dzp>> g) implements dce {
   public static final MapCodec<dcm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kj.f.optionalFieldOf("offset", kj.g).forGetter(dcm::b),
               ebv.b.optionalFieldOf("predicate").forGetter(dcm::c),
               ehz.a.fieldOf("block_state").forGetter(dcm::d),
               dzp.aj.optionalFieldOf("trigger_game_event").forGetter(dcm::e)
            )
            .apply($$0, dcm::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      jf $$5 = jf.a((jy)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dV(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcm> a() {
      return a;
   }

   public kj b() {
      return this.d;
   }

   public Optional<ebv> c() {
      return this.e;
   }

   public ehz d() {
      return this.f;
   }

   public Optional<jo<dzp>> e() {
      return this.g;
   }
}
