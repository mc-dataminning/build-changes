import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dju(djn b, float c, ehh d, @Nullable UUID e, @Nullable UUID f, @Nullable biw g) {
   public static final Codec<dju> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.b.q().fieldOf("game_event").forGetter(dju::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dju::b),
               ehh.a.fieldOf("pos").forGetter(dju::c),
               hx.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               hx.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dju($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dju(djn $$0, float $$1, ehh $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dju(djn $$0, float $$1, ehh $$2, @Nullable biw $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable biw $$0) {
      if ($$0 instanceof ccs $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<biw> a(akt $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<biw> b(akt $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof ccs).map($$0x -> (ccs)$$0x).map(ccs::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public djn a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ehh c() {
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
   public biw f() {
      return this.g;
   }
}
