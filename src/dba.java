import com.mojang.serialization.MapCodec;

public class dba extends cuu {
   public static final MapCodec<dba> d = b(dba::new);
   public static final dil<dir> e = did.ah;
   public static final die f = did.w;

   @Override
   public MapCodec<dba> a() {
      return d;
   }

   protected dba(dhm.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dir.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(csf $$0, hx $$1, dhn $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dir $$9 = $$2.c(e);
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

               $$9 = dir.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dir.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dir.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dir.a;
         }

         return this.a($$0, new hx($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new hx($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(csf $$0, hx $$1, boolean $$2, int $$3, dir $$4) {
      dhn $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dir $$6 = $$5.c(e);
         if ($$4 != dir.b || $$6 != dir.a && $$6 != dir.e && $$6 != dir.f) {
            if ($$4 != dir.a || $$6 != dir.b && $$6 != dir.c && $$6 != dir.d) {
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
   protected void a(dhn $$0, csf $$1, hx $$2, cvf $$3) {
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
   public diq<dir> c() {
      return e;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      switch ($$1) {
         case c:
            switch ((dir)$$0.c(e)) {
               case c:
                  return $$0.a(e, dir.d);
               case d:
                  return $$0.a(e, dir.c);
               case e:
                  return $$0.a(e, dir.f);
               case f:
                  return $$0.a(e, dir.e);
               case g:
                  return $$0.a(e, dir.i);
               case h:
                  return $$0.a(e, dir.j);
               case i:
                  return $$0.a(e, dir.g);
               case j:
                  return $$0.a(e, dir.h);
            }
         case d:
            switch ((dir)$$0.c(e)) {
               case a:
                  return $$0.a(e, dir.b);
               case b:
                  return $$0.a(e, dir.a);
               case c:
                  return $$0.a(e, dir.e);
               case d:
                  return $$0.a(e, dir.f);
               case e:
                  return $$0.a(e, dir.d);
               case f:
                  return $$0.a(e, dir.c);
               case g:
                  return $$0.a(e, dir.j);
               case h:
                  return $$0.a(e, dir.g);
               case i:
                  return $$0.a(e, dir.h);
               case j:
                  return $$0.a(e, dir.i);
            }
         case b:
            switch ((dir)$$0.c(e)) {
               case a:
                  return $$0.a(e, dir.b);
               case b:
                  return $$0.a(e, dir.a);
               case c:
                  return $$0.a(e, dir.f);
               case d:
                  return $$0.a(e, dir.e);
               case e:
                  return $$0.a(e, dir.c);
               case f:
                  return $$0.a(e, dir.d);
               case g:
                  return $$0.a(e, dir.h);
               case h:
                  return $$0.a(e, dir.i);
               case i:
                  return $$0.a(e, dir.j);
               case j:
                  return $$0.a(e, dir.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      dir $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dir.f);
               case f:
                  return $$0.a(e, dir.e);
               case g:
                  return $$0.a(e, dir.j);
               case h:
                  return $$0.a(e, dir.i);
               case i:
                  return $$0.a(e, dir.h);
               case j:
                  return $$0.a(e, dir.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dir.d);
               case d:
                  return $$0.a(e, dir.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dir.h);
               case h:
                  return $$0.a(e, dir.g);
               case i:
                  return $$0.a(e, dir.j);
               case j:
                  return $$0.a(e, dir.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e, f, c);
   }
}
