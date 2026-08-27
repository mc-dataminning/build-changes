import com.mojang.serialization.MapCodec;

public class dce extends cvy {
   public static final MapCodec<dce> d = b(dce::new);
   public static final djy<dke> e = djq.ah;
   public static final djr f = djq.w;

   @Override
   public MapCodec<dce> a() {
      return d;
   }

   protected dce(diz.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dke.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cti $$0, hx $$1, dja $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dke $$9 = $$2.c(e);
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

               $$9 = dke.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dke.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dke.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dke.a;
         }

         return this.a($$0, new hx($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hx($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cti $$0, hx $$1, boolean $$2, int $$3, dke $$4) {
      dja $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dke $$6 = $$5.c(e);
         if ($$4 != dke.b || $$6 != dke.a && $$6 != dke.e && $$6 != dke.f) {
            if ($$4 != dke.a || $$6 != dke.b && $$6 != dke.c && $$6 != dke.d) {
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
   protected void a(dja $$0, cti $$1, hx $$2, cwj $$3) {
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
   public dkd<dke> c() {
      return e;
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      switch ($$1) {
         case c:
            switch ((dke)$$0.c(e)) {
               case c:
                  return $$0.a(e, dke.d);
               case d:
                  return $$0.a(e, dke.c);
               case e:
                  return $$0.a(e, dke.f);
               case f:
                  return $$0.a(e, dke.e);
               case g:
                  return $$0.a(e, dke.i);
               case h:
                  return $$0.a(e, dke.j);
               case i:
                  return $$0.a(e, dke.g);
               case j:
                  return $$0.a(e, dke.h);
            }
         case d:
            switch ((dke)$$0.c(e)) {
               case a:
                  return $$0.a(e, dke.b);
               case b:
                  return $$0.a(e, dke.a);
               case c:
                  return $$0.a(e, dke.e);
               case d:
                  return $$0.a(e, dke.f);
               case e:
                  return $$0.a(e, dke.d);
               case f:
                  return $$0.a(e, dke.c);
               case g:
                  return $$0.a(e, dke.j);
               case h:
                  return $$0.a(e, dke.g);
               case i:
                  return $$0.a(e, dke.h);
               case j:
                  return $$0.a(e, dke.i);
            }
         case b:
            switch ((dke)$$0.c(e)) {
               case a:
                  return $$0.a(e, dke.b);
               case b:
                  return $$0.a(e, dke.a);
               case c:
                  return $$0.a(e, dke.f);
               case d:
                  return $$0.a(e, dke.e);
               case e:
                  return $$0.a(e, dke.c);
               case f:
                  return $$0.a(e, dke.d);
               case g:
                  return $$0.a(e, dke.h);
               case h:
                  return $$0.a(e, dke.i);
               case i:
                  return $$0.a(e, dke.j);
               case j:
                  return $$0.a(e, dke.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      dke $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dke.f);
               case f:
                  return $$0.a(e, dke.e);
               case g:
                  return $$0.a(e, dke.j);
               case h:
                  return $$0.a(e, dke.i);
               case i:
                  return $$0.a(e, dke.h);
               case j:
                  return $$0.a(e, dke.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dke.d);
               case d:
                  return $$0.a(e, dke.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dke.h);
               case h:
                  return $$0.a(e, dke.g);
               case i:
                  return $$0.a(e, dke.j);
               case j:
                  return $$0.a(e, dke.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(e, f, c);
   }
}
