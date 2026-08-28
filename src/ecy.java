import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ecy(jq<ecr> b, float c, fby d, @Nullable UUID e, @Nullable UUID f, @Nullable bvk g) {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecr.aj.fieldOf("game_event").forGetter(ecy::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ecy::b),
               fby.a.fieldOf("pos").forGetter(ecy::c),
               kk.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kk.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ecy($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ecy(jq<ecr> $$0, float $$1, fby $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ecy(jq<ecr> $$0, float $$1, fby $$2, @Nullable bvk $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bvk $$0) {
      if ($$0 instanceof cqq $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<bvk> a(ash $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bvk> b(ash $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cqq).map($$0x -> (cqq)$$0x).map(cqq::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jq<ecr> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fby c() {
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
   public bvk f() {
      return this.g;
   }
}
