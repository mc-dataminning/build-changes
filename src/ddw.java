import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddw(km d, Optional<edx> e, ekb f, Optional<jr<ebr>> g) implements ddo {
   public static final MapCodec<ddw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               km.g.optionalFieldOf("offset", km.h).forGetter(ddw::b),
               edx.b.optionalFieldOf("predicate").forGetter(ddw::c),
               ekb.a.fieldOf("block_state").forGetter(ddw::d),
               ebr.aj.optionalFieldOf("trigger_game_event").forGetter(ddw::e)
            )
            .apply($$0, ddw::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      ji $$5 = ji.a((kb)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dZ(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public km b() {
      return this.d;
   }

   public Optional<edx> c() {
      return this.e;
   }

   public ekb d() {
      return this.f;
   }

   public Optional<jr<ebr>> e() {
      return this.g;
   }
}
