import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dmd extends dkh implements dlx, dmi {
   public static final MapCodec<dmd> c = b(dmd::new);
   private static final dtb d = dta.C;
   private final dki e = new dki(new dmd.a(dki.a));
   private final dki f = new dki(new dmd.a(dki.e.a));

   @Override
   public MapCodec<dmd> a() {
      return c;
   }

   public dmd(dsj.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dki c() {
      return this.e;
   }

   public dki m() {
      return this.f;
   }

   public static boolean a(dcg $$0, ja $$1, dsk $$2, Collection<jf> $$3) {
      boolean $$4 = false;
      dsk $$5 = dfj.qT.o();

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
   public void a(dcg $$0, dsk $$1, ja $$2, ayo $$3) {
      if ($$1.a(this)) {
         for (jf $$4 : b) {
            dtb $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfj.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eoh $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfj.a : dfj.G).o();
         }

         $$0.a($$2, $$1, 3);
         dlx.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dmc.a $$0, dcg $$1, ja $$2, ayo $$3, dmc $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayg.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dmc $$0, dcg $$1, ja $$2, ayo $$3) {
      dsk $$4 = $$1.a_($$2);
      awm<dfh> $$5 = $$0.c();

      for (jf $$6 : jf.a($$3)) {
         if (a($$4, $$6)) {
            ja $$7 = $$2.a($$6);
            dsk $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dsk $$9 = dfj.qS.o();
               $$1.a($$7, $$9, 3);
               dfh.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avh.vT, avi.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jf $$10 = $$6.g();

               for (jf $$11 : b) {
                  if ($$11 != $$10) {
                     ja $$12 = $$7.a($$11);
                     dsk $$13 = $$1.a_($$12);
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

   public static boolean a(dcg $$0, dsk $$1, ja $$2) {
      if (!$$1.a(dfj.qT)) {
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
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      return !$$1.n().a(cuf.gi) || super.a($$0, $$1);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }

   class a extends dki.a {
      private final dki.e[] b;

      public a(final dki.e... $$0) {
         super(dmd.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbl $$0, ja $$1, ja $$2, jf $$3, dsk $$4) {
         dsk $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfj.qS) && !$$5.a(dfj.qU) && !$$5.a(dfj.bQ)) {
            if ($$1.k($$2) == 2) {
               ja $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eoh $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eoi.c)) {
               return false;
            } else {
               return $$4.a(avw.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dki.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dsk $$0) {
         return !$$0.a(dfj.qT);
      }
   }
}
