import com.mojang.serialization.MapCodec;

public class dao extends cui {
   public static final MapCodec<dao> d = b(dao::new);
   public static final dhu<dia> e = dhm.ah;
   public static final dhn f = dhm.w;

   @Override
   public MapCodec<dao> a() {
      return d;
   }

   protected dao(dgv.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dia.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(crs $$0, ht $$1, dgw $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dia $$9 = $$2.c(e);
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

               $$9 = dia.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dia.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dia.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dia.a;
         }

         return this.a($$0, new ht($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ht($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(crs $$0, ht $$1, boolean $$2, int $$3, dia $$4) {
      dgw $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dia $$6 = $$5.c(e);
         if ($$4 != dia.b || $$6 != dia.a && $$6 != dia.e && $$6 != dia.f) {
            if ($$4 != dia.a || $$6 != dia.b && $$6 != dia.c && $$6 != dia.d) {
               if (!$$5.c(f)) {
                  return false;
               } else {
                  return $$0.B($$1) ? true : this.a($$0, $$1, $$5, $$2, $$3 + 1);
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
   protected void a(dgw $$0, crs $$1, ht $$2, cut $$3) {
      boolean $$4 = $$0.c(f);
      boolean $$5 = $$1.B($$2) || this.a($$1, $$2, $$0, true, 0) || this.a($$1, $$2, $$0, false, 0);
      if ($$5 != $$4) {
         $$1.a($$2, $$0.a(f, Boolean.valueOf($$5)), 3);
         $$1.a($$2.d(), this);
         if ($$0.c(e).b()) {
            $$1.a($$2.c(), this);
         }
      }
   }

   @Override
   public dhz<dia> c() {
      return e;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      switch ($$1) {
         case c:
            switch ((dia)$$0.c(e)) {
               case c:
                  return $$0.a(e, dia.d);
               case d:
                  return $$0.a(e, dia.c);
               case e:
                  return $$0.a(e, dia.f);
               case f:
                  return $$0.a(e, dia.e);
               case g:
                  return $$0.a(e, dia.i);
               case h:
                  return $$0.a(e, dia.j);
               case i:
                  return $$0.a(e, dia.g);
               case j:
                  return $$0.a(e, dia.h);
            }
         case d:
            switch ((dia)$$0.c(e)) {
               case a:
                  return $$0.a(e, dia.b);
               case b:
                  return $$0.a(e, dia.a);
               case c:
                  return $$0.a(e, dia.e);
               case d:
                  return $$0.a(e, dia.f);
               case e:
                  return $$0.a(e, dia.d);
               case f:
                  return $$0.a(e, dia.c);
               case g:
                  return $$0.a(e, dia.j);
               case h:
                  return $$0.a(e, dia.g);
               case i:
                  return $$0.a(e, dia.h);
               case j:
                  return $$0.a(e, dia.i);
            }
         case b:
            switch ((dia)$$0.c(e)) {
               case a:
                  return $$0.a(e, dia.b);
               case b:
                  return $$0.a(e, dia.a);
               case c:
                  return $$0.a(e, dia.f);
               case d:
                  return $$0.a(e, dia.e);
               case e:
                  return $$0.a(e, dia.c);
               case f:
                  return $$0.a(e, dia.d);
               case g:
                  return $$0.a(e, dia.h);
               case h:
                  return $$0.a(e, dia.i);
               case i:
                  return $$0.a(e, dia.j);
               case j:
                  return $$0.a(e, dia.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      dia $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dia.f);
               case f:
                  return $$0.a(e, dia.e);
               case g:
                  return $$0.a(e, dia.j);
               case h:
                  return $$0.a(e, dia.i);
               case i:
                  return $$0.a(e, dia.h);
               case j:
                  return $$0.a(e, dia.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dia.d);
               case d:
                  return $$0.a(e, dia.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dia.h);
               case h:
                  return $$0.a(e, dia.g);
               case i:
                  return $$0.a(e, dia.j);
               case j:
                  return $$0.a(e, dia.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(e, f, c);
   }
}
