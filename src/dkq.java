import com.mojang.serialization.MapCodec;

public class dkq extends dej {
   public static final MapCodec<dkq> d = b(dkq::new);
   public static final dsv<dtb> e = dsn.ah;
   public static final dso f = dsn.w;

   @Override
   public MapCodec<dkq> a() {
      return d;
   }

   protected dkq(drw.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dtb.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dbt $$0, iz $$1, drx $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dtb $$9 = $$2.c(e);
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

               $$9 = dtb.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dtb.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dtb.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dtb.a;
         }

         return this.a($$0, new iz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dbt $$0, iz $$1, boolean $$2, int $$3, dtb $$4) {
      drx $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dtb $$6 = $$5.c(e);
         if ($$4 != dtb.b || $$6 != dtb.a && $$6 != dtb.e && $$6 != dtb.f) {
            if ($$4 != dtb.a || $$6 != dtb.b && $$6 != dtb.c && $$6 != dtb.d) {
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
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3) {
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
   public dta<dtb> c() {
      return e;
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      switch ($$1) {
         case c:
            switch ((dtb)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtb.d);
               case d:
                  return $$0.a(e, dtb.c);
               case e:
                  return $$0.a(e, dtb.f);
               case f:
                  return $$0.a(e, dtb.e);
               case g:
                  return $$0.a(e, dtb.i);
               case h:
                  return $$0.a(e, dtb.j);
               case i:
                  return $$0.a(e, dtb.g);
               case j:
                  return $$0.a(e, dtb.h);
            }
         case d:
            switch ((dtb)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtb.b);
               case b:
                  return $$0.a(e, dtb.a);
               case c:
                  return $$0.a(e, dtb.e);
               case d:
                  return $$0.a(e, dtb.f);
               case e:
                  return $$0.a(e, dtb.d);
               case f:
                  return $$0.a(e, dtb.c);
               case g:
                  return $$0.a(e, dtb.j);
               case h:
                  return $$0.a(e, dtb.g);
               case i:
                  return $$0.a(e, dtb.h);
               case j:
                  return $$0.a(e, dtb.i);
            }
         case b:
            switch ((dtb)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtb.b);
               case b:
                  return $$0.a(e, dtb.a);
               case c:
                  return $$0.a(e, dtb.f);
               case d:
                  return $$0.a(e, dtb.e);
               case e:
                  return $$0.a(e, dtb.c);
               case f:
                  return $$0.a(e, dtb.d);
               case g:
                  return $$0.a(e, dtb.h);
               case h:
                  return $$0.a(e, dtb.i);
               case i:
                  return $$0.a(e, dtb.j);
               case j:
                  return $$0.a(e, dtb.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      dtb $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtb.f);
               case f:
                  return $$0.a(e, dtb.e);
               case g:
                  return $$0.a(e, dtb.j);
               case h:
                  return $$0.a(e, dtb.i);
               case i:
                  return $$0.a(e, dtb.h);
               case j:
                  return $$0.a(e, dtb.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtb.d);
               case d:
                  return $$0.a(e, dtb.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtb.h);
               case h:
                  return $$0.a(e, dtb.g);
               case i:
                  return $$0.a(e, dtb.j);
               case j:
                  return $$0.a(e, dtb.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(e, f, c);
   }
}
