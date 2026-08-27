import java.util.List;
import java.util.function.Predicate;

public class cun extends csg {
   public static final dgc<dgi> d = dfu.ah;
   public static final dfv e = dfu.w;
   private static final int f = 20;

   public cun(dfd.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, dgi.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == hc.b ? 15 : 0;
      }
   }

   private void a(cpq $$0, gw $$1, dfe $$2) {
      if (this.a($$2, (cpt)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<cdg> $$5 = this.a($$0, $$1, cdg.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dfe $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dfe $$7 = $$2.a(e, Boolean.valueOf(false));
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

   protected void b(cpq $$0, gw $$1, dfe $$2, boolean $$3) {
      cyp $$4 = new cyp($$0, $$1, $$2);

      for (gw $$6 : $$4.a()) {
         dfe $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dfe $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgh<dgi> b() {
      return d;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      if ($$0.c(e)) {
         List<cdo> $$3 = this.a($$1, $$2, cdo.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).A().k();
         }

         List<cdg> $$4 = this.a($$1, $$2, cdg.class, bio.d);
         if (!$$4.isEmpty()) {
            return ceg.b((bgm)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cdg> List<T> a(cpq $$0, gw $$1, Class<T> $$2, Predicate<bil> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ehd a(gw $$0) {
      double $$1 = 0.2;
      return new ehd(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      switch ($$1) {
         case c:
            switch ((dgi)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgi.d);
               case d:
                  return $$0.a(d, dgi.c);
               case e:
                  return $$0.a(d, dgi.f);
               case f:
                  return $$0.a(d, dgi.e);
               case g:
                  return $$0.a(d, dgi.i);
               case h:
                  return $$0.a(d, dgi.j);
               case i:
                  return $$0.a(d, dgi.g);
               case j:
                  return $$0.a(d, dgi.h);
            }
         case d:
            switch ((dgi)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgi.e);
               case d:
                  return $$0.a(d, dgi.f);
               case e:
                  return $$0.a(d, dgi.d);
               case f:
                  return $$0.a(d, dgi.c);
               case g:
                  return $$0.a(d, dgi.j);
               case h:
                  return $$0.a(d, dgi.g);
               case i:
                  return $$0.a(d, dgi.h);
               case j:
                  return $$0.a(d, dgi.i);
               case a:
                  return $$0.a(d, dgi.b);
               case b:
                  return $$0.a(d, dgi.a);
            }
         case b:
            switch ((dgi)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgi.f);
               case d:
                  return $$0.a(d, dgi.e);
               case e:
                  return $$0.a(d, dgi.c);
               case f:
                  return $$0.a(d, dgi.d);
               case g:
                  return $$0.a(d, dgi.h);
               case h:
                  return $$0.a(d, dgi.i);
               case i:
                  return $$0.a(d, dgi.j);
               case j:
                  return $$0.a(d, dgi.g);
               case a:
                  return $$0.a(d, dgi.b);
               case b:
                  return $$0.a(d, dgi.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      dgi $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgi.f);
               case f:
                  return $$0.a(d, dgi.e);
               case g:
                  return $$0.a(d, dgi.j);
               case h:
                  return $$0.a(d, dgi.i);
               case i:
                  return $$0.a(d, dgi.h);
               case j:
                  return $$0.a(d, dgi.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgi.d);
               case d:
                  return $$0.a(d, dgi.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgi.h);
               case h:
                  return $$0.a(d, dgi.g);
               case i:
                  return $$0.a(d, dgi.j);
               case j:
                  return $$0.a(d, dgi.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d, e, c);
   }
}
