import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duw extends doo implements drc {
   public static final MapCodec<duw> c = b(duw::new);
   public static final ebf<ebd> d = doo.b;
   private static final ffk e = dmf.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<duw> a() {
      return c;
   }

   public duw(eag.d $$0) {
      super($$0);
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return e;
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.c($$1, $$2, ja.b) && !$$0.a(dmh.lp);
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(dmh.bG);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      eah $$1 = super.a($$0);
      if ($$1 != null) {
         ewo $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axh.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      if ($$0.c(d) == ebd.a) {
         eah $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == ebd.b;
      } else {
         ewo $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axh.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ewo b_(eah $$0) {
      return ewp.c.a(false);
   }

   @Override
   public boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      return false;
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      return false;
   }
}
