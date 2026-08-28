import com.mojang.serialization.MapCodec;

public class dsi extends dlu {
   public static final MapCodec<dsi> b = b(dsi::new);
   public static final ebf<ebl> c = eax.ak;
   public static final eay d = eax.A;

   @Override
   public MapCodec<dsi> a() {
      return b;
   }

   protected dsi(eag.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, ebl.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(dja $$0, iu $$1, eah $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         ebl $$9 = $$2.c(c);
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

               $$9 = ebl.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = ebl.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = ebl.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = ebl.a;
         }

         return this.a($$0, new iu($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iu($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dja $$0, iu $$1, boolean $$2, int $$3, ebl $$4) {
      eah $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         ebl $$6 = $$5.c(c);
         if ($$4 != ebl.b || $$6 != ebl.a && $$6 != ebl.e && $$6 != ebl.f) {
            if ($$4 != ebl.a || $$6 != ebl.b && $$6 != ebl.c && $$6 != ebl.d) {
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
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3) {
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
   public ebk<ebl> c() {
      return c;
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
               case a:
                  return $$0.b(c, ebl.b);
               case b:
                  return $$0.b(c, ebl.a);
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
            }
         case b:
            switch ((ebl)$$0.c(c)) {
               case a:
                  return $$0.b(c, ebl.b);
               case b:
                  return $$0.b(c, ebl.a);
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
