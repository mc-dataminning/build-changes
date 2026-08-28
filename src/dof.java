import com.mojang.serialization.MapCodec;

public class dof extends dhy {
   public static final MapCodec<dof> d = b(dof::new);
   public static final dwl<dwr> e = dwe.ah;
   public static final dwf f = dwe.w;

   @Override
   public MapCodec<dof> a() {
      return d;
   }

   protected dof(dvn.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dwr.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dff $$0, jh $$1, dvo $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dwr $$9 = $$2.c(e);
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

               $$9 = dwr.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dwr.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dwr.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dwr.a;
         }

         return this.a($$0, new jh($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jh($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dff $$0, jh $$1, boolean $$2, int $$3, dwr $$4) {
      dvo $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dwr $$6 = $$5.c(e);
         if ($$4 != dwr.b || $$6 != dwr.a && $$6 != dwr.e && $$6 != dwr.f) {
            if ($$4 != dwr.a || $$6 != dwr.b && $$6 != dwr.c && $$6 != dwr.d) {
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
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3) {
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
   public dwq<dwr> c() {
      return e;
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      switch ($$1) {
         case c:
            switch ((dwr)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwr.d);
               case d:
                  return $$0.b(e, dwr.c);
               case e:
                  return $$0.b(e, dwr.f);
               case f:
                  return $$0.b(e, dwr.e);
               case g:
                  return $$0.b(e, dwr.i);
               case h:
                  return $$0.b(e, dwr.j);
               case i:
                  return $$0.b(e, dwr.g);
               case j:
                  return $$0.b(e, dwr.h);
            }
         case d:
            switch ((dwr)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwr.b);
               case b:
                  return $$0.b(e, dwr.a);
               case c:
                  return $$0.b(e, dwr.e);
               case d:
                  return $$0.b(e, dwr.f);
               case e:
                  return $$0.b(e, dwr.d);
               case f:
                  return $$0.b(e, dwr.c);
               case g:
                  return $$0.b(e, dwr.j);
               case h:
                  return $$0.b(e, dwr.g);
               case i:
                  return $$0.b(e, dwr.h);
               case j:
                  return $$0.b(e, dwr.i);
            }
         case b:
            switch ((dwr)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwr.b);
               case b:
                  return $$0.b(e, dwr.a);
               case c:
                  return $$0.b(e, dwr.f);
               case d:
                  return $$0.b(e, dwr.e);
               case e:
                  return $$0.b(e, dwr.c);
               case f:
                  return $$0.b(e, dwr.d);
               case g:
                  return $$0.b(e, dwr.h);
               case h:
                  return $$0.b(e, dwr.i);
               case i:
                  return $$0.b(e, dwr.j);
               case j:
                  return $$0.b(e, dwr.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      dwr $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwr.f);
               case f:
                  return $$0.b(e, dwr.e);
               case g:
                  return $$0.b(e, dwr.j);
               case h:
                  return $$0.b(e, dwr.i);
               case i:
                  return $$0.b(e, dwr.h);
               case j:
                  return $$0.b(e, dwr.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwr.d);
               case d:
                  return $$0.b(e, dwr.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwr.h);
               case h:
                  return $$0.b(e, dwr.g);
               case i:
                  return $$0.b(e, dwr.j);
               case j:
                  return $$0.b(e, dwr.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(e, f, c);
   }
}
