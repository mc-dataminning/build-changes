import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class drf extends dpj implements dqz {
   public static final MapCodec<drf> e = b(drf::new);
   private final dpk f = new dpk(new drf.a(dpk.a));
   private final dpk g = new dpk(new drf.a(dpk.e.a));

   @Override
   public MapCodec<drf> a() {
      return e;
   }

   public drf(dxp.d $$0) {
      super($$0);
   }

   @Override
   public dpk c() {
      return this.f;
   }

   public dpk q() {
      return this.g;
   }

   public static boolean a(dha $$0, ji $$1, dxq $$2, Collection<jn> $$3) {
      boolean $$4 = false;
      dxq $$5 = dkg.rv.m();

      for (jn $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(dpi.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dha $$0, dxq $$1, ji $$2, azh $$3) {
      if ($$1.a(this)) {
         for (jn $$4 : d) {
            dyh $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dkg.ru)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            etw $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dkg.a : dkg.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqz.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dre.a $$0, dha $$1, ji $$2, azh $$3, dre $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dre $$0, dha $$1, ji $$2, azh $$3) {
      dxq $$4 = $$1.a_($$2);
      axf<dke> $$5 = $$0.c();

      for (jn $$6 : jn.a($$3)) {
         if (a($$4, $$6)) {
            ji $$7 = $$2.a($$6);
            dxq $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dxq $$9 = dkg.ru.m();
               $$1.a($$7, $$9, 3);
               dke.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awa.wD, awb.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jn $$10 = $$6.g();

               for (jn $$11 : d) {
                  if ($$11 != $$10) {
                     ji $$12 = $$7.a($$11);
                     dxq $$13 = $$1.a_($$12);
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

   public static boolean a(dha $$0, dxq $$1, ji $$2) {
      if (!$$1.a(dkg.rv)) {
         return false;
      } else {
         for (jn $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awp.bV)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dpk.a {
      private final dpk.e[] b;

      public a(final dpk.e... $$0) {
         super(drf.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dgf $$0, ji $$1, ji $$2, jn $$3, dxq $$4) {
         dxq $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dkg.ru) && !$$5.a(dkg.rw) && !$$5.a(dkg.bX)) {
            if ($$1.k($$2) == 2) {
               ji $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            etw $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(etx.c)) {
               return false;
            } else {
               return $$4.a(awp.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dpk.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dxq $$0) {
         return !$$0.a(dkg.rv);
      }
   }
}
