import com.mojang.serialization.MapCodec;

public class cyw extends csr {
   public static final MapCodec<cyw> d = b(cyw::new);
   public static final dgb<dgh> e = dft.ah;
   public static final dfu f = dft.w;

   @Override
   public MapCodec<cyw> a() {
      return d;
   }

   protected cyw(dfc.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dgh.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cqb $$0, gw $$1, dfd $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dgh $$9 = $$2.c(e);
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

               $$9 = dgh.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dgh.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dgh.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dgh.a;
         }

         return this.a($$0, new gw($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new gw($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cqb $$0, gw $$1, boolean $$2, int $$3, dgh $$4) {
      dfd $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dgh $$6 = $$5.c(e);
         if ($$4 != dgh.b || $$6 != dgh.a && $$6 != dgh.e && $$6 != dgh.f) {
            if ($$4 != dgh.a || $$6 != dgh.b && $$6 != dgh.c && $$6 != dgh.d) {
               if (!$$5.c(f)) {
                  return false;
               } else {
                  return $$0.B($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
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
   protected void a(dfd $$0, cqb $$1, gw $$2, ctc $$3) {
      boolean $$4 = $$0.c(f);
      boolean $$5 = $$1.B($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(f, Boolean.valueOf($$5)), 3);
         $$1.a($$2.d(), this);
         if ($$0.c(e).b()) {
            $$1.a($$2.c(), this);
         }
      }
   }

   @Override
   public dgg<dgh> c() {
      return e;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      switch ($$1) {
         case c:
            switch ((dgh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dgh.d);
               case d:
                  return $$0.a(e, dgh.c);
               case e:
                  return $$0.a(e, dgh.f);
               case f:
                  return $$0.a(e, dgh.e);
               case g:
                  return $$0.a(e, dgh.i);
               case h:
                  return $$0.a(e, dgh.j);
               case i:
                  return $$0.a(e, dgh.g);
               case j:
                  return $$0.a(e, dgh.h);
            }
         case d:
            switch ((dgh)$$0.c(e)) {
               case a:
                  return $$0.a(e, dgh.b);
               case b:
                  return $$0.a(e, dgh.a);
               case c:
                  return $$0.a(e, dgh.e);
               case d:
                  return $$0.a(e, dgh.f);
               case e:
                  return $$0.a(e, dgh.d);
               case f:
                  return $$0.a(e, dgh.c);
               case g:
                  return $$0.a(e, dgh.j);
               case h:
                  return $$0.a(e, dgh.g);
               case i:
                  return $$0.a(e, dgh.h);
               case j:
                  return $$0.a(e, dgh.i);
            }
         case b:
            switch ((dgh)$$0.c(e)) {
               case a:
                  return $$0.a(e, dgh.b);
               case b:
                  return $$0.a(e, dgh.a);
               case c:
                  return $$0.a(e, dgh.f);
               case d:
                  return $$0.a(e, dgh.e);
               case e:
                  return $$0.a(e, dgh.c);
               case f:
                  return $$0.a(e, dgh.d);
               case g:
                  return $$0.a(e, dgh.h);
               case h:
                  return $$0.a(e, dgh.i);
               case i:
                  return $$0.a(e, dgh.j);
               case j:
                  return $$0.a(e, dgh.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      dgh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dgh.f);
               case f:
                  return $$0.a(e, dgh.e);
               case g:
                  return $$0.a(e, dgh.j);
               case h:
                  return $$0.a(e, dgh.i);
               case i:
                  return $$0.a(e, dgh.h);
               case j:
                  return $$0.a(e, dgh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dgh.d);
               case d:
                  return $$0.a(e, dgh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dgh.h);
               case h:
                  return $$0.a(e, dgh.g);
               case i:
                  return $$0.a(e, dgh.j);
               case j:
                  return $$0.a(e, dgh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e, f, c);
   }
}
