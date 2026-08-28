import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxd(ji<dww> b, float c, evs d, @Nullable UUID e, @Nullable UUID f, @Nullable bsv g) {
   public static final Codec<dxd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.a.r().fieldOf("game_event").forGetter(dxd::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxd::b),
               evs.a.fieldOf("pos").forGetter(dxd::c),
               kc.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kc.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxd($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxd(ji<dww> $$0, float $$1, evs $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxd(ji<dww> $$0, float $$1, evs $$2, @Nullable bsv $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsv $$0) {
      if ($$0 instanceof cnq $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bsv> a(arf $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsv> b(arf $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnq).map($$0x -> (cnq)$$0x).map(cnq::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ji<dww> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evs c() {
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
   public bsv f() {
      return this.g;
   }
}
