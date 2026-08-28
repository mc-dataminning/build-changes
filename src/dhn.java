import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhn(dby d, ka e, Optional<jf<ege>> f) implements dhc {
   public static final MapCodec<dhn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dby.b.fieldOf("properties").forGetter(dhn::b),
               ka.g.optionalFieldOf("offset", ka.i).forGetter(dhn::c),
               ege.aj.optionalFieldOf("trigger_game_event").forGetter(dhn::d)
            )
            .apply($$0, dhn::new)
   );

   public dhn(dby $$0) {
      this($$0, ka.i, Optional.of(ege.c));
   }

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      iv $$5 = iv.a((jp)$$4).a(this.e);
      ebe $$6 = $$3.dV().a_($$5);
      ebe $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhn> a() {
      return a;
   }

   public dby b() {
      return this.d;
   }

   public ka c() {
      return this.e;
   }

   public Optional<jf<ege>> d() {
      return this.f;
   }
}
