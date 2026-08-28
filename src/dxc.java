import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxc(ji<dwv> b, float c, evr d, @Nullable UUID e, @Nullable UUID f, @Nullable bsu g) {
   public static final Codec<dxc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.a.r().fieldOf("game_event").forGetter(dxc::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxc::b),
               evr.a.fieldOf("pos").forGetter(dxc::c),
               kc.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kc.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxc($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxc(ji<dwv> $$0, float $$1, evr $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxc(ji<dwv> $$0, float $$1, evr $$2, @Nullable bsu $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsu $$0) {
      if ($$0 instanceof cnp $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bsu> a(arf $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsu> b(arf $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnp).map($$0x -> (cnp)$$0x).map(cnp::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ji<dwv> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evr c() {
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
   public bsu f() {
      return this.g;
   }
}
