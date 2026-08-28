import com.mojang.serialization.MapCodec;

public class dpo extends djc {
   public static final MapCodec<dpo> d = b(dpo::new);
   public static final dxv<dyb> e = dxo.ak;
   public static final dxp f = dxo.B;

   @Override
   public MapCodec<dpo> a() {
      return d;
   }

   protected dpo(dwx.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dyb.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dgj $$0, ji $$1, dwy $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dyb $$9 = $$2.c(e);
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

               $$9 = dyb.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dyb.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dyb.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dyb.a;
         }

         return this.a($$0, new ji($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ji($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dgj $$0, ji $$1, boolean $$2, int $$3, dyb $$4) {
      dwy $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dyb $$6 = $$5.c(e);
         if ($$4 != dyb.b || $$6 != dyb.a && $$6 != dyb.e && $$6 != dyb.f) {
            if ($$4 != dyb.a || $$6 != dyb.b && $$6 != dyb.c && $$6 != dyb.d) {
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
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3) {
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
   public dya<dyb> c() {
      return e;
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      switch ($$1) {
         case c:
            switch ((dyb)$$0.c(e)) {
               case c:
                  return $$0.b(e, dyb.d);
               case d:
                  return $$0.b(e, dyb.c);
               case e:
                  return $$0.b(e, dyb.f);
               case f:
                  return $$0.b(e, dyb.e);
               case g:
                  return $$0.b(e, dyb.i);
               case h:
                  return $$0.b(e, dyb.j);
               case i:
                  return $$0.b(e, dyb.g);
               case j:
                  return $$0.b(e, dyb.h);
            }
         case d:
            switch ((dyb)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyb.b);
               case b:
                  return $$0.b(e, dyb.a);
               case c:
                  return $$0.b(e, dyb.e);
               case d:
                  return $$0.b(e, dyb.f);
               case e:
                  return $$0.b(e, dyb.d);
               case f:
                  return $$0.b(e, dyb.c);
               case g:
                  return $$0.b(e, dyb.j);
               case h:
                  return $$0.b(e, dyb.g);
               case i:
                  return $$0.b(e, dyb.h);
               case j:
                  return $$0.b(e, dyb.i);
            }
         case b:
            switch ((dyb)$$0.c(e)) {
               case a:
                  return $$0.b(e, dyb.b);
               case b:
                  return $$0.b(e, dyb.a);
               case c:
                  return $$0.b(e, dyb.f);
               case d:
                  return $$0.b(e, dyb.e);
               case e:
                  return $$0.b(e, dyb.c);
               case f:
                  return $$0.b(e, dyb.d);
               case g:
                  return $$0.b(e, dyb.h);
               case h:
                  return $$0.b(e, dyb.i);
               case i:
                  return $$0.b(e, dyb.j);
               case j:
                  return $$0.b(e, dyb.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      dyb $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dyb.f);
               case f:
                  return $$0.b(e, dyb.e);
               case g:
                  return $$0.b(e, dyb.j);
               case h:
                  return $$0.b(e, dyb.i);
               case i:
                  return $$0.b(e, dyb.h);
               case j:
                  return $$0.b(e, dyb.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dyb.d);
               case d:
                  return $$0.b(e, dyb.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dyb.h);
               case h:
                  return $$0.b(e, dyb.g);
               case i:
                  return $$0.b(e, dyb.j);
               case j:
                  return $$0.b(e, dyb.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(e, f, c);
   }
}
