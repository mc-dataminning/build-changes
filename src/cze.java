import javax.annotation.Nullable;

public class cze extends crx implements czl {
   public static final dfp a = dfo.F;
   public static final dfp b = dfo.C;
   public static final dfp c = dfo.G;
   protected static final ehy d = csk.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(hb.a.b);

   public cze(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, big $$3) {
      if ($$0 instanceof aki $$4) {
         akj $$5 = ddq.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dcm.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if ($$1 instanceof aki $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, dcm.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, dcm.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return d;
   }

   @Override
   public ehy f(dey $$0, coq $$1, gv $$2) {
      return d;
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddq($$0, $$1);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eac.c));
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(b) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, ciw $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfq.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return !$$0.B ? crx.a($$2, dcm.L, ($$0x, $$1x, $$2x, $$3) -> djr.c.a($$0x, $$3.gb(), $$3.gc())) : null;
   }
}
