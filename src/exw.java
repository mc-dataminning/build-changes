import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exw(Optional<dh> b, jh c) implements exy {
   private static final MapCodec<jh> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kl::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kl::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kl::w)
            )
            .apply($$0, jh::new)
   );
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dh.a.optionalFieldOf("predicate").forGetter(exw::c), g.forGetter(exw::d)).apply($$0, exw::new)
   );

   @Override
   public exz b() {
      return eya.n;
   }

   public boolean a(eun $$0) {
      ezy $$1 = $$0.c(exj.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<exg<?>> a() {
      return Set.of(exj.f);
   }

   public static exy.a a(dh.a $$0) {
      return () -> new exw(Optional.of($$0.b()), jh.c);
   }

   public static exy.a a(dh.a $$0, jh $$1) {
      return () -> new exw(Optional.of($$0.b()), $$1);
   }

   public Optional<dh> c() {
      return this.b;
   }

   public jh d() {
      return this.c;
   }
}
