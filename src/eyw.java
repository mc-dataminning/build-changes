import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyw(Optional<di> b, ji c) implements eyy {
   private static final MapCodec<ji> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(km::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(km::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(km::w)
            )
            .apply($$0, ji::new)
   );
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(di.a.optionalFieldOf("predicate").forGetter(eyw::c), g.forGetter(eyw::d)).apply($$0, eyw::new)
   );

   @Override
   public eyz b() {
      return eza.n;
   }

   public boolean a(evp $$0) {
      fay $$1 = $$0.c(eyj.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.f);
   }

   public static eyy.a a(di.a $$0) {
      return () -> new eyw(Optional.of($$0.b()), ji.c);
   }

   public static eyy.a a(di.a $$0, ji $$1) {
      return () -> new eyw(Optional.of($$0.b()), $$1);
   }

   public Optional<di> c() {
      return this.b;
   }

   public ji d() {
      return this.c;
   }
}
