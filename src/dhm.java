import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhm(kb d, Optional<eim> e, eos f, Optional<jg<egg>> g) implements dhe {
   public static final MapCodec<dhm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.g.optionalFieldOf("offset", kb.i).forGetter(dhm::b),
               eim.b.optionalFieldOf("predicate").forGetter(dhm::c),
               eos.a.fieldOf("block_state").forGetter(dhm::d),
               egg.aj.optionalFieldOf("trigger_game_event").forGetter(dhm::e)
            )
            .apply($$0, dhm::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      iw $$5 = iw.a((jq)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public kb b() {
      return this.d;
   }

   public Optional<eim> c() {
      return this.e;
   }

   public eos d() {
      return this.f;
   }

   public Optional<jg<egg>> e() {
      return this.g;
   }
}
