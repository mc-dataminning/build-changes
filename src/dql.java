import com.mojang.serialization.MapCodec;

public class dql extends dkb {
   public static final MapCodec<dql> d = b(dql::new);
   public static final dys<dyy> e = dyl.ai;
   public static final dym f = dyl.x;

   @Override
   public MapCodec<dql> a() {
      return d;
   }

   protected dql(dxu.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dyy.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dhi $$0, jh $$1, dxv $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dyy $$9 = $$2.c(e);
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

               $$9 = dyy.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dyy.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dyy.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dyy.a;
         }

         return this.a($$0, new jh($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jh($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dhi $$0, jh $$1, boolean $$2, int $$3, dyy $$4) {
      dxv $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dyy $$6 = $$5.c(e);
         if ($$4 != dyy.b || $$6 != dyy.a && $$6 != dyy.e && $$6 != dyy.f) {
            if ($$4 != dyy.a || $$6 != dyy.b && $$6 != dyy.c && $$6 != dyy.d) {
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
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3) {
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
   public dyx<dyy> c() {
      return e;
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      switch ($$1) {
         case c:
            switch ((dyy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyy.d);
               case d:
                  return $$0.b(e, dyy.c);
               case e:
                  return $$0.b(e, dyy.f);
               case f:
                  return $$0.b(e, dyy.e);
               case g:
                  return $$0.b(e, dyy.i);
               case h:
                  return $$0.b(e, dyy.j);
               case i:
                  return $$0.b(e, dyy.g);
               case j:
                  return $$0.b(e, dyy.h);
            }
         case d:
            switch ((dyy)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyy.b);
               case b:
                  return $$0.b(e, dyy.a);
               case c:
                  return $$0.b(e, dyy.e);
               case d:
                  return $$0.b(e, dyy.f);
               case e:
                  return $$0.b(e, dyy.d);
               case f:
                  return $$0.b(e, dyy.c);
               case g:
                  return $$0.b(e, dyy.j);
               case h:
                  return $$0.b(e, dyy.g);
               case i:
                  return $$0.b(e, dyy.h);
               case j:
                  return $$0.b(e, dyy.i);
            }
         case b:
            switch ((dyy)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyy.b);
               case b:
                  return $$0.b(e, dyy.a);
               case c:
                  return $$0.b(e, dyy.f);
               case d:
                  return $$0.b(e, dyy.e);
               case e:
                  return $$0.b(e, dyy.c);
               case f:
                  return $$0.b(e, dyy.d);
               case g:
                  return $$0.b(e, dyy.h);
               case h:
                  return $$0.b(e, dyy.i);
               case i:
                  return $$0.b(e, dyy.j);
               case j:
                  return $$0.b(e, dyy.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      dyy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyy.f);
               case f:
                  return $$0.b(e, dyy.e);
               case g:
                  return $$0.b(e, dyy.j);
               case h:
                  return $$0.b(e, dyy.i);
               case i:
                  return $$0.b(e, dyy.h);
               case j:
                  return $$0.b(e, dyy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyy.d);
               case d:
                  return $$0.b(e, dyy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyy.h);
               case h:
                  return $$0.b(e, dyy.g);
               case i:
                  return $$0.b(e, dyy.j);
               case j:
                  return $$0.b(e, dyy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(e, f, c);
   }
}
