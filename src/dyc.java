import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dyc(ja<dxv> b, float c, ewu d, @Nullable UUID e, @Nullable UUID f, @Nullable brv g) {
   public static final Codec<dyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lh.a.r().fieldOf("game_event").forGetter(dyc::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dyc::b),
               ewu.a.fieldOf("pos").forGetter(dyc::c),
               ju.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ju.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dyc($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dyc(ja<dxv> $$0, float $$1, ewu $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dyc(ja<dxv> $$0, float $$1, ewu $$2, @Nullable brv $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cE(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable brv $$0) {
      if ($$0 instanceof cms $$1 && $$1.t() != null) {
         return $$1.t().cE();
      }

      return null;
   }

   public Optional<brv> a(aqt $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<brv> b(aqt $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cms).map($$0x -> (cms)$$0x).map(cms::t).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ja<dxv> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ewu c() {
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
   public brv f() {
      return this.g;
   }
}
