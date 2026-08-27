import com.mojang.serialization.MapCodec;

public class dfv extends czp {
   public static final MapCodec<dfv> d = b(dfv::new);
   public static final dnx<dod> e = dnp.ah;
   public static final dnq f = dnp.w;

   @Override
   public MapCodec<dfv> a() {
      return d;
   }

   protected dfv(dmy.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dod.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(cwz $$0, ib $$1, dmz $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dod $$9 = $$2.c(e);
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

               $$9 = dod.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dod.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dod.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dod.a;
         }

         return this.a($$0, new ib($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ib($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(cwz $$0, ib $$1, boolean $$2, int $$3, dod $$4) {
      dmz $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dod $$6 = $$5.c(e);
         if ($$4 != dod.b || $$6 != dod.a && $$6 != dod.e && $$6 != dod.f) {
            if ($$4 != dod.a || $$6 != dod.b && $$6 != dod.c && $$6 != dod.d) {
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
   protected void a(dmz $$0, cwz $$1, ib $$2, daa $$3) {
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
   public doc<dod> c() {
      return e;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      switch ($$1) {
         case c:
            switch ((dod)$$0.c(e)) {
               case c:
                  return $$0.a(e, dod.d);
               case d:
                  return $$0.a(e, dod.c);
               case e:
                  return $$0.a(e, dod.f);
               case f:
                  return $$0.a(e, dod.e);
               case g:
                  return $$0.a(e, dod.i);
               case h:
                  return $$0.a(e, dod.j);
               case i:
                  return $$0.a(e, dod.g);
               case j:
                  return $$0.a(e, dod.h);
            }
         case d:
            switch ((dod)$$0.c(e)) {
               case a:
                  return $$0.a(e, dod.b);
               case b:
                  return $$0.a(e, dod.a);
               case c:
                  return $$0.a(e, dod.e);
               case d:
                  return $$0.a(e, dod.f);
               case e:
                  return $$0.a(e, dod.d);
               case f:
                  return $$0.a(e, dod.c);
               case g:
                  return $$0.a(e, dod.j);
               case h:
                  return $$0.a(e, dod.g);
               case i:
                  return $$0.a(e, dod.h);
               case j:
                  return $$0.a(e, dod.i);
            }
         case b:
            switch ((dod)$$0.c(e)) {
               case a:
                  return $$0.a(e, dod.b);
               case b:
                  return $$0.a(e, dod.a);
               case c:
                  return $$0.a(e, dod.f);
               case d:
                  return $$0.a(e, dod.e);
               case e:
                  return $$0.a(e, dod.c);
               case f:
                  return $$0.a(e, dod.d);
               case g:
                  return $$0.a(e, dod.h);
               case h:
                  return $$0.a(e, dod.i);
               case i:
                  return $$0.a(e, dod.j);
               case j:
                  return $$0.a(e, dod.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      dod $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dod.f);
               case f:
                  return $$0.a(e, dod.e);
               case g:
                  return $$0.a(e, dod.j);
               case h:
                  return $$0.a(e, dod.i);
               case i:
                  return $$0.a(e, dod.h);
               case j:
                  return $$0.a(e, dod.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dod.d);
               case d:
                  return $$0.a(e, dod.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dod.h);
               case h:
                  return $$0.a(e, dod.g);
               case i:
                  return $$0.a(e, dod.j);
               case j:
                  return $$0.a(e, dod.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(e, f, c);
   }
}
