import com.mojang.serialization.MapCodec;

public class dkx extends deq {
   public static final MapCodec<dkx> d = b(dkx::new);
   public static final dtc<dti> e = dsu.ah;
   public static final dsv f = dsu.w;

   @Override
   public MapCodec<dkx> a() {
      return d;
   }

   protected dkx(dsd.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dti.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dca $$0, iz $$1, dse $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dti $$9 = $$2.c(e);
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

               $$9 = dti.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dti.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dti.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dti.a;
         }

         return this.a($$0, new iz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dca $$0, iz $$1, boolean $$2, int $$3, dti $$4) {
      dse $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dti $$6 = $$5.c(e);
         if ($$4 != dti.b || $$6 != dti.a && $$6 != dti.e && $$6 != dti.f) {
            if ($$4 != dti.a || $$6 != dti.b && $$6 != dti.c && $$6 != dti.d) {
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
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3) {
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
   public dth<dti> c() {
      return e;
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      switch ($$1) {
         case c:
            switch ((dti)$$0.c(e)) {
               case c:
                  return $$0.a(e, dti.d);
               case d:
                  return $$0.a(e, dti.c);
               case e:
                  return $$0.a(e, dti.f);
               case f:
                  return $$0.a(e, dti.e);
               case g:
                  return $$0.a(e, dti.i);
               case h:
                  return $$0.a(e, dti.j);
               case i:
                  return $$0.a(e, dti.g);
               case j:
                  return $$0.a(e, dti.h);
            }
         case d:
            switch ((dti)$$0.c(e)) {
               case a:
                  return $$0.a(e, dti.b);
               case b:
                  return $$0.a(e, dti.a);
               case c:
                  return $$0.a(e, dti.e);
               case d:
                  return $$0.a(e, dti.f);
               case e:
                  return $$0.a(e, dti.d);
               case f:
                  return $$0.a(e, dti.c);
               case g:
                  return $$0.a(e, dti.j);
               case h:
                  return $$0.a(e, dti.g);
               case i:
                  return $$0.a(e, dti.h);
               case j:
                  return $$0.a(e, dti.i);
            }
         case b:
            switch ((dti)$$0.c(e)) {
               case a:
                  return $$0.a(e, dti.b);
               case b:
                  return $$0.a(e, dti.a);
               case c:
                  return $$0.a(e, dti.f);
               case d:
                  return $$0.a(e, dti.e);
               case e:
                  return $$0.a(e, dti.c);
               case f:
                  return $$0.a(e, dti.d);
               case g:
                  return $$0.a(e, dti.h);
               case h:
                  return $$0.a(e, dti.i);
               case i:
                  return $$0.a(e, dti.j);
               case j:
                  return $$0.a(e, dti.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      dti $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dti.f);
               case f:
                  return $$0.a(e, dti.e);
               case g:
                  return $$0.a(e, dti.j);
               case h:
                  return $$0.a(e, dti.i);
               case i:
                  return $$0.a(e, dti.h);
               case j:
                  return $$0.a(e, dti.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dti.d);
               case d:
                  return $$0.a(e, dti.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dti.h);
               case h:
                  return $$0.a(e, dti.g);
               case i:
                  return $$0.a(e, dti.j);
               case j:
                  return $$0.a(e, dti.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(e, f, c);
   }
}
