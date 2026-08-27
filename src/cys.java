public class cys extends csn {
   public static final dgj<dgp> d = dgb.ah;
   public static final dgc e = dgb.w;

   protected cys(dfk.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(d, dgp.a).a(e, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cpx $$0, gw $$1, dfl $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dgp $$9 = $$2.c(d);
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

               $$9 = dgp.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dgp.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dgp.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dgp.a;
         }

         return this.a($$0, new gw($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new gw($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cpx $$0, gw $$1, boolean $$2, int $$3, dgp $$4) {
      dfl $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dgp $$6 = $$5.c(d);
         if ($$4 != dgp.b || $$6 != dgp.a && $$6 != dgp.e && $$6 != dgp.f) {
            if ($$4 != dgp.a || $$6 != dgp.b && $$6 != dgp.c && $$6 != dgp.d) {
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
   protected void a(dfl $$0, cpx $$1, gw $$2, csx $$3) {
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
   public dgo<dgp> b() {
      return d;
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      switch ($$1) {
         case c:
            switch ((dgp)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgp.d);
               case d:
                  return $$0.a(d, dgp.c);
               case e:
                  return $$0.a(d, dgp.f);
               case f:
                  return $$0.a(d, dgp.e);
               case g:
                  return $$0.a(d, dgp.i);
               case h:
                  return $$0.a(d, dgp.j);
               case i:
                  return $$0.a(d, dgp.g);
               case j:
                  return $$0.a(d, dgp.h);
            }
         case d:
            switch ((dgp)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgp.b);
               case b:
                  return $$0.a(d, dgp.a);
               case c:
                  return $$0.a(d, dgp.e);
               case d:
                  return $$0.a(d, dgp.f);
               case e:
                  return $$0.a(d, dgp.d);
               case f:
                  return $$0.a(d, dgp.c);
               case g:
                  return $$0.a(d, dgp.j);
               case h:
                  return $$0.a(d, dgp.g);
               case i:
                  return $$0.a(d, dgp.h);
               case j:
                  return $$0.a(d, dgp.i);
            }
         case b:
            switch ((dgp)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgp.b);
               case b:
                  return $$0.a(d, dgp.a);
               case c:
                  return $$0.a(d, dgp.f);
               case d:
                  return $$0.a(d, dgp.e);
               case e:
                  return $$0.a(d, dgp.c);
               case f:
                  return $$0.a(d, dgp.d);
               case g:
                  return $$0.a(d, dgp.h);
               case h:
                  return $$0.a(d, dgp.i);
               case i:
                  return $$0.a(d, dgp.j);
               case j:
                  return $$0.a(d, dgp.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      dgp $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgp.f);
               case f:
                  return $$0.a(d, dgp.e);
               case g:
                  return $$0.a(d, dgp.j);
               case h:
                  return $$0.a(d, dgp.i);
               case i:
                  return $$0.a(d, dgp.h);
               case j:
                  return $$0.a(d, dgp.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgp.d);
               case d:
                  return $$0.a(d, dgp.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgp.h);
               case h:
                  return $$0.a(d, dgp.g);
               case i:
                  return $$0.a(d, dgp.j);
               case j:
                  return $$0.a(d, dgp.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d, e, c);
   }
}
