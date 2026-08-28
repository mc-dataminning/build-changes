import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dlw extends dka implements dlq, dmb {
   public static final MapCodec<dlw> c = b(dlw::new);
   private static final dsu d = dst.C;
   private final dkb e = new dkb(new dlw.a(dkb.a));
   private final dkb f = new dkb(new dlw.a(dkb.e.a));

   @Override
   public MapCodec<dlw> a() {
      return c;
   }

   public dlw(dsc.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dkb c() {
      return this.e;
   }

   public dkb m() {
      return this.f;
   }

   public static boolean a(dca $$0, iz $$1, dsd $$2, Collection<je> $$3) {
      boolean $$4 = false;
      dsd $$5 = dfc.qT.o();

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
   public void a(dca $$0, dsd $$1, iz $$2, azh $$3) {
      if ($$1.a(this)) {
         for (je $$4 : b) {
            dsu $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfc.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            enw $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfc.a : dfc.G).o();
         }

         $$0.a($$2, $$1, 3);
         dlq.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dlv.a $$0, dca $$1, iz $$2, azh $$3, dlv $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dlv $$0, dca $$1, iz $$2, azh $$3) {
      dsd $$4 = $$1.a_($$2);
      axf<dfa> $$5 = $$0.c();

      for (je $$6 : je.a($$3)) {
         if (a($$4, $$6)) {
            iz $$7 = $$2.a($$6);
            dsd $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dsd $$9 = dfc.qS.o();
               $$1.a($$7, $$9, 3);
               dfa.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awa.vQ, awb.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               je $$10 = $$6.g();

               for (je $$11 : b) {
                  if ($$11 != $$10) {
                     iz $$12 = $$7.a($$11);
                     dsd $$13 = $$1.a_($$12);
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

   public static boolean a(dca $$0, dsd $$1, iz $$2) {
      if (!$$1.a(dfc.qT)) {
         return false;
      } else {
         for (je $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awp.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, enx.c, enx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      return !$$1.n().a(cut.gi) || super.a($$0, $$1);
   }

   @Override
   protected enw b_(dsd $$0) {
      return $$0.c(d) ? enx.c.a(false) : super.b_($$0);
   }

   class a extends dkb.a {
      private final dkb.e[] b;

      public a(final dkb.e... $$0) {
         super(dlw.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbf $$0, iz $$1, iz $$2, je $$3, dsd $$4) {
         dsd $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfc.qS) && !$$5.a(dfc.qU) && !$$5.a(dfc.bQ)) {
            if ($$1.k($$2) == 2) {
               iz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            enw $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(enx.c)) {
               return false;
            } else {
               return $$4.a(awp.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dkb.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dsd $$0) {
         return !$$0.a(dfc.qT);
      }
   }
}
