import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dif extends dfi implements dfc {
   public static final MapCodec<dif> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lp.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dif::new)
   );
   protected static final ewk b = dez.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dez d;
   private final ale<eal<?, ?>> e;

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   protected dif(ale<eal<?, ?>> $$0, dez $$1, dsb.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return b;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfb.fl) || $$0.a(dfb.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ji<eal<?, ?>>> a(dcb $$0) {
      return $$0.H_().d(lq.aC).b(this.e);
   }

   @Override
   public boolean b(dcb $$0, iz $$1, dsc $$2) {
      dsc $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dby $$0, azh $$1, iz $$2, dsc $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dsc $$3) {
      this.a($$0).ifPresent($$3x -> ((eal)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
