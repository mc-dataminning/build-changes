import javax.annotation.Nullable;

public class czi extends css implements csm, cwy {
   protected static final float a = 6.0F;
   protected static final ehy b = csk.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected czi(dex.d $$0) {
      super($$0);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.d($$1, $$2, hb.b) && !$$0.a(csl.kJ);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      return $$1.a(apo.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      dey $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return true;
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public eab c_(dey $$0) {
      return eac.c.a(false);
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      dey $$4 = csl.bx.n();
      dey $$5 = $$4.a(dar.b, dfu.a);
      gv $$6 = $$2.c();
      if ($$0.a_($$6).a(csl.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
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
