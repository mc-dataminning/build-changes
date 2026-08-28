import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcv(Optional<cu> b, iv c) implements fcx {
   private static final MapCodec<iv> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(ka::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(ka::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(ka::w)
            )
            .apply($$0, iv::new)
   );
   public static final MapCodec<fcv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(fcv::c), g.forGetter(fcv::d)).apply($$0, fcv::new)
   );

   @Override
   public fcy b() {
      return fcz.n;
   }

   public boolean a(ezo $$0) {
      fex $$1 = $$0.c(fci.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.f);
   }

   public static fcx.a a(cu.a $$0) {
      return () -> new fcv(Optional.of($$0.b()), iv.c);
   }

   public static fcx.a a(cu.a $$0, iv $$1) {
      return () -> new fcv(Optional.of($$0.b()), $$1);
   }

   public Optional<cu> c() {
      return this.b;
   }

   public iv d() {
      return this.c;
   }
}
