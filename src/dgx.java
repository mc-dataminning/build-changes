import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dgx extends dfb implements dgr, dhc {
   public static final MapCodec<dgx> c = b(dgx::new);
   private static final dns d = dnr.C;
   private final dfc e = new dfc(new dgx.a(dfc.a));
   private final dfc f = new dfc(new dgx.a(dfc.e.a));

   @Override
   public MapCodec<dgx> a() {
      return c;
   }

   public dgx(dna.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfc c() {
      return this.e;
   }

   public dfc i() {
      return this.f;
   }

   public static boolean a(cxc $$0, ib $$1, dnb $$2, Collection<ih> $$3) {
      boolean $$4 = false;
      dnb $$5 = dae.qT.o();

      for (ih $$6 : $$3) {
         ib $$7 = $$1.a($$6);
         if (a($$0, $$6, $$7, $$0.a_($$7))) {
            $$5 = $$5.a(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.u().c()) {
            $$5 = $$5.a(d, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(cxc $$0, dnb $$1, ib $$2, axd $$3) {
      if ($$1.a(this)) {
         for (ih $$4 : b) {
            dns $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dae.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eip $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dae.a : dae.G).o();
         }

         $$0.a($$2, $$1, 3);
         dgr.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dgw.a $$0, cxc $$1, ib $$2, axd $$3, dgw $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aww.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dgw $$0, cxc $$1, ib $$2, axd $$3) {
      dnb $$4 = $$1.a_($$2);
      avd<dac> $$5 = $$0.c();

      for (ih $$6 : ih.a($$3)) {
         if (a($$4, $$6)) {
            ib $$7 = $$2.a($$6);
            dnb $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dnb $$9 = dae.qS.o();
               $$1.a($$7, $$9, 3);
               dac.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aty.vu, atz.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ih $$10 = $$6.g();

               for (ih $$11 : b) {
                  if ($$11 != $$10) {
                     ib $$12 = $$7.a($$11);
                     dnb $$13 = $$1.a_($$12);
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

   public static boolean a(cxc $$0, dnb $$1, ib $$2) {
      if (!$$1.a(dae.qT)) {
         return false;
      } else {
         for (ih $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(aun.bM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eiq.c, eiq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dnb $$0, csu $$1) {
      return !$$1.n().a(cqp.gh) || super.a($$0, $$1);
   }

   @Override
   protected eip c_(dnb $$0) {
      return $$0.c(d) ? eiq.c.a(false) : super.c_($$0);
   }

   class a extends dfc.a {
      private final dfc.e[] c;

      public a(dfc.e... $$0) {
         super(dgx.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cwh $$0, ib $$1, ib $$2, ih $$3, dnb $$4) {
         dnb $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dae.qS) && !$$5.a(dae.qU) && !$$5.a(dae.bQ)) {
            if ($$1.k($$2) == 2) {
               ib $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eip $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eiq.c)) {
               return false;
            } else {
               return $$4.a(aun.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dfc.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dnb $$0) {
         return !$$0.a(dae.qT);
      }
   }
}
