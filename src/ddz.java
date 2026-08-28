import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddz(ddg d, ddg e, km f, Optional<edz> g, ekd h, Optional<jr<ebt>> i) implements ddq {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddg.b.fieldOf("radius").forGetter(ddz::b),
               ddg.b.fieldOf("height").forGetter(ddz::c),
               km.g.optionalFieldOf("offset", km.h).forGetter(ddz::d),
               edz.b.optionalFieldOf("predicate").forGetter(ddz::e),
               ekd.a.fieldOf("block_state").forGetter(ddz::f),
               ebt.aj.optionalFieldOf("trigger_game_event").forGetter(ddz::g)
            )
            .apply($$0, ddz::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.f);
      azh $$6 = $$3.dY();
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
   public MapCodec<ddz> a() {
      return a;
   }

   public ddg b() {
      return this.d;
   }

   public ddg c() {
      return this.e;
   }

   public km d() {
      return this.f;
   }

   public Optional<edz> e() {
      return this.g;
   }

   public ekd f() {
      return this.h;
   }

   public Optional<jr<ebt>> g() {
      return this.i;
   }
}
