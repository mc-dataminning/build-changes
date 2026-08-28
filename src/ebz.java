import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ebz(jr<ebs> b, float c, faz d, @Nullable UUID e, @Nullable UUID f, @Nullable buk g) {
   public static final Codec<ebz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebs.aj.fieldOf("game_event").forGetter(ebz::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ebz::b),
               faz.a.fieldOf("pos").forGetter(ebz::c),
               kl.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kl.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ebz($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ebz(jr<ebs> $$0, float $$1, faz $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ebz(jr<ebs> $$0, float $$1, faz $$2, @Nullable buk $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable buk $$0) {
      if ($$0 instanceof cpp $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<buk> a(ard $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<buk> b(ard $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpp).map($$0x -> (cpp)$$0x).map(cpp::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jr<ebs> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public faz c() {
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
   public buk f() {
      return this.g;
   }
}
