import com.mojang.serialization.MapCodec;

public class dic extends dbw {
   public static final MapCodec<dic> d = b(dic::new);
   public static final dqg<dqm> e = dpy.ah;
   public static final dpz f = dpy.w;

   @Override
   public MapCodec<dic> a() {
      return d;
   }

   protected dic(dph.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dqm.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(czg $$0, id $$1, dpi $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dqm $$9 = $$2.c(e);
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

               $$9 = dqm.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dqm.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dqm.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dqm.a;
         }

         return this.a($$0, new id($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new id($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(czg $$0, id $$1, boolean $$2, int $$3, dqm $$4) {
      dpi $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dqm $$6 = $$5.c(e);
         if ($$4 != dqm.b || $$6 != dqm.a && $$6 != dqm.e && $$6 != dqm.f) {
            if ($$4 != dqm.a || $$6 != dqm.b && $$6 != dqm.c && $$6 != dqm.d) {
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
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3) {
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
   public dql<dqm> c() {
      return e;
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      switch ($$1) {
         case c:
            switch ((dqm)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqm.d);
               case d:
                  return $$0.a(e, dqm.c);
               case e:
                  return $$0.a(e, dqm.f);
               case f:
                  return $$0.a(e, dqm.e);
               case g:
                  return $$0.a(e, dqm.i);
               case h:
                  return $$0.a(e, dqm.j);
               case i:
                  return $$0.a(e, dqm.g);
               case j:
                  return $$0.a(e, dqm.h);
            }
         case d:
            switch ((dqm)$$0.c(e)) {
               case a:
                  return $$0.a(e, dqm.b);
               case b:
                  return $$0.a(e, dqm.a);
               case c:
                  return $$0.a(e, dqm.e);
               case d:
                  return $$0.a(e, dqm.f);
               case e:
                  return $$0.a(e, dqm.d);
               case f:
                  return $$0.a(e, dqm.c);
               case g:
                  return $$0.a(e, dqm.j);
               case h:
                  return $$0.a(e, dqm.g);
               case i:
                  return $$0.a(e, dqm.h);
               case j:
                  return $$0.a(e, dqm.i);
            }
         case b:
            switch ((dqm)$$0.c(e)) {
               case a:
                  return $$0.a(e, dqm.b);
               case b:
                  return $$0.a(e, dqm.a);
               case c:
                  return $$0.a(e, dqm.f);
               case d:
                  return $$0.a(e, dqm.e);
               case e:
                  return $$0.a(e, dqm.c);
               case f:
                  return $$0.a(e, dqm.d);
               case g:
                  return $$0.a(e, dqm.h);
               case h:
                  return $$0.a(e, dqm.i);
               case i:
                  return $$0.a(e, dqm.j);
               case j:
                  return $$0.a(e, dqm.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      dqm $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dqm.f);
               case f:
                  return $$0.a(e, dqm.e);
               case g:
                  return $$0.a(e, dqm.j);
               case h:
                  return $$0.a(e, dqm.i);
               case i:
                  return $$0.a(e, dqm.h);
               case j:
                  return $$0.a(e, dqm.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dqm.d);
               case d:
                  return $$0.a(e, dqm.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dqm.h);
               case h:
                  return $$0.a(e, dqm.g);
               case i:
                  return $$0.a(e, dqm.j);
               case j:
                  return $$0.a(e, dqm.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e, f, c);
   }
}
