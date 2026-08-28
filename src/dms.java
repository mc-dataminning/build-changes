import com.mojang.serialization.MapCodec;

public class dms extends dgk {
   public static final MapCodec<dms> d = b(dms::new);
   public static final duy<dve> e = duq.ah;
   public static final dur f = duq.w;

   @Override
   public MapCodec<dms> a() {
      return d;
   }

   protected dms(dtz.d $$0) {
      super(true, $$0);
      this.l(this.E.b().b(e, dve.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dds $$0, je $$1, dua $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dve $$9 = $$2.c(e);
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

               $$9 = dve.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dve.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dve.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dve.a;
         }

         return this.a($$0, new je($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new je($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dds $$0, je $$1, boolean $$2, int $$3, dve $$4) {
      dua $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dve $$6 = $$5.c(e);
         if ($$4 != dve.b || $$6 != dve.a && $$6 != dve.e && $$6 != dve.f) {
            if ($$4 != dve.a || $$6 != dve.b && $$6 != dve.c && $$6 != dve.d) {
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
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3) {
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
   public dvd<dve> c() {
      return e;
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      switch ($$1) {
         case c:
            switch ((dve)$$0.c(e)) {
               case c:
                  return $$0.b(e, dve.d);
               case d:
                  return $$0.b(e, dve.c);
               case e:
                  return $$0.b(e, dve.f);
               case f:
                  return $$0.b(e, dve.e);
               case g:
                  return $$0.b(e, dve.i);
               case h:
                  return $$0.b(e, dve.j);
               case i:
                  return $$0.b(e, dve.g);
               case j:
                  return $$0.b(e, dve.h);
            }
         case d:
            switch ((dve)$$0.c(e)) {
               case a:
                  return $$0.b(e, dve.b);
               case b:
                  return $$0.b(e, dve.a);
               case c:
                  return $$0.b(e, dve.e);
               case d:
                  return $$0.b(e, dve.f);
               case e:
                  return $$0.b(e, dve.d);
               case f:
                  return $$0.b(e, dve.c);
               case g:
                  return $$0.b(e, dve.j);
               case h:
                  return $$0.b(e, dve.g);
               case i:
                  return $$0.b(e, dve.h);
               case j:
                  return $$0.b(e, dve.i);
            }
         case b:
            switch ((dve)$$0.c(e)) {
               case a:
                  return $$0.b(e, dve.b);
               case b:
                  return $$0.b(e, dve.a);
               case c:
                  return $$0.b(e, dve.f);
               case d:
                  return $$0.b(e, dve.e);
               case e:
                  return $$0.b(e, dve.c);
               case f:
                  return $$0.b(e, dve.d);
               case g:
                  return $$0.b(e, dve.h);
               case h:
                  return $$0.b(e, dve.i);
               case i:
                  return $$0.b(e, dve.j);
               case j:
                  return $$0.b(e, dve.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      dve $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dve.f);
               case f:
                  return $$0.b(e, dve.e);
               case g:
                  return $$0.b(e, dve.j);
               case h:
                  return $$0.b(e, dve.i);
               case i:
                  return $$0.b(e, dve.h);
               case j:
                  return $$0.b(e, dve.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dve.d);
               case d:
                  return $$0.b(e, dve.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dve.h);
               case h:
                  return $$0.b(e, dve.g);
               case i:
                  return $$0.b(e, dve.j);
               case j:
                  return $$0.b(e, dve.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e, f, c);
   }
}
