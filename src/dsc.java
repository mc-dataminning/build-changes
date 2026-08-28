import com.mojang.serialization.MapCodec;

public class dsc extends dlp {
   public static final MapCodec<dsc> b = b(dsc::new);
   public static final eax<ebd> c = eap.ak;
   public static final eaq d = eap.A;

   @Override
   public MapCodec<dsc> a() {
      return b;
   }

   protected dsc(dzy.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(c, ebd.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(div $$0, iu $$1, dzz $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         ebd $$9 = $$2.c(c);
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

               $$9 = ebd.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = ebd.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = ebd.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = ebd.a;
         }

         return this.a($$0, new iu($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iu($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(div $$0, iu $$1, boolean $$2, int $$3, ebd $$4) {
      dzz $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         ebd $$6 = $$5.c(c);
         if ($$4 != ebd.b || $$6 != ebd.a && $$6 != ebd.e && $$6 != ebd.f) {
            if ($$4 != ebd.a || $$6 != ebd.b && $$6 != ebd.c && $$6 != ebd.d) {
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
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3) {
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
   public ebc<ebd> c() {
      return c;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      switch ($$1) {
         case c:
            switch ((ebd)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebd.d);
               case d:
                  return $$0.b(c, ebd.c);
               case e:
                  return $$0.b(c, ebd.f);
               case f:
                  return $$0.b(c, ebd.e);
               case g:
                  return $$0.b(c, ebd.i);
               case h:
                  return $$0.b(c, ebd.j);
               case i:
                  return $$0.b(c, ebd.g);
               case j:
                  return $$0.b(c, ebd.h);
            }
         case d:
            switch ((ebd)$$0.c(c)) {
               case a:
                  return $$0.b(c, ebd.b);
               case b:
                  return $$0.b(c, ebd.a);
               case c:
                  return $$0.b(c, ebd.e);
               case d:
                  return $$0.b(c, ebd.f);
               case e:
                  return $$0.b(c, ebd.d);
               case f:
                  return $$0.b(c, ebd.c);
               case g:
                  return $$0.b(c, ebd.j);
               case h:
                  return $$0.b(c, ebd.g);
               case i:
                  return $$0.b(c, ebd.h);
               case j:
                  return $$0.b(c, ebd.i);
            }
         case b:
            switch ((ebd)$$0.c(c)) {
               case a:
                  return $$0.b(c, ebd.b);
               case b:
                  return $$0.b(c, ebd.a);
               case c:
                  return $$0.b(c, ebd.f);
               case d:
                  return $$0.b(c, ebd.e);
               case e:
                  return $$0.b(c, ebd.c);
               case f:
                  return $$0.b(c, ebd.d);
               case g:
                  return $$0.b(c, ebd.h);
               case h:
                  return $$0.b(c, ebd.i);
               case i:
                  return $$0.b(c, ebd.j);
               case j:
                  return $$0.b(c, ebd.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      ebd $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebd.f);
               case f:
                  return $$0.b(c, ebd.e);
               case g:
                  return $$0.b(c, ebd.j);
               case h:
                  return $$0.b(c, ebd.i);
               case i:
                  return $$0.b(c, ebd.h);
               case j:
                  return $$0.b(c, ebd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebd.d);
               case d:
                  return $$0.b(c, ebd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebd.h);
               case h:
                  return $$0.b(c, ebd.g);
               case i:
                  return $$0.b(c, ebd.j);
               case j:
                  return $$0.b(c, ebd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c, d, a);
   }
}
