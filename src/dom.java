import com.mojang.serialization.MapCodec;

public class dom extends dif {
   public static final MapCodec<dom> d = b(dom::new);
   public static final dws<dwy> e = dwl.ah;
   public static final dwm f = dwl.w;

   @Override
   public MapCodec<dom> a() {
      return d;
   }

   protected dom(dvu.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dwy.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dfm $$0, jh $$1, dvv $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dwy $$9 = $$2.c(e);
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

               $$9 = dwy.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dwy.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dwy.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dwy.a;
         }

         return this.a($$0, new jh($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jh($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dfm $$0, jh $$1, boolean $$2, int $$3, dwy $$4) {
      dvv $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dwy $$6 = $$5.c(e);
         if ($$4 != dwy.b || $$6 != dwy.a && $$6 != dwy.e && $$6 != dwy.f) {
            if ($$4 != dwy.a || $$6 != dwy.b && $$6 != dwy.c && $$6 != dwy.d) {
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
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3) {
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
   public dwx<dwy> c() {
      return e;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      switch ($$1) {
         case c:
            switch ((dwy)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwy.d);
               case d:
                  return $$0.b(e, dwy.c);
               case e:
                  return $$0.b(e, dwy.f);
               case f:
                  return $$0.b(e, dwy.e);
               case g:
                  return $$0.b(e, dwy.i);
               case h:
                  return $$0.b(e, dwy.j);
               case i:
                  return $$0.b(e, dwy.g);
               case j:
                  return $$0.b(e, dwy.h);
            }
         case d:
            switch ((dwy)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwy.b);
               case b:
                  return $$0.b(e, dwy.a);
               case c:
                  return $$0.b(e, dwy.e);
               case d:
                  return $$0.b(e, dwy.f);
               case e:
                  return $$0.b(e, dwy.d);
               case f:
                  return $$0.b(e, dwy.c);
               case g:
                  return $$0.b(e, dwy.j);
               case h:
                  return $$0.b(e, dwy.g);
               case i:
                  return $$0.b(e, dwy.h);
               case j:
                  return $$0.b(e, dwy.i);
            }
         case b:
            switch ((dwy)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwy.b);
               case b:
                  return $$0.b(e, dwy.a);
               case c:
                  return $$0.b(e, dwy.f);
               case d:
                  return $$0.b(e, dwy.e);
               case e:
                  return $$0.b(e, dwy.c);
               case f:
                  return $$0.b(e, dwy.d);
               case g:
                  return $$0.b(e, dwy.h);
               case h:
                  return $$0.b(e, dwy.i);
               case i:
                  return $$0.b(e, dwy.j);
               case j:
                  return $$0.b(e, dwy.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      dwy $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwy.f);
               case f:
                  return $$0.b(e, dwy.e);
               case g:
                  return $$0.b(e, dwy.j);
               case h:
                  return $$0.b(e, dwy.i);
               case i:
                  return $$0.b(e, dwy.h);
               case j:
                  return $$0.b(e, dwy.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwy.d);
               case d:
                  return $$0.b(e, dwy.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwy.h);
               case h:
                  return $$0.b(e, dwy.g);
               case i:
                  return $$0.b(e, dwy.j);
               case j:
                  return $$0.b(e, dwy.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(e, f, c);
   }
}
