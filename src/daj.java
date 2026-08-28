import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record daj(ke d, Optional<dzm> e, efp f, Optional<jj<dxg>> g) implements dab {
   public static final MapCodec<daj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ke.f.optionalFieldOf("offset", ke.g).forGetter(daj::b),
               dzm.b.optionalFieldOf("predicate").forGetter(daj::c),
               efp.a.fieldOf("block_state").forGetter(daj::d),
               dxg.aj.optionalFieldOf("trigger_game_event").forGetter(daj::e)
            )
            .apply($$0, daj::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ja $$5 = ja.a($$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dT(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   public ke b() {
      return this.d;
   }

   public Optional<dzm> c() {
      return this.e;
   }

   public efp d() {
      return this.f;
   }

   public Optional<jj<dxg>> e() {
      return this.g;
   }
}
