import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dog(ih<dnz> b, float c, emc d, @Nullable UUID e, @Nullable UUID f, @Nullable blw g) {
   public static final Codec<dog> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kd.a.r().fieldOf("game_event").forGetter(dog::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dog::b),
               emc.a.fieldOf("pos").forGetter(dog::c),
               ja.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ja.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dog($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dog(ih<dnz> $$0, float $$1, emc $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dog(ih<dnz> $$0, float $$1, emc $$2, @Nullable blw $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable blw $$0) {
      if ($$0 instanceof cgi $$1 && $$1.w() != null) {
         return $$1.w().cw();
      }

      return null;
   }

   public Optional<blw> a(ane $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<blw> b(ane $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cgi).map($$0x -> (cgi)$$0x).map(cgi::w).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ih<dnz> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public emc c() {
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
   public blw f() {
      return this.g;
   }
}
