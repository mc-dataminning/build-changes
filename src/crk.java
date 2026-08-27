import java.util.List;
import java.util.function.Predicate;

public class crk extends cpd {
   public static final dcz<ddf> d = dcr.ah;
   public static final dcs e = dcr.w;
   private static final int f = 20;

   public crk(dca.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(d, ddf.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean f_(dcb $$0) {
      return true;
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, bfj $$3) {
      if (!$$1.B) {
         if (!$$0.c(e)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if ($$0.c(e)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public int a(dcb $$0, cls $$1, gu $$2, ha $$3) {
      return $$0.c(e) ? 15 : 0;
   }

   @Override
   public int b(dcb $$0, cls $$1, gu $$2, ha $$3) {
      if (!$$0.c(e)) {
         return 0;
      } else {
         return $$3 == ha.b ? 15 : 0;
      }
   }

   private void a(cmm $$0, gu $$1, dcb $$2) {
      if (this.a($$2, (cmp)$$0, $$1)) {
         boolean $$3 = $$2.c(e);
         boolean $$4 = false;
         List<caf> $$5 = this.a($$0, $$1, caf.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dcb $$6 = $$2.a(e, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dcb $$7 = $$2.a(e, Boolean.valueOf(false));
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

   protected void b(cmm $$0, gu $$1, dcb $$2, boolean $$3) {
      cvm $$4 = new cvm($$0, $$1, $$2);

      for (gu $$6 : $$4.a()) {
         dcb $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   public void b(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dcb $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dde<ddf> b() {
      return d;
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      if ($$0.c(e)) {
         List<can> $$3 = this.a($$1, $$2, can.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).A().k();
         }

         List<caf> $$4 = this.a($$1, $$2, caf.class, bfm.d);
         if (!$$4.isEmpty()) {
            return cbf.b((bdq)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends caf> List<T> a(cmm $$0, gu $$1, Class<T> $$2, Predicate<bfj> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private eed a(gu $$0) {
      double $$1 = 0.2;
      return new eed(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      switch ($$1) {
         case c:
            switch ((ddf)$$0.c(d)) {
               case c:
                  return $$0.a(d, ddf.d);
               case d:
                  return $$0.a(d, ddf.c);
               case e:
                  return $$0.a(d, ddf.f);
               case f:
                  return $$0.a(d, ddf.e);
               case g:
                  return $$0.a(d, ddf.i);
               case h:
                  return $$0.a(d, ddf.j);
               case i:
                  return $$0.a(d, ddf.g);
               case j:
                  return $$0.a(d, ddf.h);
            }
         case d:
            switch ((ddf)$$0.c(d)) {
               case c:
                  return $$0.a(d, ddf.e);
               case d:
                  return $$0.a(d, ddf.f);
               case e:
                  return $$0.a(d, ddf.d);
               case f:
                  return $$0.a(d, ddf.c);
               case g:
                  return $$0.a(d, ddf.j);
               case h:
                  return $$0.a(d, ddf.g);
               case i:
                  return $$0.a(d, ddf.h);
               case j:
                  return $$0.a(d, ddf.i);
               case a:
                  return $$0.a(d, ddf.b);
               case b:
                  return $$0.a(d, ddf.a);
            }
         case b:
            switch ((ddf)$$0.c(d)) {
               case c:
                  return $$0.a(d, ddf.f);
               case d:
                  return $$0.a(d, ddf.e);
               case e:
                  return $$0.a(d, ddf.c);
               case f:
                  return $$0.a(d, ddf.d);
               case g:
                  return $$0.a(d, ddf.h);
               case h:
                  return $$0.a(d, ddf.i);
               case i:
                  return $$0.a(d, ddf.j);
               case j:
                  return $$0.a(d, ddf.g);
               case a:
                  return $$0.a(d, ddf.b);
               case b:
                  return $$0.a(d, ddf.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      ddf $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, ddf.f);
               case f:
                  return $$0.a(d, ddf.e);
               case g:
                  return $$0.a(d, ddf.j);
               case h:
                  return $$0.a(d, ddf.i);
               case i:
                  return $$0.a(d, ddf.h);
               case j:
                  return $$0.a(d, ddf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, ddf.d);
               case d:
                  return $$0.a(d, ddf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, ddf.h);
               case h:
                  return $$0.a(d, ddf.g);
               case i:
                  return $$0.a(d, ddf.j);
               case j:
                  return $$0.a(d, ddf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(d, e, c);
   }
}
