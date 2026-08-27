import com.mojang.serialization.MapCodec;

public class dck extends cwe {
   public static final MapCodec<dck> d = b(dck::new);
   public static final dke<dkk> e = djw.ah;
   public static final djx f = djw.w;

   @Override
   public MapCodec<dck> a() {
      return d;
   }

   protected dck(djf.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dkk.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cto $$0, hx $$1, djg $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dkk $$9 = $$2.c(e);
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

               $$9 = dkk.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dkk.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dkk.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dkk.a;
         }

         return this.a($$0, new hx($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hx($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cto $$0, hx $$1, boolean $$2, int $$3, dkk $$4) {
      djg $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dkk $$6 = $$5.c(e);
         if ($$4 != dkk.b || $$6 != dkk.a && $$6 != dkk.e && $$6 != dkk.f) {
            if ($$4 != dkk.a || $$6 != dkk.b && $$6 != dkk.c && $$6 != dkk.d) {
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
   protected void a(djg $$0, cto $$1, hx $$2, cwp $$3) {
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
   public dkj<dkk> c() {
      return e;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      switch ($$1) {
         case c:
            switch ((dkk)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkk.d);
               case d:
                  return $$0.a(e, dkk.c);
               case e:
                  return $$0.a(e, dkk.f);
               case f:
                  return $$0.a(e, dkk.e);
               case g:
                  return $$0.a(e, dkk.i);
               case h:
                  return $$0.a(e, dkk.j);
               case i:
                  return $$0.a(e, dkk.g);
               case j:
                  return $$0.a(e, dkk.h);
            }
         case d:
            switch ((dkk)$$0.c(e)) {
               case a:
                  return $$0.a(e, dkk.b);
               case b:
                  return $$0.a(e, dkk.a);
               case c:
                  return $$0.a(e, dkk.e);
               case d:
                  return $$0.a(e, dkk.f);
               case e:
                  return $$0.a(e, dkk.d);
               case f:
                  return $$0.a(e, dkk.c);
               case g:
                  return $$0.a(e, dkk.j);
               case h:
                  return $$0.a(e, dkk.g);
               case i:
                  return $$0.a(e, dkk.h);
               case j:
                  return $$0.a(e, dkk.i);
            }
         case b:
            switch ((dkk)$$0.c(e)) {
               case a:
                  return $$0.a(e, dkk.b);
               case b:
                  return $$0.a(e, dkk.a);
               case c:
                  return $$0.a(e, dkk.f);
               case d:
                  return $$0.a(e, dkk.e);
               case e:
                  return $$0.a(e, dkk.c);
               case f:
                  return $$0.a(e, dkk.d);
               case g:
                  return $$0.a(e, dkk.h);
               case h:
                  return $$0.a(e, dkk.i);
               case i:
                  return $$0.a(e, dkk.j);
               case j:
                  return $$0.a(e, dkk.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      dkk $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkk.f);
               case f:
                  return $$0.a(e, dkk.e);
               case g:
                  return $$0.a(e, dkk.j);
               case h:
                  return $$0.a(e, dkk.i);
               case i:
                  return $$0.a(e, dkk.h);
               case j:
                  return $$0.a(e, dkk.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkk.d);
               case d:
                  return $$0.a(e, dkk.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkk.h);
               case h:
                  return $$0.a(e, dkk.g);
               case i:
                  return $$0.a(e, dkk.j);
               case j:
                  return $$0.a(e, dkk.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e, f, c);
   }
}
