import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class drv extends dpz implements drp {
   public static final MapCodec<drv> e = b(drv::new);
   private final dqa f = new dqa(new drv.a(dqa.a));
   private final dqa g = new dqa(new drv.a(dqa.e.a));

   @Override
   public MapCodec<drv> a() {
      return e;
   }

   public drv(dyl.d $$0) {
      super($$0);
   }

   @Override
   public dqa c() {
      return this.f;
   }

   public dqa q() {
      return this.g;
   }

   public static boolean a(dhq $$0, jj $$1, dym $$2, Collection<jo> $$3) {
      boolean $$4 = false;
      dym $$5 = dkw.rx.m();

      for (jo $$6 : $$3) {
         if (a($$0, $$1, $$6)) {
            $$5 = $$5.b(b($$6), Boolean.valueOf(true));
            $$4 = true;
         }
      }

      if (!$$4) {
         return false;
      } else {
         if (!$$2.y().c()) {
            $$5 = $$5.b(dpy.c, Boolean.valueOf(true));
         }

         $$0.a($$1, $$5, 3);
         return true;
      }
   }

   @Override
   public void a(dhq $$0, dym $$1, jj $$2, azs $$3) {
      if ($$1.a(this)) {
         for (jo $$4 : d) {
            dzd $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dkw.rw)) {
               $$1 = $$1.b($$5, Boolean.valueOf(false));
            }
         }

         if (!q($$1)) {
            eut $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dkw.a : dkw.J).m();
         }

         $$0.a($$2, $$1, 3);
         drp.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dru.a $$0, dhq $$1, jj $$2, azs $$3, dru $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? azk.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dru $$0, dhq $$1, jj $$2, azs $$3) {
      dym $$4 = $$1.a_($$2);
      axp<dku> $$5 = $$0.c();

      for (jo $$6 : jo.a($$3)) {
         if (a($$4, $$6)) {
            jj $$7 = $$2.a($$6);
            dym $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dym $$9 = dkw.rw.m();
               $$1.a($$7, $$9, 3);
               dku.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, awk.wD, awl.e, 1.0F, 1.0F);
               this.f.a($$9, $$1, $$7, $$0.h());
               jo $$10 = $$6.g();

               for (jo $$11 : d) {
                  if ($$11 != $$10) {
                     jj $$12 = $$7.a($$11);
                     dym $$13 = $$1.a_($$12);
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

   public static boolean a(dhq $$0, dym $$1, jj $$2) {
      if (!$$1.a(dkw.rx)) {
         return false;
      } else {
         for (jo $$3 : d) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awz.bV)) {
               return true;
            }
         }

         return false;
      }
   }

   class a extends dqa.a {
      private final dqa.e[] b;

      public a(final dqa.e... $$0) {
         super(drv.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dgv $$0, jj $$1, jj $$2, jo $$3, dym $$4) {
         dym $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dkw.rw) && !$$5.a(dkw.ry) && !$$5.a(dkw.bX)) {
            if ($$1.k($$2) == 2) {
               jj $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).c($$0, $$6, $$3)) {
                  return false;
               }
            }

            eut $$7 = $$4.y();
            if (!$$7.c() && !$$7.b(euu.c)) {
               return false;
            } else {
               return $$4.a(awz.aN) ? false : $$4.v() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dqa.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dym $$0) {
         return !$$0.a(dkw.rx);
      }
   }
}
