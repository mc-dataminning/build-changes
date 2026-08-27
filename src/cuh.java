import java.util.List;
import java.util.function.Predicate;

public class cuh extends csa {
   public static final dfw<dgc> d = dfo.ah;
   public static final dfp e = dfo.w;
   private static final int f = 20;

   public cuh(dex.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, dgc.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dey $$0, coq $$1, gv $$2, hb $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == hb.b ? 15 : 0;
      }
   }

   private void a(cpk $$0, gv $$1, dey $$2) {
      if (this.a($$2, (cpn)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<cdc> $$5 = this.a($$0, $$1, cdc.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dey $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dey $$7 = $$2.a(e, Boolean.valueOf(false));
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

   protected void b(cpk $$0, gv $$1, dey $$2, boolean $$3) {
      cyj $$4 = new cyj($$0, $$1, $$2);

      for (gv $$6 : $$4.a()) {
         dey $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dey $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dgb<dgc> b() {
      return d;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      if ($$0.c(e)) {
         List<cdk> $$3 = this.a($$1, $$2, cdk.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).A().k();
         }

         List<cdc> $$4 = this.a($$1, $$2, cdc.class, bij.d);
         if (!$$4.isEmpty()) {
            return cec.b((bgh)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cdc> List<T> a(cpk $$0, gv $$1, Class<T> $$2, Predicate<big> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eha a(gv $$0) {
      double $$1 = 0.2;
      return new eha(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      switch ($$1) {
         case c:
            switch ((dgc)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgc.d);
               case d:
                  return $$0.a(d, dgc.c);
               case e:
                  return $$0.a(d, dgc.f);
               case f:
                  return $$0.a(d, dgc.e);
               case g:
                  return $$0.a(d, dgc.i);
               case h:
                  return $$0.a(d, dgc.j);
               case i:
                  return $$0.a(d, dgc.g);
               case j:
                  return $$0.a(d, dgc.h);
            }
         case d:
            switch ((dgc)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgc.e);
               case d:
                  return $$0.a(d, dgc.f);
               case e:
                  return $$0.a(d, dgc.d);
               case f:
                  return $$0.a(d, dgc.c);
               case g:
                  return $$0.a(d, dgc.j);
               case h:
                  return $$0.a(d, dgc.g);
               case i:
                  return $$0.a(d, dgc.h);
               case j:
                  return $$0.a(d, dgc.i);
               case a:
                  return $$0.a(d, dgc.b);
               case b:
                  return $$0.a(d, dgc.a);
            }
         case b:
            switch ((dgc)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgc.f);
               case d:
                  return $$0.a(d, dgc.e);
               case e:
                  return $$0.a(d, dgc.c);
               case f:
                  return $$0.a(d, dgc.d);
               case g:
                  return $$0.a(d, dgc.h);
               case h:
                  return $$0.a(d, dgc.i);
               case i:
                  return $$0.a(d, dgc.j);
               case j:
                  return $$0.a(d, dgc.g);
               case a:
                  return $$0.a(d, dgc.b);
               case b:
                  return $$0.a(d, dgc.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      dgc $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgc.f);
               case f:
                  return $$0.a(d, dgc.e);
               case g:
                  return $$0.a(d, dgc.j);
               case h:
                  return $$0.a(d, dgc.i);
               case i:
                  return $$0.a(d, dgc.h);
               case j:
                  return $$0.a(d, dgc.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgc.d);
               case d:
                  return $$0.a(d, dgc.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgc.h);
               case h:
                  return $$0.a(d, dgc.g);
               case i:
                  return $$0.a(d, dgc.j);
               case j:
                  return $$0.a(d, dgc.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d, e, c);
   }
}
