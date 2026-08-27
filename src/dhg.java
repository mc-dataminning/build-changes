import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dhg extends dej implements ded {
   public static final MapCodec<dhg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akm.a(lf.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), le.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dhg::new)
   );
   protected static final evf b = dea.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dea d;
   private final akm<dzm<?, ?>> e;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(akm<dzm<?, ?>> $$0, dea $$1, drc.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(avx.aL) || $$0.a(dec.fl) || $$0.a(dec.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ix<dzm<?, ?>>> a(dbc $$0) {
      return $$0.H_().d(lf.aC).b(this.e);
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      drd $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      this.a($$0).ifPresent($$3x -> ((dzm)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
