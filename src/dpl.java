import com.mojang.serialization.MapCodec;

public class dpl extends diz {
   public static final MapCodec<dpl> d = b(dpl::new);
   public static final dxs<dxy> e = dxl.ak;
   public static final dxm f = dxl.B;

   @Override
   public MapCodec<dpl> a() {
      return d;
   }

   protected dpl(dwu.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dxy.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dgg $$0, ji $$1, dwv $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dxy $$9 = $$2.c(e);
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

               $$9 = dxy.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dxy.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dxy.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dxy.a;
         }

         return this.a($$0, new ji($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ji($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dgg $$0, ji $$1, boolean $$2, int $$3, dxy $$4) {
      dwv $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dxy $$6 = $$5.c(e);
         if ($$4 != dxy.b || $$6 != dxy.a && $$6 != dxy.e && $$6 != dxy.f) {
            if ($$4 != dxy.a || $$6 != dxy.b && $$6 != dxy.c && $$6 != dxy.d) {
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
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3) {
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
   public dxx<dxy> c() {
      return e;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      switch ($$1) {
         case c:
            switch ((dxy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dxy.d);
               case d:
                  return $$0.b(e, dxy.c);
               case e:
                  return $$0.b(e, dxy.f);
               case f:
                  return $$0.b(e, dxy.e);
               case g:
                  return $$0.b(e, dxy.i);
               case h:
                  return $$0.b(e, dxy.j);
               case i:
                  return $$0.b(e, dxy.g);
               case j:
                  return $$0.b(e, dxy.h);
            }
         case d:
            switch ((dxy)$$0.c(e)) {
               case a:
                  return $$0.b(e, dxy.b);
               case b:
                  return $$0.b(e, dxy.a);
               case c:
                  return $$0.b(e, dxy.e);
               case d:
                  return $$0.b(e, dxy.f);
               case e:
                  return $$0.b(e, dxy.d);
               case f:
                  return $$0.b(e, dxy.c);
               case g:
                  return $$0.b(e, dxy.j);
               case h:
                  return $$0.b(e, dxy.g);
               case i:
                  return $$0.b(e, dxy.h);
               case j:
                  return $$0.b(e, dxy.i);
            }
         case b:
            switch ((dxy)$$0.c(e)) {
               case a:
                  return $$0.b(e, dxy.b);
               case b:
                  return $$0.b(e, dxy.a);
               case c:
                  return $$0.b(e, dxy.f);
               case d:
                  return $$0.b(e, dxy.e);
               case e:
                  return $$0.b(e, dxy.c);
               case f:
                  return $$0.b(e, dxy.d);
               case g:
                  return $$0.b(e, dxy.h);
               case h:
                  return $$0.b(e, dxy.i);
               case i:
                  return $$0.b(e, dxy.j);
               case j:
                  return $$0.b(e, dxy.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      dxy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dxy.f);
               case f:
                  return $$0.b(e, dxy.e);
               case g:
                  return $$0.b(e, dxy.j);
               case h:
                  return $$0.b(e, dxy.i);
               case i:
                  return $$0.b(e, dxy.h);
               case j:
                  return $$0.b(e, dxy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dxy.d);
               case d:
                  return $$0.b(e, dxy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dxy.h);
               case h:
                  return $$0.b(e, dxy.g);
               case i:
                  return $$0.b(e, dxy.j);
               case j:
                  return $$0.b(e, dxy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e, f, c);
   }
}
