import com.mojang.serialization.MapCodec;

public class dnj extends dhb {
   public static final MapCodec<dnj> d = b(dnj::new);
   public static final dvq<dvw> e = dvi.ah;
   public static final dvj f = dvi.w;

   @Override
   public MapCodec<dnj> a() {
      return d;
   }

   protected dnj(dur.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dvw.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dej $$0, jf $$1, dus $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dvw $$9 = $$2.c(e);
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

               $$9 = dvw.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dvw.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dvw.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dvw.a;
         }

         return this.a($$0, new jf($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jf($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dej $$0, jf $$1, boolean $$2, int $$3, dvw $$4) {
      dus $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dvw $$6 = $$5.c(e);
         if ($$4 != dvw.b || $$6 != dvw.a && $$6 != dvw.e && $$6 != dvw.f) {
            if ($$4 != dvw.a || $$6 != dvw.b && $$6 != dvw.c && $$6 != dvw.d) {
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
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3) {
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
   public dvv<dvw> c() {
      return e;
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      switch ($$1) {
         case c:
            switch ((dvw)$$0.c(e)) {
               case c:
                  return $$0.b(e, dvw.d);
               case d:
                  return $$0.b(e, dvw.c);
               case e:
                  return $$0.b(e, dvw.f);
               case f:
                  return $$0.b(e, dvw.e);
               case g:
                  return $$0.b(e, dvw.i);
               case h:
                  return $$0.b(e, dvw.j);
               case i:
                  return $$0.b(e, dvw.g);
               case j:
                  return $$0.b(e, dvw.h);
            }
         case d:
            switch ((dvw)$$0.c(e)) {
               case a:
                  return $$0.b(e, dvw.b);
               case b:
                  return $$0.b(e, dvw.a);
               case c:
                  return $$0.b(e, dvw.e);
               case d:
                  return $$0.b(e, dvw.f);
               case e:
                  return $$0.b(e, dvw.d);
               case f:
                  return $$0.b(e, dvw.c);
               case g:
                  return $$0.b(e, dvw.j);
               case h:
                  return $$0.b(e, dvw.g);
               case i:
                  return $$0.b(e, dvw.h);
               case j:
                  return $$0.b(e, dvw.i);
            }
         case b:
            switch ((dvw)$$0.c(e)) {
               case a:
                  return $$0.b(e, dvw.b);
               case b:
                  return $$0.b(e, dvw.a);
               case c:
                  return $$0.b(e, dvw.f);
               case d:
                  return $$0.b(e, dvw.e);
               case e:
                  return $$0.b(e, dvw.c);
               case f:
                  return $$0.b(e, dvw.d);
               case g:
                  return $$0.b(e, dvw.h);
               case h:
                  return $$0.b(e, dvw.i);
               case i:
                  return $$0.b(e, dvw.j);
               case j:
                  return $$0.b(e, dvw.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dus a(dus $$0, dmj $$1) {
      dvw $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dvw.f);
               case f:
                  return $$0.b(e, dvw.e);
               case g:
                  return $$0.b(e, dvw.j);
               case h:
                  return $$0.b(e, dvw.i);
               case i:
                  return $$0.b(e, dvw.h);
               case j:
                  return $$0.b(e, dvw.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dvw.d);
               case d:
                  return $$0.b(e, dvw.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dvw.h);
               case h:
                  return $$0.b(e, dvw.g);
               case i:
                  return $$0.b(e, dvw.j);
               case j:
                  return $$0.b(e, dvw.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(e, f, c);
   }
}
