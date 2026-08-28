import com.mojang.serialization.MapCodec;

public class dtf extends dmr {
   public static final MapCodec<dtf> b = b(dtf::new);
   public static final ecc<eci> c = ebu.ak;
   public static final ebv d = ebu.A;

   @Override
   public MapCodec<dtf> a() {
      return b;
   }

   protected dtf(ebd.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, eci.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(djx $$0, iv $$1, ebe $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         eci $$9 = $$2.c(c);
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

               $$9 = eci.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = eci.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = eci.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = eci.a;
         }

         return this.a($$0, new iv($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iv($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(djx $$0, iv $$1, boolean $$2, int $$3, eci $$4) {
      ebe $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         eci $$6 = $$5.c(c);
         if ($$4 != eci.b || $$6 != eci.a && $$6 != eci.e && $$6 != eci.f) {
            if ($$4 != eci.a || $$6 != eci.b && $$6 != eci.c && $$6 != eci.d) {
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
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3) {
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
   public ech<eci> c() {
      return c;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      switch ($$1) {
         case c:
            switch ((eci)$$0.c(c)) {
               case c:
                  return $$0.b(c, eci.d);
               case d:
                  return $$0.b(c, eci.c);
               case e:
                  return $$0.b(c, eci.f);
               case f:
                  return $$0.b(c, eci.e);
               case g:
                  return $$0.b(c, eci.i);
               case h:
                  return $$0.b(c, eci.j);
               case i:
                  return $$0.b(c, eci.g);
               case j:
                  return $$0.b(c, eci.h);
            }
         case d:
            switch ((eci)$$0.c(c)) {
               case a:
                  return $$0.b(c, eci.b);
               case b:
                  return $$0.b(c, eci.a);
               case c:
                  return $$0.b(c, eci.e);
               case d:
                  return $$0.b(c, eci.f);
               case e:
                  return $$0.b(c, eci.d);
               case f:
                  return $$0.b(c, eci.c);
               case g:
                  return $$0.b(c, eci.j);
               case h:
                  return $$0.b(c, eci.g);
               case i:
                  return $$0.b(c, eci.h);
               case j:
                  return $$0.b(c, eci.i);
            }
         case b:
            switch ((eci)$$0.c(c)) {
               case a:
                  return $$0.b(c, eci.b);
               case b:
                  return $$0.b(c, eci.a);
               case c:
                  return $$0.b(c, eci.f);
               case d:
                  return $$0.b(c, eci.e);
               case e:
                  return $$0.b(c, eci.c);
               case f:
                  return $$0.b(c, eci.d);
               case g:
                  return $$0.b(c, eci.h);
               case h:
                  return $$0.b(c, eci.i);
               case i:
                  return $$0.b(c, eci.j);
               case j:
                  return $$0.b(c, eci.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      eci $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eci.f);
               case f:
                  return $$0.b(c, eci.e);
               case g:
                  return $$0.b(c, eci.j);
               case h:
                  return $$0.b(c, eci.i);
               case i:
                  return $$0.b(c, eci.h);
               case j:
                  return $$0.b(c, eci.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eci.d);
               case d:
                  return $$0.b(c, eci.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eci.h);
               case h:
                  return $$0.b(c, eci.g);
               case i:
                  return $$0.b(c, eci.j);
               case j:
                  return $$0.b(c, eci.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c, d, a);
   }
}
