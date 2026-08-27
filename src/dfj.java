import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dfj extends ddn implements dfd, dfo {
   public static final MapCodec<dfj> c = b(dfj::new);
   private static final dlw d = dlv.C;
   private final ddo e = new ddo(new dfj.a(ddo.a));
   private final ddo f = new ddo(new dfj.a(ddo.e.a));

   @Override
   public MapCodec<dfj> a() {
      return c;
   }

   public dfj(dle.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public ddo c() {
      return this.e;
   }

   public ddo g() {
      return this.f;
   }

   public static boolean a(cvo $$0, hz $$1, dlf $$2, Collection<ie> $$3) {
      boolean $$4 = false;
      dlf $$5 = cyq.qT.o();

      for (ie $$6 : $$3) {
         hz $$7 = $$1.a($$6);
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
   public void a(cvo $$0, dlf $$1, hz $$2, awo $$3) {
      if ($$1.a(this)) {
         for (ie $$4 : b) {
            dlw $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cyq.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            egp $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cyq.a : cyq.G).o();
         }

         $$0.a($$2, $$1, 3);
         dfd.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dfi.a $$0, cvo $$1, hz $$2, awo $$3, dfi $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? awh.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dfi $$0, cvo $$1, hz $$2, awo $$3) {
      dlf $$4 = $$1.a_($$2);
      auo<cyo> $$5 = $$0.c();

      for (ie $$6 : ie.a($$3)) {
         if (a($$4, $$6)) {
            hz $$7 = $$2.a($$6);
            dlf $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dlf $$9 = cyq.qS.o();
               $$1.a($$7, $$9, 3);
               cyo.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, atk.vl, atl.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ie $$10 = $$6.g();

               for (ie $$11 : b) {
                  if ($$11 != $$10) {
                     hz $$12 = $$7.a($$11);
                     dlf $$13 = $$1.a_($$12);
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

   public static boolean a(cvo $$0, dlf $$1, hz $$2) {
      if (!$$1.a(cyq.qT)) {
         return false;
      } else {
         for (ie $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(atz.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dlf $$0, crg $$1) {
      return !$$1.n().a(cpc.gh) || super.a($$0, $$1);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }

   class a extends ddo.a {
      private final ddo.e[] c;

      public a(ddo.e... $$0) {
         super(dfj.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cut $$0, hz $$1, hz $$2, ie $$3, dlf $$4) {
         dlf $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cyq.qS) && !$$5.a(cyq.qU) && !$$5.a(cyq.bQ)) {
            if ($$1.k($$2) == 2) {
               hz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            egp $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(egq.c)) {
               return false;
            } else {
               return $$4.a(atz.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public ddo.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dlf $$0) {
         return !$$0.a(cyq.qT);
      }
   }
}
