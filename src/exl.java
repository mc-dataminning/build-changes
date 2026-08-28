import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exl(Optional<dh> b, jh c) implements exn {
   private static final MapCodec<jh> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kl::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kl::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kl::w)
            )
            .apply($$0, jh::new)
   );
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dh.a.optionalFieldOf("predicate").forGetter(exl::c), g.forGetter(exl::d)).apply($$0, exl::new)
   );

   @Override
   public exo b() {
      return exp.n;
   }

   public boolean a(euc $$0) {
      ezn $$1 = $$0.c(ewy.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<ewv<?>> a() {
      return Set.of(ewy.f);
   }

   public static exn.a a(dh.a $$0) {
      return () -> new exl(Optional.of($$0.b()), jh.c);
   }

   public static exn.a a(dh.a $$0, jh $$1) {
      return () -> new exl(Optional.of($$0.b()), $$1);
   }

   public Optional<dh> c() {
      return this.b;
   }

   public jh d() {
      return this.c;
   }
}
