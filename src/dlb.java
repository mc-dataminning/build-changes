import com.mojang.serialization.MapCodec;

public class dlb extends deu {
   public static final MapCodec<dlb> d = b(dlb::new);
   public static final dtf<dtl> e = dsx.ah;
   public static final dsy f = dsx.w;

   @Override
   public MapCodec<dlb> a() {
      return d;
   }

   protected dlb(dsg.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dtl.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dcd $$0, ja $$1, dsh $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dtl $$9 = $$2.c(e);
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

               $$9 = dtl.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dtl.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dtl.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dtl.a;
         }

         return this.a($$0, new ja($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ja($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dcd $$0, ja $$1, boolean $$2, int $$3, dtl $$4) {
      dsh $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dtl $$6 = $$5.c(e);
         if ($$4 != dtl.b || $$6 != dtl.a && $$6 != dtl.e && $$6 != dtl.f) {
            if ($$4 != dtl.a || $$6 != dtl.b && $$6 != dtl.c && $$6 != dtl.d) {
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
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3) {
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
   public dtk<dtl> c() {
      return e;
   }

   @Override
   protected dsh a(dsh $$0, dls $$1) {
      switch ($$1) {
         case c:
            switch ((dtl)$$0.c(e)) {
               case c:
                  return $$0.a(e, dtl.d);
               case d:
                  return $$0.a(e, dtl.c);
               case e:
                  return $$0.a(e, dtl.f);
               case f:
                  return $$0.a(e, dtl.e);
               case g:
                  return $$0.a(e, dtl.i);
               case h:
                  return $$0.a(e, dtl.j);
               case i:
                  return $$0.a(e, dtl.g);
               case j:
                  return $$0.a(e, dtl.h);
            }
         case d:
            switch ((dtl)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtl.b);
               case b:
                  return $$0.a(e, dtl.a);
               case c:
                  return $$0.a(e, dtl.e);
               case d:
                  return $$0.a(e, dtl.f);
               case e:
                  return $$0.a(e, dtl.d);
               case f:
                  return $$0.a(e, dtl.c);
               case g:
                  return $$0.a(e, dtl.j);
               case h:
                  return $$0.a(e, dtl.g);
               case i:
                  return $$0.a(e, dtl.h);
               case j:
                  return $$0.a(e, dtl.i);
            }
         case b:
            switch ((dtl)$$0.c(e)) {
               case a:
                  return $$0.a(e, dtl.b);
               case b:
                  return $$0.a(e, dtl.a);
               case c:
                  return $$0.a(e, dtl.f);
               case d:
                  return $$0.a(e, dtl.e);
               case e:
                  return $$0.a(e, dtl.c);
               case f:
                  return $$0.a(e, dtl.d);
               case g:
                  return $$0.a(e, dtl.h);
               case h:
                  return $$0.a(e, dtl.i);
               case i:
                  return $$0.a(e, dtl.j);
               case j:
                  return $$0.a(e, dtl.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dsh a(dsh $$0, dkc $$1) {
      dtl $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dtl.f);
               case f:
                  return $$0.a(e, dtl.e);
               case g:
                  return $$0.a(e, dtl.j);
               case h:
                  return $$0.a(e, dtl.i);
               case i:
                  return $$0.a(e, dtl.h);
               case j:
                  return $$0.a(e, dtl.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dtl.d);
               case d:
                  return $$0.a(e, dtl.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dtl.h);
               case h:
                  return $$0.a(e, dtl.g);
               case i:
                  return $$0.a(e, dtl.j);
               case j:
                  return $$0.a(e, dtl.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(e, f, c);
   }
}
