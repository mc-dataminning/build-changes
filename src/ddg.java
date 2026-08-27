import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ddg extends daj implements dad {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajg.a(kj.ax).fieldOf("feature").forGetter($$0x -> $$0x.e), ki.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, ddg::new)
   );
   protected static final eqk b = daa.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final daa d;
   private final ajg<dvd<?, ?>> e;

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   protected ddg(ajg<dvd<?, ?>> $$0, daa $$1, dmy.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b;
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(aun.aL) || $$0.a(dac.fl) || $$0.a(dac.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends il<dvd<?, ?>>> a(cxc $$0) {
      return $$0.H_().d(kj.ax).b(this.e);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      dmz $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      this.a($$0).ifPresent($$3x -> ((dvd)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
