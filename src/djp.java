import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record djp(dji b, float c, ehf d, @Nullable UUID e, @Nullable UUID f, @Nullable big g) {
   public static final Codec<djp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jc.b.q().fieldOf("game_event").forGetter(djp::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(djp::b),
               ehf.a.fieldOf("pos").forGetter(djp::c),
               hz.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               hz.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new djp($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public djp(dji $$0, float $$1, ehf $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public djp(dji $$0, float $$1, ehf $$2, @Nullable big $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable big $$0) {
      if ($$0 instanceof ccd $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<big> a(aki $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<big> b(aki $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof ccd).map($$0x -> (ccd)$$0x).map(ccd::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dji a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ehf c() {
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
   public big f() {
      return this.g;
   }
}
