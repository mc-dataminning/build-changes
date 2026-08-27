import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dvh(iw<dva> b, float c, etp d, @Nullable UUID e, @Nullable UUID f, @Nullable brh g) {
   public static final Codec<dvh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ld.a.r().fieldOf("game_event").forGetter(dvh::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dvh::b),
               etp.a.fieldOf("pos").forGetter(dvh::c),
               jq.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jq.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dvh($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dvh(iw<dva> $$0, float $$1, etp $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dvh(iw<dva> $$0, float $$1, etp $$2, @Nullable brh $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cx(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable brh $$0) {
      if ($$0 instanceof clz $$1 && $$1.u() != null) {
         return $$1.u().cx();
      }

      return null;
   }

   public Optional<brh> a(aqh $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<brh> b(aqh $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof clz).map($$0x -> (clz)$$0x).map(clz::u).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public iw<dva> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public etp c() {
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
   public brh f() {
      return this.g;
   }
}
