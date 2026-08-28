import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fda(Optional<cu> b, iv c) implements fdc {
   private static final MapCodec<iv> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(ka::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(ka::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(ka::w)
            )
            .apply($$0, iv::new)
   );
   public static final MapCodec<fda> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(fda::c), g.forGetter(fda::d)).apply($$0, fda::new)
   );

   @Override
   public fdd b() {
      return fde.n;
   }

   public boolean a(ezt $$0) {
      ffc $$1 = $$0.c(fcn.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.f);
   }

   public static fdc.a a(cu.a $$0) {
      return () -> new fda(Optional.of($$0.b()), iv.c);
   }

   public static fdc.a a(cu.a $$0, iv $$1) {
      return () -> new fda(Optional.of($$0.b()), $$1);
   }

   public Optional<cu> c() {
      return this.b;
   }

   public iv d() {
      return this.c;
   }
}
