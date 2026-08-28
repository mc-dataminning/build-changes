import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dmv extends dky implements dmp, dna {
   public static final MapCodec<dmv> c = b(dmv::new);
   private static final dtt d = dts.C;
   private final dkz e = new dkz(new dmv.a(dkz.a));
   private final dkz f = new dkz(new dmv.a(dkz.e.a));

   @Override
   public MapCodec<dmv> a() {
      return c;
   }

   public dmv(dtb.d $$0) {
      super($$0);
      this.k(this.o().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dkz c() {
      return this.e;
   }

   public dkz m() {
      return this.f;
   }

   public static boolean a(dcx $$0, jd $$1, dtc $$2, Collection<ji> $$3) {
      boolean $$4 = false;
      dtc $$5 = dga.qT.o();

      for (ji $$6 : $$3) {
         jd $$7 = $$1.a($$6);
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
   public void a(dcx $$0, dtc $$1, jd $$2, ayw $$3) {
      if ($$1.a(this)) {
         for (ji $$4 : b) {
            dtt $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dga.qS)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            epc $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dga.a : dga.G).o();
         }

         $$0.a($$2, $$1, 3);
         dmp.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dmu.a $$0, dcx $$1, jd $$2, ayw $$3, dmu $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? ayo.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dmu $$0, dcx $$1, jd $$2, ayw $$3) {
      dtc $$4 = $$1.a_($$2);
      awu<dfy> $$5 = $$0.c();

      for (ji $$6 : ji.a($$3)) {
         if (a($$4, $$6)) {
            jd $$7 = $$2.a($$6);
            dtc $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dtc $$9 = dga.qS.o();
               $$1.a($$7, $$9, 3);
               dfy.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avp.vT, avq.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               ji $$10 = $$6.g();

               for (ji $$11 : b) {
                  if ($$11 != $$10) {
                     jd $$12 = $$7.a($$11);
                     dtc $$13 = $$1.a_($$12);
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

   public static boolean a(dcx $$0, dtc $$1, jd $$2) {
      if (!$$1.a(dga.qT)) {
         return false;
      } else {
         for (ji $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awe.bS)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return !$$1.n().a(cut.gi) || super.a($$0, $$1);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(d) ? epd.c.a(false) : super.b_($$0);
   }

   class a extends dkz.a {
      private final dkz.e[] b;

      public a(final dkz.e... $$0) {
         super(dmv.this);
         this.b = $$0;
      }

      @Override
      public boolean a(dcc $$0, jd $$1, jd $$2, ji $$3, dtc $$4) {
         dtc $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dga.qS) && !$$5.a(dga.qU) && !$$5.a(dga.bQ)) {
            if ($$1.k($$2) == 2) {
               jd $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            epc $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(epd.c)) {
               return false;
            } else {
               return $$4.a(awe.aK) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dkz.e[] a() {
         return this.b;
      }

      @Override
      public boolean a(dtc $$0) {
         return !$$0.a(dga.qT);
      }
   }
}
