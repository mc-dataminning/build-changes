import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ean(jq<eag> b, float c, ezn d, @Nullable UUID e, @Nullable UUID f, @Nullable bue g) {
   public static final Codec<ean> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eag.aj.fieldOf("game_event").forGetter(ean::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ean::b),
               ezn.a.fieldOf("pos").forGetter(ean::c),
               kk.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kk.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ean($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ean(jq<eag> $$0, float $$1, ezn $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ean(jq<eag> $$0, float $$1, ezn $$2, @Nullable bue $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cH(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bue $$0) {
      if ($$0 instanceof cpg $$1 && $$1.s() != null) {
         return $$1.s().cH();
      }

      return null;
   }

   public Optional<bue> a(arn $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bue> b(arn $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpg).map($$0x -> (cpg)$$0x).map(cpg::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jq<eag> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ezn c() {
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
   public bue f() {
      return this.g;
   }
}
