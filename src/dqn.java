import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dqn extends dop implements dqh, dqs {
   public static final MapCodec<dqn> d = b(dqn::new);
   private static final dxo e = dxn.J;
   private final doq f = new doq(new dqn.a(doq.a));
   private final doq g = new doq(new dqn.a(doq.e.a));

   @Override
   public MapCodec<dqn> a() {
      return d;
   }

   public dqn(dww.d $$0) {
      super($$0);
      this.l(this.m().b(e, Boolean.valueOf(false)));
   }

   @Override
   public doq c() {
      return this.f;
   }

   public doq q() {
      return this.g;
   }

   public static boolean a(dgj $$0, ji $$1, dwx $$2, Collection<jn> $$3) {
      boolean $$4 = false;
      dwx $$5 = djo.rv.m();

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
            $$5 = $$5.b(e, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dgj $$0, dwx $$1, ji $$2, azh $$3) {
      if ($$1.a(this)) {
         for (jn $$4 : c) {
            dxo $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(djo.ru)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            esz $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? djo.a : djo.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqh.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dqm.a $$0, dgj $$1, ji $$2, azh $$3, dqm $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dqm $$0, dgj $$1, ji $$2, azh $$3) {
      dwx $$4 = $$1.a_($$2);
      axf<djm> $$5 = $$0.c();

      for (jn $$6 : jn.a($$3)) {
         if (a($$4, $$6)) {
            ji $$7 = $$2.a($$6);
            dwx $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dwx $$9 = djo.ru.m();
               $$1.a($$7, $$9, 3);
               djm.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awa.wt, awb.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jn $$10 = $$6.g();

               for (jn $$11 : c) {
                  if ($$11 != $$10) {
                     ji $$12 = $$7.a($$11);
                     dwx $$13 = $$1.a_($$12);
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

   public static boolean a(dgj $$0, dwx $$1, ji $$2) {
      if (!$$1.a(djo.rv)) {
         return false;
      } else {
         for (jn $$3 : c) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awp.bU)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      super.a($$0);
      $$0.a(e);
   }

   @Override
   protected boolean a(dwx $$0, dag $$1) {
      return !$$1.n().a(cwt.gE) || super.a($$0, $$1);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(e) ? eta.c.a(false) : super.b_($$0);
   }

   class a extends doq.a {
      private final doq.e[] b;

      public a(final doq.e... $$0) {
         super(dqn.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dfn $$0, ji $$1, ji $$2, jn $$3, dwx $$4) {
         dwx $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(djo.ru) && !$$5.a(djo.rw) && !$$5.a(djo.bX)) {
            if ($$1.k($$2) == 2) {
               ji $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            esz $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(eta.c)) {
               return false;
            } else {
               return $$4.a(awp.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public doq.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dwx $$0) {
         return !$$0.a(djo.rv);
      }
   }
}
