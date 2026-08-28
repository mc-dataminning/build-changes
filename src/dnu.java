import com.mojang.serialization.MapCodec;

public class dnu extends dhn {
   public static final MapCodec<dnu> d = b(dnu::new);
   public static final dwb<dwh> e = dvt.ah;
   public static final dvu f = dvt.w;

   @Override
   public MapCodec<dnu> a() {
      return d;
   }

   protected dnu(dvc.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dwh.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dev $$0, jg $$1, dvd $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dwh $$9 = $$2.c(e);
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

               $$9 = dwh.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dwh.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dwh.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dwh.a;
         }

         return this.a($$0, new jg($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jg($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dev $$0, jg $$1, boolean $$2, int $$3, dwh $$4) {
      dvd $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dwh $$6 = $$5.c(e);
         if ($$4 != dwh.b || $$6 != dwh.a && $$6 != dwh.e && $$6 != dwh.f) {
            if ($$4 != dwh.a || $$6 != dwh.b && $$6 != dwh.c && $$6 != dwh.d) {
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
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3) {
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
   public dwg<dwh> c() {
      return e;
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      switch ($$1) {
         case c:
            switch ((dwh)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwh.d);
               case d:
                  return $$0.b(e, dwh.c);
               case e:
                  return $$0.b(e, dwh.f);
               case f:
                  return $$0.b(e, dwh.e);
               case g:
                  return $$0.b(e, dwh.i);
               case h:
                  return $$0.b(e, dwh.j);
               case i:
                  return $$0.b(e, dwh.g);
               case j:
                  return $$0.b(e, dwh.h);
            }
         case d:
            switch ((dwh)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwh.b);
               case b:
                  return $$0.b(e, dwh.a);
               case c:
                  return $$0.b(e, dwh.e);
               case d:
                  return $$0.b(e, dwh.f);
               case e:
                  return $$0.b(e, dwh.d);
               case f:
                  return $$0.b(e, dwh.c);
               case g:
                  return $$0.b(e, dwh.j);
               case h:
                  return $$0.b(e, dwh.g);
               case i:
                  return $$0.b(e, dwh.h);
               case j:
                  return $$0.b(e, dwh.i);
            }
         case b:
            switch ((dwh)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwh.b);
               case b:
                  return $$0.b(e, dwh.a);
               case c:
                  return $$0.b(e, dwh.f);
               case d:
                  return $$0.b(e, dwh.e);
               case e:
                  return $$0.b(e, dwh.c);
               case f:
                  return $$0.b(e, dwh.d);
               case g:
                  return $$0.b(e, dwh.h);
               case h:
                  return $$0.b(e, dwh.i);
               case i:
                  return $$0.b(e, dwh.j);
               case j:
                  return $$0.b(e, dwh.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      dwh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwh.f);
               case f:
                  return $$0.b(e, dwh.e);
               case g:
                  return $$0.b(e, dwh.j);
               case h:
                  return $$0.b(e, dwh.i);
               case i:
                  return $$0.b(e, dwh.h);
               case j:
                  return $$0.b(e, dwh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwh.d);
               case d:
                  return $$0.b(e, dwh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwh.h);
               case h:
                  return $$0.b(e, dwh.g);
               case i:
                  return $$0.b(e, dwh.j);
               case j:
                  return $$0.b(e, dwh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(e, f, c);
   }
}
