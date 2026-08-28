import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record ecb(jr<ebu> b, float c, fbb d, @Nullable UUID e, @Nullable UUID f, @Nullable bum g) {
   public static final Codec<ecb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebu.aj.fieldOf("game_event").forGetter(ecb::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(ecb::b),
               fbb.a.fieldOf("pos").forGetter(ecb::c),
               kl.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kl.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new ecb($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public ecb(jr<ebu> $$0, float $$1, fbb $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public ecb(jr<ebu> $$0, float $$1, fbb $$2, @Nullable bum $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bum $$0) {
      if ($$0 instanceof cpr $$1 && $$1.p() != null) {
         return $$1.p().cG();
      }

      return null;
   }

   public Optional<bum> a(ard $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bum> b(ard $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpr).map($$0x -> (cpr)$$0x).map(cpr::p).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jr<ebu> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fbb c() {
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
   public bum f() {
      return this.g;
   }
}
