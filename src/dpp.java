import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpp extends dvr implements dmi {
   public static final MapCodec<dpp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mg.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mf.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dpp::new)
   );
   private static final double b = 0.4;
   private static final ffk c = dmf.b(8.0, 0.0, 9.0);
   private final dmf d;
   private final alf<eiy<?, ?>> e;

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   protected dpp(alf<eiy<?, ?>> $$0, dmf $$1, eag.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(axc.aO) || $$0.a(dmh.fE) || $$0.a(dmh.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends je<eiy<?, ?>>> a(djd $$0) {
      return $$0.F_().f(mg.aL).a(this.e);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      eah $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      this.a($$0).ifPresent($$3x -> ((eiy)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
