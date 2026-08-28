import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record eah(jp<eaa> b, float c, ezh d, @Nullable UUID e, @Nullable UUID f, @Nullable btz g) {
   public static final Codec<eah> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eaa.aj.fieldOf("game_event").forGetter(eah::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(eah::b),
               ezh.a.fieldOf("pos").forGetter(eah::c),
               kj.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               kj.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new eah($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public eah(jp<eaa> $$0, float $$1, ezh $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public eah(jp<eaa> $$0, float $$1, ezh $$2, @Nullable btz $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cH(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable btz $$0) {
      if ($$0 instanceof cpb $$1 && $$1.s() != null) {
         return $$1.s().cH();
      }

      return null;
   }

   public Optional<btz> a(arm $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<btz> b(arm $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cpb).map($$0x -> (cpb)$$0x).map(cpb::s).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public jp<eaa> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public ezh c() {
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
   public btz f() {
      return this.g;
   }
}
