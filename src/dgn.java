import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgn(day d, jz e, Optional<je<eez>> f) implements dgc {
   public static final MapCodec<dgn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               day.b.fieldOf("properties").forGetter(dgn::b),
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgn::c),
               eez.aj.optionalFieldOf("trigger_game_event").forGetter(dgn::d)
            )
            .apply($$0, dgn::new)
   );

   public dgn(day $$0) {
      this($$0, jz.i, Optional.of(eez.c));
   }

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.e);
      dzz $$6 = $$3.dV().a_($$5);
      dzz $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   public day b() {
      return this.d;
   }

   public jz c() {
      return this.e;
   }

   public Optional<je<eez>> d() {
      return this.f;
   }
}
