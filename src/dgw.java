import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgw(ka d, Optional<ehu> e, eny f, Optional<jf<efo>> g) implements dgo {
   public static final MapCodec<dgw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dgw::b),
               ehu.b.optionalFieldOf("predicate").forGetter(dgw::c),
               eny.a.fieldOf("block_state").forGetter(dgw::d),
               efo.aj.optionalFieldOf("trigger_game_event").forGetter(dgw::e)
            )
            .apply($$0, dgw::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dX(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   public ka b() {
      return this.d;
   }

   public Optional<ehu> c() {
      return this.e;
   }

   public eny d() {
      return this.f;
   }

   public Optional<jf<efo>> e() {
      return this.g;
   }
}
