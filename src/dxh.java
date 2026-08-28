import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxh(jj<dxa> b, float c, evz d, @Nullable UUID e, @Nullable UUID f, @Nullable bsd g) {
   public static final Codec<dxh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lq.a.s().fieldOf("game_event").forGetter(dxh::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxh::b),
               evz.a.fieldOf("pos").forGetter(dxh::c),
               kd.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kd.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxh($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxh(jj<dxa> $$0, float $$1, evz $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxh(jj<dxa> $$0, float $$1, evz $$2, @Nullable bsd $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsd $$0) {
      if ($$0 instanceof cmz $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bsd> a(aqk $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsd> b(aqk $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cmz).map($$0x -> (cmz)$$0x).map(cmz::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jj<dxa> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evz c() {
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
   public bsd f() {
      return this.g;
   }
}
