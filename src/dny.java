import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dny(dnr b, float c, elt d, @Nullable UUID e, @Nullable UUID f, @Nullable blv g) {
   public static final Codec<dny> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a.q().fieldOf("game_event").forGetter(dny::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dny::b),
               elt.a.fieldOf("pos").forGetter(dny::c),
               ja.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ja.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dny($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dny(dnr $$0, float $$1, elt $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dny(dnr $$0, float $$1, elt $$2, @Nullable blv $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable blv $$0) {
      if ($$0 instanceof cga $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<blv> a(and $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<blv> b(and $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cga).map($$0x -> (cga)$$0x).map(cga::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dnr a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public elt c() {
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
   public blv f() {
      return this.g;
   }
}
