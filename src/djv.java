import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record djv(djo b, float c, ehi d, @Nullable UUID e, @Nullable UUID f, @Nullable bil g) {
   public static final Codec<djv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.b.q().fieldOf("game_event").forGetter(djv::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(djv::b),
               ehi.a.fieldOf("pos").forGetter(djv::c),
               ia.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ia.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new djv($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public djv(djo $$0, float $$1, ehi $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public djv(djo $$0, float $$1, ehi $$2, @Nullable bil $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bil $$0) {
      if ($$0 instanceof cch $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<bil> a(akn $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bil> b(akn $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cch).map($$0x -> (cch)$$0x).map(cch::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public djo a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ehi c() {
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
   public bil f() {
      return this.g;
   }
}
