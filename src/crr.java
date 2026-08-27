import javax.annotation.Nullable;

public class crr extends crx {
   public static final dfs a = dfo.P;
   public static final dfp b = dfo.u;

   public crr(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.a;
      } else {
         dck $$6 = $$1.c_($$2);
         if ($$6 instanceof dcd) {
            $$3.a((dcd)$$6);
            $$3.a(ape.ar);
            cac.a($$3, true);
         }

         return bgo.b;
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dck $$5 = $$1.c_($$2);
         if ($$5 instanceof bgh) {
            bgk.a($$1, $$2, (bgh)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      dck $$4 = $$1.c_($$2);
      if ($$4 instanceof dcd) {
         ((dcd)$$4).i();
      }
   }

   @Nullable
   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcd($$0, $$1);
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      if ($$4.A()) {
         dck $$5 = $$0.c_($$1);
         if ($$5 instanceof dcd) {
            ((dcd)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return cec.a($$1.c_($$2));
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dey a(cle $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
