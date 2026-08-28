import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fas(Optional<di> b, jj c) implements fau {
   private static final MapCodec<jj> g = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.INT.optionalFieldOf("offsetX", 0).forGetter(kn::u),
               Codec.INT.optionalFieldOf("offsetY", 0).forGetter(kn::v),
               Codec.INT.optionalFieldOf("offsetZ", 0).forGetter(kn::w)
            )
            .apply($$0, jj::new)
   );
   public static final MapCodec<fas> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(di.a.optionalFieldOf("predicate").forGetter(fas::c), g.forGetter(fas::d)).apply($$0, fas::new)
   );

   @Override
   public fav b() {
      return faw.n;
   }

   public boolean a(exl $$0) {
      fcu $$1 = $$0.c(faf.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(faf.f);
   }

   public static fau.a a(di.a $$0) {
      return () -> new fas(Optional.of($$0.b()), jj.c);
   }

   public static fau.a a(di.a $$0, jj $$1) {
      return () -> new fas(Optional.of($$0.b()), $$1);
   }

   public Optional<di> c() {
      return this.b;
   }

   public jj d() {
      return this.c;
   }
}
