import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class doo extends dmb {
   public static final MapCodec<doo> b = b(doo::new);
   public static final ebm<ebs> c = ebe.ak;
   public static final ebf d = ebe.A;
   private static final int e = 20;

   @Override
   public MapCodec<doo> a() {
      return b;
   }

   public doo(ean.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(d, Boolean.valueOf(false)).b(c, ebs.a).b(a, Boolean.valueOf(false)));
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C) {
         if (!$$0.c(d)) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(d)) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      if (!$$0.c(d)) {
         return 0;
      } else {
         return $$3 == jb.b ? 15 : 0;
      }
   }

   private void a(djh $$0, iv $$1, eao $$2) {
      if (this.a($$2, (djk)$$0, $$1)) {
         boolean $$3 = $$2.c(d);
         boolean $$4 = false;
         List<ctw> $$5 = this.a($$0, $$1, ctw.class, $$0x -> true);
         if (!$$5.isEmpty()) {
            $$4 = true;
         }

         if ($$4 && !$$3) {
            eao $$6 = $$2.b(d, Boolean.valueOf(true));
            $$0.a($$1, $$6, 3);
            this.b($$0, $$1, $$6, true);
            $$0.a($$1, this);
            $$0.a($$1.e(), this);
            $$0.b($$1, $$2, $$6);
         }

         if (!$$4 && $$3) {
            eao $$7 = $$2.b(d, Boolean.valueOf(false));
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

   protected void b(djh $$0, iv $$1, eao $$2, boolean $$3) {
      dst $$4 = new dst($$0, $$1, $$2);

      for (iv $$6 : $$4.a()) {
         eao $$7 = $$0.a_($$6);
         $$0.a($$7, $$6, $$7.b(), null, false);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         eao $$5 = this.a($$0, $$1, $$2, $$4);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public ebr<ebs> c() {
      return c;
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      if ($$0.c(d)) {
         List<cug> $$3 = this.a($$1, $$2, cug.class, $$0x -> true);
         if (!$$3.isEmpty()) {
            return $$3.get(0).q().k();
         }

         List<ctw> $$4 = this.a($$1, $$2, ctw.class, bwp.d);
         if (!$$4.isEmpty()) {
            return cvc.b((btz)$$4.get(0));
         }
      }

      return 0;
   }

   private <T extends ctw> List<T> a(djh $$0, iv $$1, Class<T> $$2, Predicate<bwi> $$3) {
      return $$0.a($$2, this.a($$1), $$3);
   }

   private fes a(iv $$0) {
      double $$1 = 0.2;
      return new fes(
         (double)$$0.u() + 0.2, (double)$$0.v(), (double)$$0.w() + 0.2, (double)($$0.u() + 1) - 0.2, (double)($$0.v() + 1) - 0.2, (double)($$0.w() + 1) - 0.2
      );
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
      switch ($$1) {
         case c:
            switch ((ebs)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebs.d);
               case d:
                  return $$0.b(c, ebs.c);
               case e:
                  return $$0.b(c, ebs.f);
               case f:
                  return $$0.b(c, ebs.e);
               case g:
                  return $$0.b(c, ebs.i);
               case h:
                  return $$0.b(c, ebs.j);
               case i:
                  return $$0.b(c, ebs.g);
               case j:
                  return $$0.b(c, ebs.h);
            }
         case d:
            switch ((ebs)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebs.e);
               case d:
                  return $$0.b(c, ebs.f);
               case e:
                  return $$0.b(c, ebs.d);
               case f:
                  return $$0.b(c, ebs.c);
               case g:
                  return $$0.b(c, ebs.j);
               case h:
                  return $$0.b(c, ebs.g);
               case i:
                  return $$0.b(c, ebs.h);
               case j:
                  return $$0.b(c, ebs.i);
               case a:
                  return $$0.b(c, ebs.b);
               case b:
                  return $$0.b(c, ebs.a);
            }
         case b:
            switch ((ebs)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebs.f);
               case d:
                  return $$0.b(c, ebs.e);
               case e:
                  return $$0.b(c, ebs.c);
               case f:
                  return $$0.b(c, ebs.d);
               case g:
                  return $$0.b(c, ebs.h);
               case h:
                  return $$0.b(c, ebs.i);
               case i:
                  return $$0.b(c, ebs.j);
               case j:
                  return $$0.b(c, ebs.g);
               case a:
                  return $$0.b(c, ebs.b);
               case b:
                  return $$0.b(c, ebs.a);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected eao a(eao $$0, drp $$1) {
      ebs $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebs.f);
               case f:
                  return $$0.b(c, ebs.e);
               case g:
                  return $$0.b(c, ebs.j);
               case h:
                  return $$0.b(c, ebs.i);
               case i:
                  return $$0.b(c, ebs.h);
               case j:
                  return $$0.b(c, ebs.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebs.d);
               case d:
                  return $$0.b(c, ebs.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebs.h);
               case h:
                  return $$0.b(c, ebs.g);
               case i:
                  return $$0.b(c, ebs.j);
               case j:
                  return $$0.b(c, ebs.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c, d, a);
   }
}
