import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnf extends dhh implements djq {
   public static final MapCodec<dnf> c = b(dnf::new);
   public static final dta<dsy> d = dhh.b;
   protected static final float e = 6.0F;
   protected static final ewk f = dez.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnf> a() {
      return c;
   }

   public dnf(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return f;
   }

   @Override
   protected boolean b(dsc $$0, dbe $$1, iz $$2) {
      return $$0.d($$1, $$2, je.b) && !$$0.a(dfb.kJ);
   }

   @Override
   public cup a(dcb $$0, iz $$1, dsc $$2) {
      return new cup(dfb.bw);
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      dsc $$1 = super.a($$0);
      if ($$1 != null) {
         env $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      if ($$0.c(d) == dsy.a) {
         dsc $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == dsy.b;
      } else {
         env $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected env b_(dsc $$0) {
      return enw.c.a(false);
   }

   @Override
   public boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return false;
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      return false;
   }
}
