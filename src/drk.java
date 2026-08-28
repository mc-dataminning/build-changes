import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class drk extends dpn implements dre, drp {
   public static final MapCodec<drk> c = b(drk::new);
   private static final dyl d = dyk.D;
   private final dpo e = new dpo(new drk.a(dpo.a));
   private final dpo f = new dpo(new drk.a(dpo.e.a));

   @Override
   public MapCodec<drk> a() {
      return c;
   }

   public drk(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dpo c() {
      return this.e;
   }

   public dpo q() {
      return this.f;
   }

   public static boolean a(dhi $$0, jh $$1, dxu $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dxu $$5 = dkn.ro.m();

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
   public void a(dhi $$0, dxu $$1, jh $$2, bam $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : b) {
            dyl $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dkn.rn)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            etw $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dkn.a : dkn.J).m();
         }

         $$0.a($$2, $$1, 3);
         dre.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(drj.a $$0, dhi $$1, jh $$2, bam $$3, drj $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? bae.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(drj $$0, dhi $$1, jh $$2, bam $$3) {
      dxu $$4 = $$1.a_($$2);
      ayk<dkl> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dxu $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dxu $$9 = dkn.rn.m();
               $$1.a($$7, $$9, 3);
               dkl.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, axf.wn, axg.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : b) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dxu $$13 = $$1.a_($$12);
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

   public static boolean a(dhi $$0, dxu $$1, jh $$2) {
      if (!$$1.a(dkn.ro)) {
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
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dxu $$0, dbf $$1) {
      return !$$1.n().a(cxs.gv) || super.a($$0, $$1);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(d) ? etx.c.a(false) : super.b_($$0);
   }

   class a extends dpo.a {
      private final dpo.e[] b;

      public a(final dpo.e... $$0) {
         super(drk.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dgm $$0, jh $$1, jh $$2, jm $$3, dxu $$4) {
         dxu $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dkn.rn) && !$$5.a(dkn.rp) && !$$5.a(dkn.bX)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            etw $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(etx.c)) {
               return false;
            } else {
               return $$4.a(axu.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dpo.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dxu $$0) {
         return !$$0.a(dkn.ro);
      }
   }
}
