import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ega(jf<eft> b, float c, ffc d, @Nullable UUID e, @Nullable UUID f, @Nullable bwi g) {
   public static final Codec<ega> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eft.aj.fieldOf("game_event").forGetter(ega::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ega::b),
               ffc.a.fieldOf("pos").forGetter(ega::c),
               jz.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jz.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ega($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ega(jf<eft> $$0, float $$1, ffc $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ega(jf<eft> $$0, float $$1, ffc $$2, @Nullable bwi $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cF(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bwi $$0) {
      if ($$0 instanceof csh $$1 && $$1.q() != null) {
         return $$1.q().cF();
      }

      return null;
   }

   public Optional<bwi> a(arq $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bwi> b(arq $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof csh).map($$0x -> (csh)$$0x).map(csh::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public jf<eft> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ffc c() {
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
   public bwi f() {
      return this.g;
   }
}
