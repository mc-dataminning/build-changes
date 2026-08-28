import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxe(ji<dwx> b, float c, evt d, @Nullable UUID e, @Nullable UUID f, @Nullable bsw g) {
   public static final Codec<dxe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.a.r().fieldOf("game_event").forGetter(dxe::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxe::b),
               evt.a.fieldOf("pos").forGetter(dxe::c),
               kc.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kc.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxe($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxe(ji<dwx> $$0, float $$1, evt $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxe(ji<dwx> $$0, float $$1, evt $$2, @Nullable bsw $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsw $$0) {
      if ($$0 instanceof cnr $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bsw> a(arf $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsw> b(arf $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnr).map($$0x -> (cnr)$$0x).map(cnr::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ji<dwx> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evt c() {
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
   public bsw f() {
      return this.g;
   }
}
