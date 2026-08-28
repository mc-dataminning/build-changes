import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhw(kb d, Optional<eiw> e, epc f, Optional<jg<egq>> g) implements dho {
   public static final MapCodec<dhw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kb.g.optionalFieldOf("offset", kb.i).forGetter(dhw::b),
               eiw.b.optionalFieldOf("predicate").forGetter(dhw::c),
               epc.a.fieldOf("block_state").forGetter(dhw::d),
               egq.aj.optionalFieldOf("trigger_game_event").forGetter(dhw::e)
            )
            .apply($$0, dhw::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      iw $$5 = iw.a((jq)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dhw> a() {
      return a;
   }

   public kb b() {
      return this.d;
   }

   public Optional<eiw> c() {
      return this.e;
   }

   public epc d() {
      return this.f;
   }

   public Optional<jg<egq>> e() {
      return this.g;
   }
}
