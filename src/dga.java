import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dga extends dee implements dfu, dgf {
   public static final MapCodec<dga> c = b(dga::new);
   private static final dmv d = dmu.C;
   private final def e = new def(new dga.a(def.a));
   private final def f = new def(new dga.a(def.e.a));

   @Override
   public MapCodec<dga> a() {
      return c;
   }

   public dga(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public def c() {
      return this.e;
   }

   public def i() {
      return this.f;
   }

   public static boolean a(cwf $$0, ib $$1, dme $$2, Collection<ih> $$3) {
      boolean $$4 = false;
      dme $$5 = czh.qT.o();

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
   public void a(cwf $$0, dme $$1, ib $$2, awt $$3) {
      if ($$1.a(this)) {
         for (ih $$4 : b) {
            dmv $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(czh.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            ehr $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? czh.a : czh.G).o();
         }

         $$0.a($$2, $$1, 3);
         dfu.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dfz.a $$0, cwf $$1, ib $$2, awt $$3, dfz $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? awm.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dfz $$0, cwf $$1, ib $$2, awt $$3) {
      dme $$4 = $$1.a_($$2);
      aut<czf> $$5 = $$0.c();

      for (ih $$6 : ih.a($$3)) {
         if (a($$4, $$6)) {
            ib $$7 = $$2.a($$6);
            dme $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dme $$9 = czh.qS.o();
               $$1.a($$7, $$9, 3);
               czf.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, atp.vm, atq.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ih $$10 = $$6.g();

               for (ih $$11 : b) {
                  if ($$11 != $$10) {
                     ib $$12 = $$7.a($$11);
                     dme $$13 = $$1.a_($$12);
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

   public static boolean a(cwf $$0, dme $$1, ib $$2) {
      if (!$$1.a(czh.qT)) {
         return false;
      } else {
         for (ih $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(aue.bL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      return !$$1.n().a(cpt.gh) || super.a($$0, $$1);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }

   class a extends def.a {
      private final def.e[] c;

      public a(def.e... $$0) {
         super(dga.this);
         this.c = $$0;
      }

      @Override
      public boolean a(cvk $$0, ib $$1, ib $$2, ih $$3, dme $$4) {
         dme $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(czh.qS) && !$$5.a(czh.qU) && !$$5.a(czh.bQ)) {
            if ($$1.k($$2) == 2) {
               ib $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            ehr $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(ehs.c)) {
               return false;
            } else {
               return $$4.a(aue.aJ) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public def.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dme $$0) {
         return !$$0.a(czh.qT);
      }
   }
}
