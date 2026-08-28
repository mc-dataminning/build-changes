import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ear(jq<eak> b, float c, ezr d, @Nullable UUID e, @Nullable UUID f, @Nullable bui g) {
   public static final Codec<ear> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eak.aj.fieldOf("game_event").forGetter(ear::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ear::b),
               ezr.a.fieldOf("pos").forGetter(ear::c),
               kk.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kk.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ear($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ear(jq<eak> $$0, float $$1, ezr $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ear(jq<eak> $$0, float $$1, ezr $$2, @Nullable bui $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cI(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bui $$0) {
      if ($$0 instanceof cpk $$1 && $$1.s() != null) {
         return $$1.s().cI();
      }

      return null;
   }

   public Optional<bui> a(arq $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bui> b(arq $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpk).map($$0x -> (cpk)$$0x).map(cpk::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jq<eak> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ezr c() {
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
   public bui f() {
      return this.g;
   }
}
