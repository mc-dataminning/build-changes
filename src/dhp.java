import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhp(dca d, kb e, Optional<jg<egg>> f) implements dhe {
   public static final MapCodec<dhp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dca.b.fieldOf("properties").forGetter(dhp::b),
               kb.g.optionalFieldOf("offset", kb.i).forGetter(dhp::c),
               egg.aj.optionalFieldOf("trigger_game_event").forGetter(dhp::d)
            )
            .apply($$0, dhp::new)
   );

   public dhp(dca $$0) {
      this($$0, kb.i, Optional.of(egg.c));
   }

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      iw $$5 = iw.a((jq)$$4).a(this.e);
      ebg $$6 = $$3.dV().a_($$5);
      ebg $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dca b() {
      return this.d;
   }

   public kb c() {
      return this.e;
   }

   public Optional<jg<egg>> d() {
      return this.f;
   }
}
