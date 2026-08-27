import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dkc(djv b, float c, ehp d, @Nullable UUID e, @Nullable UUID f, @Nullable bis g) {
   public static final Codec<dkc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jd.b.q().fieldOf("game_event").forGetter(dkc::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dkc::b),
               ehp.a.fieldOf("pos").forGetter(dkc::c),
               ia.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ia.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dkc($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dkc(djv $$0, float $$1, ehp $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dkc(djv $$0, float $$1, ehp $$2, @Nullable bis $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bis $$0) {
      if ($$0 instanceof cco $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<bis> a(aks $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bis> b(aks $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cco).map($$0x -> (cco)$$0x).map(cco::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public djv a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ehp c() {
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
   public bis f() {
      return this.g;
   }
}
