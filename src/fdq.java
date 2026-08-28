import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdq(Optional<cv> b, iw c) implements fds {
   private static final MapCodec<iw> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kb::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kb::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kb::w)
            )
            .apply($$0, iw::new)
   );
   public static final MapCodec<fdq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cv.a.optionalFieldOf("predicate").forGetter(fdq::c), g.forGetter(fdq::d)).apply($$0, fdq::new)
   );

   @Override
   public fdt b() {
      return fdu.n;
   }

   public boolean a(faj $$0) {
      ffs $$1 = $$0.c(fdd.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.f);
   }

   public static fds.a a(cv.a $$0) {
      return () -> new fdq(Optional.of($$0.b()), iw.c);
   }

   public static fds.a a(cv.a $$0, iw $$1) {
      return () -> new fdq(Optional.of($$0.b()), $$1);
   }

   public Optional<cv> c() {
      return this.b;
   }

   public iw d() {
      return this.c;
   }
}
