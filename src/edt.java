import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record edt(js<edm> b, float c, fcu d, @Nullable UUID e, @Nullable UUID f, @Nullable bvs g) {
   public static final Codec<edt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               edm.aj.fieldOf("game_event").forGetter(edt::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(edt::b),
               fcu.a.fieldOf("pos").forGetter(edt::c),
               km.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               km.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new edt($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public edt(js<edm> $$0, float $$1, fcu $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public edt(js<edm> $$0, float $$1, fcu $$2, @Nullable bvs $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bvs $$0) {
      if ($$0 instanceof crb $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bvs> a(arn $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bvs> b(arn $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof crb).map($$0x -> (crb)$$0x).map(crb::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public js<edm> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fcu c() {
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
   public bvs f() {
      return this.g;
   }
}
