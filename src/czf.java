import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class czf extends cwi implements cwc {
   public static final MapCodec<czf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ags.a(kc.av).fieldOf("feature").forGetter($$0x -> $$0x.e), kb.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, czf::new)
   );
   protected static final elu b = cvz.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cvz d;
   private final ags<dqp<?, ?>> e;

   @Override
   public MapCodec<czf> a() {
      return a;
   }

   protected czf(ags<dqp<?, ?>> $$0, cvz $$1, dio.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return b;
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(arr.aK) || $$0.a(cwb.fl) || $$0.a(cwb.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ie<dqp<?, ?>>> a(ctb $$0) {
      return $$0.I_().d(kc.av).b(this.e);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      dip $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      this.a($$0).ifPresent($$3x -> ((dqp)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2));
   }
}
