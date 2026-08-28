import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ets(Optional<dc> b, iz c) implements etu {
   private static final MapCodec<iz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kd::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kd::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kd::w)
            )
            .apply($$0, iz::new)
   );
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dc.a.optionalFieldOf("predicate").forGetter(ets::c), d.forGetter(ets::d)).apply($$0, ets::new)
   );

   @Override
   public etv b() {
      return etw.p;
   }

   public boolean a(eqk $$0) {
      evt $$1 = $$0.c(etg.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static etu.a a(dc.a $$0) {
      return () -> new ets(Optional.of($$0.b()), iz.c);
   }

   public static etu.a a(dc.a $$0, iz $$1) {
      return () -> new ets(Optional.of($$0.b()), $$1);
   }

   public Optional<dc> c() {
      return this.b;
   }

   public iz d() {
      return this.c;
   }
}
