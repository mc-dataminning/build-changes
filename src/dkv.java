import com.mojang.serialization.MapCodec;

public class dkv extends deo {
   public static final MapCodec<dkv> d = b(dkv::new);
   public static final dta<dtg> e = dss.ah;
   public static final dst f = dss.w;

   @Override
   public MapCodec<dkv> a() {
      return d;
   }

   protected dkv(dsb.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dtg.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dby $$0, iz $$1, dsc $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dtg $$9 = $$2.c(e);
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

               $$9 = dtg.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dtg.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dtg.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dtg.a;
         }

         return this.a($$0, new iz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dby $$0, iz $$1, boolean $$2, int $$3, dtg $$4) {
      dsc $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dtg $$6 = $$5.c(e);
         if ($$4 != dtg.b || $$6 != dtg.a && $$6 != dtg.e && $$6 != dtg.f) {
            if ($$4 != dtg.a || $$6 != dtg.b && $$6 != dtg.c && $$6 != dtg.d) {
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
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3) {
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
   public dtf<dtg> c() {
      return e;
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      switch ($$1) {
         case c:
            switch ((dtg)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtg.d);
               case d:
                  return $$0.a(e, dtg.c);
               case e:
                  return $$0.a(e, dtg.f);
               case f:
                  return $$0.a(e, dtg.e);
               case g:
                  return $$0.a(e, dtg.i);
               case h:
                  return $$0.a(e, dtg.j);
               case i:
                  return $$0.a(e, dtg.g);
               case j:
                  return $$0.a(e, dtg.h);
            }
         case d:
            switch ((dtg)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtg.b);
               case b:
                  return $$0.a(e, dtg.a);
               case c:
                  return $$0.a(e, dtg.e);
               case d:
                  return $$0.a(e, dtg.f);
               case e:
                  return $$0.a(e, dtg.d);
               case f:
                  return $$0.a(e, dtg.c);
               case g:
                  return $$0.a(e, dtg.j);
               case h:
                  return $$0.a(e, dtg.g);
               case i:
                  return $$0.a(e, dtg.h);
               case j:
                  return $$0.a(e, dtg.i);
            }
         case b:
            switch ((dtg)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtg.b);
               case b:
                  return $$0.a(e, dtg.a);
               case c:
                  return $$0.a(e, dtg.f);
               case d:
                  return $$0.a(e, dtg.e);
               case e:
                  return $$0.a(e, dtg.c);
               case f:
                  return $$0.a(e, dtg.d);
               case g:
                  return $$0.a(e, dtg.h);
               case h:
                  return $$0.a(e, dtg.i);
               case i:
                  return $$0.a(e, dtg.j);
               case j:
                  return $$0.a(e, dtg.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      dtg $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtg.f);
               case f:
                  return $$0.a(e, dtg.e);
               case g:
                  return $$0.a(e, dtg.j);
               case h:
                  return $$0.a(e, dtg.i);
               case i:
                  return $$0.a(e, dtg.h);
               case j:
                  return $$0.a(e, dtg.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtg.d);
               case d:
                  return $$0.a(e, dtg.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtg.h);
               case h:
                  return $$0.a(e, dtg.g);
               case i:
                  return $$0.a(e, dtg.j);
               case j:
                  return $$0.a(e, dtg.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(e, f, c);
   }
}
