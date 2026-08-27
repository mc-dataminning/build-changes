import com.mojang.serialization.MapCodec;

public class dju extends ddn {
   public static final MapCodec<dju> d = b(dju::new);
   public static final drz<dsf> e = drr.ah;
   public static final drs f = drr.w;

   @Override
   public MapCodec<dju> a() {
      return d;
   }

   protected dju(dra.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dsf.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dax $$0, io $$1, drb $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dsf $$9 = $$2.c(e);
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

               $$9 = dsf.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dsf.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dsf.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dsf.a;
         }

         return this.a($$0, new io($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new io($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dax $$0, io $$1, boolean $$2, int $$3, dsf $$4) {
      drb $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dsf $$6 = $$5.c(e);
         if ($$4 != dsf.b || $$6 != dsf.a && $$6 != dsf.e && $$6 != dsf.f) {
            if ($$4 != dsf.a || $$6 != dsf.b && $$6 != dsf.c && $$6 != dsf.d) {
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
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3) {
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
   public dse<dsf> c() {
      return e;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      switch ($$1) {
         case c:
            switch ((dsf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsf.d);
               case d:
                  return $$0.a(e, dsf.c);
               case e:
                  return $$0.a(e, dsf.f);
               case f:
                  return $$0.a(e, dsf.e);
               case g:
                  return $$0.a(e, dsf.i);
               case h:
                  return $$0.a(e, dsf.j);
               case i:
                  return $$0.a(e, dsf.g);
               case j:
                  return $$0.a(e, dsf.h);
            }
         case d:
            switch ((dsf)$$0.c(e)) {
               case a:
                  return $$0.a(e, dsf.b);
               case b:
                  return $$0.a(e, dsf.a);
               case c:
                  return $$0.a(e, dsf.e);
               case d:
                  return $$0.a(e, dsf.f);
               case e:
                  return $$0.a(e, dsf.d);
               case f:
                  return $$0.a(e, dsf.c);
               case g:
                  return $$0.a(e, dsf.j);
               case h:
                  return $$0.a(e, dsf.g);
               case i:
                  return $$0.a(e, dsf.h);
               case j:
                  return $$0.a(e, dsf.i);
            }
         case b:
            switch ((dsf)$$0.c(e)) {
               case a:
                  return $$0.a(e, dsf.b);
               case b:
                  return $$0.a(e, dsf.a);
               case c:
                  return $$0.a(e, dsf.f);
               case d:
                  return $$0.a(e, dsf.e);
               case e:
                  return $$0.a(e, dsf.c);
               case f:
                  return $$0.a(e, dsf.d);
               case g:
                  return $$0.a(e, dsf.h);
               case h:
                  return $$0.a(e, dsf.i);
               case i:
                  return $$0.a(e, dsf.j);
               case j:
                  return $$0.a(e, dsf.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      dsf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dsf.f);
               case f:
                  return $$0.a(e, dsf.e);
               case g:
                  return $$0.a(e, dsf.j);
               case h:
                  return $$0.a(e, dsf.i);
               case i:
                  return $$0.a(e, dsf.h);
               case j:
                  return $$0.a(e, dsf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dsf.d);
               case d:
                  return $$0.a(e, dsf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dsf.h);
               case h:
                  return $$0.a(e, dsf.g);
               case i:
                  return $$0.a(e, dsf.j);
               case j:
                  return $$0.a(e, dsf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(e, f, c);
   }
}
