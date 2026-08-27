import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dru(il<drn> b, float c, epr d, @Nullable UUID e, @Nullable UUID f, @Nullable bow g) {
   public static final Codec<dru> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ki.a.r().fieldOf("game_event").forGetter(dru::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dru::b),
               epr.a.fieldOf("pos").forGetter(dru::c),
               jf.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jf.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dru($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dru(il<drn> $$0, float $$1, epr $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dru(il<drn> $$0, float $$1, epr $$2, @Nullable bow $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bow $$0) {
      if ($$0 instanceof cjk $$1 && $$1.af_() != null) {
         return $$1.af_().cw();
      }

      return null;
   }

   public Optional<bow> a(apf $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bow> b(apf $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cjk).map($$0x -> (cjk)$$0x).map(cjk::af_).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public il<drn> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public epr c() {
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
   public bow f() {
      return this.g;
   }
}
