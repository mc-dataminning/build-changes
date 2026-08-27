import com.mojang.serialization.MapCodec;

public class den extends cyh {
   public static final MapCodec<den> d = b(den::new);
   public static final dmh<dmn> e = dlz.ah;
   public static final dma f = dlz.w;

   @Override
   public MapCodec<den> a() {
      return d;
   }

   protected den(dli.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dmn.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cvr $$0, hz $$1, dlj $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dmn $$9 = $$2.c(e);
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

               $$9 = dmn.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dmn.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dmn.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dmn.a;
         }

         return this.a($$0, new hz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cvr $$0, hz $$1, boolean $$2, int $$3, dmn $$4) {
      dlj $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dmn $$6 = $$5.c(e);
         if ($$4 != dmn.b || $$6 != dmn.a && $$6 != dmn.e && $$6 != dmn.f) {
            if ($$4 != dmn.a || $$6 != dmn.b && $$6 != dmn.c && $$6 != dmn.d) {
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
   protected void a(dlj $$0, cvr $$1, hz $$2, cys $$3) {
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
   public dmm<dmn> c() {
      return e;
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      switch ($$1) {
         case c:
            switch ((dmn)$$0.c(e)) {
               case c:
                  return $$0.a(e, dmn.d);
               case d:
                  return $$0.a(e, dmn.c);
               case e:
                  return $$0.a(e, dmn.f);
               case f:
                  return $$0.a(e, dmn.e);
               case g:
                  return $$0.a(e, dmn.i);
               case h:
                  return $$0.a(e, dmn.j);
               case i:
                  return $$0.a(e, dmn.g);
               case j:
                  return $$0.a(e, dmn.h);
            }
         case d:
            switch ((dmn)$$0.c(e)) {
               case a:
                  return $$0.a(e, dmn.b);
               case b:
                  return $$0.a(e, dmn.a);
               case c:
                  return $$0.a(e, dmn.e);
               case d:
                  return $$0.a(e, dmn.f);
               case e:
                  return $$0.a(e, dmn.d);
               case f:
                  return $$0.a(e, dmn.c);
               case g:
                  return $$0.a(e, dmn.j);
               case h:
                  return $$0.a(e, dmn.g);
               case i:
                  return $$0.a(e, dmn.h);
               case j:
                  return $$0.a(e, dmn.i);
            }
         case b:
            switch ((dmn)$$0.c(e)) {
               case a:
                  return $$0.a(e, dmn.b);
               case b:
                  return $$0.a(e, dmn.a);
               case c:
                  return $$0.a(e, dmn.f);
               case d:
                  return $$0.a(e, dmn.e);
               case e:
                  return $$0.a(e, dmn.c);
               case f:
                  return $$0.a(e, dmn.d);
               case g:
                  return $$0.a(e, dmn.h);
               case h:
                  return $$0.a(e, dmn.i);
               case i:
                  return $$0.a(e, dmn.j);
               case j:
                  return $$0.a(e, dmn.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      dmn $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dmn.f);
               case f:
                  return $$0.a(e, dmn.e);
               case g:
                  return $$0.a(e, dmn.j);
               case h:
                  return $$0.a(e, dmn.i);
               case i:
                  return $$0.a(e, dmn.h);
               case j:
                  return $$0.a(e, dmn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dmn.d);
               case d:
                  return $$0.a(e, dmn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dmn.h);
               case h:
                  return $$0.a(e, dmn.g);
               case i:
                  return $$0.a(e, dmn.j);
               case j:
                  return $$0.a(e, dmn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(e, f, c);
   }
}
