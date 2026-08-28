import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddd(dck d, dck e, kl f, Optional<ecx> g, ejb h, Optional<jq<ear>> i) implements dcu {
   public static final MapCodec<ddd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dck.b.fieldOf("radius").forGetter(ddd::b),
               dck.b.fieldOf("height").forGetter(ddd::c),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(ddd::d),
               ecx.b.optionalFieldOf("predicate").forGetter(ddd::e),
               ejb.a.fieldOf("block_state").forGetter(ddd::f),
               ear.aj.optionalFieldOf("trigger_game_event").forGetter(ddd::g)
            )
            .apply($$0, ddd::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      azu $$6 = $$3.dY();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jh $$9 : jh.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azm.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<ddd> a() {
      return a;
   }

   public dck b() {
      return this.d;
   }

   public dck c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<ecx> e() {
      return this.g;
   }

   public ejb f() {
      return this.h;
   }

   public Optional<jq<ear>> g() {
      return this.i;
   }
}
