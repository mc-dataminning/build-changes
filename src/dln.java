import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dln(dlg b, float c, eji d, @Nullable UUID e, @Nullable UUID f, @Nullable bki g) {
   public static final Codec<dln> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jy.b.q().fieldOf("game_event").forGetter(dln::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dln::b),
               eji.a.fieldOf("pos").forGetter(dln::c),
               iv.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               iv.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dln($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dln(dlg $$0, float $$1, eji $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dln(dlg $$0, float $$1, eji $$2, @Nullable bki $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cv(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bki $$0) {
      if ($$0 instanceof cee $$1 && $$1.v() != null) {
         return $$1.v().cv();
      }

      return null;
   }

   public Optional<bki> a(ama $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bki> b(ama $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cee).map($$0x -> (cee)$$0x).map(cee::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dlg a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eji c() {
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
   public bki f() {
      return this.g;
   }
}
