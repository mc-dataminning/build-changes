import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eto(Optional<dc> b, iz c) implements etq {
   private static final MapCodec<iz> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kd::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kd::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kd::w)
            )
            .apply($$0, iz::new)
   );
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dc.a.optionalFieldOf("predicate").forGetter(eto::c), d.forGetter(eto::d)).apply($$0, eto::new)
   );

   @Override
   public etr b() {
      return ets.p;
   }

   public boolean a(eqg $$0) {
      evp $$1 = $$0.c(etc.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static etq.a a(dc.a $$0) {
      return () -> new eto(Optional.of($$0.b()), iz.c);
   }

   public static etq.a a(dc.a $$0, iz $$1) {
      return () -> new eto(Optional.of($$0.b()), $$1);
   }

   public Optional<dc> c() {
      return this.b;
   }

   public iz d() {
      return this.c;
   }
}
