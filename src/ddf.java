import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddf(cyo d, kl e, Optional<jq<ear>> f) implements dcu {
   public static final MapCodec<ddf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cyo.b.fieldOf("properties").forGetter(ddf::b),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(ddf::c),
               ear.aj.optionalFieldOf("trigger_game_event").forGetter(ddf::d)
            )
            .apply($$0, ddf::new)
   );

   public ddf(cyo $$0) {
      this($$0, kl.g, Optional.of(ear.c));
   }

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dvv $$6 = $$3.dV().a_($$5);
      dvv $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dV().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<ddf> a() {
      return a;
   }

   public cyo b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<ear>> d() {
      return this.f;
   }
}
