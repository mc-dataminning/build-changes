import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dre extends dpg implements dqy, drj {
   public static final MapCodec<dre> d = b(dre::new);
   private static final dyf e = dye.J;
   private final dph f = new dph(new dre.a(dph.a));
   private final dph g = new dph(new dre.a(dph.e.a));

   @Override
   public MapCodec<dre> a() {
      return d;
   }

   public dre(dxn.d $$0) {
      super($$0);
      this.l(this.m().b(e, Boolean.valueOf(false)));
   }

   @Override
   public dph c() {
      return this.f;
   }

   public dph q() {
      return this.g;
   }

   public static boolean a(dha $$0, jh $$1, dxo $$2, Collection<jm> $$3) {
      boolean $$4 = false;
      dxo $$5 = dkf.rv.m();

      for (jm $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(e, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dha $$0, dxo $$1, jh $$2, bac $$3) {
      if ($$1.a(this)) {
         for (jm $$4 : c) {
            dyf $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dkf.ru)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            etq $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dkf.a : dkf.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqy.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(drd.a $$0, dha $$1, jh $$2, bac $$3, drd $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azu.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(drd $$0, dha $$1, jh $$2, bac $$3) {
      dxo $$4 = $$1.a_($$2);
      aya<dkd> $$5 = $$0.c();

      for (jm $$6 : jm.a($$3)) {
         if (a($$4, $$6)) {
            jh $$7 = $$2.a($$6);
            dxo $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dxo $$9 = dkf.ru.m();
               $$1.a($$7, $$9, 3);
               dkd.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awv.wt, aww.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jm $$10 = $$6.g();

               for (jm $$11 : c) {
                  if ($$11 != $$10) {
                     jh $$12 = $$7.a($$11);
                     dxo $$13 = $$1.a_($$12);
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

   public static boolean a(dha $$0, dxo $$1, jh $$2) {
      if (!$$1.a(dkf.rv)) {
         return false;
      } else {
         for (jm $$3 : c) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axk.bU)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      return !$$1.n().a(cxk.gE) || super.a($$0, $$1);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(e) ? etr.c.a(false) : super.b_($$0);
   }

   class a extends dph.a {
      private final dph.e[] b;

      public a(final dph.e... $$0) {
         super(dre.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dge $$0, jh $$1, jh $$2, jm $$3, dxo $$4) {
         dxo $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dkf.ru) && !$$5.a(dkf.rw) && !$$5.a(dkf.bX)) {
            if ($$1.k($$2) == 2) {
               jh $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            etq $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(etr.c)) {
               return false;
            } else {
               return $$4.a(axk.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dph.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dxo $$0) {
         return !$$0.a(dkf.rv);
      }
   }
}
