import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class doh extends dlu {
   public static final MapCodec<doh> b = b(doh::new);
   public static final ebf<ebl> c = eax.ak;
   public static final eay d = eax.A;
   private static final int e = 20;

   @Override
   public MapCodec<doh> a() {
      return b;
   }

   public doh(eag.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)).b(c, ebl.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == ja.b ? 15 : 0;
      }
   }

   private void a(dja $$0, iu $$1, eah $$2) {
      if (this.a($$2, (djd)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<ctp> $$5 = this.a($$0, $$1, ctp.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            eah $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            eah $$7 = $$2.b(d, Boolean.valueOf(false));
            $$0.a($$1, $$7, 3);
            this.b($$0, $$1, $$7, false);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$7);
         }

         if ($$4) {
            $$0.a($$1, this, 20);
         }

         $$0.b($$1, this);
      }
   }

   protected void b(dja $$0, iu $$1, eah $$2, boolean $$3) {
      dsm $$4 = new dsm($$0, $$1, $$2);

      for (iu $$6 : $$4.a()) {
         eah $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         eah $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ebk<ebl> c() {
      return c;
   }

   @Override
   protected boolean c_(eah $$0) {
      return true;
   }

   @Override
   protected int a(eah $$0, dja $$1, iu $$2) {
      if ($$0.c(d)) {
         List<ctz> $$3 = this.a($$1, $$2, ctz.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<ctp> $$4 = this.a($$1, $$2, ctp.class, bwm.d);
         if (!$$4.isEmpty()) {
            return cuv.b((btw)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ctp> List<T> a(dja $$0, iu $$1, Class<T> $$2, Predicate<bwf> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fel a(iu $$0) {
      double $$1 = 0.2;
      return new fel(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      switch ($$1) {
         case c:
            switch ((ebl)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebl.d);
               case d:
                  return $$0.b(c, ebl.c);
               case e:
                  return $$0.b(c, ebl.f);
               case f:
                  return $$0.b(c, ebl.e);
               case g:
                  return $$0.b(c, ebl.i);
               case h:
                  return $$0.b(c, ebl.j);
               case i:
                  return $$0.b(c, ebl.g);
               case j:
                  return $$0.b(c, ebl.h);
            }
         case d:
            switch ((ebl)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebl.e);
               case d:
                  return $$0.b(c, ebl.f);
               case e:
                  return $$0.b(c, ebl.d);
               case f:
                  return $$0.b(c, ebl.c);
               case g:
                  return $$0.b(c, ebl.j);
               case h:
                  return $$0.b(c, ebl.g);
               case i:
                  return $$0.b(c, ebl.h);
               case j:
                  return $$0.b(c, ebl.i);
               case a:
                  return $$0.b(c, ebl.b);
               case b:
                  return $$0.b(c, ebl.a);
            }
         case b:
            switch ((ebl)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebl.f);
               case d:
                  return $$0.b(c, ebl.e);
               case e:
                  return $$0.b(c, ebl.c);
               case f:
                  return $$0.b(c, ebl.d);
               case g:
                  return $$0.b(c, ebl.h);
               case h:
                  return $$0.b(c, ebl.i);
               case i:
                  return $$0.b(c, ebl.j);
               case j:
                  return $$0.b(c, ebl.g);
               case a:
                  return $$0.b(c, ebl.b);
               case b:
                  return $$0.b(c, ebl.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      ebl $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebl.f);
               case f:
                  return $$0.b(c, ebl.e);
               case g:
                  return $$0.b(c, ebl.j);
               case h:
                  return $$0.b(c, ebl.i);
               case i:
                  return $$0.b(c, ebl.h);
               case j:
                  return $$0.b(c, ebl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebl.d);
               case d:
                  return $$0.b(c, ebl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebl.h);
               case h:
                  return $$0.b(c, ebl.g);
               case i:
                  return $$0.b(c, ebl.j);
               case j:
                  return $$0.b(c, ebl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c, d, a);
   }
}
