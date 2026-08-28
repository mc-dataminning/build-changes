import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgz(ka d, Optional<ehz> e, eod f, Optional<jf<eft>> g) implements dgr {
   public static final MapCodec<dgz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dgz::b),
               ehz.b.optionalFieldOf("predicate").forGetter(dgz::c),
               eod.a.fieldOf("block_state").forGetter(dgz::d),
               eft.aj.optionalFieldOf("trigger_game_event").forGetter(dgz::e)
            )
            .apply($$0, dgz::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dX(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public ka b() {
      return this.d;
   }

   public Optional<ehz> c() {
      return this.e;
   }

   public eod d() {
      return this.f;
   }

   public Optional<jf<eft>> e() {
      return this.g;
   }
}
