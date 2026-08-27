import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dtz(il<dts> b, float c, esa d, @Nullable UUID e, @Nullable UUID f, @Nullable bpv g) {
   public static final Codec<dtz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kr.a.r().fieldOf("game_event").forGetter(dtz::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dtz::b),
               esa.a.fieldOf("pos").forGetter(dtz::c),
               jf.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jf.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dtz($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dtz(il<dts> $$0, float $$1, esa $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dtz(il<dts> $$0, float $$1, esa $$2, @Nullable bpv $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bpv $$0) {
      if ($$0 instanceof ckl $$1 && $$1.u() != null) {
         return $$1.u().cw();
      }

      return null;
   }

   public Optional<bpv> a(aps $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bpv> b(aps $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof ckl).map($$0x -> (ckl)$$0x).map(ckl::u).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public il<dts> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public esa c() {
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
   public bpv f() {
      return this.g;
   }
}
