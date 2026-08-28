import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dxb(ji<dwu> b, float c, evq d, @Nullable UUID e, @Nullable UUID f, @Nullable bst g) {
   public static final Codec<dxb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               lp.a.r().fieldOf("game_event").forGetter(dxb::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dxb::b),
               evq.a.fieldOf("pos").forGetter(dxb::c),
               kc.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kc.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dxb($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dxb(ji<dwu> $$0, float $$1, evq $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dxb(ji<dwu> $$0, float $$1, evq $$2, @Nullable bst $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bst $$0) {
      if ($$0 instanceof cno $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bst> a(are $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bst> b(are $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cno).map($$0x -> (cno)$$0x).map(cno::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ji<dwu> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public evq c() {
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
   public bst f() {
      return this.g;
   }
}
