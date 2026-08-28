import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dqo extends doq implements dqi {
   public static final MapCodec<dqo> e = b(dqo::new);
   private final dor f = new dor(new dqo.a(dor.a));
   private final dor g = new dor(new dqo.a(dor.e.a));

   @Override
   public MapCodec<dqo> a() {
      return e;
   }

   public dqo(dwx.d $$0) {
      super($$0);
   }

   @Override
   public dor c() {
      return this.f;
   }

   public dor q() {
      return this.g;
   }

   public static boolean a(dgk $$0, ji $$1, dwy $$2, Collection<jn> $$3) {
      boolean $$4 = false;
      dwy $$5 = djp.rv.m();

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
            $$5 = $$5.b(dop.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dgk $$0, dwy $$1, ji $$2, azh $$3) {
      if ($$1.a(this)) {
         for (jn $$4 : d) {
            dxp $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(djp.ru)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            eta $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? djp.a : djp.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqi.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dqn.a $$0, dgk $$1, ji $$2, azh $$3, dqn $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dqn $$0, dgk $$1, ji $$2, azh $$3) {
      dwy $$4 = $$1.a_($$2);
      axf<djn> $$5 = $$0.c();

      for (jn $$6 : jn.a($$3)) {
         if (a($$4, $$6)) {
            ji $$7 = $$2.a($$6);
            dwy $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dwy $$9 = djp.ru.m();
               $$1.a($$7, $$9, 3);
               djn.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awa.wt, awb.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jn $$10 = $$6.g();

               for (jn $$11 : d) {
                  if ($$11 != $$10) {
                     ji $$12 = $$7.a($$11);
                     dwy $$13 = $$1.a_($$12);
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

   public static boolean a(dgk $$0, dwy $$1, ji $$2) {
      if (!$$1.a(djp.rv)) {
         return false;
      } else {
         for (jn $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awp.bU)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dor.a {
      private final dor.e[] b;

      public a(final dor.e... $$0) {
         super(dqo.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dfo $$0, ji $$1, ji $$2, jn $$3, dwy $$4) {
         dwy $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(djp.ru) && !$$5.a(djp.rw) && !$$5.a(djp.bX)) {
            if ($$1.k($$2) == 2) {
               ji $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            eta $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(etb.c)) {
               return false;
            } else {
               return $$4.a(awp.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dor.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dwy $$0) {
         return !$$0.a(djp.rv);
      }
   }
}
