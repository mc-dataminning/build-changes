import com.mojang.serialization.MapCodec;

public class dav extends cup {
   public static final MapCodec<dav> d = b(dav::new);
   public static final dig<dim> e = dhy.ah;
   public static final dhz f = dhy.w;

   @Override
   public MapCodec<dav> a() {
      return d;
   }

   protected dav(dhh.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dim.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(csa $$0, ht $$1, dhi $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dim $$9 = $$2.c(e);
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

               $$9 = dim.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dim.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dim.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dim.a;
         }

         return this.a($$0, new ht($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ht($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(csa $$0, ht $$1, boolean $$2, int $$3, dim $$4) {
      dhi $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dim $$6 = $$5.c(e);
         if ($$4 != dim.b || $$6 != dim.a && $$6 != dim.e && $$6 != dim.f) {
            if ($$4 != dim.a || $$6 != dim.b && $$6 != dim.c && $$6 != dim.d) {
               if (!$$5.c(f)) {
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
   protected void a(dhi $$0, csa $$1, ht $$2, cva $$3) {
      boolean $$4 = $$0.c(f);
      boolean $$5 = $$1.B($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(f, Boolean.valueOf($$5)), 3);
         $$1.a($$2.d(), this);
         if ($$0.c(e).b()) {
            $$1.a($$2.c(), this);
         }
      }
   }

   @Override
   public dil<dim> c() {
      return e;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      switch ($$1) {
         case c:
            switch ((dim)$$0.c(e)) {
               case c:
                  return $$0.a(e, dim.d);
               case d:
                  return $$0.a(e, dim.c);
               case e:
                  return $$0.a(e, dim.f);
               case f:
                  return $$0.a(e, dim.e);
               case g:
                  return $$0.a(e, dim.i);
               case h:
                  return $$0.a(e, dim.j);
               case i:
                  return $$0.a(e, dim.g);
               case j:
                  return $$0.a(e, dim.h);
            }
         case d:
            switch ((dim)$$0.c(e)) {
               case a:
                  return $$0.a(e, dim.b);
               case b:
                  return $$0.a(e, dim.a);
               case c:
                  return $$0.a(e, dim.e);
               case d:
                  return $$0.a(e, dim.f);
               case e:
                  return $$0.a(e, dim.d);
               case f:
                  return $$0.a(e, dim.c);
               case g:
                  return $$0.a(e, dim.j);
               case h:
                  return $$0.a(e, dim.g);
               case i:
                  return $$0.a(e, dim.h);
               case j:
                  return $$0.a(e, dim.i);
            }
         case b:
            switch ((dim)$$0.c(e)) {
               case a:
                  return $$0.a(e, dim.b);
               case b:
                  return $$0.a(e, dim.a);
               case c:
                  return $$0.a(e, dim.f);
               case d:
                  return $$0.a(e, dim.e);
               case e:
                  return $$0.a(e, dim.c);
               case f:
                  return $$0.a(e, dim.d);
               case g:
                  return $$0.a(e, dim.h);
               case h:
                  return $$0.a(e, dim.i);
               case i:
                  return $$0.a(e, dim.j);
               case j:
                  return $$0.a(e, dim.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      dim $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dim.f);
               case f:
                  return $$0.a(e, dim.e);
               case g:
                  return $$0.a(e, dim.j);
               case h:
                  return $$0.a(e, dim.i);
               case i:
                  return $$0.a(e, dim.h);
               case j:
                  return $$0.a(e, dim.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dim.d);
               case d:
                  return $$0.a(e, dim.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dim.h);
               case h:
                  return $$0.a(e, dim.g);
               case i:
                  return $$0.a(e, dim.j);
               case j:
                  return $$0.a(e, dim.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(e, f, c);
   }
}
