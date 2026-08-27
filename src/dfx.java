import com.mojang.serialization.MapCodec;

public class dfx extends czr {
   public static final MapCodec<dfx> d = b(dfx::new);
   public static final dnz<dof> e = dnr.ah;
   public static final dns f = dnr.w;

   @Override
   public MapCodec<dfx> a() {
      return d;
   }

   protected dfx(dna.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dof.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cxb $$0, ib $$1, dnb $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dof $$9 = $$2.c(e);
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

               $$9 = dof.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dof.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dof.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dof.a;
         }

         return this.a($$0, new ib($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ib($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cxb $$0, ib $$1, boolean $$2, int $$3, dof $$4) {
      dnb $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dof $$6 = $$5.c(e);
         if ($$4 != dof.b || $$6 != dof.a && $$6 != dof.e && $$6 != dof.f) {
            if ($$4 != dof.a || $$6 != dof.b && $$6 != dof.c && $$6 != dof.d) {
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
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3) {
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
   public doe<dof> c() {
      return e;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      switch ($$1) {
         case c:
            switch ((dof)$$0.c(e)) {
               case c:
                  return $$0.a(e, dof.d);
               case d:
                  return $$0.a(e, dof.c);
               case e:
                  return $$0.a(e, dof.f);
               case f:
                  return $$0.a(e, dof.e);
               case g:
                  return $$0.a(e, dof.i);
               case h:
                  return $$0.a(e, dof.j);
               case i:
                  return $$0.a(e, dof.g);
               case j:
                  return $$0.a(e, dof.h);
            }
         case d:
            switch ((dof)$$0.c(e)) {
               case a:
                  return $$0.a(e, dof.b);
               case b:
                  return $$0.a(e, dof.a);
               case c:
                  return $$0.a(e, dof.e);
               case d:
                  return $$0.a(e, dof.f);
               case e:
                  return $$0.a(e, dof.d);
               case f:
                  return $$0.a(e, dof.c);
               case g:
                  return $$0.a(e, dof.j);
               case h:
                  return $$0.a(e, dof.g);
               case i:
                  return $$0.a(e, dof.h);
               case j:
                  return $$0.a(e, dof.i);
            }
         case b:
            switch ((dof)$$0.c(e)) {
               case a:
                  return $$0.a(e, dof.b);
               case b:
                  return $$0.a(e, dof.a);
               case c:
                  return $$0.a(e, dof.f);
               case d:
                  return $$0.a(e, dof.e);
               case e:
                  return $$0.a(e, dof.c);
               case f:
                  return $$0.a(e, dof.d);
               case g:
                  return $$0.a(e, dof.h);
               case h:
                  return $$0.a(e, dof.i);
               case i:
                  return $$0.a(e, dof.j);
               case j:
                  return $$0.a(e, dof.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      dof $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dof.f);
               case f:
                  return $$0.a(e, dof.e);
               case g:
                  return $$0.a(e, dof.j);
               case h:
                  return $$0.a(e, dof.i);
               case i:
                  return $$0.a(e, dof.h);
               case j:
                  return $$0.a(e, dof.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dof.d);
               case d:
                  return $$0.a(e, dof.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dof.h);
               case h:
                  return $$0.a(e, dof.g);
               case i:
                  return $$0.a(e, dof.j);
               case j:
                  return $$0.a(e, dof.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(e, f, c);
   }
}
