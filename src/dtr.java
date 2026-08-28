import com.mojang.serialization.MapCodec;

public class dtr extends dnd {
   public static final MapCodec<dtr> b = b(dtr::new);
   public static final eco<ecu> c = ecg.ak;
   public static final ech d = ecg.A;

   @Override
   public MapCodec<dtr> a() {
      return b;
   }

   protected dtr(ebp.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, ecu.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(dkj $$0, iw $$1, ebq $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         ecu $$9 = $$2.c(c);
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

               $$9 = ecu.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = ecu.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = ecu.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = ecu.a;
         }

         return this.a($$0, new iw($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iw($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dkj $$0, iw $$1, boolean $$2, int $$3, ecu $$4) {
      ebq $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         ecu $$6 = $$5.c(c);
         if ($$4 != ecu.b || $$6 != ecu.a && $$6 != ecu.e && $$6 != ecu.f) {
            if ($$4 != ecu.a || $$6 != ecu.b && $$6 != ecu.c && $$6 != ecu.d) {
               if (!$$5.c(d)) {
                  return false;
               } else {
                  return $$0.D($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
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
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3) {
      boolean $$4 = $$0.c(d);
      boolean $$5 = $$1.D($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.b(d, Boolean.valueOf($$5)), 3);
         $$1.a($$2.e(), this);
         if ($$0.c(c).b()) {
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public ect<ecu> c() {
      return c;
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      switch ($$1) {
         case c:
            switch ((ecu)$$0.c(c)) {
               case c:
                  return $$0.b(c, ecu.d);
               case d:
                  return $$0.b(c, ecu.c);
               case e:
                  return $$0.b(c, ecu.f);
               case f:
                  return $$0.b(c, ecu.e);
               case g:
                  return $$0.b(c, ecu.i);
               case h:
                  return $$0.b(c, ecu.j);
               case i:
                  return $$0.b(c, ecu.g);
               case j:
                  return $$0.b(c, ecu.h);
            }
         case d:
            switch ((ecu)$$0.c(c)) {
               case a:
                  return $$0.b(c, ecu.b);
               case b:
                  return $$0.b(c, ecu.a);
               case c:
                  return $$0.b(c, ecu.e);
               case d:
                  return $$0.b(c, ecu.f);
               case e:
                  return $$0.b(c, ecu.d);
               case f:
                  return $$0.b(c, ecu.c);
               case g:
                  return $$0.b(c, ecu.j);
               case h:
                  return $$0.b(c, ecu.g);
               case i:
                  return $$0.b(c, ecu.h);
               case j:
                  return $$0.b(c, ecu.i);
            }
         case b:
            switch ((ecu)$$0.c(c)) {
               case a:
                  return $$0.b(c, ecu.b);
               case b:
                  return $$0.b(c, ecu.a);
               case c:
                  return $$0.b(c, ecu.f);
               case d:
                  return $$0.b(c, ecu.e);
               case e:
                  return $$0.b(c, ecu.c);
               case f:
                  return $$0.b(c, ecu.d);
               case g:
                  return $$0.b(c, ecu.h);
               case h:
                  return $$0.b(c, ecu.i);
               case i:
                  return $$0.b(c, ecu.j);
               case j:
                  return $$0.b(c, ecu.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      ecu $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ecu.f);
               case f:
                  return $$0.b(c, ecu.e);
               case g:
                  return $$0.b(c, ecu.j);
               case h:
                  return $$0.b(c, ecu.i);
               case i:
                  return $$0.b(c, ecu.h);
               case j:
                  return $$0.b(c, ecu.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ecu.d);
               case d:
                  return $$0.b(c, ecu.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ecu.h);
               case h:
                  return $$0.b(c, ecu.g);
               case i:
                  return $$0.b(c, ecu.j);
               case j:
                  return $$0.b(c, ecu.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c, d, a);
   }
}
