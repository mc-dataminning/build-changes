import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpc extends dme implements dlx {
   public static final MapCodec<dpc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(mg.aK).fieldOf("feature").forGetter($$0x -> $$0x.e), mf.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dpc::new)
   );
   private static final double b = 0.4;
   private static final feq c = dlu.b(8.0, 0.0, 9.0);
   private final dlu d;
   private final ald<eif<?, ?>> e;

   @Override
   public MapCodec<dpc> a() {
      return a;
   }

   protected dpc(ald<eif<?, ?>> $$0, dlu $$1, dzn.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return c;
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(axa.aO) || $$0.a(dlw.fA) || $$0.a(dlw.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends je<eif<?, ?>>> a(dis $$0) {
      return $$0.F_().f(mg.aK).a(this.e);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      dzo $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      this.a($$0).ifPresent($$3x -> ((eif)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
