import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record egl(jf<ege> b, float c, ffq d, @Nullable UUID e, @Nullable UUID f, @Nullable bwt g) {
   public static final Codec<egl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ege.aj.fieldOf("game_event").forGetter(egl::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(egl::b),
               ffq.a.fieldOf("pos").forGetter(egl::c),
               jz.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jz.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new egl($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public egl(jf<ege> $$0, float $$1, ffq $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public egl(jf<ege> $$0, float $$1, ffq $$2, @Nullable bwt $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bwt $$0) {
      if ($$0 instanceof css $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bwt> a(ars $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bwt> b(ars $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof css).map($$0x -> (css)$$0x).map(css::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public jf<ege> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ffq c() {
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
   public bwt f() {
      return this.g;
   }
}
