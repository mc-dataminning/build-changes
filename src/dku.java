import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dku extends diy implements dko, dkz {
   public static final MapCodec<dku> c = b(dku::new);
   private static final drs d = drr.C;
   private final diz e = new diz(new dku.a(diz.a));
   private final diz f = new diz(new dku.a(diz.e.a));

   @Override
   public MapCodec<dku> a() {
      return c;
   }

   public dku(dra.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public diz c() {
      return this.e;
   }

   public diz l() {
      return this.f;
   }

   public static boolean a(day $$0, io $$1, drb $$2, Collection<it> $$3) {
      boolean $$4 = false;
      drb $$5 = dea.qT.n();

      for (it $$6 : $$3) {
         io $$7 = $$1.a($$6);
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
   public void a(day $$0, drb $$1, io $$2, ayk $$3) {
      if ($$1.a(this)) {
         for (it $$4 : b) {
            drs $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dea.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            emu $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dea.a : dea.G).n();
         }

         $$0.a($$2, $$1, 3);
         dko.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dkt.a $$0, day $$1, io $$2, ayk $$3, dkt $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayd.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dkt $$0, day $$1, io $$2, ayk $$3) {
      drb $$4 = $$1.a_($$2);
      awl<ddy> $$5 = $$0.c();

      for (it $$6 : it.a($$3)) {
         if (a($$4, $$6)) {
            io $$7 = $$2.a($$6);
            drb $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               drb $$9 = dea.qS.n();
               $$1.a($$7, $$9, 3);
               ddy.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avh.vQ, avi.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               it $$10 = $$6.g();

               for (it $$11 : b) {
                  if ($$11 != $$10) {
                     io $$12 = $$7.a($$11);
                     drb $$13 = $$1.a_($$12);
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

   public static boolean a(day $$0, drb $$1, io $$2) {
      if (!$$1.a(dea.qT)) {
         return false;
      } else {
         for (it $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avw.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(drb $$0, cwz $$1) {
      return !$$1.n().a(ctr.gi) || super.a($$0, $$1);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }

   class a extends diz.a {
      private final diz.e[] c;

      public a(diz.e... $$0) {
         super(dku.this);
         this.c = $$0;
      }

      @Override
      public boolean a(dad $$0, io $$1, io $$2, it $$3, drb $$4) {
         drb $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dea.qS) && !$$5.a(dea.qU) && !$$5.a(dea.bQ)) {
            if ($$1.k($$2) == 2) {
               io $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            emu $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(emv.c)) {
               return false;
            } else {
               return $$4.a(avw.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public diz.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(drb $$0) {
         return !$$0.a(dea.qT);
      }
   }
}
