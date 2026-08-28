import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxo(jj<dxh> b, float c, ewh d, @Nullable UUID e, @Nullable UUID f, @Nullable bsh g) {
   public static final Codec<dxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxh.aj.fieldOf("game_event").forGetter(dxo::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxo::b),
               ewh.a.fieldOf("pos").forGetter(dxo::c),
               kd.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kd.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxo($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxo(jj<dxh> $$0, float $$1, ewh $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxo(jj<dxh> $$0, float $$1, ewh $$2, @Nullable bsh $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cB(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsh $$0) {
      if ($$0 instanceof cnd $$1 && $$1.s() != null) {
         return $$1.s().cB();
      }

      return null;
   }

   public Optional<bsh> a(aqm $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsh> b(aqm $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnd).map($$0x -> (cnd)$$0x).map(cnd::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jj<dxh> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ewh c() {
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
   public bsh f() {
      return this.g;
   }
}
