import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dnx(dnq b, float c, els d, @Nullable UUID e, @Nullable UUID f, @Nullable blu g) {
   public static final Codec<dnx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a.q().fieldOf("game_event").forGetter(dnx::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dnx::b),
               els.a.fieldOf("pos").forGetter(dnx::c),
               ja.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ja.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dnx($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dnx(dnq $$0, float $$1, els $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dnx(dnq $$0, float $$1, els $$2, @Nullable blu $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable blu $$0) {
      if ($$0 instanceof cfz $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<blu> a(and $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<blu> b(and $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cfz).map($$0x -> (cfz)$$0x).map(cfz::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dnq a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public els c() {
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
   public blu f() {
      return this.g;
   }
}
