import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxe extends cwq implements cxr {
   public static final MapCodec<cxe> c = b(cxe::new);
   protected static final eia g = ctc.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<cxe> a() {
      return c;
   }

   protected cxe(dfc.d $$0) {
      super($$0, ha.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dfd $$0) {
      return $$0.a(cte.G);
   }

   @Override
   protected ctc b() {
      return cte.md;
   }

   @Override
   protected boolean h(dfd $$0) {
      return !$$0.a(cte.kJ);
   }

   @Override
   public boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return false;
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      return false;
   }

   @Override
   protected int a(ash $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return $$1.a(aqa.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eag c_(dfd $$0) {
      return eah.c.a(false);
   }
}
