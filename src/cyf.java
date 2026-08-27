import com.mojang.serialization.MapCodec;

public class cyf extends ctl {
   public static final MapCodec<cyf> a = b(cyf::new);
   protected static final eia b = ctc.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<cyf> a() {
      return a;
   }

   public cyf(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(apv.aK) || $$0.a(cte.dX) || super.d($$0, $$1, $$2);
   }
}
