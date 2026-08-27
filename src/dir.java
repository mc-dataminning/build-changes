import com.mojang.serialization.MapCodec;

public class dir extends dck {
   public static final MapCodec<dir> d = b(dir::new);
   public static final dqw<drc> e = dqo.ah;
   public static final dqp f = dqo.w;

   @Override
   public MapCodec<dir> a() {
      return d;
   }

   protected dir(dpx.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, drc.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(czu $$0, im $$1, dpy $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         drc $$9 = $$2.c(e);
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

               $$9 = drc.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = drc.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = drc.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = drc.a;
         }

         return this.a($$0, new im($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new im($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(czu $$0, im $$1, boolean $$2, int $$3, drc $$4) {
      dpy $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         drc $$6 = $$5.c(e);
         if ($$4 != drc.b || $$6 != drc.a && $$6 != drc.e && $$6 != drc.f) {
            if ($$4 != drc.a || $$6 != drc.b && $$6 != drc.c && $$6 != drc.d) {
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
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3) {
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
   public drb<drc> c() {
      return e;
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      switch ($$1) {
         case c:
            switch ((drc)$$0.c(e)) {
               case c:
                  return $$0.a(e, drc.d);
               case d:
                  return $$0.a(e, drc.c);
               case e:
                  return $$0.a(e, drc.f);
               case f:
                  return $$0.a(e, drc.e);
               case g:
                  return $$0.a(e, drc.i);
               case h:
                  return $$0.a(e, drc.j);
               case i:
                  return $$0.a(e, drc.g);
               case j:
                  return $$0.a(e, drc.h);
            }
         case d:
            switch ((drc)$$0.c(e)) {
               case a:
                  return $$0.a(e, drc.b);
               case b:
                  return $$0.a(e, drc.a);
               case c:
                  return $$0.a(e, drc.e);
               case d:
                  return $$0.a(e, drc.f);
               case e:
                  return $$0.a(e, drc.d);
               case f:
                  return $$0.a(e, drc.c);
               case g:
                  return $$0.a(e, drc.j);
               case h:
                  return $$0.a(e, drc.g);
               case i:
                  return $$0.a(e, drc.h);
               case j:
                  return $$0.a(e, drc.i);
            }
         case b:
            switch ((drc)$$0.c(e)) {
               case a:
                  return $$0.a(e, drc.b);
               case b:
                  return $$0.a(e, drc.a);
               case c:
                  return $$0.a(e, drc.f);
               case d:
                  return $$0.a(e, drc.e);
               case e:
                  return $$0.a(e, drc.c);
               case f:
                  return $$0.a(e, drc.d);
               case g:
                  return $$0.a(e, drc.h);
               case h:
                  return $$0.a(e, drc.i);
               case i:
                  return $$0.a(e, drc.j);
               case j:
                  return $$0.a(e, drc.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      drc $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, drc.f);
               case f:
                  return $$0.a(e, drc.e);
               case g:
                  return $$0.a(e, drc.j);
               case h:
                  return $$0.a(e, drc.i);
               case i:
                  return $$0.a(e, drc.h);
               case j:
                  return $$0.a(e, drc.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, drc.d);
               case d:
                  return $$0.a(e, drc.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, drc.h);
               case h:
                  return $$0.a(e, drc.g);
               case i:
                  return $$0.a(e, drc.j);
               case j:
                  return $$0.a(e, drc.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e, f, c);
   }
}
