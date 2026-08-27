import com.mojang.serialization.MapCodec;

public class dll extends deq {
   public static final MapCodec<dll> d = b(dll::new);
   public static final dua<dug> e = dts.ah;
   public static final dtt f = dts.w;

   @Override
   public MapCodec<dll> a() {
      return d;
   }

   protected dll(dtb.d $$0) {
      super(true, $$0);
      this.k(this.E.b().a(e, dug.a).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   protected boolean a(dca $$0, ir $$1, dtc $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dug $$9 = $$2.c(e);
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

               $$9 = dug.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dug.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dug.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dug.a;
         }

         return this.a($$0, new ir($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new ir($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dca $$0, ir $$1, boolean $$2, int $$3, dug $$4) {
      dtc $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dug $$6 = $$5.c(e);
         if ($$4 != dug.b || $$6 != dug.a && $$6 != dug.e && $$6 != dug.f) {
            if ($$4 != dug.a || $$6 != dug.b && $$6 != dug.c && $$6 != dug.d) {
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
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3) {
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
   public duf<dug> c() {
      return e;
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      switch ($$1) {
         case c:
            switch ((dug)$$0.c(e)) {
               case c:
                  return $$0.a(e, dug.d);
               case d:
                  return $$0.a(e, dug.c);
               case e:
                  return $$0.a(e, dug.f);
               case f:
                  return $$0.a(e, dug.e);
               case g:
                  return $$0.a(e, dug.i);
               case h:
                  return $$0.a(e, dug.j);
               case i:
                  return $$0.a(e, dug.g);
               case j:
                  return $$0.a(e, dug.h);
            }
         case d:
            switch ((dug)$$0.c(e)) {
               case a:
                  return $$0.a(e, dug.b);
               case b:
                  return $$0.a(e, dug.a);
               case c:
                  return $$0.a(e, dug.e);
               case d:
                  return $$0.a(e, dug.f);
               case e:
                  return $$0.a(e, dug.d);
               case f:
                  return $$0.a(e, dug.c);
               case g:
                  return $$0.a(e, dug.j);
               case h:
                  return $$0.a(e, dug.g);
               case i:
                  return $$0.a(e, dug.h);
               case j:
                  return $$0.a(e, dug.i);
            }
         case b:
            switch ((dug)$$0.c(e)) {
               case a:
                  return $$0.a(e, dug.b);
               case b:
                  return $$0.a(e, dug.a);
               case c:
                  return $$0.a(e, dug.f);
               case d:
                  return $$0.a(e, dug.e);
               case e:
                  return $$0.a(e, dug.c);
               case f:
                  return $$0.a(e, dug.d);
               case g:
                  return $$0.a(e, dug.h);
               case h:
                  return $$0.a(e, dug.i);
               case i:
                  return $$0.a(e, dug.j);
               case j:
                  return $$0.a(e, dug.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      dug $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.a(e, dug.f);
               case f:
                  return $$0.a(e, dug.e);
               case g:
                  return $$0.a(e, dug.j);
               case h:
                  return $$0.a(e, dug.i);
               case i:
                  return $$0.a(e, dug.h);
               case j:
                  return $$0.a(e, dug.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.a(e, dug.d);
               case d:
                  return $$0.a(e, dug.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.a(e, dug.h);
               case h:
                  return $$0.a(e, dug.g);
               case i:
                  return $$0.a(e, dug.j);
               case j:
                  return $$0.a(e, dug.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(e, f, c);
   }
}
