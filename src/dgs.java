import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public record dgs(dgl b, float c, eei d, @Nullable UUID e, @Nullable UUID f, @Nullable bfj g) {
   public static final Codec<dgs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jb.b.q().fieldOf("game_event").forGetter(dgs::a),
               Codec.floatRange(0.0F, Float.MAX_VALUE).fieldOf("distance").forGetter(dgs::b),
               eei.a.fieldOf("pos").forGetter(dgs::c),
               hy.a.optionalFieldOf("source").forGetter($$0x -> Optional.ofNullable($$0x.d())),
               hy.a.optionalFieldOf("projectile_owner").forGetter($$0x -> Optional.ofNullable($$0x.e()))
            )
            .apply($$0, ($$0x, $$1, $$2, $$3, $$4) -> new dgs($$0x, $$1, $$2, (UUID)$$3.orElse(null), (UUID)$$4.orElse(null)))
   );

   public dgs(dgl $$0, float $$1, eei $$2, @Nullable UUID $$3, @Nullable UUID $$4) {
      this($$0, $$1, $$2, $$3, $$4, null);
   }

   public dgs(dgl $$0, float $$1, eei $$2, @Nullable bfj $$3) {
      this($$0, $$1, $$2, $$3 == null ? null : $$3.ct(), a($$3), $$3);
   }

   @Nullable
   private static UUID a(@Nullable bfj $$0) {
      if ($$0 instanceof bzg $$1 && $$1.v() != null) {
         return $$1.v().ct();
      }

      return null;
   }

   public Optional<bfj> a(aif $$0) {
      return Optional.ofNullable(this.g).or(() -> Optional.ofNullable(this.e).map($$0::a));
   }

   public Optional<bfj> b(aif $$0) {
      return this.a($$0).filter($$0x -> $$0x instanceof bzg).map($$0x -> (bzg)$$0x).map(bzg::v).or(() -> Optional.ofNullable(this.f).map($$0::a));
   }

   public dgl a() {
      return this.b;
   }

   public float b() {
      return this.c;
   }

   public eei c() {
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
   public bfj f() {
      return this.g;
   }
}
