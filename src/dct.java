import com.mojang.serialization.MapCodec;

public class dct extends cwn {
   public static final MapCodec<dct> d = b(dct::new);
   public static final dkn<dkt> e = dkf.ah;
   public static final dkg f = dkf.w;

   @Override
   public MapCodec<dct> a() {
      return d;
   }

   protected dct(djo.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dkt.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(ctx $$0, hx $$1, djp $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dkt $$9 = $$2.c(e);
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

               $$9 = dkt.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dkt.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dkt.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dkt.a;
         }

         return this.a($$0, new hx($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hx($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(ctx $$0, hx $$1, boolean $$2, int $$3, dkt $$4) {
      djp $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dkt $$6 = $$5.c(e);
         if ($$4 != dkt.b || $$6 != dkt.a && $$6 != dkt.e && $$6 != dkt.f) {
            if ($$4 != dkt.a || $$6 != dkt.b && $$6 != dkt.c && $$6 != dkt.d) {
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
   protected void a(djp $$0, ctx $$1, hx $$2, cwy $$3) {
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
   public dks<dkt> c() {
      return e;
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      switch ($$1) {
         case c:
            switch ((dkt)$$0.c(e)) {
               case c:
                  return $$0.a(e, dkt.d);
               case d:
                  return $$0.a(e, dkt.c);
               case e:
                  return $$0.a(e, dkt.f);
               case f:
                  return $$0.a(e, dkt.e);
               case g:
                  return $$0.a(e, dkt.i);
               case h:
                  return $$0.a(e, dkt.j);
               case i:
                  return $$0.a(e, dkt.g);
               case j:
                  return $$0.a(e, dkt.h);
            }
         case d:
            switch ((dkt)$$0.c(e)) {
               case a:
                  return $$0.a(e, dkt.b);
               case b:
                  return $$0.a(e, dkt.a);
               case c:
                  return $$0.a(e, dkt.e);
               case d:
                  return $$0.a(e, dkt.f);
               case e:
                  return $$0.a(e, dkt.d);
               case f:
                  return $$0.a(e, dkt.c);
               case g:
                  return $$0.a(e, dkt.j);
               case h:
                  return $$0.a(e, dkt.g);
               case i:
                  return $$0.a(e, dkt.h);
               case j:
                  return $$0.a(e, dkt.i);
            }
         case b:
            switch ((dkt)$$0.c(e)) {
               case a:
                  return $$0.a(e, dkt.b);
               case b:
                  return $$0.a(e, dkt.a);
               case c:
                  return $$0.a(e, dkt.f);
               case d:
                  return $$0.a(e, dkt.e);
               case e:
                  return $$0.a(e, dkt.c);
               case f:
                  return $$0.a(e, dkt.d);
               case g:
                  return $$0.a(e, dkt.h);
               case h:
                  return $$0.a(e, dkt.i);
               case i:
                  return $$0.a(e, dkt.j);
               case j:
                  return $$0.a(e, dkt.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      dkt $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dkt.f);
               case f:
                  return $$0.a(e, dkt.e);
               case g:
                  return $$0.a(e, dkt.j);
               case h:
                  return $$0.a(e, dkt.i);
               case i:
                  return $$0.a(e, dkt.h);
               case j:
                  return $$0.a(e, dkt.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dkt.d);
               case d:
                  return $$0.a(e, dkt.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dkt.h);
               case h:
                  return $$0.a(e, dkt.g);
               case i:
                  return $$0.a(e, dkt.j);
               case j:
                  return $$0.a(e, dkt.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e, f, c);
   }
}
