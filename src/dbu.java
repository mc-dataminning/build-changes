import com.mojang.serialization.MapCodec;

public class dbu extends cvo {
   public static final MapCodec<dbu> d = b(dbu::new);
   public static final djn<djt> e = djf.ah;
   public static final djg f = djf.w;

   @Override
   public MapCodec<dbu> a() {
      return d;
   }

   protected dbu(dio.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, djt.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(csy $$0, hv $$1, dip $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         djt $$9 = $$2.c(e);
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

               $$9 = djt.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = djt.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = djt.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = djt.a;
         }

         return this.a($$0, new hv($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hv($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(csy $$0, hv $$1, boolean $$2, int $$3, djt $$4) {
      dip $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         djt $$6 = $$5.c(e);
         if ($$4 != djt.b || $$6 != djt.a && $$6 != djt.e && $$6 != djt.f) {
            if ($$4 != djt.a || $$6 != djt.b && $$6 != djt.c && $$6 != djt.d) {
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
   protected void a(dip $$0, csy $$1, hv $$2, cvz $$3) {
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
   public djs<djt> c() {
      return e;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      switch ($$1) {
         case c:
            switch ((djt)$$0.c(e)) {
               case c:
                  return $$0.a(e, djt.d);
               case d:
                  return $$0.a(e, djt.c);
               case e:
                  return $$0.a(e, djt.f);
               case f:
                  return $$0.a(e, djt.e);
               case g:
                  return $$0.a(e, djt.i);
               case h:
                  return $$0.a(e, djt.j);
               case i:
                  return $$0.a(e, djt.g);
               case j:
                  return $$0.a(e, djt.h);
            }
         case d:
            switch ((djt)$$0.c(e)) {
               case a:
                  return $$0.a(e, djt.b);
               case b:
                  return $$0.a(e, djt.a);
               case c:
                  return $$0.a(e, djt.e);
               case d:
                  return $$0.a(e, djt.f);
               case e:
                  return $$0.a(e, djt.d);
               case f:
                  return $$0.a(e, djt.c);
               case g:
                  return $$0.a(e, djt.j);
               case h:
                  return $$0.a(e, djt.g);
               case i:
                  return $$0.a(e, djt.h);
               case j:
                  return $$0.a(e, djt.i);
            }
         case b:
            switch ((djt)$$0.c(e)) {
               case a:
                  return $$0.a(e, djt.b);
               case b:
                  return $$0.a(e, djt.a);
               case c:
                  return $$0.a(e, djt.f);
               case d:
                  return $$0.a(e, djt.e);
               case e:
                  return $$0.a(e, djt.c);
               case f:
                  return $$0.a(e, djt.d);
               case g:
                  return $$0.a(e, djt.h);
               case h:
                  return $$0.a(e, djt.i);
               case i:
                  return $$0.a(e, djt.j);
               case j:
                  return $$0.a(e, djt.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      djt $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, djt.f);
               case f:
                  return $$0.a(e, djt.e);
               case g:
                  return $$0.a(e, djt.j);
               case h:
                  return $$0.a(e, djt.i);
               case i:
                  return $$0.a(e, djt.h);
               case j:
                  return $$0.a(e, djt.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, djt.d);
               case d:
                  return $$0.a(e, djt.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, djt.h);
               case h:
                  return $$0.a(e, djt.g);
               case i:
                  return $$0.a(e, djt.j);
               case j:
                  return $$0.a(e, djt.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(e, f, c);
   }
}
