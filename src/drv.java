import com.mojang.serialization.MapCodec;

public class drv extends dlj {
   public static final MapCodec<drv> b = b(drv::new);
   public static final eam<eas> c = eae.ak;
   public static final eaf d = eae.A;

   @Override
   public MapCodec<drv> a() {
      return b;
   }

   protected drv(dzn.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(c, eas.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(dip $$0, iu $$1, dzo $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         eas $$9 = $$2.c(c);
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

               $$9 = eas.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = eas.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = eas.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = eas.a;
         }

         return this.a($$0, new iu($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iu($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dip $$0, iu $$1, boolean $$2, int $$3, eas $$4) {
      dzo $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         eas $$6 = $$5.c(c);
         if ($$4 != eas.b || $$6 != eas.a && $$6 != eas.e && $$6 != eas.f) {
            if ($$4 != eas.a || $$6 != eas.b && $$6 != eas.c && $$6 != eas.d) {
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
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3) {
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
   public ear<eas> c() {
      return c;
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      switch ($$1) {
         case c:
            switch ((eas)$$0.c(c)) {
               case c:
                  return $$0.b(c, eas.d);
               case d:
                  return $$0.b(c, eas.c);
               case e:
                  return $$0.b(c, eas.f);
               case f:
                  return $$0.b(c, eas.e);
               case g:
                  return $$0.b(c, eas.i);
               case h:
                  return $$0.b(c, eas.j);
               case i:
                  return $$0.b(c, eas.g);
               case j:
                  return $$0.b(c, eas.h);
            }
         case d:
            switch ((eas)$$0.c(c)) {
               case a:
                  return $$0.b(c, eas.b);
               case b:
                  return $$0.b(c, eas.a);
               case c:
                  return $$0.b(c, eas.e);
               case d:
                  return $$0.b(c, eas.f);
               case e:
                  return $$0.b(c, eas.d);
               case f:
                  return $$0.b(c, eas.c);
               case g:
                  return $$0.b(c, eas.j);
               case h:
                  return $$0.b(c, eas.g);
               case i:
                  return $$0.b(c, eas.h);
               case j:
                  return $$0.b(c, eas.i);
            }
         case b:
            switch ((eas)$$0.c(c)) {
               case a:
                  return $$0.b(c, eas.b);
               case b:
                  return $$0.b(c, eas.a);
               case c:
                  return $$0.b(c, eas.f);
               case d:
                  return $$0.b(c, eas.e);
               case e:
                  return $$0.b(c, eas.c);
               case f:
                  return $$0.b(c, eas.d);
               case g:
                  return $$0.b(c, eas.h);
               case h:
                  return $$0.b(c, eas.i);
               case i:
                  return $$0.b(c, eas.j);
               case j:
                  return $$0.b(c, eas.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      eas $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, eas.f);
               case f:
                  return $$0.b(c, eas.e);
               case g:
                  return $$0.b(c, eas.j);
               case h:
                  return $$0.b(c, eas.i);
               case i:
                  return $$0.b(c, eas.h);
               case j:
                  return $$0.b(c, eas.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, eas.d);
               case d:
                  return $$0.b(c, eas.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, eas.h);
               case h:
                  return $$0.b(c, eas.g);
               case i:
                  return $$0.b(c, eas.j);
               case j:
                  return $$0.b(c, eas.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d, a);
   }
}
