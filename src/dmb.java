import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dmb extends dkf implements dlv, dmg {
   public static final MapCodec<dmb> c = b(dmb::new);
   private static final dsy d = dsx.C;
   private final dkg e = new dkg(new dmb.a(dkg.a));
   private final dkg f = new dkg(new dmb.a(dkg.e.a));

   @Override
   public MapCodec<dmb> a() {
      return c;
   }

   public dmb(dsg.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dkg c() {
      return this.e;
   }

   public dkg m() {
      return this.f;
   }

   public static boolean a(dce $$0, ja $$1, dsh $$2, Collection<jf> $$3) {
      boolean $$4 = false;
      dsh $$5 = dfh.qT.o();

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
   public void a(dce $$0, dsh $$1, ja $$2, aym $$3) {
      if ($$1.a(this)) {
         for (jf $$4 : b) {
            dsy $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfh.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            eob $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfh.a : dfh.G).o();
         }

         $$0.a($$2, $$1, 3);
         dlv.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dma.a $$0, dce $$1, ja $$2, aym $$3, dma $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aye.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dma $$0, dce $$1, ja $$2, aym $$3) {
      dsh $$4 = $$1.a_($$2);
      awk<dff> $$5 = $$0.c();

      for (jf $$6 : jf.a($$3)) {
         if (a($$4, $$6)) {
            ja $$7 = $$2.a($$6);
            dsh $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dsh $$9 = dfh.qS.o();
               $$1.a($$7, $$9, 3);
               dff.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avf.vT, avg.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               jf $$10 = $$6.g();

               for (jf $$11 : b) {
                  if ($$11 != $$10) {
                     ja $$12 = $$7.a($$11);
                     dsh $$13 = $$1.a_($$12);
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

   public static boolean a(dce $$0, dsh $$1, ja $$2) {
      if (!$$1.a(dfh.qT)) {
         return false;
      } else {
         for (jf $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(avu.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoc.c, eoc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dsh $$0, cxk $$1) {
      return !$$1.n().a(cud.gi) || super.a($$0, $$1);
   }

   @Override
   protected eob b_(dsh $$0) {
      return $$0.c(d) ? eoc.c.a(false) : super.b_($$0);
   }

   class a extends dkg.a {
      private final dkg.e[] b;

      public a(final dkg.e... $$0) {
         super(dmb.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dbj $$0, ja $$1, ja $$2, jf $$3, dsh $$4) {
         dsh $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfh.qS) && !$$5.a(dfh.qU) && !$$5.a(dfh.bQ)) {
            if ($$1.k($$2) == 2) {
               ja $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            eob $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(eoc.c)) {
               return false;
            } else {
               return $$4.a(avu.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dkg.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dsh $$0) {
         return !$$0.a(dfh.qT);
      }
   }
}
