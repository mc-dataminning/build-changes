import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dng(dmz b, float c, elb d, @Nullable UUID e, @Nullable UUID f, @Nullable blf g) {
   public static final Codec<dng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kb.a.q().fieldOf("game_event").forGetter(dng::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dng::b),
               elb.a.fieldOf("pos").forGetter(dng::c),
               iy.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               iy.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dng($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dng(dmz $$0, float $$1, elb $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dng(dmz $$0, float $$1, elb $$2, @Nullable blf $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable blf $$0) {
      if ($$0 instanceof cfj $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<blf> a(amp $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<blf> b(amp $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cfj).map($$0x -> (cfj)$$0x).map(cfj::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dmz a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public elb c() {
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
   public blf f() {
      return this.g;
   }
}
