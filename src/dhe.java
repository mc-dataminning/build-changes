import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dhe extends deh implements deb {
   public static final MapCodec<dhe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akl.a(lf.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), le.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dhe::new)
   );
   protected static final evd b = ddy.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final ddy d;
   private final akl<dzk<?, ?>> e;

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   protected dhe(akl<dzk<?, ?>> $$0, ddy $$1, dra.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(avw.aL) || $$0.a(dea.fl) || $$0.a(dea.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ix<dzk<?, ?>>> a(dba $$0) {
      return $$0.H_().d(lf.aC).b(this.e);
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      drb $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      this.a($$0).ifPresent($$3x -> ((dzk)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
