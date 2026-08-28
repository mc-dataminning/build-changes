import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record eev(je<eeo> b, float c, fdw d, @Nullable UUID e, @Nullable UUID f, @Nullable bwa g) {
   public static final Codec<eev> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eeo.aj.fieldOf("game_event").forGetter(eev::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(eev::b),
               fdw.a.fieldOf("pos").forGetter(eev::c),
               jy.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jy.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eev($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public eev(je<eeo> $$0, float $$1, fdw $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public eev(je<eeo> $$0, float $$1, fdw $$2, @Nullable bwa $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bwa $$0) {
      if ($$0 instanceof crm $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bwa> a(aro $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bwa> b(aro $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof crm).map($$0x -> (crm)$$0x).map(crm::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public je<eeo> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fdw c() {
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
   public bwa f() {
      return this.g;
   }
}
