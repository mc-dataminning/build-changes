import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dwx(ji<dwq> b, float c, evm d, @Nullable UUID e, @Nullable UUID f, @Nullable bsp g) {
   public static final Codec<dwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.a.r().fieldOf("game_event").forGetter(dwx::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dwx::b),
               evm.a.fieldOf("pos").forGetter(dwx::c),
               kc.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kc.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dwx($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dwx(ji<dwq> $$0, float $$1, evm $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dwx(ji<dwq> $$0, float $$1, evm $$2, @Nullable bsp $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsp $$0) {
      if ($$0 instanceof cnk $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bsp> a(arb $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsp> b(arb $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnk).map($$0x -> (cnk)$$0x).map(cnk::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ji<dwq> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evm c() {
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
   public bsp f() {
      return this.g;
   }
}
