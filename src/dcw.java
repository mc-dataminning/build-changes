import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcw(dcd d, dcd e, kl f, Optional<ecq> g, eiu h, Optional<jq<eak>> i) implements dcn {
   public static final MapCodec<dcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dcd.b.fieldOf("radius").forGetter(dcw::b),
               dcd.b.fieldOf("height").forGetter(dcw::c),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dcw::d),
               ecq.b.optionalFieldOf("predicate").forGetter(dcw::e),
               eiu.a.fieldOf("block_state").forGetter(dcw::f),
               eak.aj.optionalFieldOf("trigger_game_event").forGetter(dcw::g)
            )
            .apply($$0, dcw::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.f);
      azv $$6 = $$3.eb();
      int $$7 = (int)this.d.a($$1);
      int $$8 = (int)this.e.a($$1);

      for (jh $$9 : jh.c($$5.b(-$$7, 0, -$$7), $$5.b($$7, Math.min($$8 - 1, 0), $$7))) {
         if ($$9.c($$4.a(), (double)$$9.v() + 0.5, $$4.c()) < (double)azn.h($$7)
            && this.g.map($$2x -> $$2x.test($$0, $$9)).orElse(true)
            && $$0.b($$9, this.h.a($$6, $$9))) {
            this.i.ifPresent($$3x -> $$0.a($$3, $$3x, $$9));
         }
      }
   }

   @Override
   public MapCodec<dcw> a() {
      return a;
   }

   public dcd b() {
      return this.d;
   }

   public dcd c() {
      return this.e;
   }

   public kl d() {
      return this.f;
   }

   public Optional<ecq> e() {
      return this.g;
   }

   public eiu f() {
      return this.h;
   }

   public Optional<jq<eak>> g() {
      return this.i;
   }
}
