import com.mojang.serialization.MapCodec;

public class dej extends cyd {
   public static final MapCodec<dej> d = b(dej::new);
   public static final dmd<dmj> e = dlv.ah;
   public static final dlw f = dlv.w;

   @Override
   public MapCodec<dej> a() {
      return d;
   }

   protected dej(dle.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dmj.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cvn $$0, hz $$1, dlf $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dmj $$9 = $$2.c(e);
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

               $$9 = dmj.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dmj.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dmj.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dmj.a;
         }

         return this.a($$0, new hz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cvn $$0, hz $$1, boolean $$2, int $$3, dmj $$4) {
      dlf $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dmj $$6 = $$5.c(e);
         if ($$4 != dmj.b || $$6 != dmj.a && $$6 != dmj.e && $$6 != dmj.f) {
            if ($$4 != dmj.a || $$6 != dmj.b && $$6 != dmj.c && $$6 != dmj.d) {
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
   protected void a(dlf $$0, cvn $$1, hz $$2, cyo $$3) {
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
   public dmi<dmj> c() {
      return e;
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      switch ($$1) {
         case c:
            switch ((dmj)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmj.d);
               case d:
                  return $$0.a(e, dmj.c);
               case e:
                  return $$0.a(e, dmj.f);
               case f:
                  return $$0.a(e, dmj.e);
               case g:
                  return $$0.a(e, dmj.i);
               case h:
                  return $$0.a(e, dmj.j);
               case i:
                  return $$0.a(e, dmj.g);
               case j:
                  return $$0.a(e, dmj.h);
            }
         case d:
            switch ((dmj)$$0.c(e)) {
               case a:
                  return $$0.a(e, dmj.b);
               case b:
                  return $$0.a(e, dmj.a);
               case c:
                  return $$0.a(e, dmj.e);
               case d:
                  return $$0.a(e, dmj.f);
               case e:
                  return $$0.a(e, dmj.d);
               case f:
                  return $$0.a(e, dmj.c);
               case g:
                  return $$0.a(e, dmj.j);
               case h:
                  return $$0.a(e, dmj.g);
               case i:
                  return $$0.a(e, dmj.h);
               case j:
                  return $$0.a(e, dmj.i);
            }
         case b:
            switch ((dmj)$$0.c(e)) {
               case a:
                  return $$0.a(e, dmj.b);
               case b:
                  return $$0.a(e, dmj.a);
               case c:
                  return $$0.a(e, dmj.f);
               case d:
                  return $$0.a(e, dmj.e);
               case e:
                  return $$0.a(e, dmj.c);
               case f:
                  return $$0.a(e, dmj.d);
               case g:
                  return $$0.a(e, dmj.h);
               case h:
                  return $$0.a(e, dmj.i);
               case i:
                  return $$0.a(e, dmj.j);
               case j:
                  return $$0.a(e, dmj.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      dmj $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dmj.f);
               case f:
                  return $$0.a(e, dmj.e);
               case g:
                  return $$0.a(e, dmj.j);
               case h:
                  return $$0.a(e, dmj.i);
               case i:
                  return $$0.a(e, dmj.h);
               case j:
                  return $$0.a(e, dmj.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dmj.d);
               case d:
                  return $$0.a(e, dmj.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dmj.h);
               case h:
                  return $$0.a(e, dmj.g);
               case i:
                  return $$0.a(e, dmj.j);
               case j:
                  return $$0.a(e, dmj.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(e, f, c);
   }
}
