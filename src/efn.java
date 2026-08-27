import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efn(Optional<cj> b, gw c) implements efp {
   private static final MapCodec<gw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               arf.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(hy::u),
               arf.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(hy::v),
               arf.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(hy::w)
            )
            .apply($$0, gw::new)
   );
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arf.a(cj.a, "predicate").forGetter(efn::c), d.forGetter(efn::d)).apply($$0, efn::new)
   );

   @Override
   public efq b() {
      return efr.o;
   }

   public boolean a(ecq $$0) {
      ehn $$1 = $$0.c(efb.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static efp.a a(cj.a $$0) {
      return () -> new efn(Optional.of($$0.b()), gw.b);
   }

   public static efp.a a(cj.a $$0, gw $$1) {
      return () -> new efn(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public gw d() {
      return this.c;
   }
}
