import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record egn(jg<egg> b, float c, ffs d, @Nullable UUID e, @Nullable UUID f, @Nullable bwv g) {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egg.aj.fieldOf("game_event").forGetter(egn::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(egn::b),
               ffs.a.fieldOf("pos").forGetter(egn::c),
               ka.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ka.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new egn($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public egn(jg<egg> $$0, float $$1, ffs $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public egn(jg<egg> $$0, float $$1, ffs $$2, @Nullable bwv $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bwv $$0) {
      if ($$0 instanceof csu $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bwv> a(aru $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bwv> b(aru $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof csu).map($$0x -> (csu)$$0x).map(csu::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public jg<egg> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ffs c() {
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
   public bwv f() {
      return this.g;
   }
}
