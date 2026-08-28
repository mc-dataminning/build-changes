import com.mojang.serialization.MapCodec;

public class dqe extends djs {
   public static final MapCodec<dqe> d = b(dqe::new);
   public static final dyl<dyr> e = dye.ak;
   public static final dyf f = dye.B;

   @Override
   public MapCodec<dqe> a() {
      return d;
   }

   protected dqe(dxn.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dyr.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dgz $$0, jh $$1, dxo $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dyr $$9 = $$2.c(e);
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

               $$9 = dyr.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dyr.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dyr.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dyr.a;
         }

         return this.a($$0, new jh($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jh($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dgz $$0, jh $$1, boolean $$2, int $$3, dyr $$4) {
      dxo $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dyr $$6 = $$5.c(e);
         if ($$4 != dyr.b || $$6 != dyr.a && $$6 != dyr.e && $$6 != dyr.f) {
            if ($$4 != dyr.a || $$6 != dyr.b && $$6 != dyr.c && $$6 != dyr.d) {
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
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3) {
      boolean $$4 = $$0.c(f);
      boolean $$5 = $$1.C($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.b(f, Boolean.valueOf($$5)), 3);
         $$1.a($$2.e(), this);
         if ($$0.c(e).b()) {
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dyq<dyr> c() {
      return e;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      switch ($$1) {
         case c:
            switch ((dyr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyr.d);
               case d:
                  return $$0.b(e, dyr.c);
               case e:
                  return $$0.b(e, dyr.f);
               case f:
                  return $$0.b(e, dyr.e);
               case g:
                  return $$0.b(e, dyr.i);
               case h:
                  return $$0.b(e, dyr.j);
               case i:
                  return $$0.b(e, dyr.g);
               case j:
                  return $$0.b(e, dyr.h);
            }
         case d:
            switch ((dyr)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyr.b);
               case b:
                  return $$0.b(e, dyr.a);
               case c:
                  return $$0.b(e, dyr.e);
               case d:
                  return $$0.b(e, dyr.f);
               case e:
                  return $$0.b(e, dyr.d);
               case f:
                  return $$0.b(e, dyr.c);
               case g:
                  return $$0.b(e, dyr.j);
               case h:
                  return $$0.b(e, dyr.g);
               case i:
                  return $$0.b(e, dyr.h);
               case j:
                  return $$0.b(e, dyr.i);
            }
         case b:
            switch ((dyr)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyr.b);
               case b:
                  return $$0.b(e, dyr.a);
               case c:
                  return $$0.b(e, dyr.f);
               case d:
                  return $$0.b(e, dyr.e);
               case e:
                  return $$0.b(e, dyr.c);
               case f:
                  return $$0.b(e, dyr.d);
               case g:
                  return $$0.b(e, dyr.h);
               case h:
                  return $$0.b(e, dyr.i);
               case i:
                  return $$0.b(e, dyr.j);
               case j:
                  return $$0.b(e, dyr.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      dyr $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyr.f);
               case f:
                  return $$0.b(e, dyr.e);
               case g:
                  return $$0.b(e, dyr.j);
               case h:
                  return $$0.b(e, dyr.i);
               case i:
                  return $$0.b(e, dyr.h);
               case j:
                  return $$0.b(e, dyr.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyr.d);
               case d:
                  return $$0.b(e, dyr.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyr.h);
               case h:
                  return $$0.b(e, dyr.g);
               case i:
                  return $$0.b(e, dyr.j);
               case j:
                  return $$0.b(e, dyr.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(e, f, c);
   }
}
