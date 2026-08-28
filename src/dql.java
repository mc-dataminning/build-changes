import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dql extends don implements dqf {
   public static final MapCodec<dql> e = b(dql::new);
   private final doo f = new doo(new dql.a(doo.a));
   private final doo g = new doo(new dql.a(doo.e.a));

   @Override
   public MapCodec<dql> a() {
      return e;
   }

   public dql(dwu.d $$0) {
      super($$0);
   }

   @Override
   public doo c() {
      return this.f;
   }

   public doo q() {
      return this.g;
   }

   public static boolean a(dgh $$0, ji $$1, dwv $$2, Collection<jn> $$3) {
      boolean $$4 = false;
      dwv $$5 = djm.rv.m();

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
            $$5 = $$5.b(dom.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dgh $$0, dwv $$1, ji $$2, azg $$3) {
      if ($$1.a(this)) {
         for (jn $$4 : d) {
            dxm $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(djm.ru)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            esx $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? djm.a : djm.J).m();
         }

         $$0.a($$2, $$1, 3);
         dqf.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dqk.a $$0, dgh $$1, ji $$2, azg $$3, dqk $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayy.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dqk $$0, dgh $$1, ji $$2, azg $$3) {
      dwv $$4 = $$1.a_($$2);
      axe<djk> $$5 = $$0.c();

      for (jn $$6 : jn.a($$3)) {
         if (a($$4, $$6)) {
            ji $$7 = $$2.a($$6);
            dwv $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dwv $$9 = djm.ru.m();
               $$1.a($$7, $$9, 3);
               djk.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avz.wt, awa.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jn $$10 = $$6.g();

               for (jn $$11 : d) {
                  if ($$11 != $$10) {
                     ji $$12 = $$7.a($$11);
                     dwv $$13 = $$1.a_($$12);
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

   public static boolean a(dgh $$0, dwv $$1, ji $$2) {
      if (!$$1.a(djm.rv)) {
         return false;
      } else {
         for (jn $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awo.bU)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends doo.a {
      private final doo.e[] b;

      public a(final doo.e... $$0) {
         super(dql.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dfl $$0, ji $$1, ji $$2, jn $$3, dwv $$4) {
         dwv $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(djm.ru) && !$$5.a(djm.rw) && !$$5.a(djm.bX)) {
            if ($$1.k($$2) == 2) {
               ji $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            esx $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(esy.c)) {
               return false;
            } else {
               return $$4.a(awo.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public doo.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dwv $$0) {
         return !$$0.a(djm.rv);
      }
   }
}
