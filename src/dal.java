import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dal(czt d, czt e, ke f, Optional<dzn> g, efq h, Optional<jj<dxh>> i) implements dac {
   public static final MapCodec<dal> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czt.b.fieldOf("radius").forGetter(dal::b),
               czt.b.fieldOf("height").forGetter(dal::c),
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dal::d),
               dzn.b.optionalFieldOf("predicate").forGetter(dal::e),
               efq.a.fieldOf("block_state").forGetter(dal::f),
               dxh.aj.optionalFieldOf("trigger_game_event").forGetter(dal::g)
            )
            .apply($$0, dal::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ja $$5 = ja.a($$4).a(this.f);
      ayo $$6 = $$3.dU();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (ja $$9 : ja.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)ayg.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   public czt b() {
      return this.d;
   }

   public czt c() {
      return this.e;
   }

   public ke d() {
      return this.f;
   }

   public Optional<dzn> e() {
      return this.g;
   }

   public efq f() {
      return this.h;
   }

   public Optional<jj<dxh>> g() {
      return this.i;
   }
}
