import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbw(dbd d, dbd e, ki f, Optional<ebd> g, ehh h, Optional<jn<dyx>> i) implements dbn {
   public static final MapCodec<dbw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbd.b.fieldOf("radius").forGetter(dbw::b),
               dbd.b.fieldOf("height").forGetter(dbw::c),
               ki.f.optionalFieldOf("offset", ki.g).forGetter(dbw::d),
               ebd.b.optionalFieldOf("predicate").forGetter(dbw::e),
               ehh.a.fieldOf("block_state").forGetter(dbw::f),
               dyx.aj.optionalFieldOf("trigger_game_event").forGetter(dbw::g)
            )
            .apply($$0, dbw::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      je $$5 = je.a((jx)$$4).a(this.f);
      azk $$6 = $$3.dV();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (je $$9 : je.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azc.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbd b() {
      return this.d;
   }

   public dbd c() {
      return this.e;
   }

   public ki d() {
      return this.f;
   }

   public Optional<ebd> e() {
      return this.g;
   }

   public ehh f() {
      return this.h;
   }

   public Optional<jn<dyx>> g() {
      return this.i;
   }
}
