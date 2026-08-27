import javax.annotation.Nullable;

public class ctv extends crx implements czl {
   public static final dfp a = dfo.C;
   private static final int c = 3;
   protected static final ehy b = csk.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public ctv(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$2, dcm.z, $$0.B ? dcw::a : dcw::b);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.b;
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(a) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof dcf) {
            ((dcf)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      return this.n().a(a, Boolean.valueOf($$1.a(apo.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
