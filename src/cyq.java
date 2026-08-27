public class cyq extends csl {
   public static final dgh<dgn> d = dfz.ah;
   public static final dga e = dfz.w;

   protected cyq(dfi.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(d, dgn.a).a(e, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cpv $$0, gw $$1, dfj $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dgn $$9 = $$2.c(d);
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

               $$9 = dgn.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dgn.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dgn.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dgn.a;
         }

         return this.a($$0, new gw($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new gw($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cpv $$0, gw $$1, boolean $$2, int $$3, dgn $$4) {
      dfj $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dgn $$6 = $$5.c(d);
         if ($$4 != dgn.b || $$6 != dgn.a && $$6 != dgn.e && $$6 != dgn.f) {
            if ($$4 != dgn.a || $$6 != dgn.b && $$6 != dgn.c && $$6 != dgn.d) {
               if (!$$5.c(e)) {
                  return false;
               } else {
                  return $$0.B($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
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
   protected void a(dfj $$0, cpv $$1, gw $$2, csv $$3) {
      boolean $$4 = $$0.c(e);
      boolean $$5 = $$1.B($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(e, Boolean.valueOf($$5)), 3);
         $$1.a($$2.d(), this);
         if ($$0.c(d).b()) {
            $$1.a($$2.c(), this);
         }
      }
   }

   @Override
   public dgm<dgn> b() {
      return d;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
      switch ($$1) {
         case c:
            switch ((dgn)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgn.d);
               case d:
                  return $$0.a(d, dgn.c);
               case e:
                  return $$0.a(d, dgn.f);
               case f:
                  return $$0.a(d, dgn.e);
               case g:
                  return $$0.a(d, dgn.i);
               case h:
                  return $$0.a(d, dgn.j);
               case i:
                  return $$0.a(d, dgn.g);
               case j:
                  return $$0.a(d, dgn.h);
            }
         case d:
            switch ((dgn)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgn.b);
               case b:
                  return $$0.a(d, dgn.a);
               case c:
                  return $$0.a(d, dgn.e);
               case d:
                  return $$0.a(d, dgn.f);
               case e:
                  return $$0.a(d, dgn.d);
               case f:
                  return $$0.a(d, dgn.c);
               case g:
                  return $$0.a(d, dgn.j);
               case h:
                  return $$0.a(d, dgn.g);
               case i:
                  return $$0.a(d, dgn.h);
               case j:
                  return $$0.a(d, dgn.i);
            }
         case b:
            switch ((dgn)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgn.b);
               case b:
                  return $$0.a(d, dgn.a);
               case c:
                  return $$0.a(d, dgn.f);
               case d:
                  return $$0.a(d, dgn.e);
               case e:
                  return $$0.a(d, dgn.c);
               case f:
                  return $$0.a(d, dgn.d);
               case g:
                  return $$0.a(d, dgn.h);
               case h:
                  return $$0.a(d, dgn.i);
               case i:
                  return $$0.a(d, dgn.j);
               case j:
                  return $$0.a(d, dgn.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfj a(dfj $$0, cxq $$1) {
      dgn $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgn.f);
               case f:
                  return $$0.a(d, dgn.e);
               case g:
                  return $$0.a(d, dgn.j);
               case h:
                  return $$0.a(d, dgn.i);
               case i:
                  return $$0.a(d, dgn.h);
               case j:
                  return $$0.a(d, dgn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgn.d);
               case d:
                  return $$0.a(d, dgn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgn.h);
               case h:
                  return $$0.a(d, dgn.g);
               case i:
                  return $$0.a(d, dgn.j);
               case j:
                  return $$0.a(d, dgn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d, e, c);
   }
}
