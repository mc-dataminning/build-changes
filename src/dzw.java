import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dzw(jo<dzp> b, float c, eyw d, @Nullable UUID e, @Nullable UUID f, @Nullable btr g) {
   public static final Codec<dzw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzp.aj.fieldOf("game_event").forGetter(dzw::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dzw::b),
               eyw.a.fieldOf("pos").forGetter(dzw::c),
               ki.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ki.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dzw($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dzw(jo<dzp> $$0, float $$1, eyw $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dzw(jo<dzp> $$0, float $$1, eyw $$2, @Nullable btr $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cD(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable btr $$0) {
      if ($$0 instanceof cor $$1 && $$1.s() != null) {
         return $$1.s().cD();
      }

      return null;
   }

   public Optional<btr> a(arj $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<btr> b(arj $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cor).map($$0x -> (cor)$$0x).map(cor::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jo<dzp> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eyw c() {
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
   public btr f() {
      return this.g;
   }
}
