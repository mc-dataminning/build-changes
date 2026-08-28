import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dtq extends drt implements dtk {
   public static final MapCodec<dtq> e = b(dtq::new);
   private final dru f = new dru(new dtq.a(dru.a));
   private final dru g = new dru(new dtq.a(dru.e.a));

   @Override
   public MapCodec<dtq> a() {
      return e;
   }

   public dtq(ean.d $$0) {
      super($$0);
   }

   @Override
   public dru c() {
      return this.f;
   }

   public dru q() {
      return this.g;
   }

   public static boolean a(dji $$0, iv $$1, eao $$2, Collection<jb> $$3) {
      boolean $$4 = false;
      eao $$5 = dmo.rB.m();

      for (jb $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(drs.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dji $$0, eao $$1, iv $$2, azv $$3) {
      if ($$1.a(this)) {
         for (jb $$4 : d) {
            ebf $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dmo.rA)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            ewv $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dmo.a : dmo.J).m();
         }

         $$0.a($$2, $$1, 3);
         dtk.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dtp.a $$0, dji $$1, iv $$2, azv $$3, dtp $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dtp $$0, dji $$1, iv $$2, azv $$3) {
      eao $$4 = $$1.a_($$2);
      axr<dmm> $$5 = $$0.c();

      for (jb $$6 : jb.a($$3)) {
         if (a($$4, $$6)) {
            iv $$7 = $$2.a($$6);
            eao $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               eao $$9 = dmo.rA.m();
               $$1.a($$7, $$9, 3);
               dmm.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awn.wJ, awo.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jb $$10 = $$6.g();

               for (jb $$11 : d) {
                  if ($$11 != $$10) {
                     iv $$12 = $$7.a($$11);
                     eao $$13 = $$1.a_($$12);
                     if ($$13.a(this)) {
                        this.a($$1, $$13, $$12, $$3);
                     }
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   public static boolean a(dji $$0, eao $$1, iv $$2) {
      if (!$$1.a(dmo.rB)) {
         return false;
      } else {
         for (jb $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axc.bW)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dru.a {
      private final dru.e[] b;

      public a(final dru.e... $$0) {
         super(dtq.this);
         this.b = $$0;
      }

      @Override
      public boolean a(din $$0, iv $$1, iv $$2, jb $$3, eao $$4) {
         eao $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dmo.rA) && !$$5.a(dmo.rC) && !$$5.a(dmo.ca)) {
            if ($$1.k($$2) == 2) {
               iv $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            ewv $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(eww.c)) {
               return false;
            } else {
               return $$4.a(axc.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dru.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(eao $$0) {
         return !$$0.a(dmo.rB);
      }
   }
}
