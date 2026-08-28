import com.mojang.serialization.MapCodec;

public class dku extends den {
   public static final MapCodec<dku> d = b(dku::new);
   public static final dsz<dtf> e = dsr.ah;
   public static final dss f = dsr.w;

   @Override
   public MapCodec<dku> a() {
      return d;
   }

   protected dku(dsa.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dtf.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dbx $$0, iz $$1, dsb $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dtf $$9 = $$2.c(e);
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

               $$9 = dtf.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dtf.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dtf.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dtf.a;
         }

         return this.a($$0, new iz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dbx $$0, iz $$1, boolean $$2, int $$3, dtf $$4) {
      dsb $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dtf $$6 = $$5.c(e);
         if ($$4 != dtf.b || $$6 != dtf.a && $$6 != dtf.e && $$6 != dtf.f) {
            if ($$4 != dtf.a || $$6 != dtf.b && $$6 != dtf.c && $$6 != dtf.d) {
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
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3) {
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
   public dte<dtf> c() {
      return e;
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      switch ($$1) {
         case c:
            switch ((dtf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtf.d);
               case d:
                  return $$0.a(e, dtf.c);
               case e:
                  return $$0.a(e, dtf.f);
               case f:
                  return $$0.a(e, dtf.e);
               case g:
                  return $$0.a(e, dtf.i);
               case h:
                  return $$0.a(e, dtf.j);
               case i:
                  return $$0.a(e, dtf.g);
               case j:
                  return $$0.a(e, dtf.h);
            }
         case d:
            switch ((dtf)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtf.b);
               case b:
                  return $$0.a(e, dtf.a);
               case c:
                  return $$0.a(e, dtf.e);
               case d:
                  return $$0.a(e, dtf.f);
               case e:
                  return $$0.a(e, dtf.d);
               case f:
                  return $$0.a(e, dtf.c);
               case g:
                  return $$0.a(e, dtf.j);
               case h:
                  return $$0.a(e, dtf.g);
               case i:
                  return $$0.a(e, dtf.h);
               case j:
                  return $$0.a(e, dtf.i);
            }
         case b:
            switch ((dtf)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtf.b);
               case b:
                  return $$0.a(e, dtf.a);
               case c:
                  return $$0.a(e, dtf.f);
               case d:
                  return $$0.a(e, dtf.e);
               case e:
                  return $$0.a(e, dtf.c);
               case f:
                  return $$0.a(e, dtf.d);
               case g:
                  return $$0.a(e, dtf.h);
               case h:
                  return $$0.a(e, dtf.i);
               case i:
                  return $$0.a(e, dtf.j);
               case j:
                  return $$0.a(e, dtf.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      dtf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtf.f);
               case f:
                  return $$0.a(e, dtf.e);
               case g:
                  return $$0.a(e, dtf.j);
               case h:
                  return $$0.a(e, dtf.i);
               case i:
                  return $$0.a(e, dtf.h);
               case j:
                  return $$0.a(e, dtf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtf.d);
               case d:
                  return $$0.a(e, dtf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtf.h);
               case h:
                  return $$0.a(e, dtf.g);
               case i:
                  return $$0.a(e, dtf.j);
               case j:
                  return $$0.a(e, dtf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(e, f, c);
   }
}
