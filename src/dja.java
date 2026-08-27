import com.mojang.serialization.MapCodec;

public class dja extends dct {
   public static final MapCodec<dja> d = b(dja::new);
   public static final drf<drl> e = dqx.ah;
   public static final dqy f = dqx.w;

   @Override
   public MapCodec<dja> a() {
      return d;
   }

   protected dja(dqg.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, drl.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dad $$0, in $$1, dqh $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         drl $$9 = $$2.c(e);
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

               $$9 = drl.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = drl.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = drl.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = drl.a;
         }

         return this.a($$0, new in($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new in($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dad $$0, in $$1, boolean $$2, int $$3, drl $$4) {
      dqh $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         drl $$6 = $$5.c(e);
         if ($$4 != drl.b || $$6 != drl.a && $$6 != drl.e && $$6 != drl.f) {
            if ($$4 != drl.a || $$6 != drl.b && $$6 != drl.c && $$6 != drl.d) {
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
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3) {
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
   public drk<drl> c() {
      return e;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      switch ($$1) {
         case c:
            switch ((drl)$$0.c(e)) {
               case c:
                  return $$0.a(e, drl.d);
               case d:
                  return $$0.a(e, drl.c);
               case e:
                  return $$0.a(e, drl.f);
               case f:
                  return $$0.a(e, drl.e);
               case g:
                  return $$0.a(e, drl.i);
               case h:
                  return $$0.a(e, drl.j);
               case i:
                  return $$0.a(e, drl.g);
               case j:
                  return $$0.a(e, drl.h);
            }
         case d:
            switch ((drl)$$0.c(e)) {
               case a:
                  return $$0.a(e, drl.b);
               case b:
                  return $$0.a(e, drl.a);
               case c:
                  return $$0.a(e, drl.e);
               case d:
                  return $$0.a(e, drl.f);
               case e:
                  return $$0.a(e, drl.d);
               case f:
                  return $$0.a(e, drl.c);
               case g:
                  return $$0.a(e, drl.j);
               case h:
                  return $$0.a(e, drl.g);
               case i:
                  return $$0.a(e, drl.h);
               case j:
                  return $$0.a(e, drl.i);
            }
         case b:
            switch ((drl)$$0.c(e)) {
               case a:
                  return $$0.a(e, drl.b);
               case b:
                  return $$0.a(e, drl.a);
               case c:
                  return $$0.a(e, drl.f);
               case d:
                  return $$0.a(e, drl.e);
               case e:
                  return $$0.a(e, drl.c);
               case f:
                  return $$0.a(e, drl.d);
               case g:
                  return $$0.a(e, drl.h);
               case h:
                  return $$0.a(e, drl.i);
               case i:
                  return $$0.a(e, drl.j);
               case j:
                  return $$0.a(e, drl.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      drl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, drl.f);
               case f:
                  return $$0.a(e, drl.e);
               case g:
                  return $$0.a(e, drl.j);
               case h:
                  return $$0.a(e, drl.i);
               case i:
                  return $$0.a(e, drl.h);
               case j:
                  return $$0.a(e, drl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, drl.d);
               case d:
                  return $$0.a(e, drl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, drl.h);
               case h:
                  return $$0.a(e, drl.g);
               case i:
                  return $$0.a(e, drl.j);
               case j:
                  return $$0.a(e, drl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(e, f, c);
   }
}
