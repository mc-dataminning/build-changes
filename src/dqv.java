import com.mojang.serialization.MapCodec;

public class dqv extends dkj {
   public static final MapCodec<dqv> b = b(dqv::new);
   public static final dzk<dzq> c = dzc.ak;
   public static final dzd d = dzc.A;

   @Override
   public MapCodec<dqv> a() {
      return b;
   }

   protected dqv(dyl.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(c, dzq.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(dhp $$0, jj $$1, dym $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dzq $$9 = $$2.c(c);
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

               $$9 = dzq.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dzq.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dzq.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dzq.a;
         }

         return this.a($$0, new jj($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jj($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dhp $$0, jj $$1, boolean $$2, int $$3, dzq $$4) {
      dym $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dzq $$6 = $$5.c(c);
         if ($$4 != dzq.b || $$6 != dzq.a && $$6 != dzq.e && $$6 != dzq.f) {
            if ($$4 != dzq.a || $$6 != dzq.b && $$6 != dzq.c && $$6 != dzq.d) {
               if (!$$5.c(d)) {
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
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3) {
      boolean $$4 = $$0.c(d);
      boolean $$5 = $$1.C($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.b(d, Boolean.valueOf($$5)), 3);
         $$1.a($$2.e(), this);
         if ($$0.c(c).b()) {
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dzp<dzq> c() {
      return c;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      switch ($$1) {
         case c:
            switch ((dzq)$$0.c(c)) {
               case c:
                  return $$0.b(c, dzq.d);
               case d:
                  return $$0.b(c, dzq.c);
               case e:
                  return $$0.b(c, dzq.f);
               case f:
                  return $$0.b(c, dzq.e);
               case g:
                  return $$0.b(c, dzq.i);
               case h:
                  return $$0.b(c, dzq.j);
               case i:
                  return $$0.b(c, dzq.g);
               case j:
                  return $$0.b(c, dzq.h);
            }
         case d:
            switch ((dzq)$$0.c(c)) {
               case a:
                  return $$0.b(c, dzq.b);
               case b:
                  return $$0.b(c, dzq.a);
               case c:
                  return $$0.b(c, dzq.e);
               case d:
                  return $$0.b(c, dzq.f);
               case e:
                  return $$0.b(c, dzq.d);
               case f:
                  return $$0.b(c, dzq.c);
               case g:
                  return $$0.b(c, dzq.j);
               case h:
                  return $$0.b(c, dzq.g);
               case i:
                  return $$0.b(c, dzq.h);
               case j:
                  return $$0.b(c, dzq.i);
            }
         case b:
            switch ((dzq)$$0.c(c)) {
               case a:
                  return $$0.b(c, dzq.b);
               case b:
                  return $$0.b(c, dzq.a);
               case c:
                  return $$0.b(c, dzq.f);
               case d:
                  return $$0.b(c, dzq.e);
               case e:
                  return $$0.b(c, dzq.c);
               case f:
                  return $$0.b(c, dzq.d);
               case g:
                  return $$0.b(c, dzq.h);
               case h:
                  return $$0.b(c, dzq.i);
               case i:
                  return $$0.b(c, dzq.j);
               case j:
                  return $$0.b(c, dzq.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      dzq $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, dzq.f);
               case f:
                  return $$0.b(c, dzq.e);
               case g:
                  return $$0.b(c, dzq.j);
               case h:
                  return $$0.b(c, dzq.i);
               case i:
                  return $$0.b(c, dzq.h);
               case j:
                  return $$0.b(c, dzq.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, dzq.d);
               case d:
                  return $$0.b(c, dzq.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, dzq.h);
               case h:
                  return $$0.b(c, dzq.g);
               case i:
                  return $$0.b(c, dzq.j);
               case j:
                  return $$0.b(c, dzq.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c, d, a);
   }
}
