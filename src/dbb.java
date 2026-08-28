import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbb(daj d, daj e, kh f, Optional<eaf> g, egj h, Optional<jm<dxz>> i) implements das {
   public static final MapCodec<dbb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               daj.b.fieldOf("radius").forGetter(dbb::b),
               daj.b.fieldOf("height").forGetter(dbb::c),
               kh.f.optionalFieldOf("offset", kh.g).forGetter(dbb::d),
               eaf.b.optionalFieldOf("predicate").forGetter(dbb::e),
               egj.a.fieldOf("block_state").forGetter(dbb::f),
               dxz.aj.optionalFieldOf("trigger_game_event").forGetter(dbb::g)
            )
            .apply($$0, dbb::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      jd $$5 = jd.a((jw)$$4).a(this.f);
      ayw $$6 = $$3.dR();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jd $$9 : jd.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayo.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dbb> a() {
      return a;
   }

   public daj b() {
      return this.d;
   }

   public daj c() {
      return this.e;
   }

   public kh d() {
      return this.f;
   }

   public Optional<eaf> e() {
      return this.g;
   }

   public egj f() {
      return this.h;
   }

   public Optional<jm<dxz>> g() {
      return this.i;
   }
}
