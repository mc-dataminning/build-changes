import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxa(ji<dwt> b, float c, evp d, @Nullable UUID e, @Nullable UUID f, @Nullable bss g) {
   public static final Codec<dxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.a.r().fieldOf("game_event").forGetter(dxa::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxa::b),
               evp.a.fieldOf("pos").forGetter(dxa::c),
               kc.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kc.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxa($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxa(ji<dwt> $$0, float $$1, evp $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxa(ji<dwt> $$0, float $$1, evp $$2, @Nullable bss $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bss $$0) {
      if ($$0 instanceof cnn $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bss> a(are $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bss> b(are $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnn).map($$0x -> (cnn)$$0x).map(cnn::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ji<dwt> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evp c() {
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
   public bss f() {
      return this.g;
   }
}
