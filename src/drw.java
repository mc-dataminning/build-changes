import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record drw(il<drp> b, float c, ept d, @Nullable UUID e, @Nullable UUID f, @Nullable box g) {
   public static final Codec<drw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ki.a.r().fieldOf("game_event").forGetter(drw::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(drw::b),
               ept.a.fieldOf("pos").forGetter(drw::c),
               jf.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jf.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new drw($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public drw(il<drp> $$0, float $$1, ept $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public drw(il<drp> $$0, float $$1, ept $$2, @Nullable box $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable box $$0) {
      if ($$0 instanceof cjm $$1 && $$1.af_() != null) {
         return $$1.af_().cw();
      }

      return null;
   }

   public Optional<box> a(apf $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<box> b(apf $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cjm).map($$0x -> (cjm)$$0x).map(cjm::af_).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public il<drp> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ept c() {
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
   public box f() {
      return this.g;
   }
}
