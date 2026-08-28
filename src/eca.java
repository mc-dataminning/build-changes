import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record eca(jr<ebt> b, float c, fba d, @Nullable UUID e, @Nullable UUID f, @Nullable bul g) {
   public static final Codec<eca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebt.aj.fieldOf("game_event").forGetter(eca::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(eca::b),
               fba.a.fieldOf("pos").forGetter(eca::c),
               kl.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kl.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eca($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public eca(jr<ebt> $$0, float $$1, fba $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public eca(jr<ebt> $$0, float $$1, fba $$2, @Nullable bul $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bul $$0) {
      if ($$0 instanceof cpq $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<bul> a(ard $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bul> b(ard $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpq).map($$0x -> (cpq)$$0x).map(cpq::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jr<ebt> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fba c() {
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
   public bul f() {
      return this.g;
   }
}
