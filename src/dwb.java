import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dwb(ix<dvu> b, float c, euk d, @Nullable UUID e, @Nullable UUID f, @Nullable bru g) {
   public static final Codec<dwb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               le.a.r().fieldOf("game_event").forGetter(dwb::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dwb::b),
               euk.a.fieldOf("pos").forGetter(dwb::c),
               jr.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jr.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dwb($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dwb(ix<dvu> $$0, float $$1, euk $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dwb(ix<dvu> $$0, float $$1, euk $$2, @Nullable bru $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cz(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bru $$0) {
      if ($$0 instanceof cmo $$1 && $$1.s() != null) {
         return $$1.s().cz();
      }

      return null;
   }

   public Optional<bru> a(aqm $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bru> b(aqm $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cmo).map($$0x -> (cmo)$$0x).map(cmo::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public ix<dvu> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public euk c() {
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
   public bru f() {
      return this.g;
   }
}
