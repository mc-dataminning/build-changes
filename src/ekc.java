import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ekc(Optional<ci> b, hx c) implements eke {
   private static final MapCodec<hx> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               atx.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(jb::u),
               atx.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(jb::v),
               atx.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(jb::w)
            )
            .apply($$0, hx::new)
   );
   public static final Codec<ekc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atx.a(ci.a, "predicate").forGetter(ekc::c), d.forGetter(ekc::d)).apply($$0, ekc::new)
   );

   @Override
   public ekf b() {
      return ekg.o;
   }

   public boolean a(ehf $$0) {
      emc $$1 = $$0.c(ejq.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static eke.a a(ci.a $$0) {
      return () -> new ekc(Optional.of($$0.b()), hx.b);
   }

   public static eke.a a(ci.a $$0, hx $$1) {
      return () -> new ekc(Optional.of($$0.b()), $$1);
   }

   public Optional<ci> c() {
      return this.b;
   }

   public hx d() {
      return this.c;
   }
}
