import java.util.List;
import java.util.function.Predicate;

public class cui extends csb {
   public static final dfx<dgd> d = dfp.ah;
   public static final dfq e = dfp.w;
   private static final int f = 20;

   public cui(dey.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, dgd.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dez $$0, cor $$1, gu $$2, ha $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == ha.b ? 15 : 0;
      }
   }

   private void a(cpl $$0, gu $$1, dez $$2) {
      if (this.a($$2, (cpo)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<cdd> $$5 = this.a($$0, $$1, cdd.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dez $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dez $$7 = $$2.a(e, Boolean.valueOf(false));
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

   protected void b(cpl $$0, gu $$1, dez $$2, boolean $$3) {
      cyk $$4 = new cyk($$0, $$1, $$2);

      for (gu $$6 : $$4.a()) {
         dez $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dez $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgc<dgd> b() {
      return d;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      if ($$0.c(e)) {
         List<cdl> $$3 = this.a($$1, $$2, cdl.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).A().k();
         }

         List<cdd> $$4 = this.a($$1, $$2, cdd.class, bil.d);
         if (!$$4.isEmpty()) {
            return ced.b((bgj)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cdd> List<T> a(cpl $$0, gu $$1, Class<T> $$2, Predicate<bii> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private egy a(gu $$0) {
      double $$1 = 0.2;
      return new egy(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      switch ($$1) {
         case c:
            switch ((dgd)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgd.d);
               case d:
                  return $$0.a(d, dgd.c);
               case e:
                  return $$0.a(d, dgd.f);
               case f:
                  return $$0.a(d, dgd.e);
               case g:
                  return $$0.a(d, dgd.i);
               case h:
                  return $$0.a(d, dgd.j);
               case i:
                  return $$0.a(d, dgd.g);
               case j:
                  return $$0.a(d, dgd.h);
            }
         case d:
            switch ((dgd)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgd.e);
               case d:
                  return $$0.a(d, dgd.f);
               case e:
                  return $$0.a(d, dgd.d);
               case f:
                  return $$0.a(d, dgd.c);
               case g:
                  return $$0.a(d, dgd.j);
               case h:
                  return $$0.a(d, dgd.g);
               case i:
                  return $$0.a(d, dgd.h);
               case j:
                  return $$0.a(d, dgd.i);
               case a:
                  return $$0.a(d, dgd.b);
               case b:
                  return $$0.a(d, dgd.a);
            }
         case b:
            switch ((dgd)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgd.f);
               case d:
                  return $$0.a(d, dgd.e);
               case e:
                  return $$0.a(d, dgd.c);
               case f:
                  return $$0.a(d, dgd.d);
               case g:
                  return $$0.a(d, dgd.h);
               case h:
                  return $$0.a(d, dgd.i);
               case i:
                  return $$0.a(d, dgd.j);
               case j:
                  return $$0.a(d, dgd.g);
               case a:
                  return $$0.a(d, dgd.b);
               case b:
                  return $$0.a(d, dgd.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      dgd $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgd.f);
               case f:
                  return $$0.a(d, dgd.e);
               case g:
                  return $$0.a(d, dgd.j);
               case h:
                  return $$0.a(d, dgd.i);
               case i:
                  return $$0.a(d, dgd.h);
               case j:
                  return $$0.a(d, dgd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgd.d);
               case d:
                  return $$0.a(d, dgd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgd.h);
               case h:
                  return $$0.a(d, dgd.g);
               case i:
                  return $$0.a(d, dgd.j);
               case j:
                  return $$0.a(d, dgd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d, e, c);
   }
}
