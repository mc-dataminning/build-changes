import com.mojang.serialization.MapCodec;

public class dng extends dgy {
   public static final MapCodec<dng> d = b(dng::new);
   public static final dvm<dvs> e = dve.ah;
   public static final dvf f = dve.w;

   @Override
   public MapCodec<dng> a() {
      return d;
   }

   protected dng(dun.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dvs.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(deg $$0, je $$1, duo $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dvs $$9 = $$2.c(e);
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

               $$9 = dvs.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dvs.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dvs.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dvs.a;
         }

         return this.a($$0, new je($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new je($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(deg $$0, je $$1, boolean $$2, int $$3, dvs $$4) {
      duo $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dvs $$6 = $$5.c(e);
         if ($$4 != dvs.b || $$6 != dvs.a && $$6 != dvs.e && $$6 != dvs.f) {
            if ($$4 != dvs.a || $$6 != dvs.b && $$6 != dvs.c && $$6 != dvs.d) {
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
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3) {
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
   public dvr<dvs> c() {
      return e;
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      switch ($$1) {
         case c:
            switch ((dvs)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvs.d);
               case d:
                  return $$0.b(e, dvs.c);
               case e:
                  return $$0.b(e, dvs.f);
               case f:
                  return $$0.b(e, dvs.e);
               case g:
                  return $$0.b(e, dvs.i);
               case h:
                  return $$0.b(e, dvs.j);
               case i:
                  return $$0.b(e, dvs.g);
               case j:
                  return $$0.b(e, dvs.h);
            }
         case d:
            switch ((dvs)$$0.c(e)) {
               case a:
                  return $$0.b(e, dvs.b);
               case b:
                  return $$0.b(e, dvs.a);
               case c:
                  return $$0.b(e, dvs.e);
               case d:
                  return $$0.b(e, dvs.f);
               case e:
                  return $$0.b(e, dvs.d);
               case f:
                  return $$0.b(e, dvs.c);
               case g:
                  return $$0.b(e, dvs.j);
               case h:
                  return $$0.b(e, dvs.g);
               case i:
                  return $$0.b(e, dvs.h);
               case j:
                  return $$0.b(e, dvs.i);
            }
         case b:
            switch ((dvs)$$0.c(e)) {
               case a:
                  return $$0.b(e, dvs.b);
               case b:
                  return $$0.b(e, dvs.a);
               case c:
                  return $$0.b(e, dvs.f);
               case d:
                  return $$0.b(e, dvs.e);
               case e:
                  return $$0.b(e, dvs.c);
               case f:
                  return $$0.b(e, dvs.d);
               case g:
                  return $$0.b(e, dvs.h);
               case h:
                  return $$0.b(e, dvs.i);
               case i:
                  return $$0.b(e, dvs.j);
               case j:
                  return $$0.b(e, dvs.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected duo a(duo $$0, dmg $$1) {
      dvs $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dvs.f);
               case f:
                  return $$0.b(e, dvs.e);
               case g:
                  return $$0.b(e, dvs.j);
               case h:
                  return $$0.b(e, dvs.i);
               case i:
                  return $$0.b(e, dvs.h);
               case j:
                  return $$0.b(e, dvs.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dvs.d);
               case d:
                  return $$0.b(e, dvs.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dvs.h);
               case h:
                  return $$0.b(e, dvs.g);
               case i:
                  return $$0.b(e, dvs.j);
               case j:
                  return $$0.b(e, dvs.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(e, f, c);
   }
}
