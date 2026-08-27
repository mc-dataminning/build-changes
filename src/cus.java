import java.util.List;
import java.util.function.Predicate;

public class cus extends csl {
   public static final dgh<dgn> d = dfz.ah;
   public static final dga e = dfz.w;
   private static final int f = 20;

   public cus(dfi.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, dgn.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dfj $$0) {
      return true;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dfj $$0, cpb $$1, gw $$2, ha $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == ha.b ? 15 : 0;
      }
   }

   private void a(cpv $$0, gw $$1, dfj $$2) {
      if (this.a($$2, (cpy)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<cdl> $$5 = this.a($$0, $$1, cdl.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dfj $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dfj $$7 = $$2.a(e, Boolean.valueOf(false));
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

   protected void b(cpv $$0, gw $$1, dfj $$2, boolean $$3) {
      cyu $$4 = new cyu($$0, $$1, $$2);

      for (gw $$6 : $$4.a()) {
         dfj $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dfj $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgm<dgn> b() {
      return d;
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      if ($$0.c(e)) {
         List<cdt> $$3 = this.a($$1, $$2, cdt.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).G().k();
         }

         List<cdl> $$4 = this.a($$1, $$2, cdl.class, bit.d);
         if (!$$4.isEmpty()) {
            return cel.b((bgr)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cdl> List<T> a(cpv $$0, gw $$1, Class<T> $$2, Predicate<biq> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ehi a(gw $$0) {
      double $$1 = 0.2;
      return new ehi(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      switch ($$1) {
         case c:
            switch ((dgn)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgn.d);
               case d:
                  return $$0.a(d, dgn.c);
               case e:
                  return $$0.a(d, dgn.f);
               case f:
                  return $$0.a(d, dgn.e);
               case g:
                  return $$0.a(d, dgn.i);
               case h:
                  return $$0.a(d, dgn.j);
               case i:
                  return $$0.a(d, dgn.g);
               case j:
                  return $$0.a(d, dgn.h);
            }
         case d:
            switch ((dgn)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgn.e);
               case d:
                  return $$0.a(d, dgn.f);
               case e:
                  return $$0.a(d, dgn.d);
               case f:
                  return $$0.a(d, dgn.c);
               case g:
                  return $$0.a(d, dgn.j);
               case h:
                  return $$0.a(d, dgn.g);
               case i:
                  return $$0.a(d, dgn.h);
               case j:
                  return $$0.a(d, dgn.i);
               case a:
                  return $$0.a(d, dgn.b);
               case b:
                  return $$0.a(d, dgn.a);
            }
         case b:
            switch ((dgn)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgn.f);
               case d:
                  return $$0.a(d, dgn.e);
               case e:
                  return $$0.a(d, dgn.c);
               case f:
                  return $$0.a(d, dgn.d);
               case g:
                  return $$0.a(d, dgn.h);
               case h:
                  return $$0.a(d, dgn.i);
               case i:
                  return $$0.a(d, dgn.j);
               case j:
                  return $$0.a(d, dgn.g);
               case a:
                  return $$0.a(d, dgn.b);
               case b:
                  return $$0.a(d, dgn.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      dgn $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgn.f);
               case f:
                  return $$0.a(d, dgn.e);
               case g:
                  return $$0.a(d, dgn.j);
               case h:
                  return $$0.a(d, dgn.i);
               case i:
                  return $$0.a(d, dgn.h);
               case j:
                  return $$0.a(d, dgn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgn.d);
               case d:
                  return $$0.a(d, dgn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgn.h);
               case h:
                  return $$0.a(d, dgn.g);
               case i:
                  return $$0.a(d, dgn.j);
               case j:
                  return $$0.a(d, dgn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d, e, c);
   }
}
