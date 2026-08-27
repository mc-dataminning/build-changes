public class cyf extends csa {
   public static final dfw<dgc> d = dfo.ah;
   public static final dfp e = dfo.w;

   protected cyf(dex.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(d, dgc.a).a(e, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cpk $$0, gv $$1, dey $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dgc $$9 = $$2.c(d);
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

               $$9 = dgc.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dgc.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dgc.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dgc.a;
         }

         return this.a($$0, new gv($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new gv($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cpk $$0, gv $$1, boolean $$2, int $$3, dgc $$4) {
      dey $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dgc $$6 = $$5.c(d);
         if ($$4 != dgc.b || $$6 != dgc.a && $$6 != dgc.e && $$6 != dgc.f) {
            if ($$4 != dgc.a || $$6 != dgc.b && $$6 != dgc.c && $$6 != dgc.d) {
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
   protected void a(dey $$0, cpk $$1, gv $$2, csk $$3) {
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
   public dgb<dgc> b() {
      return d;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      switch ($$1) {
         case c:
            switch ((dgc)$$0.c(d)) {
               case c:
                  return $$0.a(d, dgc.d);
               case d:
                  return $$0.a(d, dgc.c);
               case e:
                  return $$0.a(d, dgc.f);
               case f:
                  return $$0.a(d, dgc.e);
               case g:
                  return $$0.a(d, dgc.i);
               case h:
                  return $$0.a(d, dgc.j);
               case i:
                  return $$0.a(d, dgc.g);
               case j:
                  return $$0.a(d, dgc.h);
            }
         case d:
            switch ((dgc)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgc.b);
               case b:
                  return $$0.a(d, dgc.a);
               case c:
                  return $$0.a(d, dgc.e);
               case d:
                  return $$0.a(d, dgc.f);
               case e:
                  return $$0.a(d, dgc.d);
               case f:
                  return $$0.a(d, dgc.c);
               case g:
                  return $$0.a(d, dgc.j);
               case h:
                  return $$0.a(d, dgc.g);
               case i:
                  return $$0.a(d, dgc.h);
               case j:
                  return $$0.a(d, dgc.i);
            }
         case b:
            switch ((dgc)$$0.c(d)) {
               case a:
                  return $$0.a(d, dgc.b);
               case b:
                  return $$0.a(d, dgc.a);
               case c:
                  return $$0.a(d, dgc.f);
               case d:
                  return $$0.a(d, dgc.e);
               case e:
                  return $$0.a(d, dgc.c);
               case f:
                  return $$0.a(d, dgc.d);
               case g:
                  return $$0.a(d, dgc.h);
               case h:
                  return $$0.a(d, dgc.i);
               case i:
                  return $$0.a(d, dgc.j);
               case j:
                  return $$0.a(d, dgc.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      dgc $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dgc.f);
               case f:
                  return $$0.a(d, dgc.e);
               case g:
                  return $$0.a(d, dgc.j);
               case h:
                  return $$0.a(d, dgc.i);
               case i:
                  return $$0.a(d, dgc.h);
               case j:
                  return $$0.a(d, dgc.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dgc.d);
               case d:
                  return $$0.a(d, dgc.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dgc.h);
               case h:
                  return $$0.a(d, dgc.g);
               case i:
                  return $$0.a(d, dgc.j);
               case j:
                  return $$0.a(d, dgc.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(d, e, c);
   }
}
