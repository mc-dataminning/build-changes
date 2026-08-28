import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record der(ddy d, ddy e, kl f, Optional<eep> g, ekt h, Optional<jq<ecj>> i) implements dei {
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddy.b.fieldOf("radius").forGetter(der::b),
               ddy.b.fieldOf("height").forGetter(der::c),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(der::d),
               eep.b.optionalFieldOf("predicate").forGetter(der::e),
               ekt.a.fieldOf("block_state").forGetter(der::f),
               ecj.aj.optionalFieldOf("trigger_game_event").forGetter(der::g)
            )
            .apply($$0, der::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      bam $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jh $$9 : jh.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)bae.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public ddy b() {
      return this.d;
   }

   public ddy c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<eep> e() {
      return this.g;
   }

   public ekt f() {
      return this.h;
   }

   public Optional<jq<ecj>> g() {
      return this.i;
   }
}
