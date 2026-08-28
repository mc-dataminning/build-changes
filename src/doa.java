import com.mojang.serialization.MapCodec;

public class doa extends dht {
   public static final MapCodec<doa> d = b(doa::new);
   public static final dwh<dwn> e = dvz.ah;
   public static final dwa f = dvz.w;

   @Override
   public MapCodec<doa> a() {
      return d;
   }

   protected doa(dvi.d $$0) {
      super(true, $$0);
      this.l(this.F.b().b(e, dwn.a).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   protected boolean a(dfb $$0, jh $$1, dvj $$2, boolean $$3, int $$4) {
      if ($$4 >= 8) {
         return false;
      } else {
         int $$5 = $$1.u();
         int $$6 = $$1.v();
         int $$7 = $$1.w();
         boolean $$8 = true;
         dwn $$9 = $$2.c(e);
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

               $$9 = dwn.b;
               break;
            case d:
               if ($$3) {
                  $$5--;
                  $$6++;
                  $$8 = false;
               } else {
                  $$5++;
               }

               $$9 = dwn.b;
               break;
            case e:
               if ($$3) {
                  $$7++;
               } else {
                  $$7--;
                  $$6++;
                  $$8 = false;
               }

               $$9 = dwn.a;
               break;
            case f:
               if ($$3) {
                  $$7++;
                  $$6++;
                  $$8 = false;
               } else {
                  $$7--;
               }

               $$9 = dwn.a;
         }

         return this.a($$0, new jh($$5, $$6, $$7), $$3, $$4, $$9) ? true : $$8 && this.a($$0, new jh($$5, $$6 - 1, $$7), $$3, $$4, $$9);
      }
   }

   protected boolean a(dfb $$0, jh $$1, boolean $$2, int $$3, dwn $$4) {
      dvj $$5 = $$0.a_($$1);
      if (!$$5.a(this)) {
         return false;
      } else {
         dwn $$6 = $$5.c(e);
         if ($$4 != dwn.b || $$6 != dwn.a && $$6 != dwn.e && $$6 != dwn.f) {
            if ($$4 != dwn.a || $$6 != dwn.b && $$6 != dwn.c && $$6 != dwn.d) {
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
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3) {
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
   public dwm<dwn> c() {
      return e;
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      switch ($$1) {
         case c:
            switch ((dwn)$$0.c(e)) {
               case c:
                  return $$0.b(e, dwn.d);
               case d:
                  return $$0.b(e, dwn.c);
               case e:
                  return $$0.b(e, dwn.f);
               case f:
                  return $$0.b(e, dwn.e);
               case g:
                  return $$0.b(e, dwn.i);
               case h:
                  return $$0.b(e, dwn.j);
               case i:
                  return $$0.b(e, dwn.g);
               case j:
                  return $$0.b(e, dwn.h);
            }
         case d:
            switch ((dwn)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwn.b);
               case b:
                  return $$0.b(e, dwn.a);
               case c:
                  return $$0.b(e, dwn.e);
               case d:
                  return $$0.b(e, dwn.f);
               case e:
                  return $$0.b(e, dwn.d);
               case f:
                  return $$0.b(e, dwn.c);
               case g:
                  return $$0.b(e, dwn.j);
               case h:
                  return $$0.b(e, dwn.g);
               case i:
                  return $$0.b(e, dwn.h);
               case j:
                  return $$0.b(e, dwn.i);
            }
         case b:
            switch ((dwn)$$0.c(e)) {
               case a:
                  return $$0.b(e, dwn.b);
               case b:
                  return $$0.b(e, dwn.a);
               case c:
                  return $$0.b(e, dwn.f);
               case d:
                  return $$0.b(e, dwn.e);
               case e:
                  return $$0.b(e, dwn.c);
               case f:
                  return $$0.b(e, dwn.d);
               case g:
                  return $$0.b(e, dwn.h);
               case h:
                  return $$0.b(e, dwn.i);
               case i:
                  return $$0.b(e, dwn.j);
               case j:
                  return $$0.b(e, dwn.g);
            }
         default:
            return $$0;
      }
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      dwn $$2 = $$0.c(e);
      switch ($$1) {
         case b:
            switch ($$2) {
               case e:
                  return $$0.b(e, dwn.f);
               case f:
                  return $$0.b(e, dwn.e);
               case g:
                  return $$0.b(e, dwn.j);
               case h:
                  return $$0.b(e, dwn.i);
               case i:
                  return $$0.b(e, dwn.h);
               case j:
                  return $$0.b(e, dwn.g);
               default:
                  return super.a($$0, $$1);
            }
         case c:
            switch ($$2) {
               case c:
                  return $$0.b(e, dwn.d);
               case d:
                  return $$0.b(e, dwn.c);
               case e:
               case f:
               default:
                  break;
               case g:
                  return $$0.b(e, dwn.h);
               case h:
                  return $$0.b(e, dwn.g);
               case i:
                  return $$0.b(e, dwn.j);
               case j:
                  return $$0.b(e, dwn.i);
            }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(e, f, c);
   }
}
