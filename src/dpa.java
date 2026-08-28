import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dpa extends dnd implements dou, dpf {
   public static final MapCodec<dpa> c = b(dpa::new);
   private static final dwa d = dvz.C;
   private final dne e = new dne(new dpa.a(dne.a));
   private final dne f = new dne(new dpa.a(dne.e.a));

   @Override
   public MapCodec<dpa> a() {
      return c;
   }

   public dpa(dvi.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dne c() {
      return this.e;
   }

   public dne q() {
      return this.f;
   }

   public static boolean a(dfc $$0, jh $$1, dvj $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dvj $$5 = dig.qT.m();

      for (jm $$6 : $$3) {
         jh $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dfc $$0, dvj $$1, jh $$2, azs $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : b) {
            dwa $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dig.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            erk $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dig.a : dig.G).m();
         }

         $$0.a($$2, $$1, 3);
         dou.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(doz.a $$0, dfc $$1, jh $$2, azs $$3, doz $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azk.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(doz $$0, dfc $$1, jh $$2, azs $$3) {
      dvj $$4 = $$1.a_($$2);
      axq<die> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dvj $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dvj $$9 = dig.qS.m();
               $$1.a($$7, $$9, 3);
               die.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awl.vS, awm.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : b) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dvj $$13 = $$1.a_($$12);
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

   public static boolean a(dfc $$0, dvj $$1, jh $$2) {
      if (!$$1.a(dig.qT)) {
         return false;
      } else {
         for (jm $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axa.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dvj $$0, czs $$1) {
      return !$$1.n().a(cwf.gi) || super.a($$0, $$1);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(d) ? erl.c.a(false) : super.b_($$0);
   }

   class a extends dne.a {
      private final dne.e[] b;

      public a(final dne.e... $$0) {
         super(dpa.this);
         this.b = $$0;
      }

      @Override
      public boolean a(deg $$0, jh $$1, jh $$2, jm $$3, dvj $$4) {
         dvj $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dig.qS) && !$$5.a(dig.qU) && !$$5.a(dig.bQ)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            erk $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(erl.c)) {
               return false;
            } else {
               return $$4.a(axa.aL) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dne.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dvj $$0) {
         return !$$0.a(dig.qT);
      }
   }
}
