import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddx(dde d, dde e, km f, Optional<edx> g, ekb h, Optional<jr<ebr>> i) implements ddo {
   public static final MapCodec<ddx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dde.b.fieldOf("radius").forGetter(ddx::b),
               dde.b.fieldOf("height").forGetter(ddx::c),
               km.g.optionalFieldOf("offset", km.h).forGetter(ddx::d),
               edx.b.optionalFieldOf("predicate").forGetter(ddx::e),
               ekb.a.fieldOf("block_state").forGetter(ddx::f),
               ebr.aj.optionalFieldOf("trigger_game_event").forGetter(ddx::g)
            )
            .apply($$0, ddx::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.f);
      azg $$6 = $$3.dZ();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (ji $$9 : ji.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayy.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public dde b() {
      return this.d;
   }

   public dde c() {
      return this.e;
   }

   public km d() {
      return this.f;
   }

   public Optional<edx> e() {
      return this.g;
   }

   public ekb f() {
      return this.h;
   }

   public Optional<jr<ebr>> g() {
      return this.i;
   }
}
