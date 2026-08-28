import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record der(ddy d, ddy e, km f, Optional<eev> g, ekz h, Optional<jr<ecp>> i) implements dei {
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddy.b.fieldOf("radius").forGetter(der::b),
               ddy.b.fieldOf("height").forGetter(der::c),
               km.g.optionalFieldOf("offset", km.h).forGetter(der::d),
               eev.b.optionalFieldOf("predicate").forGetter(der::e),
               ekz.a.fieldOf("block_state").forGetter(der::f),
               ecp.aj.optionalFieldOf("trigger_game_event").forGetter(der::g)
            )
            .apply($$0, der::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.f);
      azh $$6 = $$3.dX();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (ji $$9 : ji.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayz.h($$7)
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

   public km d() {
      return this.f;
   }

   public Optional<eev> e() {
      return this.g;
   }

   public ekz f() {
      return this.h;
   }

   public Optional<jr<ecp>> g() {
      return this.i;
   }
}
