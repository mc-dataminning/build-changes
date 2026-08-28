import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dey(def d, def e, kl f, Optional<eew> g, ela h, Optional<jq<ecq>> i) implements dep {
   public static final MapCodec<dey> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               def.b.fieldOf("radius").forGetter(dey::b),
               def.b.fieldOf("height").forGetter(dey::c),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dey::d),
               eew.b.optionalFieldOf("predicate").forGetter(dey::e),
               ela.a.fieldOf("block_state").forGetter(dey::f),
               ecq.aj.optionalFieldOf("trigger_game_event").forGetter(dey::g)
            )
            .apply($$0, dey::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      bam $$6 = $$3.dZ();
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
   public MapCodec<dey> a() {
      return a;
   }

   public def b() {
      return this.d;
   }

   public def c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<eew> e() {
      return this.g;
   }

   public ela f() {
      return this.h;
   }

   public Optional<jq<ecq>> g() {
      return this.i;
   }
}
