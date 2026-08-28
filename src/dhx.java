import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhx(dhe d, dhe e, kb f, Optional<eiw> g, epc h, Optional<jg<egq>> i) implements dho {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhe.b.fieldOf("radius").forGetter(dhx::b),
               dhe.b.fieldOf("height").forGetter(dhx::c),
               kb.g.optionalFieldOf("offset", kb.i).forGetter(dhx::d),
               eiw.b.optionalFieldOf("predicate").forGetter(dhx::e),
               epc.a.fieldOf("block_state").forGetter(dhx::f),
               egq.aj.optionalFieldOf("trigger_game_event").forGetter(dhx::g)
            )
            .apply($$0, dhx::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      iw $$5 = iw.a((jq)$$4).a(this.f);
      bai $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (iw $$9 : iw.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azz.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhe b() {
      return this.d;
   }

   public dhe c() {
      return this.e;
   }

   public kb d() {
      return this.f;
   }

   public Optional<eiw> e() {
      return this.g;
   }

   public epc f() {
      return this.h;
   }

   public Optional<jg<egq>> g() {
      return this.i;
   }
}
