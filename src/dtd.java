import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dtd extends drg implements dsx {
   public static final MapCodec<dtd> e = b(dtd::new);
   private final drh f = new drh(new dtd.a(drh.a));
   private final drh g = new drh(new dtd.a(drh.e.a));

   @Override
   public MapCodec<dtd> a() {
      return e;
   }

   public dtd(dzy.d $$0) {
      super($$0);
   }

   @Override
   public drh c() {
      return this.f;
   }

   public drh q() {
      return this.g;
   }

   public static boolean a(diw $$0, iu $$1, dzz $$2, Collection<ja> $$3) {
      boolean $$4 = false;
      dzz $$5 = dmc.ry.m();

      for (ja $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(drf.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(diw $$0, dzz $$1, iu $$2, azv $$3) {
      if ($$1.a(this)) {
         for (ja $$4 : d) {
            eaq $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dmc.rx)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            ewg $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dmc.a : dmc.J).m();
         }

         $$0.a($$2, $$1, 3);
         dsx.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dtc.a $$0, diw $$1, iu $$2, azv $$3, dtc $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dtc $$0, diw $$1, iu $$2, azv $$3) {
      dzz $$4 = $$1.a_($$2);
      axr<dma> $$5 = $$0.c();

      for (ja $$6 : ja.a($$3)) {
         if (a($$4, $$6)) {
            iu $$7 = $$2.a($$6);
            dzz $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dzz $$9 = dmc.rx.m();
               $$1.a($$7, $$9, 3);
               dma.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awn.wG, awo.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               ja $$10 = $$6.g();

               for (ja $$11 : d) {
                  if ($$11 != $$10) {
                     iu $$12 = $$7.a($$11);
                     dzz $$13 = $$1.a_($$12);
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

   public static boolean a(diw $$0, dzz $$1, iu $$2) {
      if (!$$1.a(dmc.ry)) {
         return false;
      } else {
         for (ja $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(axc.bV)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends drh.a {
      private final drh.e[] b;

      public a(final drh.e... $$0) {
         super(dtd.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dib $$0, iu $$1, iu $$2, ja $$3, dzz $$4) {
         dzz $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dmc.rx) && !$$5.a(dmc.rz) && !$$5.a(dmc.bY)) {
            if ($$1.k($$2) == 2) {
               iu $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            ewg $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(ewh.c)) {
               return false;
            } else {
               return $$4.a(axc.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public drh.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dzz $$0) {
         return !$$0.a(dmc.ry);
      }
   }
}
