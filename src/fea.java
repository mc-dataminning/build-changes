import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fea(Optional<cv> b, iw c) implements fec {
   private static final MapCodec<iw> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kb::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kb::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kb::w)
            )
            .apply($$0, iw::new)
   );
   public static final MapCodec<fea> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(fea::c), g.forGetter(fea::d)).apply($$0, fea::new)
   );

   @Override
   public fed b() {
      return fee.n;
   }

   public boolean a(fat $$0) {
      fgc $$1 = $$0.c(fdn.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.f);
   }

   public static fec.a a(cv.a $$0) {
      return () -> new fea(Optional.of($$0.b()), iw.c);
   }

   public static fec.a a(cv.a $$0, iw $$1) {
      return () -> new fea(Optional.of($$0.b()), $$1);
   }

   public Optional<cv> c() {
      return this.b;
   }

   public iw d() {
      return this.c;
   }
}
