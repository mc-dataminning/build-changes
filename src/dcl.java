import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dcl extends czo implements czi {
   public static final MapCodec<dcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajb.a(ki.ax).fieldOf("feature").forGetter($$0x -> $$0x.e), kh.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dcl::new)
   );
   protected static final epo b = czf.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final czf d;
   private final ajb<duh<?, ?>> e;

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   protected dcl(ajb<duh<?, ?>> $$0, czf $$1, dmd.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(aue.aK) || $$0.a(czh.fl) || $$0.a(czh.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends il<duh<?, ?>>> a(cwh $$0) {
      return $$0.I_().d(ki.ax).b(this.e);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      dme $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      this.a($$0).ifPresent($$3x -> ((duh)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
