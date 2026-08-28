import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgf(dfm d, dfm e, jz f, Optional<egu> g, emy h, Optional<je<eeo>> i) implements dfw {
   public static final MapCodec<dgf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfm.b.fieldOf("radius").forGetter(dgf::b),
               dfm.b.fieldOf("height").forGetter(dgf::c),
               jz.g.optionalFieldOf("offset", jz.i).forGetter(dgf::d),
               egu.b.optionalFieldOf("predicate").forGetter(dgf::e),
               emy.a.fieldOf("block_state").forGetter(dgf::f),
               eeo.aj.optionalFieldOf("trigger_game_event").forGetter(dgf::g)
            )
            .apply($$0, dgf::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      iu $$5 = iu.a((jo)$$4).a(this.f);
      azt $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iu $$9 : iu.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azk.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   public dfm b() {
      return this.d;
   }

   public dfm c() {
      return this.e;
   }

   public jz d() {
      return this.f;
   }

   public Optional<egu> e() {
      return this.g;
   }

   public emy f() {
      return this.h;
   }

   public Optional<je<eeo>> g() {
      return this.i;
   }
}
