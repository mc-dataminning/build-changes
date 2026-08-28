import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record egx(jg<egq> b, float c, fgc d, @Nullable UUID e, @Nullable UUID f, @Nullable bxe g) {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               egq.aj.fieldOf("game_event").forGetter(egx::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(egx::b),
               fgc.a.fieldOf("pos").forGetter(egx::c),
               ka.a.lenientOptionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               ka.a.lenientOptionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new egx($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public egx(jg<egq> $$0, float $$1, fgc $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public egx(jg<egq> $$0, float $$1, fgc $$2, @Nullable bxe $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cG(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bxe $$0) {
      if ($$0 instanceof ctd $$1 && $$1.q() != null) {
         return $$1.q().cG();
      }

      return null;
   }

   public Optional<bxe> a(asb $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::b));
   }

   public Optional<bxe> b(asb $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof ctd).map($$0x -> (ctd)$$0x).map(ctd::q).or(() -> Optional.ofNullable(this.f).map($$0::b));
   }

   public jg<egq> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public fgc c() {
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
   public bxe f() {
      return this.g;
   }
}
