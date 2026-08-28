import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class drl extends dpo implements drf, drq {
   public static final MapCodec<drl> c = b(drl::new);
   private static final dym d = dyl.D;
   private final dpp e = new dpp(new drl.a(dpp.a));
   private final dpp f = new dpp(new drl.a(dpp.e.a));

   @Override
   public MapCodec<drl> a() {
      return c;
   }

   public drl(dxu.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dpp c() {
      return this.e;
   }

   public dpp q() {
      return this.f;
   }

   public static boolean a(dhj $$0, jh $$1, dxv $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dxv $$5 = dko.ro.m();

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
   public void a(dhj $$0, dxv $$1, jh $$2, bam $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : b) {
            dym $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dko.rn)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            etx $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dko.a : dko.J).m();
         }

         $$0.a($$2, $$1, 3);
         drf.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(drk.a $$0, dhj $$1, jh $$2, bam $$3, drk $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? bae.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(drk $$0, dhj $$1, jh $$2, bam $$3) {
      dxv $$4 = $$1.a_($$2);
      ayk<dkm> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dxv $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dxv $$9 = dko.rn.m();
               $$1.a($$7, $$9, 3);
               dkm.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, axf.wn, axg.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : b) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dxv $$13 = $$1.a_($$12);
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

   public static boolean a(dhj $$0, dxv $$1, jh $$2) {
      if (!$$1.a(dko.ro)) {
         return false;
      } else {
         for (jm $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axu.bU)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dxv $$0, dbg $$1) {
      return !$$1.n().a(cxt.gv) || super.a($$0, $$1);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(d) ? ety.c.a(false) : super.b_($$0);
   }

   class a extends dpp.a {
      private final dpp.e[] b;

      public a(final dpp.e... $$0) {
         super(drl.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dgn $$0, jh $$1, jh $$2, jm $$3, dxv $$4) {
         dxv $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dko.rn) && !$$5.a(dko.rp) && !$$5.a(dko.bX)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            etx $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(ety.c)) {
               return false;
            } else {
               return $$4.a(axu.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dpp.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dxv $$0) {
         return !$$0.a(dko.ro);
      }
   }
}
