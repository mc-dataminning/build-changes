import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dka(djt b, float c, ehn d, @Nullable UUID e, @Nullable UUID f, @Nullable biq g) {
   public static final Codec<dka> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.b.q().fieldOf("game_event").forGetter(dka::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dka::b),
               ehn.a.fieldOf("pos").forGetter(dka::c),
               ia.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ia.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dka($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dka(djt $$0, float $$1, ehn $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dka(djt $$0, float $$1, ehn $$2, @Nullable biq $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable biq $$0) {
      if ($$0 instanceof ccm $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<biq> a(akr $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<biq> b(akr $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof ccm).map($$0x -> (ccm)$$0x).map(ccm::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public djt a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ehn c() {
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
   public biq f() {
      return this.g;
   }
}
