import com.mojang.serialization.MapCodec;

public class dkt extends dem {
   public static final MapCodec<dkt> d = b(dkt::new);
   public static final dsy<dte> e = dsq.ah;
   public static final dsr f = dsq.w;

   @Override
   public MapCodec<dkt> a() {
      return d;
   }

   protected dkt(drz.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dte.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dbw $$0, iz $$1, dsa $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dte $$9 = $$2.c(e);
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

               $$9 = dte.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dte.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dte.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dte.a;
         }

         return this.a($$0, new iz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dbw $$0, iz $$1, boolean $$2, int $$3, dte $$4) {
      dsa $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dte $$6 = $$5.c(e);
         if ($$4 != dte.b || $$6 != dte.a && $$6 != dte.e && $$6 != dte.f) {
            if ($$4 != dte.a || $$6 != dte.b && $$6 != dte.c && $$6 != dte.d) {
               if (!$$5.c(f)) {
                  return false;
               } else {
                  return $$0.C($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
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
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3) {
      boolean $$4 = $$0.c(f);
      boolean $$5 = $$1.C($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(f, Boolean.valueOf($$5)), 3);
         $$1.a($$2.d(), this);
         if ($$0.c(e).b()) {
            $$1.a($$2.c(), this);
         }
      }
   }

   @Override
   public dtd<dte> c() {
      return e;
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      switch ($$1) {
         case c:
            switch ((dte)$$0.c(e)) {
               case c:
                  return $$0.a(e, dte.d);
               case d:
                  return $$0.a(e, dte.c);
               case e:
                  return $$0.a(e, dte.f);
               case f:
                  return $$0.a(e, dte.e);
               case g:
                  return $$0.a(e, dte.i);
               case h:
                  return $$0.a(e, dte.j);
               case i:
                  return $$0.a(e, dte.g);
               case j:
                  return $$0.a(e, dte.h);
            }
         case d:
            switch ((dte)$$0.c(e)) {
               case a:
                  return $$0.a(e, dte.b);
               case b:
                  return $$0.a(e, dte.a);
               case c:
                  return $$0.a(e, dte.e);
               case d:
                  return $$0.a(e, dte.f);
               case e:
                  return $$0.a(e, dte.d);
               case f:
                  return $$0.a(e, dte.c);
               case g:
                  return $$0.a(e, dte.j);
               case h:
                  return $$0.a(e, dte.g);
               case i:
                  return $$0.a(e, dte.h);
               case j:
                  return $$0.a(e, dte.i);
            }
         case b:
            switch ((dte)$$0.c(e)) {
               case a:
                  return $$0.a(e, dte.b);
               case b:
                  return $$0.a(e, dte.a);
               case c:
                  return $$0.a(e, dte.f);
               case d:
                  return $$0.a(e, dte.e);
               case e:
                  return $$0.a(e, dte.c);
               case f:
                  return $$0.a(e, dte.d);
               case g:
                  return $$0.a(e, dte.h);
               case h:
                  return $$0.a(e, dte.i);
               case i:
                  return $$0.a(e, dte.j);
               case j:
                  return $$0.a(e, dte.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsa a(dsa $$0, dju $$1) {
      dte $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dte.f);
               case f:
                  return $$0.a(e, dte.e);
               case g:
                  return $$0.a(e, dte.j);
               case h:
                  return $$0.a(e, dte.i);
               case i:
                  return $$0.a(e, dte.h);
               case j:
                  return $$0.a(e, dte.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dte.d);
               case d:
                  return $$0.a(e, dte.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dte.h);
               case h:
                  return $$0.a(e, dte.g);
               case i:
                  return $$0.a(e, dte.j);
               case j:
                  return $$0.a(e, dte.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e, f, c);
   }
}
