import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddx(km d, Optional<edy> e, ekc f, Optional<jr<ebs>> g) implements ddp {
   public static final MapCodec<ddx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               km.g.optionalFieldOf("offset", km.h).forGetter(ddx::b),
               edy.b.optionalFieldOf("predicate").forGetter(ddx::c),
               ekc.a.fieldOf("block_state").forGetter(ddx::d),
               ebs.aj.optionalFieldOf("trigger_game_event").forGetter(ddx::e)
            )
            .apply($$0, ddx::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public km b() {
      return this.d;
   }

   public Optional<edy> c() {
      return this.e;
   }

   public ekc d() {
      return this.f;
   }

   public Optional<jr<ebs>> e() {
      return this.g;
   }
}
