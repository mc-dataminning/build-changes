public class cyh extends csc {
   public static final dfy<dge> d = dfq.ah;
   public static final dfr e = dfq.w;

   protected cyh(dez.d $$0) {
      super(true, $$0);
      this.k(this.C.b().a(d, dge.a).a(e, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cpm $$0, gu $$1, dfa $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dge $$9 = $$2.c(d);
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

               $$9 = dge.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dge.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dge.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dge.a;
         }

         return this.a($$0, new gu($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new gu($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cpm $$0, gu $$1, boolean $$2, int $$3, dge $$4) {
      dfa $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dge $$6 = $$5.c(d);
         if ($$4 != dge.b || $$6 != dge.a && $$6 != dge.e && $$6 != dge.f) {
            if ($$4 != dge.a || $$6 != dge.b && $$6 != dge.c && $$6 != dge.d) {
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
   protected void a(dfa $$0, cpm $$1, gu $$2, csm $$3) {
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
   public dgd<dge> b() {
      return d;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      switch ($$1) {
         case c:
            switch ((dge)$$0.c(d)) {
               case c:
                  return $$0.a(d, dge.d);
               case d:
                  return $$0.a(d, dge.c);
               case e:
                  return $$0.a(d, dge.f);
               case f:
                  return $$0.a(d, dge.e);
               case g:
                  return $$0.a(d, dge.i);
               case h:
                  return $$0.a(d, dge.j);
               case i:
                  return $$0.a(d, dge.g);
               case j:
                  return $$0.a(d, dge.h);
            }
         case d:
            switch ((dge)$$0.c(d)) {
               case a:
                  return $$0.a(d, dge.b);
               case b:
                  return $$0.a(d, dge.a);
               case c:
                  return $$0.a(d, dge.e);
               case d:
                  return $$0.a(d, dge.f);
               case e:
                  return $$0.a(d, dge.d);
               case f:
                  return $$0.a(d, dge.c);
               case g:
                  return $$0.a(d, dge.j);
               case h:
                  return $$0.a(d, dge.g);
               case i:
                  return $$0.a(d, dge.h);
               case j:
                  return $$0.a(d, dge.i);
            }
         case b:
            switch ((dge)$$0.c(d)) {
               case a:
                  return $$0.a(d, dge.b);
               case b:
                  return $$0.a(d, dge.a);
               case c:
                  return $$0.a(d, dge.f);
               case d:
                  return $$0.a(d, dge.e);
               case e:
                  return $$0.a(d, dge.c);
               case f:
                  return $$0.a(d, dge.d);
               case g:
                  return $$0.a(d, dge.h);
               case h:
                  return $$0.a(d, dge.i);
               case i:
                  return $$0.a(d, dge.j);
               case j:
                  return $$0.a(d, dge.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      dge $$2 = $$0.c(d);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(d, dge.f);
               case f:
                  return $$0.a(d, dge.e);
               case g:
                  return $$0.a(d, dge.j);
               case h:
                  return $$0.a(d, dge.i);
               case i:
                  return $$0.a(d, dge.h);
               case j:
                  return $$0.a(d, dge.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(d, dge.d);
               case d:
                  return $$0.a(d, dge.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(d, dge.h);
               case h:
                  return $$0.a(d, dge.g);
               case i:
                  return $$0.a(d, dge.j);
               case j:
                  return $$0.a(d, dge.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(d, e, c);
   }
}
