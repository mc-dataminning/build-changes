import com.mojang.serialization.MapCodec;

public class dqf extends djt {
   public static final MapCodec<dqf> b = b(dqf::new);
   public static final dyo<dyu> c = dyg.ak;
   public static final dyh d = dyg.A;

   @Override
   public MapCodec<dqf> a() {
      return b;
   }

   protected dqf(dxp.d $$0) {
      super(true, $$0);
      this.l(this.B.b().b(c, dyu.a).b(d, Boolean.valueOf(false)).b(a, Boolean.valueOf(false)));
   }

   protected boolean a(dgz $$0, ji $$1, dxq $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dyu $$9 = $$2.c(c);
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

               $$9 = dyu.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dyu.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dyu.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dyu.a;
         }

         return this.a($$0, new ji($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ji($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dgz $$0, ji $$1, boolean $$2, int $$3, dyu $$4) {
      dxq $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dyu $$6 = $$5.c(c);
         if ($$4 != dyu.b || $$6 != dyu.a && $$6 != dyu.e && $$6 != dyu.f) {
            if ($$4 != dyu.a || $$6 != dyu.b && $$6 != dyu.c && $$6 != dyu.d) {
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
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3) {
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
   public dyt<dyu> c() {
      return c;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      switch ($$1) {
         case c:
            switch ((dyu)$$0.c(c)) {
               case c:
                  return $$0.b(c, dyu.d);
               case d:
                  return $$0.b(c, dyu.c);
               case e:
                  return $$0.b(c, dyu.f);
               case f:
                  return $$0.b(c, dyu.e);
               case g:
                  return $$0.b(c, dyu.i);
               case h:
                  return $$0.b(c, dyu.j);
               case i:
                  return $$0.b(c, dyu.g);
               case j:
                  return $$0.b(c, dyu.h);
            }
         case d:
            switch ((dyu)$$0.c(c)) {
               case a:
                  return $$0.b(c, dyu.b);
               case b:
                  return $$0.b(c, dyu.a);
               case c:
                  return $$0.b(c, dyu.e);
               case d:
                  return $$0.b(c, dyu.f);
               case e:
                  return $$0.b(c, dyu.d);
               case f:
                  return $$0.b(c, dyu.c);
               case g:
                  return $$0.b(c, dyu.j);
               case h:
                  return $$0.b(c, dyu.g);
               case i:
                  return $$0.b(c, dyu.h);
               case j:
                  return $$0.b(c, dyu.i);
            }
         case b:
            switch ((dyu)$$0.c(c)) {
               case a:
                  return $$0.b(c, dyu.b);
               case b:
                  return $$0.b(c, dyu.a);
               case c:
                  return $$0.b(c, dyu.f);
               case d:
                  return $$0.b(c, dyu.e);
               case e:
                  return $$0.b(c, dyu.c);
               case f:
                  return $$0.b(c, dyu.d);
               case g:
                  return $$0.b(c, dyu.h);
               case h:
                  return $$0.b(c, dyu.i);
               case i:
                  return $$0.b(c, dyu.j);
               case j:
                  return $$0.b(c, dyu.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      dyu $$2 = $$0.c(c);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(c, dyu.f);
               case f:
                  return $$0.b(c, dyu.e);
               case g:
                  return $$0.b(c, dyu.j);
               case h:
                  return $$0.b(c, dyu.i);
               case i:
                  return $$0.b(c, dyu.h);
               case j:
                  return $$0.b(c, dyu.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(c, dyu.d);
               case d:
                  return $$0.b(c, dyu.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(c, dyu.h);
               case h:
                  return $$0.b(c, dyu.g);
               case i:
                  return $$0.b(c, dyu.j);
               case j:
                  return $$0.b(c, dyu.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c, d, a);
   }
}
