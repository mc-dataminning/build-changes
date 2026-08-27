import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dme(dlx b, float c, ejz d, @Nullable UUID e, @Nullable UUID f, @Nullable bkv g) {
   public static final Codec<dme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kc.b.q().fieldOf("game_event").forGetter(dme::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dme::b),
               ejz.a.fieldOf("pos").forGetter(dme::c),
               iz.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               iz.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dme($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dme(dlx $$0, float $$1, ejz $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dme(dlx $$0, float $$1, ejz $$2, @Nullable bkv $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bkv $$0) {
      if ($$0 instanceof cer $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<bkv> a(ami $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bkv> b(ami $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cer).map($$0x -> (cer)$$0x).map(cer::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dlx a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ejz c() {
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
   public bkv f() {
      return this.g;
   }
}
