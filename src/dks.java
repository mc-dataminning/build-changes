import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dks(dkl b, float c, eif d, @Nullable UUID e, @Nullable UUID f, @Nullable bjt g) {
   public static final Codec<dks> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.b.q().fieldOf("game_event").forGetter(dks::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dks::b),
               eif.a.fieldOf("pos").forGetter(dks::c),
               iv.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               iv.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dks($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dks(dkl $$0, float $$1, eif $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dks(dkl $$0, float $$1, eif $$2, @Nullable bjt $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bjt $$0) {
      if ($$0 instanceof cdp $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<bjt> a(alq $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bjt> b(alq $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cdp).map($$0x -> (cdp)$$0x).map(cdp::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dkl a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eif c() {
      return this.d;
   }

   @Nullable
   public UUID d() {
      return this.e;
   }

   @Nullable
   public UUID e() {
      return this.f;
   }

   @Nullable
   public bjt f() {
      return this.g;
   }
}
