import com.mojang.serialization.MapCodec;

public class dqk extends dka {
   public static final MapCodec<dqk> d = b(dqk::new);
   public static final dyr<dyx> e = dyk.ai;
   public static final dyl f = dyk.x;

   @Override
   public MapCodec<dqk> a() {
      return d;
   }

   protected dqk(dxt.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dyx.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dhh $$0, jh $$1, dxu $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dyx $$9 = $$2.c(e);
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

               $$9 = dyx.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dyx.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dyx.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dyx.a;
         }

         return this.a($$0, new jh($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jh($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dhh $$0, jh $$1, boolean $$2, int $$3, dyx $$4) {
      dxu $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dyx $$6 = $$5.c(e);
         if ($$4 != dyx.b || $$6 != dyx.a && $$6 != dyx.e && $$6 != dyx.f) {
            if ($$4 != dyx.a || $$6 != dyx.b && $$6 != dyx.c && $$6 != dyx.d) {
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
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3) {
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
   public dyw<dyx> c() {
      return e;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      switch ($$1) {
         case c:
            switch ((dyx)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyx.d);
               case d:
                  return $$0.b(e, dyx.c);
               case e:
                  return $$0.b(e, dyx.f);
               case f:
                  return $$0.b(e, dyx.e);
               case g:
                  return $$0.b(e, dyx.i);
               case h:
                  return $$0.b(e, dyx.j);
               case i:
                  return $$0.b(e, dyx.g);
               case j:
                  return $$0.b(e, dyx.h);
            }
         case d:
            switch ((dyx)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyx.b);
               case b:
                  return $$0.b(e, dyx.a);
               case c:
                  return $$0.b(e, dyx.e);
               case d:
                  return $$0.b(e, dyx.f);
               case e:
                  return $$0.b(e, dyx.d);
               case f:
                  return $$0.b(e, dyx.c);
               case g:
                  return $$0.b(e, dyx.j);
               case h:
                  return $$0.b(e, dyx.g);
               case i:
                  return $$0.b(e, dyx.h);
               case j:
                  return $$0.b(e, dyx.i);
            }
         case b:
            switch ((dyx)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyx.b);
               case b:
                  return $$0.b(e, dyx.a);
               case c:
                  return $$0.b(e, dyx.f);
               case d:
                  return $$0.b(e, dyx.e);
               case e:
                  return $$0.b(e, dyx.c);
               case f:
                  return $$0.b(e, dyx.d);
               case g:
                  return $$0.b(e, dyx.h);
               case h:
                  return $$0.b(e, dyx.i);
               case i:
                  return $$0.b(e, dyx.j);
               case j:
                  return $$0.b(e, dyx.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      dyx $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyx.f);
               case f:
                  return $$0.b(e, dyx.e);
               case g:
                  return $$0.b(e, dyx.j);
               case h:
                  return $$0.b(e, dyx.i);
               case i:
                  return $$0.b(e, dyx.h);
               case j:
                  return $$0.b(e, dyx.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyx.d);
               case d:
                  return $$0.b(e, dyx.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyx.h);
               case h:
                  return $$0.b(e, dyx.g);
               case i:
                  return $$0.b(e, dyx.j);
               case j:
                  return $$0.b(e, dyx.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(e, f, c);
   }
}
