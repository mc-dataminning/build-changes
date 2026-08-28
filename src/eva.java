import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eva(Optional<df> b, jd c) implements evc {
   private static final MapCodec<jd> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kh::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kh::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kh::w)
            )
            .apply($$0, jd::new)
   );
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(df.a.optionalFieldOf("predicate").forGetter(eva::c), g.forGetter(eva::d)).apply($$0, eva::new)
   );

   @Override
   public evd b() {
      return eve.n;
   }

   public boolean a(err $$0) {
      exc $$1 = $$0.c(eun.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<euk<?>> a() {
      return Set.of(eun.f);
   }

   public static evc.a a(df.a $$0) {
      return () -> new eva(Optional.of($$0.b()), jd.c);
   }

   public static evc.a a(df.a $$0, jd $$1) {
      return () -> new eva(Optional.of($$0.b()), $$1);
   }

   public Optional<df> c() {
      return this.b;
   }

   public jd d() {
      return this.c;
   }
}
