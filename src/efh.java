import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efh(Optional<cj> b, gw c) implements efj {
   private static final MapCodec<gw> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               arj.a(Codec.INT, "offsetX", Integer.valueOf(0)).forGetter(hy::u),
               arj.a(Codec.INT, "offsetY", Integer.valueOf(0)).forGetter(hy::v),
               arj.a(Codec.INT, "offsetZ", Integer.valueOf(0)).forGetter(hy::w)
            )
            .apply($$0, gw::new)
   );
   public static final Codec<efh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arj.a(cj.a, "predicate").forGetter(efh::c), d.forGetter(efh::d)).apply($$0, efh::new)
   );

   @Override
   public efk b() {
      return efl.o;
   }

   public boolean a(eck $$0) {
      ehh $$1 = $$0.c(eev.f);
      return $$1 != null
         && (this.b.isEmpty() || this.b.get().a($$0.d(), $$1.a() + (double)this.c.u(), $$1.b() + (double)this.c.v(), $$1.c() + (double)this.c.w()));
   }

   public static efj.a a(cj.a $$0) {
      return () -> new efh(Optional.of($$0.b()), gw.b);
   }

   public static efj.a a(cj.a $$0, gw $$1) {
      return () -> new efh(Optional.of($$0.b()), $$1);
   }

   public Optional<cj> c() {
      return this.b;
   }

   public gw d() {
      return this.c;
   }
}
