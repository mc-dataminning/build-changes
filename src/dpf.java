import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dpf extends dni implements doz, dpk {
   public static final MapCodec<dpf> c = b(dpf::new);
   private static final dwf d = dwe.C;
   private final dnj e = new dnj(new dpf.a(dnj.a));
   private final dnj f = new dnj(new dpf.a(dnj.e.a));

   @Override
   public MapCodec<dpf> a() {
      return c;
   }

   public dpf(dvn.d $$0) {
      super($$0);
      this.l(this.m().b(d, Boolean.valueOf(false)));
   }

   @Override
   public dnj c() {
      return this.e;
   }

   public dnj q() {
      return this.f;
   }

   public static boolean a(dfg $$0, jh $$1, dvo $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dvo $$5 = dil.qT.m();

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
   public void a(dfg $$0, dvo $$1, jh $$2, azv $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : b) {
            dwf $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dil.qS)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            ero $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dil.a : dil.G).m();
         }

         $$0.a($$2, $$1, 3);
         doz.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dpe.a $$0, dfg $$1, jh $$2, azv $$3, dpe $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azn.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dpe $$0, dfg $$1, jh $$2, azv $$3) {
      dvo $$4 = $$1.a_($$2);
      axt<dij> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dvo $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dvo $$9 = dil.qS.m();
               $$1.a($$7, $$9, 3);
               dij.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awo.vS, awp.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : b) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dvo $$13 = $$1.a_($$12);
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

   public static boolean a(dfg $$0, dvo $$1, jh $$2) {
      if (!$$1.a(dil.qT)) {
         return false;
      } else {
         for (jm $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axd.bT)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dvo $$0, czw $$1) {
      return !$$1.n().a(cwj.gi) || super.a($$0, $$1);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(d) ? erp.c.a(false) : super.b_($$0);
   }

   class a extends dnj.a {
      private final dnj.e[] b;

      public a(final dnj.e... $$0) {
         super(dpf.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dek $$0, jh $$1, jh $$2, jm $$3, dvo $$4) {
         dvo $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dil.qS) && !$$5.a(dil.qU) && !$$5.a(dil.bQ)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            ero $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(erp.c)) {
               return false;
            } else {
               return $$4.a(axd.aM) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dnj.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dvo $$0) {
         return !$$0.a(dil.qT);
      }
   }
}
