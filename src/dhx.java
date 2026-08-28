import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dhx extends dfl {
   public static final MapCodec<dhx> d = b(dhx::new);
   public static final dty<due> e = dtq.ah;
   public static final dtr f = dtq.w;
   private static final int g = 20;

   @Override
   public MapCodec<dhx> a() {
      return d;
   }

   public dhx(dsz.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(e, due.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if (!$$1.B) {
         if (!$$0.c(f)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$0.c(f)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      if (!$$0.c(f)) {
         return 0;
      } else {
         return $$3 == ji.b ? 15 : 0;
      }
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      if (this.a($$2, (dcx)$$0, $$1)) {
         boolean $$3 = $$2.c(f);
         boolean $$4 = false;
         List<cor> $$5 = this.a($$0, $$1, cor.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            dta $$6 = $$2.a(f, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.d(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            dta $$7 = $$2.a(f, Boolean.valueOf(false));
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

   protected void b(dcu $$0, jd $$1, dta $$2, boolean $$3) {
      dlx $$4 = new dlx($$0, $$1, $$2);

      for (jd $$6 : $$4.a()) {
         dta $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), $$1, false);
      }
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         dta $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public dud<due> c() {
      return e;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      if ($$0.c(f)) {
         List<coz> $$3 = this.a($$1, $$2, coz.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).B().k();
         }

         List<cor> $$4 = this.a($$1, $$2, cor.class, bsv.d);
         if (!$$4.isEmpty()) {
            return cps.b((bqj)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cor> List<T> a(dcu $$0, jd $$1, Class<T> $$2, Predicate<bsq> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ewr a(jd $$0) {
      double $$1 = 0.2;
      return new ewr(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      switch ($$1) {
         case c:
            switch ((due)$$0.c(e)) {
               case c:
                  return $$0.a(e, due.d);
               case d:
                  return $$0.a(e, due.c);
               case e:
                  return $$0.a(e, due.f);
               case f:
                  return $$0.a(e, due.e);
               case g:
                  return $$0.a(e, due.i);
               case h:
                  return $$0.a(e, due.j);
               case i:
                  return $$0.a(e, due.g);
               case j:
                  return $$0.a(e, due.h);
            }
         case d:
            switch ((due)$$0.c(e)) {
               case c:
                  return $$0.a(e, due.e);
               case d:
                  return $$0.a(e, due.f);
               case e:
                  return $$0.a(e, due.d);
               case f:
                  return $$0.a(e, due.c);
               case g:
                  return $$0.a(e, due.j);
               case h:
                  return $$0.a(e, due.g);
               case i:
                  return $$0.a(e, due.h);
               case j:
                  return $$0.a(e, due.i);
               case a:
                  return $$0.a(e, due.b);
               case b:
                  return $$0.a(e, due.a);
            }
         case b:
            switch ((due)$$0.c(e)) {
               case c:
                  return $$0.a(e, due.f);
               case d:
                  return $$0.a(e, due.e);
               case e:
                  return $$0.a(e, due.c);
               case f:
                  return $$0.a(e, due.d);
               case g:
                  return $$0.a(e, due.h);
               case h:
                  return $$0.a(e, due.i);
               case i:
                  return $$0.a(e, due.j);
               case j:
                  return $$0.a(e, due.g);
               case a:
                  return $$0.a(e, due.b);
               case b:
                  return $$0.a(e, due.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      due $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, due.f);
               case f:
                  return $$0.a(e, due.e);
               case g:
                  return $$0.a(e, due.j);
               case h:
                  return $$0.a(e, due.i);
               case i:
                  return $$0.a(e, due.h);
               case j:
                  return $$0.a(e, due.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, due.d);
               case d:
                  return $$0.a(e, due.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, due.h);
               case h:
                  return $$0.a(e, due.g);
               case i:
                  return $$0.a(e, due.j);
               case j:
                  return $$0.a(e, due.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e, f, c);
   }
}
