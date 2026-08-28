import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgp(jz d, Optional<ehn> e, enr f, Optional<je<efh>> g) implements dgh {
   public static final MapCodec<dgp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgp::b),
               ehn.b.optionalFieldOf("predicate").forGetter(dgp::c),
               enr.a.fieldOf("block_state").forGetter(dgp::d),
               efh.aj.optionalFieldOf("trigger_game_event").forGetter(dgp::e)
            )
            .apply($$0, dgp::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public jz b() {
      return this.d;
   }

   public Optional<ehn> c() {
      return this.e;
   }

   public enr d() {
      return this.f;
   }

   public Optional<je<efh>> e() {
      return this.g;
   }
}
