import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dze(jn<dyx> b, float c, eye d, @Nullable UUID e, @Nullable UUID f, @Nullable btj g) {
   public static final Codec<dze> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyx.aj.fieldOf("game_event").forGetter(dze::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dze::b),
               eye.a.fieldOf("pos").forGetter(dze::c),
               kh.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kh.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dze($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dze(jn<dyx> $$0, float $$1, eye $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dze(jn<dyx> $$0, float $$1, eye $$2, @Nullable btj $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cD(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable btj $$0) {
      if ($$0 instanceof coi $$1 && $$1.s() != null) {
         return $$1.s().cD();
      }

      return null;
   }

   public Optional<btj> a(arg $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<btj> b(arg $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof coi).map($$0x -> (coi)$$0x).map(coi::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jn<dyx> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eye c() {
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
   public btj f() {
      return this.g;
   }
}
