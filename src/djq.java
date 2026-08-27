import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record djq(djj b, float c, ehd d, @Nullable UUID e, @Nullable UUID f, @Nullable bii g) {
   public static final Codec<djq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.b.q().fieldOf("game_event").forGetter(djq::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(djq::b),
               ehd.a.fieldOf("pos").forGetter(djq::c),
               hy.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               hy.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new djq($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public djq(djj $$0, float $$1, ehd $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public djq(djj $$0, float $$1, ehd $$2, @Nullable bii $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bii $$0) {
      if ($$0 instanceof cce $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<bii> a(akk $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bii> b(akk $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cce).map($$0x -> (cce)$$0x).map(cce::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public djj a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ehd c() {
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
   public bii f() {
      return this.g;
   }
}
