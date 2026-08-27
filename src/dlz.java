import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dlz(dls b, float c, eju d, @Nullable UUID e, @Nullable UUID f, @Nullable bkq g) {
   public static final Codec<dlz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.b.q().fieldOf("game_event").forGetter(dlz::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dlz::b),
               eju.a.fieldOf("pos").forGetter(dlz::c),
               iv.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               iv.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dlz($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dlz(dls $$0, float $$1, eju $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dlz(dls $$0, float $$1, eju $$2, @Nullable bkq $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bkq $$0) {
      if ($$0 instanceof cem $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<bkq> a(ame $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bkq> b(ame $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cem).map($$0x -> (cem)$$0x).map(cem::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dls a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eju c() {
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
   public bkq f() {
      return this.g;
   }
}
