import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ecr(jq<eck> b, float c, fbr d, @Nullable UUID e, @Nullable UUID f, @Nullable bvb g) {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eck.aj.fieldOf("game_event").forGetter(ecr::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ecr::b),
               fbr.a.fieldOf("pos").forGetter(ecr::c),
               kk.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kk.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ecr($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ecr(jq<eck> $$0, float $$1, fbr $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ecr(jq<eck> $$0, float $$1, fbr $$2, @Nullable bvb $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bvb $$0) {
      if ($$0 instanceof cqh $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<bvb> a(arx $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bvb> b(arx $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cqh).map($$0x -> (cqh)$$0x).map(cqh::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jq<eck> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fbr c() {
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
   public bvb f() {
      return this.g;
   }
}
