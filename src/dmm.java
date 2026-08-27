import com.mojang.serialization.MapCodec;
import java.util.Collection;

public class dmm extends dkh implements dmg, dmr {
   public static final MapCodec<dmm> c = b(dmm::new);
   private static final dtt d = dts.C;
   private final dki e = new dki(new dmm.a(dki.a));
   private final dki f = new dki(new dmm.a(dki.e.a));

   @Override
   public MapCodec<dmm> a() {
      return c;
   }

   public dmm(dtb.d $$0) {
      super($$0);
      this.k(this.n().a(d, Boolean.valueOf(false)));
   }

   @Override
   public dki c() {
      return this.e;
   }

   public dki k() {
      return this.f;
   }

   public static boolean a(dcb $$0, ir $$1, dtc $$2, Collection<iw> $$3) {
      boolean $$4 = false;
      dtc $$5 = dfe.se.n();

      for (iw $$6 : $$3) {
         ir $$7 = $$1.a($$6);
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
   public void a(dcb $$0, dtc $$1, ir $$2, ayt $$3) {
      if ($$1.a(this)) {
         for (iw $$4 : b) {
            dtt $$5 = b($$4);
            if ($$1.c($$5) && $$0.a_($$2.a($$4)).a(dfe.sd)) {
               $$1 = $$1.a($$5, Boolean.valueOf(false));
            }
         }

         if (!n($$1)) {
            epe $$6 = $$0.b_($$2);
            $$1 = ($$6.c() ? dfe.a : dfe.al).n();
         }

         $$0.a($$2, $$1, 3);
         dmg.super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public int a(dml.a $$0, dcb $$1, ir $$2, ayt $$3, dml $$4, boolean $$5) {
      if ($$5 && this.a($$4, $$1, $$0.a(), $$3)) {
         return $$0.b() - 1;
      } else {
         return $$3.a($$4.f()) == 0 ? aym.d((float)$$0.b() * 0.5F) : $$0.b();
      }
   }

   private boolean a(dml $$0, dcb $$1, ir $$2, ayt $$3) {
      dtc $$4 = $$1.a_($$2);
      awt<dfc> $$5 = $$0.c();

      for (iw $$6 : iw.a($$3)) {
         if (a($$4, $$6)) {
            ir $$7 = $$2.a($$6);
            dtc $$8 = $$1.a_($$7);
            if ($$8.a($$5)) {
               dtc $$9 = dfe.sd.n();
               $$1.a($$7, $$9, 3);
               dfc.a($$8, $$9, $$1, $$7);
               $$1.a(null, $$7, avo.wo, avq.e, 1.0F, 1.0F);
               this.e.a($$9, $$1, $$7, $$0.h());
               iw $$10 = $$6.g();

               for (iw $$11 : b) {
                  if ($$11 != $$10) {
                     ir $$12 = $$7.a($$11);
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

   public static boolean a(dcb $$0, dtc $$1, ir $$2) {
      if (!$$1.a(dfe.se)) {
         return false;
      } else {
         for (iw $$3 : b) {
            if (a($$1, $$3) && $$0.a_($$2.a($$3)).a(awe.bV)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      super.a($$0);
      $$0.a(d);
   }

   @Override
   protected boolean a(dtc $$0, cyd $$1) {
      return !$$1.n().a(cuk.hv) || super.a($$0, $$1);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(d) ? epf.c.a(false) : super.b_($$0);
   }

   class a extends dki.a {
      private final dki.e[] c;

      public a(dki.e... $$0) {
         super(dmm.this);
         this.c = $$0;
      }

      @Override
      public boolean a(dbg $$0, ir $$1, ir $$2, iw $$3, dtc $$4) {
         dtc $$5 = $$0.a_($$2.a($$3));
         if (!$$5.a(dfe.sd) && !$$5.a(dfe.sf) && !$$5.a(dfe.cA)) {
            if ($$1.k($$2) == 2) {
               ir $$6 = $$1.a($$3.g());
               if ($$0.a_($$6).d($$0, $$6, $$3)) {
                  return false;
               }
            }

            epe $$7 = $$4.u();
            if (!$$7.c() && !$$7.b(epf.c)) {
               return false;
            } else {
               return $$4.a(awe.aM) ? false : $$4.r() || super.a($$0, $$1, $$2, $$3, $$4);
            }
         } else {
            return false;
         }
      }

      @Override
      public dki.e[] a() {
         return this.c;
      }

      @Override
      public boolean a(dtc $$0) {
         return !$$0.a(dfe.se);
      }
   }
}
