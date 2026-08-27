import com.mojang.serialization.MapCodec;

public class czu extends ctp {
   public static final MapCodec<czu> d = b(czu::new);
   public static final dgz<dhf> e = dgr.ah;
   public static final dgs f = dgr.w;

   @Override
   public MapCodec<czu> a() {
      return d;
   }

   protected czu(dga.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dhf.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cqz $$0, ht $$1, dgb $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dhf $$9 = $$2.c(e);
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

               $$9 = dhf.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dhf.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dhf.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dhf.a;
         }

         return this.a($$0, new ht($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ht($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cqz $$0, ht $$1, boolean $$2, int $$3, dhf $$4) {
      dgb $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dhf $$6 = $$5.c(e);
         if ($$4 != dhf.b || $$6 != dhf.a && $$6 != dhf.e && $$6 != dhf.f) {
            if ($$4 != dhf.a || $$6 != dhf.b && $$6 != dhf.c && $$6 != dhf.d) {
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
   protected void a(dgb $$0, cqz $$1, ht $$2, cua $$3) {
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
   public dhe<dhf> c() {
      return e;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      switch ($$1) {
         case c:
            switch ((dhf)$$0.c(e)) {
               case c:
                  return $$0.a(e, dhf.d);
               case d:
                  return $$0.a(e, dhf.c);
               case e:
                  return $$0.a(e, dhf.f);
               case f:
                  return $$0.a(e, dhf.e);
               case g:
                  return $$0.a(e, dhf.i);
               case h:
                  return $$0.a(e, dhf.j);
               case i:
                  return $$0.a(e, dhf.g);
               case j:
                  return $$0.a(e, dhf.h);
            }
         case d:
            switch ((dhf)$$0.c(e)) {
               case a:
                  return $$0.a(e, dhf.b);
               case b:
                  return $$0.a(e, dhf.a);
               case c:
                  return $$0.a(e, dhf.e);
               case d:
                  return $$0.a(e, dhf.f);
               case e:
                  return $$0.a(e, dhf.d);
               case f:
                  return $$0.a(e, dhf.c);
               case g:
                  return $$0.a(e, dhf.j);
               case h:
                  return $$0.a(e, dhf.g);
               case i:
                  return $$0.a(e, dhf.h);
               case j:
                  return $$0.a(e, dhf.i);
            }
         case b:
            switch ((dhf)$$0.c(e)) {
               case a:
                  return $$0.a(e, dhf.b);
               case b:
                  return $$0.a(e, dhf.a);
               case c:
                  return $$0.a(e, dhf.f);
               case d:
                  return $$0.a(e, dhf.e);
               case e:
                  return $$0.a(e, dhf.c);
               case f:
                  return $$0.a(e, dhf.d);
               case g:
                  return $$0.a(e, dhf.h);
               case h:
                  return $$0.a(e, dhf.i);
               case i:
                  return $$0.a(e, dhf.j);
               case j:
                  return $$0.a(e, dhf.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      dhf $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dhf.f);
               case f:
                  return $$0.a(e, dhf.e);
               case g:
                  return $$0.a(e, dhf.j);
               case h:
                  return $$0.a(e, dhf.i);
               case i:
                  return $$0.a(e, dhf.h);
               case j:
                  return $$0.a(e, dhf.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dhf.d);
               case d:
                  return $$0.a(e, dhf.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dhf.h);
               case h:
                  return $$0.a(e, dhf.g);
               case i:
                  return $$0.a(e, dhf.j);
               case j:
                  return $$0.a(e, dhf.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(e, f, c);
   }
}
