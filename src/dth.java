import com.mojang.serialization.MapCodec;

public class dth extends dmt {
   public static final MapCodec<dth> b = b(dth::new);
   public static final ece<eck> c = ebw.ak;
   public static final ebx d = ebw.A;

   @Override
   public MapCodec<dth> a() {
      return b;
   }

   protected dth(ebf.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, eck.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(djz $$0, iw $$1, ebg $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         eck $$9 = $$2.c(c);
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

               $$9 = eck.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = eck.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = eck.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = eck.a;
         }

         return this.a($$0, new iw($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iw($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(djz $$0, iw $$1, boolean $$2, int $$3, eck $$4) {
      ebg $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         eck $$6 = $$5.c(c);
         if ($$4 != eck.b || $$6 != eck.a && $$6 != eck.e && $$6 != eck.f) {
            if ($$4 != eck.a || $$6 != eck.b && $$6 != eck.c && $$6 != eck.d) {
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
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3) {
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
   public ecj<eck> c() {
      return c;
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      switch ($$1) {
         case c:
            switch ((eck)$$0.c(c)) {
               case c:
                  return $$0.b(c, eck.d);
               case d:
                  return $$0.b(c, eck.c);
               case e:
                  return $$0.b(c, eck.f);
               case f:
                  return $$0.b(c, eck.e);
               case g:
                  return $$0.b(c, eck.i);
               case h:
                  return $$0.b(c, eck.j);
               case i:
                  return $$0.b(c, eck.g);
               case j:
                  return $$0.b(c, eck.h);
            }
         case d:
            switch ((eck)$$0.c(c)) {
               case a:
                  return $$0.b(c, eck.b);
               case b:
                  return $$0.b(c, eck.a);
               case c:
                  return $$0.b(c, eck.e);
               case d:
                  return $$0.b(c, eck.f);
               case e:
                  return $$0.b(c, eck.d);
               case f:
                  return $$0.b(c, eck.c);
               case g:
                  return $$0.b(c, eck.j);
               case h:
                  return $$0.b(c, eck.g);
               case i:
                  return $$0.b(c, eck.h);
               case j:
                  return $$0.b(c, eck.i);
            }
         case b:
            switch ((eck)$$0.c(c)) {
               case a:
                  return $$0.b(c, eck.b);
               case b:
                  return $$0.b(c, eck.a);
               case c:
                  return $$0.b(c, eck.f);
               case d:
                  return $$0.b(c, eck.e);
               case e:
                  return $$0.b(c, eck.c);
               case f:
                  return $$0.b(c, eck.d);
               case g:
                  return $$0.b(c, eck.h);
               case h:
                  return $$0.b(c, eck.i);
               case i:
                  return $$0.b(c, eck.j);
               case j:
                  return $$0.b(c, eck.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      eck $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eck.f);
               case f:
                  return $$0.b(c, eck.e);
               case g:
                  return $$0.b(c, eck.j);
               case h:
                  return $$0.b(c, eck.i);
               case i:
                  return $$0.b(c, eck.h);
               case j:
                  return $$0.b(c, eck.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eck.d);
               case d:
                  return $$0.b(c, eck.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eck.h);
               case h:
                  return $$0.b(c, eck.g);
               case i:
                  return $$0.b(c, eck.j);
               case j:
                  return $$0.b(c, eck.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, d, a);
   }
}
