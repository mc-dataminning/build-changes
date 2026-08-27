import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record duy(iv<dur> b, float c, etf d, @Nullable UUID e, @Nullable UUID f, @Nullable bql g) {
   public static final Codec<duy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lc.a.r().fieldOf("game_event").forGetter(duy::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(duy::b),
               etf.a.fieldOf("pos").forGetter(duy::c),
               jp.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jp.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new duy($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public duy(iv<dur> $$0, float $$1, etf $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public duy(iv<dur> $$0, float $$1, etf $$2, @Nullable bql $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cx(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bql $$0) {
      if ($$0 instanceof cld $$1 && $$1.u() != null) {
         return $$1.u().cx();
      }

      return null;
   }

   public Optional<bql> a(aqe $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bql> b(aqe $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cld).map($$0x -> (cld)$$0x).map(cld::u).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public iv<dur> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public etf c() {
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
   public bql f() {
      return this.g;
   }
}
