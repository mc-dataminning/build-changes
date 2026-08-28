import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyy(Optional<di> b, ji c) implements eza {
   private static final MapCodec<ji> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(km::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(km::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(km::w)
            )
            .apply($$0, ji::new)
   );
   public static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(di.a.optionalFieldOf("predicate").forGetter(eyy::c), g.forGetter(eyy::d)).apply($$0, eyy::new)
   );

   @Override
   public ezb b() {
      return ezc.n;
   }

   public boolean a(evr $$0) {
      fba $$1 = $$0.c(eyl.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.f);
   }

   public static eza.a a(di.a $$0) {
      return () -> new eyy(Optional.of($$0.b()), ji.c);
   }

   public static eza.a a(di.a $$0, ji $$1) {
      return () -> new eyy(Optional.of($$0.b()), $$1);
   }

   public Optional<di> c() {
      return this.b;
   }

   public ji d() {
      return this.c;
   }
}
