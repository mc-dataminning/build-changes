import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddy(ddf d, ddf e, km f, Optional<edy> g, ekc h, Optional<jr<ebs>> i) implements ddp {
   public static final MapCodec<ddy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddf.b.fieldOf("radius").forGetter(ddy::b),
               ddf.b.fieldOf("height").forGetter(ddy::c),
               km.g.optionalFieldOf("offset", km.h).forGetter(ddy::d),
               edy.b.optionalFieldOf("predicate").forGetter(ddy::e),
               ekc.a.fieldOf("block_state").forGetter(ddy::f),
               ebs.aj.optionalFieldOf("trigger_game_event").forGetter(ddy::g)
            )
            .apply($$0, ddy::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
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
   public MapCodec<ddy> a() {
      return a;
   }

   public ddf b() {
      return this.d;
   }

   public ddf c() {
      return this.e;
   }

   public km d() {
      return this.f;
   }

   public Optional<edy> e() {
      return this.g;
   }

   public ekc f() {
      return this.h;
   }

   public Optional<jr<ebs>> g() {
      return this.i;
   }
}
