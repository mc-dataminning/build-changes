public class cyl extends csg {
   public static final dgc<dgi> d = dfu.ah;
   public static final dfv e = dfu.w;

   protected cyl(dfd.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(d, dgi.a).a(e, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cpq $$0, gw $$1, dfe $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dgi $$9 = $$2.c(d);
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

               $$9 = dgi.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dgi.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dgi.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dgi.a;
         }

         return this.a($$0, new gw($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new gw($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cpq $$0, gw $$1, boolean $$2, int $$3, dgi $$4) {
      dfe $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dgi $$6 = $$5.c(d);
         if ($$4 != dgi.b || $$6 != dgi.a && $$6 != dgi.e && $$6 != dgi.f) {
            if ($$4 != dgi.a || $$6 != dgi.b && $$6 != dgi.c && $$6 != dgi.d) {
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
   protected void a(dfe $$0, cpq $$1, gw $$2, csq $$3) {
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
   public dgh<dgi> b() {
      return d;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      switch ($$1) {
         case c:
            switch ((dgi)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgi.d);
               case d:
                  return $$0.a(d, dgi.c);
               case e:
                  return $$0.a(d, dgi.f);
               case f:
                  return $$0.a(d, dgi.e);
               case g:
                  return $$0.a(d, dgi.i);
               case h:
                  return $$0.a(d, dgi.j);
               case i:
                  return $$0.a(d, dgi.g);
               case j:
                  return $$0.a(d, dgi.h);
            }
         case d:
            switch ((dgi)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgi.b);
               case b:
                  return $$0.a(d, dgi.a);
               case c:
                  return $$0.a(d, dgi.e);
               case d:
                  return $$0.a(d, dgi.f);
               case e:
                  return $$0.a(d, dgi.d);
               case f:
                  return $$0.a(d, dgi.c);
               case g:
                  return $$0.a(d, dgi.j);
               case h:
                  return $$0.a(d, dgi.g);
               case i:
                  return $$0.a(d, dgi.h);
               case j:
                  return $$0.a(d, dgi.i);
            }
         case b:
            switch ((dgi)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgi.b);
               case b:
                  return $$0.a(d, dgi.a);
               case c:
                  return $$0.a(d, dgi.f);
               case d:
                  return $$0.a(d, dgi.e);
               case e:
                  return $$0.a(d, dgi.c);
               case f:
                  return $$0.a(d, dgi.d);
               case g:
                  return $$0.a(d, dgi.h);
               case h:
                  return $$0.a(d, dgi.i);
               case i:
                  return $$0.a(d, dgi.j);
               case j:
                  return $$0.a(d, dgi.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      dgi $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgi.f);
               case f:
                  return $$0.a(d, dgi.e);
               case g:
                  return $$0.a(d, dgi.j);
               case h:
                  return $$0.a(d, dgi.i);
               case i:
                  return $$0.a(d, dgi.h);
               case j:
                  return $$0.a(d, dgi.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgi.d);
               case d:
                  return $$0.a(d, dgi.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgi.h);
               case h:
                  return $$0.a(d, dgi.g);
               case i:
                  return $$0.a(d, dgi.j);
               case j:
                  return $$0.a(d, dgi.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d, e, c);
   }
}
