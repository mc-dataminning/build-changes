import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record eby(jr<ebr> b, float c, fay d, @Nullable UUID e, @Nullable UUID f, @Nullable buj g) {
   public static final Codec<eby> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebr.aj.fieldOf("game_event").forGetter(eby::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(eby::b),
               fay.a.fieldOf("pos").forGetter(eby::c),
               kl.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kl.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eby($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public eby(jr<ebr> $$0, float $$1, fay $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public eby(jr<ebr> $$0, float $$1, fay $$2, @Nullable buj $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable buj $$0) {
      if ($$0 instanceof cpo $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<buj> a(arc $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<buj> b(arc $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpo).map($$0x -> (cpo)$$0x).map(cpo::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jr<ebr> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fay c() {
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
   public buj f() {
      return this.g;
   }
}
