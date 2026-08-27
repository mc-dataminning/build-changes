import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ejb(Optional<ci> b, hv c) implements ejd {
   private static final MapCodec<hv> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atg.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(iz::u),
               atg.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(iz::v),
               atg.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(iz::w)
            )
            .apply($$0, hv::new)
   );
   public static final Codec<ejb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atg.a(ci.a, "predicate").forGetter(ejb::c), d.forGetter(ejb::d)).apply($$0, ejb::new)
   );

   @Override
   public eje b() {
      return ejf.o;
   }

   public boolean a(ege $$0) {
      elb $$1 = $$0.c(eip.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static ejd.a a(ci.a $$0) {
      return () -> new ejb(Optional.of($$0.b()), hv.b);
   }

   public static ejd.a a(ci.a $$0, hv $$1) {
      return () -> new ejb(Optional.of($$0.b()), $$1);
   }

   public Optional<ci> c() {
      return this.b;
   }

   public hv d() {
      return this.c;
   }
}
