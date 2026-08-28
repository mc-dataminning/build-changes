import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfj(czx d, kn e, Optional<js<edm>> f) implements dey {
   public static final MapCodec<dfj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czx.b.fieldOf("properties").forGetter(dfj::b),
               kn.g.optionalFieldOf("offset", kn.i).forGetter(dfj::c),
               edm.aj.optionalFieldOf("trigger_game_event").forGetter(dfj::d)
            )
            .apply($$0, dfj::new)
   );

   public dfj(czx $$0) {
      this($$0, kn.i, Optional.of(edm.c));
   }

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      jj $$5 = jj.a((kc)$$4).a(this.e);
      dym $$6 = $$3.dV().a_($$5);
      dym $$7 = this.d.a($$6);
      if ($$6 != $$7 && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   public czx b() {
      return this.d;
   }

   public kn c() {
      return this.e;
   }

   public Optional<js<edm>> d() {
      return this.f;
   }
}
