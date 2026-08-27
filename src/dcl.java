import com.mojang.serialization.MapCodec;

public class dcl extends cwf {
   public static final MapCodec<dcl> d = b(dcl::new);
   public static final dkf<dkl> e = djx.ah;
   public static final djy f = djx.w;

   @Override
   public MapCodec<dcl> a() {
      return d;
   }

   protected dcl(djg.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dkl.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(ctp $$0, hx $$1, djh $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dkl $$9 = $$2.c(e);
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

               $$9 = dkl.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dkl.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dkl.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dkl.a;
         }

         return this.a($$0, new hx($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hx($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(ctp $$0, hx $$1, boolean $$2, int $$3, dkl $$4) {
      djh $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dkl $$6 = $$5.c(e);
         if ($$4 != dkl.b || $$6 != dkl.a && $$6 != dkl.e && $$6 != dkl.f) {
            if ($$4 != dkl.a || $$6 != dkl.b && $$6 != dkl.c && $$6 != dkl.d) {
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
   protected void a(djh $$0, ctp $$1, hx $$2, cwq $$3) {
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
   public dkk<dkl> c() {
      return e;
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      switch ($$1) {
         case c:
            switch ((dkl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkl.d);
               case d:
                  return $$0.a(e, dkl.c);
               case e:
                  return $$0.a(e, dkl.f);
               case f:
                  return $$0.a(e, dkl.e);
               case g:
                  return $$0.a(e, dkl.i);
               case h:
                  return $$0.a(e, dkl.j);
               case i:
                  return $$0.a(e, dkl.g);
               case j:
                  return $$0.a(e, dkl.h);
            }
         case d:
            switch ((dkl)$$0.c(e)) {
               case a:
                  return $$0.a(e, dkl.b);
               case b:
                  return $$0.a(e, dkl.a);
               case c:
                  return $$0.a(e, dkl.e);
               case d:
                  return $$0.a(e, dkl.f);
               case e:
                  return $$0.a(e, dkl.d);
               case f:
                  return $$0.a(e, dkl.c);
               case g:
                  return $$0.a(e, dkl.j);
               case h:
                  return $$0.a(e, dkl.g);
               case i:
                  return $$0.a(e, dkl.h);
               case j:
                  return $$0.a(e, dkl.i);
            }
         case b:
            switch ((dkl)$$0.c(e)) {
               case a:
                  return $$0.a(e, dkl.b);
               case b:
                  return $$0.a(e, dkl.a);
               case c:
                  return $$0.a(e, dkl.f);
               case d:
                  return $$0.a(e, dkl.e);
               case e:
                  return $$0.a(e, dkl.c);
               case f:
                  return $$0.a(e, dkl.d);
               case g:
                  return $$0.a(e, dkl.h);
               case h:
                  return $$0.a(e, dkl.i);
               case i:
                  return $$0.a(e, dkl.j);
               case j:
                  return $$0.a(e, dkl.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      dkl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkl.f);
               case f:
                  return $$0.a(e, dkl.e);
               case g:
                  return $$0.a(e, dkl.j);
               case h:
                  return $$0.a(e, dkl.i);
               case i:
                  return $$0.a(e, dkl.h);
               case j:
                  return $$0.a(e, dkl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkl.d);
               case d:
                  return $$0.a(e, dkl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkl.h);
               case h:
                  return $$0.a(e, dkl.g);
               case i:
                  return $$0.a(e, dkl.j);
               case j:
                  return $$0.a(e, dkl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(e, f, c);
   }
}
