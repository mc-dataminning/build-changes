import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dnr(dnk b, float c, elm d, @Nullable UUID e, @Nullable UUID f, @Nullable blp g) {
   public static final Codec<dnr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a.q().fieldOf("game_event").forGetter(dnr::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dnr::b),
               elm.a.fieldOf("pos").forGetter(dnr::c),
               ja.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ja.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dnr($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dnr(dnk $$0, float $$1, elm $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dnr(dnk $$0, float $$1, elm $$2, @Nullable blp $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable blp $$0) {
      if ($$0 instanceof cft $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<blp> a(amz $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<blp> b(amz $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cft).map($$0x -> (cft)$$0x).map(cft::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dnk a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public elm c() {
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
   public blp f() {
      return this.g;
   }
}
