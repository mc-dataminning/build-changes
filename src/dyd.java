import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dyd(jm<dxw> b, float c, eww d, @Nullable UUID e, @Nullable UUID f, @Nullable bsq g) {
   public static final Codec<dyd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxw.aj.fieldOf("game_event").forGetter(dyd::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dyd::b),
               eww.a.fieldOf("pos").forGetter(dyd::c),
               kg.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kg.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dyd($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dyd(jm<dxw> $$0, float $$1, eww $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dyd(jm<dxw> $$0, float $$1, eww $$2, @Nullable bsq $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cA(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsq $$0) {
      if ($$0 instanceof cnn $$1 && $$1.s() != null) {
         return $$1.s().cA();
      }

      return null;
   }

   public Optional<bsq> a(aqt $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsq> b(aqt $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnn).map($$0x -> (cnn)$$0x).map(cnn::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jm<dxw> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eww c() {
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
   public bsq f() {
      return this.g;
   }
}
