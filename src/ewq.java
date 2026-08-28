import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewq(Optional<df> b, je c) implements ews {
   private static final MapCodec<je> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(ki::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(ki::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(ki::w)
            )
            .apply($$0, je::new)
   );
   public static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(df.a.optionalFieldOf("predicate").forGetter(ewq::c), g.forGetter(ewq::d)).apply($$0, ewq::new)
   );

   @Override
   public ewt b() {
      return ewu.n;
   }

   public boolean a(eth $$0) {
      eys $$1 = $$0.c(ewd.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<ewa<?>> a() {
      return Set.of(ewd.f);
   }

   public static ews.a a(df.a $$0) {
      return () -> new ewq(Optional.of($$0.b()), je.c);
   }

   public static ews.a a(df.a $$0, je $$1) {
      return () -> new ewq(Optional.of($$0.b()), $$1);
   }

   public Optional<df> c() {
      return this.b;
   }

   public je d() {
      return this.c;
   }
}
