import com.mojang.serialization.MapCodec;

public class dsp extends dmb {
   public static final MapCodec<dsp> b = b(dsp::new);
   public static final ebm<ebs> c = ebe.ak;
   public static final ebf d = ebe.A;

   @Override
   public MapCodec<dsp> a() {
      return b;
   }

   protected dsp(ean.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, ebs.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(djh $$0, iv $$1, eao $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         ebs $$9 = $$2.c(c);
         switch ($$9) {
            case a:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
               }
               break;
            case b:
               if ($$3) {
                  $$5--;
               } else {
                  $$5++;
               }
               break;
            case c:
               if ($$3) {
                  $$5--;
               } else {
                  $$5++;
                  $$6++;
                  $$8 = false;
               }

               $$9 = ebs.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = ebs.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = ebs.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = ebs.a;
         }

         return this.a($$0, new iv($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iv($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(djh $$0, iv $$1, boolean $$2, int $$3, ebs $$4) {
      eao $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         ebs $$6 = $$5.c(c);
         if ($$4 != ebs.b || $$6 != ebs.a && $$6 != ebs.e && $$6 != ebs.f) {
            if ($$4 != ebs.a || $$6 != ebs.b && $$6 != ebs.c && $$6 != ebs.d) {
               if (!$$5.c(d)) {
                  return false;
               } else {
                  return $$0.D($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3) {
      boolean $$4 = $$0.c(d);
      boolean $$5 = $$1.D($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.b(d, Boolean.valueOf($$5)), 3);
         $$1.a($$2.e(), this);
         if ($$0.c(c).b()) {
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public ebr<ebs> c() {
      return c;
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
               case a:
                  return $$0.b(c, ebs.b);
               case b:
                  return $$0.b(c, ebs.a);
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
            }
         case b:
            switch ((ebs)$$0.c(c)) {
               case a:
                  return $$0.b(c, ebs.b);
               case b:
                  return $$0.b(c, ebs.a);
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
