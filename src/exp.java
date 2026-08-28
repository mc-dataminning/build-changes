import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exp(Optional<dh> b, jh c) implements exr {
   private static final MapCodec<jh> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kl::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kl::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kl::w)
            )
            .apply($$0, jh::new)
   );
   public static final MapCodec<exp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dh.a.optionalFieldOf("predicate").forGetter(exp::c), g.forGetter(exp::d)).apply($$0, exp::new)
   );

   @Override
   public exs b() {
      return ext.n;
   }

   public boolean a(eug $$0) {
      ezr $$1 = $$0.c(exc.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<ewz<?>> a() {
      return Set.of(exc.f);
   }

   public static exr.a a(dh.a $$0) {
      return () -> new exp(Optional.of($$0.b()), jh.c);
   }

   public static exr.a a(dh.a $$0, jh $$1) {
      return () -> new exp(Optional.of($$0.b()), $$1);
   }

   public Optional<dh> c() {
      return this.b;
   }

   public jh d() {
      return this.c;
   }
}
