import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efp(Optional<cj> b, gw c) implements efr {
   private static final MapCodec<gw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               arh.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(ib::u),
               arh.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(ib::v),
               arh.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(ib::w)
            )
            .apply($$0, gw::new)
   );
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arh.a(cj.a, "predicate").forGetter(efp::c), d.forGetter(efp::d)).apply($$0, efp::new)
   );

   @Override
   public efs b() {
      return eft.o;
   }

   public boolean a(ecs $$0) {
      ehp $$1 = $$0.c(efd.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static efr.a a(cj.a $$0) {
      return () -> new efp(Optional.of($$0.b()), gw.b);
   }

   public static efr.a a(cj.a $$0, gw $$1) {
      return () -> new efp(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public gw d() {
      return this.c;
   }
}
