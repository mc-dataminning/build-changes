import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcn(dbu d, dbu e, kj f, Optional<ebv> g, ehz h, Optional<jo<dzp>> i) implements dce {
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbu.b.fieldOf("radius").forGetter(dcn::b),
               dbu.b.fieldOf("height").forGetter(dcn::c),
               kj.f.optionalFieldOf("offset", kj.g).forGetter(dcn::d),
               ebv.b.optionalFieldOf("predicate").forGetter(dcn::e),
               ehz.a.fieldOf("block_state").forGetter(dcn::f),
               dzp.aj.optionalFieldOf("trigger_game_event").forGetter(dcn::g)
            )
            .apply($$0, dcn::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      jf $$5 = jf.a((jy)$$4).a(this.f);
      azn $$6 = $$3.dV();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jf $$9 : jf.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azf.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public dbu b() {
      return this.d;
   }

   public dbu c() {
      return this.e;
   }

   public kj d() {
      return this.f;
   }

   public Optional<ebv> e() {
      return this.g;
   }

   public ehz f() {
      return this.h;
   }

   public Optional<jo<dzp>> g() {
      return this.i;
   }
}
