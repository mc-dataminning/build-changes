import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dyg(jm<dxz> b, float c, exc d, @Nullable UUID e, @Nullable UUID f, @Nullable bsr g) {
   public static final Codec<dyg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxz.aj.fieldOf("game_event").forGetter(dyg::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dyg::b),
               exc.a.fieldOf("pos").forGetter(dyg::c),
               kg.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kg.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dyg($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dyg(jm<dxz> $$0, float $$1, exc $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dyg(jm<dxz> $$0, float $$1, exc $$2, @Nullable bsr $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bsr $$0) {
      if ($$0 instanceof cnp $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bsr> a(aqu $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bsr> b(aqu $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cnp).map($$0x -> (cnp)$$0x).map(cnp::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jm<dxz> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public exc c() {
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
   public bsr f() {
      return this.g;
   }
}
