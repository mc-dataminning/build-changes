import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record deb(cyr d, km e, Optional<jr<ebt>> f) implements ddq {
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cyr.b.fieldOf("properties").forGetter(deb::b),
               km.g.optionalFieldOf("offset", km.h).forGetter(deb::c),
               ebt.aj.optionalFieldOf("trigger_game_event").forGetter(deb::d)
            )
            .apply($$0, deb::new)
   );

   public deb(cyr $$0) {
      this($$0, km.h, Optional.of(ebt.c));
   }

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.e);
      dwx $$6 = $$3.dW().a_($$5);
      dwx $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dW().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public cyr b() {
      return this.d;
   }

   public km c() {
      return this.e;
   }

   public Optional<jr<ebt>> d() {
      return this.f;
   }
}
