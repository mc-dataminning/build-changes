import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dfn extends ddr implements dfh, dfs {
   public static final MapCodec<dfn> c = b(dfn::new);
   private static final dma d = dlz.C;
   private final dds e = new dds(new dfn.a(dds.a));
   private final dds f = new dds(new dfn.a(dds.e.a));

   @Override
   public MapCodec<dfn> a() {
      return c;
   }

   public dfn(dli.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dds c() {
      return this.e;
   }

   public dds g() {
      return this.f;
   }

   public static boolean a(cvs $$0, hz $$1, dlj $$2, Collection<ie> $$3) {
      boolean $$4 = false;
      dlj $$5 = cyu.qT.o();

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
   public void a(cvs $$0, dlj $$1, hz $$2, awp $$3) {
      if ($$1.a(this)) {
         for (ie $$4 : b) {
            dma $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(cyu.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            egw $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? cyu.a : cyu.G).o();
         }

         $$0.a($$2, $$1, 3);
         dfh.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dfm.a $$0, cvs $$1, hz $$2, awp $$3, dfm $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? awi.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dfm $$0, cvs $$1, hz $$2, awp $$3) {
      dlj $$4 = $$1.a_($$2);
      aup<cys> $$5 = $$0.c();

      for (ie $$6 : ie.a($$3)) {
         if (a($$4, $$6)) {
            hz $$7 = $$2.a($$6);
            dlj $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dlj $$9 = cyu.qS.o();
               $$1.a($$7, $$9, 3);
               cys.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, atl.vm, atm.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ie $$10 = $$6.g();

               for (ie $$11 : b) {
                  if ($$11 != $$10) {
                     hz $$12 = $$7.a($$11);
                     dlj $$13 = $$1.a_($$12);
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

   public static boolean a(cvs $$0, dlj $$1, hz $$2) {
      if (!$$1.a(cyu.qT)) {
         return false;
      } else {
         for (ie $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(aua.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egx.c, egx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dlj $$0, crk $$1) {
      return !$$1.n().a(cpg.gh) || super.a($$0, $$1);
   }

   @Override
   protected egw c_(dlj $$0) {
      return $$0.c(d) ? egx.c.a(false) : super.c_($$0);
   }

   class a extends dds.a {
      private final dds.e[] c;

      public a(dds.e... $$0) {
         super(dfn.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cux $$0, hz $$1, hz $$2, ie $$3, dlj $$4) {
         dlj $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(cyu.qS) && !$$5.a(cyu.qU) && !$$5.a(cyu.bQ)) {
            if ($$1.k($$2) == 2) {
               hz $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            egw $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(egx.c)) {
               return false;
            } else {
               return $$4.a(aua.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dds.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dlj $$0) {
         return !$$0.a(cyu.qT);
      }
   }
}
