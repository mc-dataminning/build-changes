import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dlu extends djy implements dlo, dlz {
   public static final MapCodec<dlu> c = b(dlu::new);
   private static final dss d = dsr.C;
   private final djz e = new djz(new dlu.a(djz.a));
   private final djz f = new djz(new dlu.a(djz.e.a));

   @Override
   public MapCodec<dlu> a() {
      return c;
   }

   public dlu(dsa.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public djz c() {
      return this.e;
   }

   public djz m() {
      return this.f;
   }

   public static boolean a(dby $$0, iz $$1, dsb $$2, Collection<je> $$3) {
      boolean $$4 = false;
      dsb $$5 = dfa.qT.o();

      for (je $$6 : $$3) {
         iz $$7 = $$1.a($$6);
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
   public void a(dby $$0, dsb $$1, iz $$2, azg $$3) {
      if ($$1.a(this)) {
         for (je $$4 : b) {
            dss $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfa.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            enu $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfa.a : dfa.G).o();
         }

         $$0.a($$2, $$1, 3);
         dlo.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dlt.a $$0, dby $$1, iz $$2, azg $$3, dlt $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayy.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dlt $$0, dby $$1, iz $$2, azg $$3) {
      dsb $$4 = $$1.a_($$2);
      axe<dey> $$5 = $$0.c();

      for (je $$6 : je.a($$3)) {
         if (a($$4, $$6)) {
            iz $$7 = $$2.a($$6);
            dsb $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dsb $$9 = dfa.qS.o();
               $$1.a($$7, $$9, 3);
               dey.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avz.vQ, awa.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               je $$10 = $$6.g();

               for (je $$11 : b) {
                  if ($$11 != $$10) {
                     iz $$12 = $$7.a($$11);
                     dsb $$13 = $$1.a_($$12);
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

   public static boolean a(dby $$0, dsb $$1, iz $$2) {
      if (!$$1.a(dfa.qT)) {
         return false;
      } else {
         for (je $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awo.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dsb $$0, cxz $$1) {
      return !$$1.n().a(cur.gi) || super.a($$0, $$1);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(d) ? env.c.a(false) : super.b_($$0);
   }

   class a extends djz.a {
      private final djz.e[] b;

      public a(final djz.e... $$0) {
         super(dlu.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbd $$0, iz $$1, iz $$2, je $$3, dsb $$4) {
         dsb $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfa.qS) && !$$5.a(dfa.qU) && !$$5.a(dfa.bQ)) {
            if ($$1.k($$2) == 2) {
               iz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            enu $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(env.c)) {
               return false;
            } else {
               return $$4.a(awo.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public djz.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dsb $$0) {
         return !$$0.a(dfa.qT);
      }
   }
}
