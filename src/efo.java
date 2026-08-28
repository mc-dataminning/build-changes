import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record efo(je<efh> b, float c, feq d, @Nullable UUID e, @Nullable UUID f, @Nullable bwf g) {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efh.aj.fieldOf("game_event").forGetter(efo::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(efo::b),
               feq.a.fieldOf("pos").forGetter(efo::c),
               jy.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jy.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new efo($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public efo(je<efh> $$0, float $$1, feq $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public efo(je<efh> $$0, float $$1, feq $$2, @Nullable bwf $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bwf $$0) {
      if ($$0 instanceof crx $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bwf> a(arq $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bwf> b(arq $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof crx).map($$0x -> (crx)$$0x).map(crx::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public je<efh> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public feq c() {
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
   public bwf f() {
      return this.g;
   }
}
