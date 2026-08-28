import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dzs(jn<dzl> b, float c, eys d, @Nullable UUID e, @Nullable UUID f, @Nullable bto g) {
   public static final Codec<dzs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzl.aj.fieldOf("game_event").forGetter(dzs::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dzs::b),
               eys.a.fieldOf("pos").forGetter(dzs::c),
               kh.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kh.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dzs($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dzs(jn<dzl> $$0, float $$1, eys $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dzs(jn<dzl> $$0, float $$1, eys $$2, @Nullable bto $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cD(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bto $$0) {
      if ($$0 instanceof coo $$1 && $$1.s() != null) {
         return $$1.s().cD();
      }

      return null;
   }

   public Optional<bto> a(arh $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bto> b(arh $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof coo).map($$0x -> (coo)$$0x).map(coo::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jn<dzl> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eys c() {
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
   public bto f() {
      return this.g;
   }
}
