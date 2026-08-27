import javax.annotation.Nullable;

public class dar extends cuo implements cwy {
   public static final dfw<dfu> b = cuo.a;
   protected static final float c = 6.0F;
   protected static final ehy d = csk.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public dar(dex.d $$0) {
      super($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return d;
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.d($$1, $$2, hb.b) && !$$0.a(csl.kJ);
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw(csl.bw);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      dey $$1 = super.a($$0);
      if ($$1 != null) {
         eab $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(apo.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      if ($$0.c(b) == dfu.a) {
         dey $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dfu.b;
      } else {
         eab $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(apo.a) && $$4.e() == 8;
      }
   }

   @Override
   public eab c_(dey $$0) {
      return eac.c.a(false);
   }

   @Override
   public boolean a(@Nullable cbl $$0, coq $$1, gv $$2, dey $$3, eaa $$4) {
      return false;
   }

   @Override
   public boolean a(cpl $$0, gv $$1, dey $$2, eab $$3) {
      return false;
   }
}
