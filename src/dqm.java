import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dqm extends doo implements dqg {
   public static final MapCodec<dqm> e = b(dqm::new);
   private final dop f = new dop(new dqm.a(dop.a));
   private final dop g = new dop(new dqm.a(dop.e.a));

   @Override
   public MapCodec<dqm> a() {
      return e;
   }

   public dqm(dwv.d $$0) {
      super($$0);
   }

   @Override
   public dop c() {
      return this.f;
   }

   public dop q() {
      return this.g;
   }

   public static boolean a(dgi $$0, ji $$1, dww $$2, Collection<jn> $$3) {
      boolean $$4 = false;
      dww $$5 = djn.rv.m();

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
            $$5 = $$5.b(don.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dgi $$0, dww $$1, ji $$2, azh $$3) {
      if ($$1.a(this)) {
         for (jn $$4 : d) {
            dxn $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(djn.ru)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            esy $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? djn.a : djn.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqg.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dql.a $$0, dgi $$1, ji $$2, azh $$3, dql $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dql $$0, dgi $$1, ji $$2, azh $$3) {
      dww $$4 = $$1.a_($$2);
      axf<djl> $$5 = $$0.c();

      for (jn $$6 : jn.a($$3)) {
         if (a($$4, $$6)) {
            ji $$7 = $$2.a($$6);
            dww $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dww $$9 = djn.ru.m();
               $$1.a($$7, $$9, 3);
               djl.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awa.wt, awb.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jn $$10 = $$6.g();

               for (jn $$11 : d) {
                  if ($$11 != $$10) {
                     ji $$12 = $$7.a($$11);
                     dww $$13 = $$1.a_($$12);
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

   public static boolean a(dgi $$0, dww $$1, ji $$2) {
      if (!$$1.a(djn.rv)) {
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

   class a extends dop.a {
      private final dop.e[] b;

      public a(final dop.e... $$0) {
         super(dqm.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dfm $$0, ji $$1, ji $$2, jn $$3, dww $$4) {
         dww $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(djn.ru) && !$$5.a(djn.rw) && !$$5.a(djn.bX)) {
            if ($$1.k($$2) == 2) {
               ji $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            esy $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(esz.c)) {
               return false;
            } else {
               return $$4.a(awp.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dop.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dww $$0) {
         return !$$0.a(djn.rv);
      }
   }
}
