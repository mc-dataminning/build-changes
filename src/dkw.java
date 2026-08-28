import com.mojang.serialization.MapCodec;

public class dkw extends dep {
   public static final MapCodec<dkw> d = b(dkw::new);
   public static final dtb<dth> e = dst.ah;
   public static final dsu f = dst.w;

   @Override
   public MapCodec<dkw> a() {
      return d;
   }

   protected dkw(dsc.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dth.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dbz $$0, iz $$1, dsd $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dth $$9 = $$2.c(e);
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

               $$9 = dth.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dth.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dth.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dth.a;
         }

         return this.a($$0, new iz($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new iz($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dbz $$0, iz $$1, boolean $$2, int $$3, dth $$4) {
      dsd $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dth $$6 = $$5.c(e);
         if ($$4 != dth.b || $$6 != dth.a && $$6 != dth.e && $$6 != dth.f) {
            if ($$4 != dth.a || $$6 != dth.b && $$6 != dth.c && $$6 != dth.d) {
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
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3) {
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
   public dtg<dth> c() {
      return e;
   }

   @Override
   protected dsd a(dsd $$0, dln $$1) {
      switch ($$1) {
         case c:
            switch ((dth)$$0.c(e)) {
               case c:
                  return $$0.a(e, dth.d);
               case d:
                  return $$0.a(e, dth.c);
               case e:
                  return $$0.a(e, dth.f);
               case f:
                  return $$0.a(e, dth.e);
               case g:
                  return $$0.a(e, dth.i);
               case h:
                  return $$0.a(e, dth.j);
               case i:
                  return $$0.a(e, dth.g);
               case j:
                  return $$0.a(e, dth.h);
            }
         case d:
            switch ((dth)$$0.c(e)) {
               case a:
                  return $$0.a(e, dth.b);
               case b:
                  return $$0.a(e, dth.a);
               case c:
                  return $$0.a(e, dth.e);
               case d:
                  return $$0.a(e, dth.f);
               case e:
                  return $$0.a(e, dth.d);
               case f:
                  return $$0.a(e, dth.c);
               case g:
                  return $$0.a(e, dth.j);
               case h:
                  return $$0.a(e, dth.g);
               case i:
                  return $$0.a(e, dth.h);
               case j:
                  return $$0.a(e, dth.i);
            }
         case b:
            switch ((dth)$$0.c(e)) {
               case a:
                  return $$0.a(e, dth.b);
               case b:
                  return $$0.a(e, dth.a);
               case c:
                  return $$0.a(e, dth.f);
               case d:
                  return $$0.a(e, dth.e);
               case e:
                  return $$0.a(e, dth.c);
               case f:
                  return $$0.a(e, dth.d);
               case g:
                  return $$0.a(e, dth.h);
               case h:
                  return $$0.a(e, dth.i);
               case i:
                  return $$0.a(e, dth.j);
               case j:
                  return $$0.a(e, dth.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsd a(dsd $$0, djx $$1) {
      dth $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dth.f);
               case f:
                  return $$0.a(e, dth.e);
               case g:
                  return $$0.a(e, dth.j);
               case h:
                  return $$0.a(e, dth.i);
               case i:
                  return $$0.a(e, dth.h);
               case j:
                  return $$0.a(e, dth.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dth.d);
               case d:
                  return $$0.a(e, dth.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dth.h);
               case h:
                  return $$0.a(e, dth.g);
               case i:
                  return $$0.a(e, dth.j);
               case j:
                  return $$0.a(e, dth.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e, f, c);
   }
}
