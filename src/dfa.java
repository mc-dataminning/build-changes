import com.mojang.serialization.MapCodec;

public class dfa extends cyu {
   public static final MapCodec<dfa> d = b(dfa::new);
   public static final dnc<dni> e = dmu.ah;
   public static final dmv f = dmu.w;

   @Override
   public MapCodec<dfa> a() {
      return d;
   }

   protected dfa(dmd.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dni.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cwe $$0, ib $$1, dme $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dni $$9 = $$2.c(e);
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

               $$9 = dni.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dni.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dni.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dni.a;
         }

         return this.a($$0, new ib($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ib($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cwe $$0, ib $$1, boolean $$2, int $$3, dni $$4) {
      dme $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dni $$6 = $$5.c(e);
         if ($$4 != dni.b || $$6 != dni.a && $$6 != dni.e && $$6 != dni.f) {
            if ($$4 != dni.a || $$6 != dni.b && $$6 != dni.c && $$6 != dni.d) {
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
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3) {
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
   public dnh<dni> c() {
      return e;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      switch ($$1) {
         case c:
            switch ((dni)$$0.c(e)) {
               case c:
                  return $$0.a(e, dni.d);
               case d:
                  return $$0.a(e, dni.c);
               case e:
                  return $$0.a(e, dni.f);
               case f:
                  return $$0.a(e, dni.e);
               case g:
                  return $$0.a(e, dni.i);
               case h:
                  return $$0.a(e, dni.j);
               case i:
                  return $$0.a(e, dni.g);
               case j:
                  return $$0.a(e, dni.h);
            }
         case d:
            switch ((dni)$$0.c(e)) {
               case a:
                  return $$0.a(e, dni.b);
               case b:
                  return $$0.a(e, dni.a);
               case c:
                  return $$0.a(e, dni.e);
               case d:
                  return $$0.a(e, dni.f);
               case e:
                  return $$0.a(e, dni.d);
               case f:
                  return $$0.a(e, dni.c);
               case g:
                  return $$0.a(e, dni.j);
               case h:
                  return $$0.a(e, dni.g);
               case i:
                  return $$0.a(e, dni.h);
               case j:
                  return $$0.a(e, dni.i);
            }
         case b:
            switch ((dni)$$0.c(e)) {
               case a:
                  return $$0.a(e, dni.b);
               case b:
                  return $$0.a(e, dni.a);
               case c:
                  return $$0.a(e, dni.f);
               case d:
                  return $$0.a(e, dni.e);
               case e:
                  return $$0.a(e, dni.c);
               case f:
                  return $$0.a(e, dni.d);
               case g:
                  return $$0.a(e, dni.h);
               case h:
                  return $$0.a(e, dni.i);
               case i:
                  return $$0.a(e, dni.j);
               case j:
                  return $$0.a(e, dni.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      dni $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dni.f);
               case f:
                  return $$0.a(e, dni.e);
               case g:
                  return $$0.a(e, dni.j);
               case h:
                  return $$0.a(e, dni.i);
               case i:
                  return $$0.a(e, dni.h);
               case j:
                  return $$0.a(e, dni.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dni.d);
               case d:
                  return $$0.a(e, dni.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dni.h);
               case h:
                  return $$0.a(e, dni.g);
               case i:
                  return $$0.a(e, dni.j);
               case j:
                  return $$0.a(e, dni.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e, f, c);
   }
}
