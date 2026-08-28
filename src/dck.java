import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dck(dbr d, dbr e, ki f, Optional<ebr> g, ehv h, Optional<jn<dzl>> i) implements dcb {
   public static final MapCodec<dck> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbr.b.fieldOf("radius").forGetter(dck::b),
               dbr.b.fieldOf("height").forGetter(dck::c),
               ki.f.optionalFieldOf("offset", ki.g).forGetter(dck::d),
               ebr.b.optionalFieldOf("predicate").forGetter(dck::e),
               ehv.a.fieldOf("block_state").forGetter(dck::f),
               dzl.aj.optionalFieldOf("trigger_game_event").forGetter(dck::g)
            )
            .apply($$0, dck::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      je $$5 = je.a((jx)$$4).a(this.f);
      azl $$6 = $$3.dV();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (je $$9 : je.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azd.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dck> a() {
      return a;
   }

   public dbr b() {
      return this.d;
   }

   public dbr c() {
      return this.e;
   }

   public ki d() {
      return this.f;
   }

   public Optional<ebr> e() {
      return this.g;
   }

   public ehv f() {
      return this.h;
   }

   public Optional<jn<dzl>> g() {
      return this.i;
   }
}
