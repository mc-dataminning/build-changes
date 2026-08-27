import java.util.List;
import java.util.function.Predicate;

public class cuu extends csn {
   public static final dgj<dgp> d = dgb.ah;
   public static final dgc e = dgb.w;
   private static final int f = 20;

   public cuu(dfk.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, dgp.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == hc.b ? 15 : 0;
      }
   }

   private void a(cpx $$0, gw $$1, dfl $$2) {
      if (this.a($$2, (cqa)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<cdn> $$5 = this.a($$0, $$1, cdn.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dfl $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dfl $$7 = $$2.a(e, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.c($$1, this);
      }
   }

   protected void b(cpx $$0, gw $$1, dfl $$2, boolean $$3) {
      cyw $$4 = new cyw($$0, $$1, $$2);

      for (gw $$6 : $$4.a()) {
         dfl $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dfl $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgo<dgp> b() {
      return d;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      if ($$0.c(e)) {
         List<cdv> $$3 = this.a($$1, $$2, cdv.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).G().k();
         }

         List<cdn> $$4 = this.a($$1, $$2, cdn.class, biv.d);
         if (!$$4.isEmpty()) {
            return cen.b((bgt)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cdn> List<T> a(cpx $$0, gw $$1, Class<T> $$2, Predicate<bis> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ehk a(gw $$0) {
      double $$1 = 0.2;
      return new ehk(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      switch ($$1) {
         case c:
            switch ((dgp)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgp.d);
               case d:
                  return $$0.a(d, dgp.c);
               case e:
                  return $$0.a(d, dgp.f);
               case f:
                  return $$0.a(d, dgp.e);
               case g:
                  return $$0.a(d, dgp.i);
               case h:
                  return $$0.a(d, dgp.j);
               case i:
                  return $$0.a(d, dgp.g);
               case j:
                  return $$0.a(d, dgp.h);
            }
         case d:
            switch ((dgp)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgp.e);
               case d:
                  return $$0.a(d, dgp.f);
               case e:
                  return $$0.a(d, dgp.d);
               case f:
                  return $$0.a(d, dgp.c);
               case g:
                  return $$0.a(d, dgp.j);
               case h:
                  return $$0.a(d, dgp.g);
               case i:
                  return $$0.a(d, dgp.h);
               case j:
                  return $$0.a(d, dgp.i);
               case a:
                  return $$0.a(d, dgp.b);
               case b:
                  return $$0.a(d, dgp.a);
            }
         case b:
            switch ((dgp)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgp.f);
               case d:
                  return $$0.a(d, dgp.e);
               case e:
                  return $$0.a(d, dgp.c);
               case f:
                  return $$0.a(d, dgp.d);
               case g:
                  return $$0.a(d, dgp.h);
               case h:
                  return $$0.a(d, dgp.i);
               case i:
                  return $$0.a(d, dgp.j);
               case j:
                  return $$0.a(d, dgp.g);
               case a:
                  return $$0.a(d, dgp.b);
               case b:
                  return $$0.a(d, dgp.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      dgp $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgp.f);
               case f:
                  return $$0.a(d, dgp.e);
               case g:
                  return $$0.a(d, dgp.j);
               case h:
                  return $$0.a(d, dgp.i);
               case i:
                  return $$0.a(d, dgp.h);
               case j:
                  return $$0.a(d, dgp.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgp.d);
               case d:
                  return $$0.a(d, dgp.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgp.h);
               case h:
                  return $$0.a(d, dgp.g);
               case i:
                  return $$0.a(d, dgp.j);
               case j:
                  return $$0.a(d, dgp.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d, e, c);
   }
}
