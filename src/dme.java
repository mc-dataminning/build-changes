import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dme extends dki implements dly, dmj {
   public static final MapCodec<dme> c = b(dme::new);
   private static final dtc d = dtb.C;
   private final dkj e = new dkj(new dme.a(dkj.a));
   private final dkj f = new dkj(new dme.a(dkj.e.a));

   @Override
   public MapCodec<dme> a() {
      return c;
   }

   public dme(dsk.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dkj c() {
      return this.e;
   }

   public dkj m() {
      return this.f;
   }

   public static boolean a(dch $$0, ja $$1, dsl $$2, Collection<jf> $$3) {
      boolean $$4 = false;
      dsl $$5 = dfk.qT.o();

      for (jf $$6 : $$3) {
         ja $$7 = $$1.a($$6);
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
   public void a(dch $$0, dsl $$1, ja $$2, ayo $$3) {
      if ($$1.a(this)) {
         for (jf $$4 : b) {
            dtc $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfk.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eoj $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfk.a : dfk.G).o();
         }

         $$0.a($$2, $$1, 3);
         dly.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dmd.a $$0, dch $$1, ja $$2, ayo $$3, dmd $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayg.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dmd $$0, dch $$1, ja $$2, ayo $$3) {
      dsl $$4 = $$1.a_($$2);
      awm<dfi> $$5 = $$0.c();

      for (jf $$6 : jf.a($$3)) {
         if (a($$4, $$6)) {
            ja $$7 = $$2.a($$6);
            dsl $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dsl $$9 = dfk.qS.o();
               $$1.a($$7, $$9, 3);
               dfi.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avh.vT, avi.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jf $$10 = $$6.g();

               for (jf $$11 : b) {
                  if ($$11 != $$10) {
                     ja $$12 = $$7.a($$11);
                     dsl $$13 = $$1.a_($$12);
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

   public static boolean a(dch $$0, dsl $$1, ja $$2) {
      if (!$$1.a(dfk.qT)) {
         return false;
      } else {
         for (jf $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avw.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dsl $$0, cxn $$1) {
      return !$$1.n().a(cug.gi) || super.a($$0, $$1);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(d) ? eok.c.a(false) : super.b_($$0);
   }

   class a extends dkj.a {
      private final dkj.e[] b;

      public a(final dkj.e... $$0) {
         super(dme.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbm $$0, ja $$1, ja $$2, jf $$3, dsl $$4) {
         dsl $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfk.qS) && !$$5.a(dfk.qU) && !$$5.a(dfk.bQ)) {
            if ($$1.k($$2) == 2) {
               ja $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eoj $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eok.c)) {
               return false;
            } else {
               return $$4.a(avw.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dkj.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dsl $$0) {
         return !$$0.a(dfk.qT);
      }
   }
}
