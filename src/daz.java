import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record daz(dah d, dah e, kh f, Optional<eac> g, egf h, Optional<jm<dxw>> i) implements daq {
   public static final MapCodec<daz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dah.b.fieldOf("radius").forGetter(daz::b),
               dah.b.fieldOf("height").forGetter(daz::c),
               kh.f.optionalFieldOf("offset", kh.g).forGetter(daz::d),
               eac.b.optionalFieldOf("predicate").forGetter(daz::e),
               egf.a.fieldOf("block_state").forGetter(daz::f),
               dxw.aj.optionalFieldOf("trigger_game_event").forGetter(daz::g)
            )
            .apply($$0, daz::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      jd $$5 = jd.a((jw)$$4).a(this.f);
      ayv $$6 = $$3.dT();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jd $$9 : jd.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayn.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<daz> a() {
      return a;
   }

   public dah b() {
      return this.d;
   }

   public dah c() {
      return this.e;
   }

   public kh d() {
      return this.f;
   }

   public Optional<eac> e() {
      return this.g;
   }

   public egf f() {
      return this.h;
   }

   public Optional<jm<dxw>> g() {
      return this.i;
   }
}
