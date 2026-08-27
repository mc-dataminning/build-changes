import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbg extends cvi implements cxr {
   public static final MapCodec<dbg> c = b(dbg::new);
   public static final dgb<dfz> d = cvi.b;
   protected static final float e = 6.0F;
   protected static final eia f = ctc.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dbg> a() {
      return c;
   }

   public dbg(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return f;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(cte.kJ);
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return new cjl(cte.bw);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = super.a($$0);
      if ($$1 != null) {
         eag $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(aqa.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      if ($$0.c(d) == dfz.a) {
         dfd $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dfz.b;
      } else {
         eag $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aqa.a) && $$4.e() == 8;
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return eah.c.a(false);
   }

   @Override
   public boolean a(@Nullable cca $$0, cph $$1, gw $$2, dfd $$3, eaf $$4) {
      return false;
   }

   @Override
   public boolean a(cqc $$0, gw $$1, dfd $$2, eag $$3) {
      return false;
   }
}
