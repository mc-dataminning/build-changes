import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exf(Optional<dg> b, jg c) implements exh {
   private static final MapCodec<jg> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kk::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kk::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kk::w)
            )
            .apply($$0, jg::new)
   );
   public static final MapCodec<exf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dg.a.optionalFieldOf("predicate").forGetter(exf::c), g.forGetter(exf::d)).apply($$0, exf::new)
   );

   @Override
   public exi b() {
      return exj.n;
   }

   public boolean a(etw $$0) {
      ezh $$1 = $$0.c(ews.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<ewp<?>> a() {
      return Set.of(ews.f);
   }

   public static exh.a a(dg.a $$0) {
      return () -> new exf(Optional.of($$0.b()), jg.c);
   }

   public static exh.a a(dg.a $$0, jg $$1) {
      return () -> new exf(Optional.of($$0.b()), $$1);
   }

   public Optional<dg> c() {
      return this.b;
   }

   public jg d() {
      return this.c;
   }
}
