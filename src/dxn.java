import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxn(jj<dxg> b, float c, ewf d, @Nullable UUID e, @Nullable UUID f, @Nullable bsg g) {
   public static final Codec<dxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lq.a.s().fieldOf("game_event").forGetter(dxn::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxn::b),
               ewf.a.fieldOf("pos").forGetter(dxn::c),
               kd.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kd.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxn($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxn(jj<dxg> $$0, float $$1, ewf $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxn(jj<dxg> $$0, float $$1, ewf $$2, @Nullable bsg $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cA(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsg $$0) {
      if ($$0 instanceof cnc $$1 && $$1.s() != null) {
         return $$1.s().cA();
      }

      return null;
   }

   public Optional<bsg> a(aqm $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsg> b(aqm $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnc).map($$0x -> (cnc)$$0x).map(cnc::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jj<dxg> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ewf c() {
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
   public bsg f() {
      return this.g;
   }
}
