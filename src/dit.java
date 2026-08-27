import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dit extends dgx implements din, diy {
   public static final MapCodec<dit> c = b(dit::new);
   private static final dpq d = dpp.C;
   private final dgy e = new dgy(new dit.a(dgy.a));
   private final dgy f = new dgy(new dit.a(dgy.e.a));

   @Override
   public MapCodec<dit> a() {
      return c;
   }

   public dit(doy.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dgy c() {
      return this.e;
   }

   public dgy k() {
      return this.f;
   }

   public static boolean a(cyy $$0, ib $$1, doz $$2, Collection<ih> $$3) {
      boolean $$4 = false;
      doz $$5 = dca.qT.n();

      for (ih $$6 : $$3) {
         ib $$7 = $$1.a($$6);
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
   public void a(cyy $$0, doz $$1, ib $$2, axr $$3) {
      if ($$1.a(this)) {
         for (ih $$4 : b) {
            dpq $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dca.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eks $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dca.a : dca.G).n();
         }

         $$0.a($$2, $$1, 3);
         din.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dis.a $$0, cyy $$1, ib $$2, axr $$3, dis $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? axk.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dis $$0, cyy $$1, ib $$2, axr $$3) {
      doz $$4 = $$1.a_($$2);
      avr<dby> $$5 = $$0.c();

      for (ih $$6 : ih.a($$3)) {
         if (a($$4, $$6)) {
            ib $$7 = $$2.a($$6);
            doz $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               doz $$9 = dca.qS.n();
               $$1.a($$7, $$9, 3);
               dby.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, aum.vx, aun.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ih $$10 = $$6.g();

               for (ih $$11 : b) {
                  if ($$11 != $$10) {
                     ib $$12 = $$7.a($$11);
                     doz $$13 = $$1.a_($$12);
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

   public static boolean a(cyy $$0, doz $$1, ib $$2) {
      if (!$$1.a(dca.qT)) {
         return false;
      } else {
         for (ih $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avc.bM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ekt.c, ekt.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      return !$$1.n().a(crm.gh) || super.a($$0, $$1);
   }

   @Override
   protected eks c_(doz $$0) {
      return $$0.c(d) ? ekt.c.a(false) : super.c_($$0);
   }

   class a extends dgy.a {
      private final dgy.e[] c;

      public a(dgy.e... $$0) {
         super(dit.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cyd $$0, ib $$1, ib $$2, ih $$3, doz $$4) {
         doz $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dca.qS) && !$$5.a(dca.qU) && !$$5.a(dca.bQ)) {
            if ($$1.k($$2) == 2) {
               ib $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eks $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ekt.c)) {
               return false;
            } else {
               return $$4.a(avc.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dgy.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(doz $$0) {
         return !$$0.a(dca.qT);
      }
   }
}
