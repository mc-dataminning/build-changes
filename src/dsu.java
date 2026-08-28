import com.mojang.serialization.MapCodec;

public class dsu extends dmg {
   public static final MapCodec<dsu> b = b(dsu::new);
   public static final ebr<ebx> c = ebj.ak;
   public static final ebk d = ebj.A;

   @Override
   public MapCodec<dsu> a() {
      return b;
   }

   protected dsu(eas.d $$0) {
      super(true, $$0);
      this.l(this.C.b().b(c, ebx.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(djm $$0, iv $$1, eat $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         ebx $$9 = $$2.c(c);
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

               $$9 = ebx.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = ebx.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = ebx.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = ebx.a;
         }

         return this.a($$0, new iv($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iv($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(djm $$0, iv $$1, boolean $$2, int $$3, ebx $$4) {
      eat $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         ebx $$6 = $$5.c(c);
         if ($$4 != ebx.b || $$6 != ebx.a && $$6 != ebx.e && $$6 != ebx.f) {
            if ($$4 != ebx.a || $$6 != ebx.b && $$6 != ebx.c && $$6 != ebx.d) {
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
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3) {
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
   public ebw<ebx> c() {
      return c;
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      switch ($$1) {
         case c:
            switch ((ebx)$$0.c(c)) {
               case c:
                  return $$0.b(c, ebx.d);
               case d:
                  return $$0.b(c, ebx.c);
               case e:
                  return $$0.b(c, ebx.f);
               case f:
                  return $$0.b(c, ebx.e);
               case g:
                  return $$0.b(c, ebx.i);
               case h:
                  return $$0.b(c, ebx.j);
               case i:
                  return $$0.b(c, ebx.g);
               case j:
                  return $$0.b(c, ebx.h);
            }
         case d:
            switch ((ebx)$$0.c(c)) {
               case a:
                  return $$0.b(c, ebx.b);
               case b:
                  return $$0.b(c, ebx.a);
               case c:
                  return $$0.b(c, ebx.e);
               case d:
                  return $$0.b(c, ebx.f);
               case e:
                  return $$0.b(c, ebx.d);
               case f:
                  return $$0.b(c, ebx.c);
               case g:
                  return $$0.b(c, ebx.j);
               case h:
                  return $$0.b(c, ebx.g);
               case i:
                  return $$0.b(c, ebx.h);
               case j:
                  return $$0.b(c, ebx.i);
            }
         case b:
            switch ((ebx)$$0.c(c)) {
               case a:
                  return $$0.b(c, ebx.b);
               case b:
                  return $$0.b(c, ebx.a);
               case c:
                  return $$0.b(c, ebx.f);
               case d:
                  return $$0.b(c, ebx.e);
               case e:
                  return $$0.b(c, ebx.c);
               case f:
                  return $$0.b(c, ebx.d);
               case g:
                  return $$0.b(c, ebx.h);
               case h:
                  return $$0.b(c, ebx.i);
               case i:
                  return $$0.b(c, ebx.j);
               case j:
                  return $$0.b(c, ebx.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      ebx $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, ebx.f);
               case f:
                  return $$0.b(c, ebx.e);
               case g:
                  return $$0.b(c, ebx.j);
               case h:
                  return $$0.b(c, ebx.i);
               case i:
                  return $$0.b(c, ebx.h);
               case j:
                  return $$0.b(c, ebx.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, ebx.d);
               case d:
                  return $$0.b(c, ebx.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, ebx.h);
               case h:
                  return $$0.b(c, ebx.g);
               case i:
                  return $$0.b(c, ebx.j);
               case j:
                  return $$0.b(c, ebx.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(c, d, a);
   }
}
