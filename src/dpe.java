import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class dpe extends dmr {
   public static final MapCodec<dpe> b = b(dpe::new);
   public static final ecc<eci> c = ebu.ak;
   public static final ebv d = ebu.A;
   private static final int e = 20;

   @Override
   public MapCodec<dpe> a() {
      return b;
   }

   public dpe(ebd.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)).b(c, eci.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(ebe $$0) {
      return true;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(ebe $$0, djb $$1, iv $$2, jb $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(ebe $$0, djb $$1, iv $$2, jb $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jb.b ? 15 : 0;
      }
   }

   private void a(djx $$0, iv $$1, ebe $$2) {
      if (this.a($$2, (dka)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<cuk> $$5 = this.a($$0, $$1, cuk.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            ebe $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            ebe $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(djx $$0, iv $$1, ebe $$2, boolean $$3) {
      dtj $$4 = new dtj($$0, $$1, $$2);

      for (iv $$6 : $$4.a()) {
         ebe $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         ebe $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ech<eci> c() {
      return c;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      if ($$0.c(d)) {
         List<cuu> $$3 = this.a($$1, $$2, cuu.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<cuk> $$4 = this.a($$1, $$2, cuk.class, bxa.d);
         if (!$$4.isEmpty()) {
            return cvq.b((buk)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends cuk> List<T> a(djx $$0, iv $$1, Class<T> $$2, Predicate<bwt> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private ffl a(iv $$0) {
      double $$1 = 0.2;
      return new ffl(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      switch ($$1) {
         case c:
            switch ((eci)$$0.c(c)) {
               case c:
                  return $$0.b(c, eci.d);
               case d:
                  return $$0.b(c, eci.c);
               case e:
                  return $$0.b(c, eci.f);
               case f:
                  return $$0.b(c, eci.e);
               case g:
                  return $$0.b(c, eci.i);
               case h:
                  return $$0.b(c, eci.j);
               case i:
                  return $$0.b(c, eci.g);
               case j:
                  return $$0.b(c, eci.h);
            }
         case d:
            switch ((eci)$$0.c(c)) {
               case c:
                  return $$0.b(c, eci.e);
               case d:
                  return $$0.b(c, eci.f);
               case e:
                  return $$0.b(c, eci.d);
               case f:
                  return $$0.b(c, eci.c);
               case g:
                  return $$0.b(c, eci.j);
               case h:
                  return $$0.b(c, eci.g);
               case i:
                  return $$0.b(c, eci.h);
               case j:
                  return $$0.b(c, eci.i);
               case a:
                  return $$0.b(c, eci.b);
               case b:
                  return $$0.b(c, eci.a);
            }
         case b:
            switch ((eci)$$0.c(c)) {
               case c:
                  return $$0.b(c, eci.f);
               case d:
                  return $$0.b(c, eci.e);
               case e:
                  return $$0.b(c, eci.c);
               case f:
                  return $$0.b(c, eci.d);
               case g:
                  return $$0.b(c, eci.h);
               case h:
                  return $$0.b(c, eci.i);
               case i:
                  return $$0.b(c, eci.j);
               case j:
                  return $$0.b(c, eci.g);
               case a:
                  return $$0.b(c, eci.b);
               case b:
                  return $$0.b(c, eci.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      eci $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eci.f);
               case f:
                  return $$0.b(c, eci.e);
               case g:
                  return $$0.b(c, eci.j);
               case h:
                  return $$0.b(c, eci.i);
               case i:
                  return $$0.b(c, eci.h);
               case j:
                  return $$0.b(c, eci.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eci.d);
               case d:
                  return $$0.b(c, eci.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eci.h);
               case h:
                  return $$0.b(c, eci.g);
               case i:
                  return $$0.b(c, eci.j);
               case j:
                  return $$0.b(c, eci.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d, a);
   }
}
