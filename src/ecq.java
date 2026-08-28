import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ecq(jq<ecj> b, float c, fbs d, @Nullable UUID e, @Nullable UUID f, @Nullable bvf g) {
   public static final Codec<ecq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecj.aj.fieldOf("game_event").forGetter(ecq::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ecq::b),
               fbs.a.fieldOf("pos").forGetter(ecq::c),
               kk.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kk.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ecq($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ecq(jq<ecj> $$0, float $$1, fbs $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ecq(jq<ecj> $$0, float $$1, fbs $$2, @Nullable bvf $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bvf $$0) {
      if ($$0 instanceof cql $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<bvf> a(ash $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bvf> b(ash $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cql).map($$0x -> (cql)$$0x).map(cql::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jq<ecj> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fbs c() {
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
   public bvf f() {
      return this.g;
   }
}
