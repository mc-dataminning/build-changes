import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ecw(jr<ecp> b, float c, fbx d, @Nullable UUID e, @Nullable UUID f, @Nullable bva g) {
   public static final Codec<ecw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ecp.aj.fieldOf("game_event").forGetter(ecw::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ecw::b),
               fbx.a.fieldOf("pos").forGetter(ecw::c),
               kl.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kl.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ecw($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ecw(jr<ecp> $$0, float $$1, fbx $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ecw(jr<ecp> $$0, float $$1, fbx $$2, @Nullable bva $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cF(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bva $$0) {
      if ($$0 instanceof cqk $$1 && $$1.q() != null) {
         return $$1.q().cF();
      }

      return null;
   }

   public Optional<bva> a(ard $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bva> b(ard $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cqk).map($$0x -> (cqk)$$0x).map(cqk::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public jr<ecp> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fbx c() {
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
   public bva f() {
      return this.g;
   }
}
