import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class czb extends cyr {
   public static final MapCodec<czb> a = b(czb::new);
   public static final dmy b = dda.aE;
   public static final dnc<dms> c = dmu.V;
   public static final dmv d = dmu.w;
   private static final epo f = czf.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final epo g = czf.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final epo h = czf.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final epo i = czf.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final epo j = epl.a(i, h);
   private static final epo k = epl.a(j, czf.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final epo l = epl.a(j, czf.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final epo m = epl.a(j, czf.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final epo n = epl.a(j, czf.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final epo o = epl.a(j, czf.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final epo F = epl.a(j, czf.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final epo G = epl.a(j, czf.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<czb> a() {
      return a;
   }

   public czb(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dms.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      bof $$4 = $$3.w();
      cia $$5 = $$4 instanceof cia ? (cia)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bml.a($$1.B) : bml.d;
   }

   public boolean a(cwe $$0, dme $$1, eor $$2, @Nullable cia $$3, boolean $$4) {
      ih $$5 = $$2.b();
      ib $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(atz.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dme $$0, ih $$1, double $$2) {
      if ($$1.o() != ih.a.b && !($$2 > 0.8124F)) {
         ih $$3 = $$0.c(b);
         dms $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(cwe $$0, ib $$1, @Nullable ih $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bof $$0, cwe $$1, ib $$2, @Nullable ih $$3) {
      djl $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof djj) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((djj)$$4).a($$3);
         $$1.a(null, $$2, atp.bX, atq.e, 2.0F, 1.0F);
         $$1.a($$0, dqr.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private epo m(dme $$0) {
      ih $$1 = $$0.c(b);
      dms $$2 = $$0.c(c);
      if ($$2 == dms.a) {
         return $$1 != ih.c && $$1 != ih.d ? g : f;
      } else if ($$2 == dms.b) {
         return G;
      } else if ($$2 == dms.d) {
         return $$1 != ih.c && $$1 != ih.d ? l : k;
      } else if ($$1 == ih.c) {
         return o;
      } else if ($$1 == ih.d) {
         return F;
      } else {
         return $$1 == ih.f ? n : m;
      }
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.m($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.m($$0);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ih $$1 = $$0.k();
      ib $$2 = $$0.a();
      cwe $$3 = $$0.q();
      ih.a $$4 = $$1.o();
      if ($$4 == ih.a.b) {
         dme $$5 = this.o().a(c, $$1 == ih.a ? dms.b : dms.a).a(b, $$0.g());
         if ($$5.a((cwh)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ih.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ih.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ih.e)
            || $$4 == ih.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ih.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ih.c);
         dme $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dms.d : dms.c);
         if ($$7.a((cwh)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ih.b);
         $$7 = $$7.a(c, $$8 ? dms.a : dms.b);
         if ($$7.a((cwh)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, cvw $$3, BiConsumer<cpq, ib> $$4) {
      if ($$3.j() == cvw.a.d && !$$1.y_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      dms $$6 = $$0.c(c);
      ih $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dms.d) {
         return czh.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dms.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dms.c).a(b, $$1.g());
            }

            if ($$6 == dms.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dms.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ih $$3 = n($$0).g();
      return $$3 == ih.b ? czf.a($$1, $$2.c(), ih.a) : dbz.b($$1, $$2, $$3);
   }

   private static ih n(dme $$0) {
      switch ((dms)$$0.c(c)) {
         case a:
            return ih.b;
         case b:
            return ih.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new djj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return a($$2, djn.E, $$0.B ? djj::a : djj::b);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   public dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
