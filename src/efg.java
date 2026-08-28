import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record efg(je<eez> b, float c, fei d, @Nullable UUID e, @Nullable UUID f, @Nullable bwd g) {
   public static final Codec<efg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eez.aj.fieldOf("game_event").forGetter(efg::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(efg::b),
               fei.a.fieldOf("pos").forGetter(efg::c),
               jy.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jy.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new efg($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public efg(je<eez> $$0, float $$1, fei $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public efg(je<eez> $$0, float $$1, fei $$2, @Nullable bwd $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bwd $$0) {
      if ($$0 instanceof crs $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bwd> a(arq $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bwd> b(arq $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof crs).map($$0x -> (crs)$$0x).map(crs::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public je<eez> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fei c() {
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
   public bwd f() {
      return this.g;
   }
}
