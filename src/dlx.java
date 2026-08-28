import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dlx extends dkb implements dlr, dmc {
   public static final MapCodec<dlx> c = b(dlx::new);
   private static final dsv d = dsu.C;
   private final dkc e = new dkc(new dlx.a(dkc.a));
   private final dkc f = new dkc(new dlx.a(dkc.e.a));

   @Override
   public MapCodec<dlx> a() {
      return c;
   }

   public dlx(dsd.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dkc c() {
      return this.e;
   }

   public dkc m() {
      return this.f;
   }

   public static boolean a(dcb $$0, iz $$1, dse $$2, Collection<je> $$3) {
      boolean $$4 = false;
      dse $$5 = dfd.qT.o();

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
   public void a(dcb $$0, dse $$1, iz $$2, azh $$3) {
      if ($$1.a(this)) {
         for (je $$4 : b) {
            dsv $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfd.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            enx $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfd.a : dfd.G).o();
         }

         $$0.a($$2, $$1, 3);
         dlr.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dlw.a $$0, dcb $$1, iz $$2, azh $$3, dlw $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayz.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dlw $$0, dcb $$1, iz $$2, azh $$3) {
      dse $$4 = $$1.a_($$2);
      axf<dfb> $$5 = $$0.c();

      for (je $$6 : je.a($$3)) {
         if (a($$4, $$6)) {
            iz $$7 = $$2.a($$6);
            dse $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dse $$9 = dfd.qS.o();
               $$1.a($$7, $$9, 3);
               dfb.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awa.vQ, awb.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               je $$10 = $$6.g();

               for (je $$11 : b) {
                  if ($$11 != $$10) {
                     iz $$12 = $$7.a($$11);
                     dse $$13 = $$1.a_($$12);
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

   public static boolean a(dcb $$0, dse $$1, iz $$2) {
      if (!$$1.a(dfd.qT)) {
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
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dse $$0, cyc $$1) {
      return !$$1.n().a(cuu.gi) || super.a($$0, $$1);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(d) ? eny.c.a(false) : super.b_($$0);
   }

   class a extends dkc.a {
      private final dkc.e[] b;

      public a(final dkc.e... $$0) {
         super(dlx.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbg $$0, iz $$1, iz $$2, je $$3, dse $$4) {
         dse $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfd.qS) && !$$5.a(dfd.qU) && !$$5.a(dfd.bQ)) {
            if ($$1.k($$2) == 2) {
               iz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            enx $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eny.c)) {
               return false;
            } else {
               return $$4.a(awp.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dkc.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dse $$0) {
         return !$$0.a(dfd.qT);
      }
   }
}
