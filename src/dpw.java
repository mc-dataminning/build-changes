import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dpw(ij<dpp> b, float c, ens d, @Nullable UUID e, @Nullable UUID f, @Nullable bno g) {
   public static final Codec<dpw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.a.r().fieldOf("game_event").forGetter(dpw::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dpw::b),
               ens.a.fieldOf("pos").forGetter(dpw::c),
               jc.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jc.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dpw($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dpw(ij<dpp> $$0, float $$1, ens $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dpw(ij<dpp> $$0, float $$1, ens $$2, @Nullable bno $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bno $$0) {
      if ($$0 instanceof chz $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<bno> a(aov $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bno> b(aov $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof chz).map($$0x -> (chz)$$0x).map(chz::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ij<dpp> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ens c() {
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
   public bno f() {
      return this.g;
   }
}
