import com.mojang.serialization.MapCodec;

public class dht extends dbn {
   public static final MapCodec<dht> d = b(dht::new);
   public static final dpx<dqd> e = dpp.ah;
   public static final dpq f = dpp.w;

   @Override
   public MapCodec<dht> a() {
      return d;
   }

   protected dht(doy.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dqd.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cyx $$0, ib $$1, doz $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dqd $$9 = $$2.c(e);
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

               $$9 = dqd.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dqd.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dqd.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dqd.a;
         }

         return this.a($$0, new ib($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ib($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cyx $$0, ib $$1, boolean $$2, int $$3, dqd $$4) {
      doz $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dqd $$6 = $$5.c(e);
         if ($$4 != dqd.b || $$6 != dqd.a && $$6 != dqd.e && $$6 != dqd.f) {
            if ($$4 != dqd.a || $$6 != dqd.b && $$6 != dqd.c && $$6 != dqd.d) {
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
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3) {
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
   public dqc<dqd> c() {
      return e;
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      switch ($$1) {
         case c:
            switch ((dqd)$$0.c(e)) {
               case c:
                  return $$0.a(e, dqd.d);
               case d:
                  return $$0.a(e, dqd.c);
               case e:
                  return $$0.a(e, dqd.f);
               case f:
                  return $$0.a(e, dqd.e);
               case g:
                  return $$0.a(e, dqd.i);
               case h:
                  return $$0.a(e, dqd.j);
               case i:
                  return $$0.a(e, dqd.g);
               case j:
                  return $$0.a(e, dqd.h);
            }
         case d:
            switch ((dqd)$$0.c(e)) {
               case a:
                  return $$0.a(e, dqd.b);
               case b:
                  return $$0.a(e, dqd.a);
               case c:
                  return $$0.a(e, dqd.e);
               case d:
                  return $$0.a(e, dqd.f);
               case e:
                  return $$0.a(e, dqd.d);
               case f:
                  return $$0.a(e, dqd.c);
               case g:
                  return $$0.a(e, dqd.j);
               case h:
                  return $$0.a(e, dqd.g);
               case i:
                  return $$0.a(e, dqd.h);
               case j:
                  return $$0.a(e, dqd.i);
            }
         case b:
            switch ((dqd)$$0.c(e)) {
               case a:
                  return $$0.a(e, dqd.b);
               case b:
                  return $$0.a(e, dqd.a);
               case c:
                  return $$0.a(e, dqd.f);
               case d:
                  return $$0.a(e, dqd.e);
               case e:
                  return $$0.a(e, dqd.c);
               case f:
                  return $$0.a(e, dqd.d);
               case g:
                  return $$0.a(e, dqd.h);
               case h:
                  return $$0.a(e, dqd.i);
               case i:
                  return $$0.a(e, dqd.j);
               case j:
                  return $$0.a(e, dqd.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      dqd $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dqd.f);
               case f:
                  return $$0.a(e, dqd.e);
               case g:
                  return $$0.a(e, dqd.j);
               case h:
                  return $$0.a(e, dqd.i);
               case i:
                  return $$0.a(e, dqd.h);
               case j:
                  return $$0.a(e, dqd.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dqd.d);
               case d:
                  return $$0.a(e, dqd.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dqd.h);
               case h:
                  return $$0.a(e, dqd.g);
               case i:
                  return $$0.a(e, dqd.j);
               case j:
                  return $$0.a(e, dqd.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(e, f, c);
   }
}
