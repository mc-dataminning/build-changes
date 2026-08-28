import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dak(ke d, Optional<dzn> e, efq f, Optional<jj<dxh>> g) implements dac {
   public static final MapCodec<dak> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ke.f.optionalFieldOf("offset", ke.g).forGetter(dak::b),
               dzn.b.optionalFieldOf("predicate").forGetter(dak::c),
               efq.a.fieldOf("block_state").forGetter(dak::d),
               dxh.aj.optionalFieldOf("trigger_game_event").forGetter(dak::e)
            )
            .apply($$0, dak::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ja $$5 = ja.a($$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dU(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dak> a() {
      return a;
   }

   public ke b() {
      return this.d;
   }

   public Optional<dzn> c() {
      return this.e;
   }

   public efq d() {
      return this.f;
   }

   public Optional<jj<dxh>> e() {
      return this.g;
   }
}
