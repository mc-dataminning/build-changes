import com.mojang.serialization.MapCodec;

public class dpn extends djb {
   public static final MapCodec<dpn> d = b(dpn::new);
   public static final dxu<dya> e = dxn.ak;
   public static final dxo f = dxn.B;

   @Override
   public MapCodec<dpn> a() {
      return d;
   }

   protected dpn(dww.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dya.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dgi $$0, ji $$1, dwx $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dya $$9 = $$2.c(e);
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

               $$9 = dya.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dya.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dya.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dya.a;
         }

         return this.a($$0, new ji($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ji($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dgi $$0, ji $$1, boolean $$2, int $$3, dya $$4) {
      dwx $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dya $$6 = $$5.c(e);
         if ($$4 != dya.b || $$6 != dya.a && $$6 != dya.e && $$6 != dya.f) {
            if ($$4 != dya.a || $$6 != dya.b && $$6 != dya.c && $$6 != dya.d) {
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
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3) {
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
   public dxz<dya> c() {
      return e;
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      switch ($$1) {
         case c:
            switch ((dya)$$0.c(e)) {
               case c:
                  return $$0.b(e, dya.d);
               case d:
                  return $$0.b(e, dya.c);
               case e:
                  return $$0.b(e, dya.f);
               case f:
                  return $$0.b(e, dya.e);
               case g:
                  return $$0.b(e, dya.i);
               case h:
                  return $$0.b(e, dya.j);
               case i:
                  return $$0.b(e, dya.g);
               case j:
                  return $$0.b(e, dya.h);
            }
         case d:
            switch ((dya)$$0.c(e)) {
               case a:
                  return $$0.b(e, dya.b);
               case b:
                  return $$0.b(e, dya.a);
               case c:
                  return $$0.b(e, dya.e);
               case d:
                  return $$0.b(e, dya.f);
               case e:
                  return $$0.b(e, dya.d);
               case f:
                  return $$0.b(e, dya.c);
               case g:
                  return $$0.b(e, dya.j);
               case h:
                  return $$0.b(e, dya.g);
               case i:
                  return $$0.b(e, dya.h);
               case j:
                  return $$0.b(e, dya.i);
            }
         case b:
            switch ((dya)$$0.c(e)) {
               case a:
                  return $$0.b(e, dya.b);
               case b:
                  return $$0.b(e, dya.a);
               case c:
                  return $$0.b(e, dya.f);
               case d:
                  return $$0.b(e, dya.e);
               case e:
                  return $$0.b(e, dya.c);
               case f:
                  return $$0.b(e, dya.d);
               case g:
                  return $$0.b(e, dya.h);
               case h:
                  return $$0.b(e, dya.i);
               case i:
                  return $$0.b(e, dya.j);
               case j:
                  return $$0.b(e, dya.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      dya $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dya.f);
               case f:
                  return $$0.b(e, dya.e);
               case g:
                  return $$0.b(e, dya.j);
               case h:
                  return $$0.b(e, dya.i);
               case i:
                  return $$0.b(e, dya.h);
               case j:
                  return $$0.b(e, dya.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dya.d);
               case d:
                  return $$0.b(e, dya.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dya.h);
               case h:
                  return $$0.b(e, dya.g);
               case i:
                  return $$0.b(e, dya.j);
               case j:
                  return $$0.b(e, dya.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(e, f, c);
   }
}
