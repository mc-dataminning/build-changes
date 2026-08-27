import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dui(in<dub> b, float c, esj d, @Nullable UUID e, @Nullable UUID f, @Nullable bqa g) {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kt.a.r().fieldOf("game_event").forGetter(dui::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dui::b),
               esj.a.fieldOf("pos").forGetter(dui::c),
               jh.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               jh.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dui($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dui(in<dub> $$0, float $$1, esj $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dui(in<dub> $$0, float $$1, esj $$2, @Nullable bqa $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.cw(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bqa $$0) {
      if ($$0 instanceof cks $$1 && $$1.u() != null) {
         return $$1.u().cw();
      }

      return null;
   }

   public Optional<bqa> a(apu $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bqa> b(apu $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof cks).map($$0x -> (cks)$$0x).map(cks::u).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public in<dub> a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public esj c() {
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
   public bqa f() {
      return this.g;
   }
}
