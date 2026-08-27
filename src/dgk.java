import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dgk extends ddn implements ddh {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akg.a(le.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), ld.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dgk::new)
   );
   protected static final eui b = dde.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dde d;
   private final akg<dyq<?, ?>> e;

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   protected dgk(akg<dyq<?, ?>> $$0, dde $$1, dqg.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return b;
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(avr.aL) || $$0.a(ddg.fl) || $$0.a(ddg.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends iw<dyq<?, ?>>> a(dag $$0) {
      return $$0.H_().d(le.aC).b(this.e);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      dqh $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      this.a($$0).ifPresent($$3x -> ((dyq)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
