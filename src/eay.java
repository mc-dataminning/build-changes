import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record eay(jq<ear> b, float c, ezy d, @Nullable UUID e, @Nullable UUID f, @Nullable bul g) {
   public static final Codec<eay> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ear.aj.fieldOf("game_event").forGetter(eay::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(eay::b),
               ezy.a.fieldOf("pos").forGetter(eay::c),
               kk.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kk.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eay($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public eay(jq<ear> $$0, float $$1, ezy $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public eay(jq<ear> $$0, float $$1, ezy $$2, @Nullable bul $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bul $$0) {
      if ($$0 instanceof cpn $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<bul> a(arp $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bul> b(arp $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpn).map($$0x -> (cpn)$$0x).map(cpn::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jq<ear> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ezy c() {
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
   public bul f() {
      return this.g;
   }
}
