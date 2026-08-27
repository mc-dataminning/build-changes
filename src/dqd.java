import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dqd(ij<dpw> b, float c, enz d, @Nullable UUID e, @Nullable UUID f, @Nullable bnq g) {
   public static final Codec<dqd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kf.a.r().fieldOf("game_event").forGetter(dqd::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dqd::b),
               enz.a.fieldOf("pos").forGetter(dqd::c),
               jc.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jc.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dqd($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dqd(ij<dpw> $$0, float $$1, enz $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dqd(ij<dpw> $$0, float $$1, enz $$2, @Nullable bnq $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bnq $$0) {
      if ($$0 instanceof cid $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<bnq> a(aow $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bnq> b(aow $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cid).map($$0x -> (cid)$$0x).map(cid::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ij<dpw> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public enz c() {
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
   public bnq f() {
      return this.g;
   }
}
