import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddy(km d, Optional<edz> e, ekd f, Optional<jr<ebt>> g) implements ddq {
   public static final MapCodec<ddy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               km.g.optionalFieldOf("offset", km.h).forGetter(ddy::b),
               edz.b.optionalFieldOf("predicate").forGetter(ddy::c),
               ekd.a.fieldOf("block_state").forGetter(ddy::d),
               ebt.aj.optionalFieldOf("trigger_game_event").forGetter(ddy::e)
            )
            .apply($$0, ddy::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dZ(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddy> a() {
      return a;
   }

   public km b() {
      return this.d;
   }

   public Optional<edz> c() {
      return this.e;
   }

   public ekd d() {
      return this.f;
   }

   public Optional<jr<ebt>> e() {
      return this.g;
   }
}
