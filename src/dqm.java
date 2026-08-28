import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqm extends dwo implements dnf {
   public static final MapCodec<dqm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mg.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dqm::new)
   );
   private static final double b = 0.4;
   private static final fgk c = dnc.b(8.0, 0.0, 9.0);
   private final dnc d;
   private final alh<ejv<?, ?>> e;

   @Override
   public MapCodec<dqm> a() {
      return a;
   }

   protected dqm(alh<ejv<?, ?>> $$0, dnc $$1, ebd.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }

   @Override
   protected boolean b(ebe $$0, djb $$1, iv $$2) {
      return $$0.a(axe.aO) || $$0.a(dne.fE) || $$0.a(dne.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jf<ejv<?, ?>>> a(dka $$0) {
      return $$0.J_().f(mh.aL).a(this.e);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      ebe $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      this.a($$0).ifPresent($$3x -> ((ejv)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
