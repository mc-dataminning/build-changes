import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcy(cyh d, kl e, Optional<jq<eak>> f) implements dcn {
   public static final MapCodec<dcy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               cyh.b.fieldOf("properties").forGetter(dcy::b),
               kl.f.optionalFieldOf("offset", kl.g).forGetter(dcy::c),
               eak.aj.optionalFieldOf("trigger_game_event").forGetter(dcy::d)
            )
            .apply($$0, dcy::new)
   );

   public dcy(cyh $$0) {
      this($$0, kl.g, Optional.of(eak.c));
   }

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      jh $$5 = jh.a((ka)$$4).a(this.e);
      dvo $$6 = $$3.dY().a_($$5);
      dvo $$7 = this.d.a($$6);
      if (!$$6.equals($$7) && $$3.dY().a($$5, $$7, 3)) {
         this.f.ifPresent($$3x -> $$0.a($$3, $$3x, $$5));
      }
   }

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   public cyh b() {
      return this.d;
   }

   public kl c() {
      return this.e;
   }

   public Optional<jq<eak>> d() {
      return this.f;
   }
}
