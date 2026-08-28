import com.mojang.serialization.MapCodec;

public class dle extends dex {
   public static final MapCodec<dle> d = b(dle::new);
   public static final dtj<dtp> e = dtb.ah;
   public static final dtc f = dtb.w;

   @Override
   public MapCodec<dle> a() {
      return d;
   }

   protected dle(dsk.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dtp.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dcg $$0, ja $$1, dsl $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dtp $$9 = $$2.c(e);
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

               $$9 = dtp.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dtp.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dtp.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dtp.a;
         }

         return this.a($$0, new ja($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ja($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dcg $$0, ja $$1, boolean $$2, int $$3, dtp $$4) {
      dsl $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dtp $$6 = $$5.c(e);
         if ($$4 != dtp.b || $$6 != dtp.a && $$6 != dtp.e && $$6 != dtp.f) {
            if ($$4 != dtp.a || $$6 != dtp.b && $$6 != dtp.c && $$6 != dtp.d) {
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
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3) {
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
   public dto<dtp> c() {
      return e;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      switch ($$1) {
         case c:
            switch ((dtp)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtp.d);
               case d:
                  return $$0.a(e, dtp.c);
               case e:
                  return $$0.a(e, dtp.f);
               case f:
                  return $$0.a(e, dtp.e);
               case g:
                  return $$0.a(e, dtp.i);
               case h:
                  return $$0.a(e, dtp.j);
               case i:
                  return $$0.a(e, dtp.g);
               case j:
                  return $$0.a(e, dtp.h);
            }
         case d:
            switch ((dtp)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtp.b);
               case b:
                  return $$0.a(e, dtp.a);
               case c:
                  return $$0.a(e, dtp.e);
               case d:
                  return $$0.a(e, dtp.f);
               case e:
                  return $$0.a(e, dtp.d);
               case f:
                  return $$0.a(e, dtp.c);
               case g:
                  return $$0.a(e, dtp.j);
               case h:
                  return $$0.a(e, dtp.g);
               case i:
                  return $$0.a(e, dtp.h);
               case j:
                  return $$0.a(e, dtp.i);
            }
         case b:
            switch ((dtp)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtp.b);
               case b:
                  return $$0.a(e, dtp.a);
               case c:
                  return $$0.a(e, dtp.f);
               case d:
                  return $$0.a(e, dtp.e);
               case e:
                  return $$0.a(e, dtp.c);
               case f:
                  return $$0.a(e, dtp.d);
               case g:
                  return $$0.a(e, dtp.h);
               case h:
                  return $$0.a(e, dtp.i);
               case i:
                  return $$0.a(e, dtp.j);
               case j:
                  return $$0.a(e, dtp.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      dtp $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtp.f);
               case f:
                  return $$0.a(e, dtp.e);
               case g:
                  return $$0.a(e, dtp.j);
               case h:
                  return $$0.a(e, dtp.i);
               case i:
                  return $$0.a(e, dtp.h);
               case j:
                  return $$0.a(e, dtp.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtp.d);
               case d:
                  return $$0.a(e, dtp.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtp.h);
               case h:
                  return $$0.a(e, dtp.g);
               case i:
                  return $$0.a(e, dtp.j);
               case j:
                  return $$0.a(e, dtp.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(e, f, c);
   }
}
