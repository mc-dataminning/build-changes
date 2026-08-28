import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfg(kn d, Optional<efs> e, elw f, Optional<js<edm>> g) implements dey {
   public static final MapCodec<dfg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kn.g.optionalFieldOf("offset", kn.i).forGetter(dfg::b),
               efs.b.optionalFieldOf("predicate").forGetter(dfg::c),
               elw.a.fieldOf("block_state").forGetter(dfg::d),
               edm.aj.optionalFieldOf("trigger_game_event").forGetter(dfg::e)
            )
            .apply($$0, dfg::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      jj $$5 = jj.a((kc)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public kn b() {
      return this.d;
   }

   public Optional<efs> c() {
      return this.e;
   }

   public elw d() {
      return this.f;
   }

   public Optional<js<edm>> e() {
      return this.g;
   }
}
