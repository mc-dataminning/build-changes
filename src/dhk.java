import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhk(ka d, Optional<eik> e, eoq f, Optional<jf<ege>> g) implements dhc {
   public static final MapCodec<dhk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dhk::b),
               eik.b.optionalFieldOf("predicate").forGetter(dhk::c),
               eoq.a.fieldOf("block_state").forGetter(dhk::d),
               ege.aj.optionalFieldOf("trigger_game_event").forGetter(dhk::e)
            )
            .apply($$0, dhk::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhk> a() {
      return a;
   }

   public ka b() {
      return this.d;
   }

   public Optional<eik> c() {
      return this.e;
   }

   public eoq d() {
      return this.f;
   }

   public Optional<jf<ege>> e() {
      return this.g;
   }
}
