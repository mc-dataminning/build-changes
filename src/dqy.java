import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dqy(il<dqr> b, float c, eov d, @Nullable UUID e, @Nullable UUID f, @Nullable bof g) {
   public static final Codec<dqy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kh.a.r().fieldOf("game_event").forGetter(dqy::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dqy::b),
               eov.a.fieldOf("pos").forGetter(dqy::c),
               je.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               je.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dqy($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dqy(il<dqr> $$0, float $$1, eov $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dqy(il<dqr> $$0, float $$1, eov $$2, @Nullable bof $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.ct(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bof $$0) {
      if ($$0 instanceof cis $$1 && $$1.w() != null) {
         return $$1.w().ct();
      }

      return null;
   }

   public Optional<bof> a(apa $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bof> b(apa $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cis).map($$0x -> (cis)$$0x).map(cis::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public il<dqr> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eov c() {
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
   public bof f() {
      return this.g;
   }
}
