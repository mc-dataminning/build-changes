import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddz(km d, Optional<eea> e, eke f, Optional<jr<ebu>> g) implements ddr {
   public static final MapCodec<ddz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               km.g.optionalFieldOf("offset", km.h).forGetter(ddz::b),
               eea.b.optionalFieldOf("predicate").forGetter(ddz::c),
               eke.a.fieldOf("block_state").forGetter(ddz::d),
               ebu.aj.optionalFieldOf("trigger_game_event").forGetter(ddz::e)
            )
            .apply($$0, ddz::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddz> a() {
      return a;
   }

   public km b() {
      return this.d;
   }

   public Optional<eea> c() {
      return this.e;
   }

   public eke d() {
      return this.f;
   }

   public Optional<jr<ebu>> e() {
      return this.g;
   }
}
