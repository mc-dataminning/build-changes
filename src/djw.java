import com.mojang.serialization.MapCodec;

public class djw extends ddp {
   public static final MapCodec<djw> d = b(djw::new);
   public static final dsb<dsh> e = drt.ah;
   public static final dru f = drt.w;

   @Override
   public MapCodec<djw> a() {
      return d;
   }

   protected djw(drc.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dsh.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(daz $$0, io $$1, drd $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dsh $$9 = $$2.c(e);
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

               $$9 = dsh.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dsh.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dsh.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dsh.a;
         }

         return this.a($$0, new io($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new io($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(daz $$0, io $$1, boolean $$2, int $$3, dsh $$4) {
      drd $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dsh $$6 = $$5.c(e);
         if ($$4 != dsh.b || $$6 != dsh.a && $$6 != dsh.e && $$6 != dsh.f) {
            if ($$4 != dsh.a || $$6 != dsh.b && $$6 != dsh.c && $$6 != dsh.d) {
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
   protected void a(drd $$0, daz $$1, io $$2, dea $$3) {
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
   public dsg<dsh> c() {
      return e;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      switch ($$1) {
         case c:
            switch ((dsh)$$0.c(e)) {
               case c:
                  return $$0.a(e, dsh.d);
               case d:
                  return $$0.a(e, dsh.c);
               case e:
                  return $$0.a(e, dsh.f);
               case f:
                  return $$0.a(e, dsh.e);
               case g:
                  return $$0.a(e, dsh.i);
               case h:
                  return $$0.a(e, dsh.j);
               case i:
                  return $$0.a(e, dsh.g);
               case j:
                  return $$0.a(e, dsh.h);
            }
         case d:
            switch ((dsh)$$0.c(e)) {
               case a:
                  return $$0.a(e, dsh.b);
               case b:
                  return $$0.a(e, dsh.a);
               case c:
                  return $$0.a(e, dsh.e);
               case d:
                  return $$0.a(e, dsh.f);
               case e:
                  return $$0.a(e, dsh.d);
               case f:
                  return $$0.a(e, dsh.c);
               case g:
                  return $$0.a(e, dsh.j);
               case h:
                  return $$0.a(e, dsh.g);
               case i:
                  return $$0.a(e, dsh.h);
               case j:
                  return $$0.a(e, dsh.i);
            }
         case b:
            switch ((dsh)$$0.c(e)) {
               case a:
                  return $$0.a(e, dsh.b);
               case b:
                  return $$0.a(e, dsh.a);
               case c:
                  return $$0.a(e, dsh.f);
               case d:
                  return $$0.a(e, dsh.e);
               case e:
                  return $$0.a(e, dsh.c);
               case f:
                  return $$0.a(e, dsh.d);
               case g:
                  return $$0.a(e, dsh.h);
               case h:
                  return $$0.a(e, dsh.i);
               case i:
                  return $$0.a(e, dsh.j);
               case j:
                  return $$0.a(e, dsh.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      dsh $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dsh.f);
               case f:
                  return $$0.a(e, dsh.e);
               case g:
                  return $$0.a(e, dsh.j);
               case h:
                  return $$0.a(e, dsh.i);
               case i:
                  return $$0.a(e, dsh.h);
               case j:
                  return $$0.a(e, dsh.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dsh.d);
               case d:
                  return $$0.a(e, dsh.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dsh.h);
               case h:
                  return $$0.a(e, dsh.g);
               case i:
                  return $$0.a(e, dsh.j);
               case j:
                  return $$0.a(e, dsh.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e, f, c);
   }
}
