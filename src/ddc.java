import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddc(kl d, Optional<ecx> e, ejb f, Optional<jq<ear>> g) implements dcu {
   public static final MapCodec<ddc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kl.f.optionalFieldOf("offset", kl.g).forGetter(ddc::b),
               ecx.b.optionalFieldOf("predicate").forGetter(ddc::c),
               ejb.a.fieldOf("block_state").forGetter(ddc::d),
               ear.aj.optionalFieldOf("trigger_game_event").forGetter(ddc::e)
            )
            .apply($$0, ddc::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.d);
      if (this.e.map($$2x -> $$2x.test($$0, $$5)).orElse(true) && $$0.b($$5, this.f.a($$3.dY(), $$5))) {
         this.g.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddc> a() {
      return a;
   }

   public kl b() {
      return this.d;
   }

   public Optional<ecx> c() {
      return this.e;
   }

   public ejb d() {
      return this.f;
   }

   public Optional<jq<ear>> e() {
      return this.g;
   }
}
