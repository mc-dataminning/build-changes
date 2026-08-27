import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dwd(ix<dvw> b, float c, eum d, @Nullable UUID e, @Nullable UUID f, @Nullable brw g) {
   public static final Codec<dwd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               le.a.r().fieldOf("game_event").forGetter(dwd::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dwd::b),
               eum.a.fieldOf("pos").forGetter(dwd::c),
               jr.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jr.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dwd($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dwd(ix<dvw> $$0, float $$1, eum $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dwd(ix<dvw> $$0, float $$1, eum $$2, @Nullable brw $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable brw $$0) {
      if ($$0 instanceof cmq $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<brw> a(aqn $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<brw> b(aqn $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cmq).map($$0x -> (cmq)$$0x).map(cmq::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ix<dvw> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eum c() {
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
   public brw f() {
      return this.g;
   }
}
