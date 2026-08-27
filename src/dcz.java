import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcz extends cyr {
   public static final MapCodec<dcz> a = b(dcz::new);
   public static final dmy b = dmu.Q;
   public static final dmv c = dmu.f;
   private static final epo d = czf.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final epo e = czf.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final epo f = epl.a(e, d);
   private static final epo g = epl.a(f, dkj.w_, eoz.e);
   private static final epo h = epl.a(g, czf.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final epo i = epl.a(g, czf.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final epo j = epl.a(g, czf.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final epo k = epl.a(g, czf.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final epo l = epl.a(g, czf.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final epo m = dkj.w_;
   private static final epo n = epl.a(dkj.w_, czf.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final epo o = epl.a(dkj.w_, czf.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final epo F = epl.a(dkj.w_, czf.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final epo G = epl.a(dkj.w_, czf.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dcz> a() {
      return a;
   }

   public dcz(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      switch ((ih)$$0.c(b)) {
         case a:
            return h;
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         case f:
            return i;
         default:
            return g;
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2) {
      switch ((ih)$$0.c(b)) {
         case a:
            return m;
         case c:
            return o;
         case d:
            return F;
         case e:
            return G;
         case f:
            return n;
         default:
            return dkj.w_;
      }
   }

   @Override
   public dme a(crx $$0) {
      ih $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ih.a.b ? ih.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? null : a($$2, djn.r, dkk::a);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, box $$3, cpq $$4) {
      if ($$4.B()) {
         djl $$5 = $$0.c_($$1);
         if ($$5 instanceof dkk) {
            ((dkk)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         djl $$5 = $$1.c_($$2);
         if ($$5 instanceof dkk) {
            $$3.a((dkk)$$5);
            $$3.a(atz.ad);
         }

         return bml.b;
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cwe $$0, ib $$1, dme $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.c;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.a($$1.c_($$2));
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      djl $$4 = $$1.c_($$2);
      if ($$4 instanceof dkk) {
         dkk.a($$1, $$2, $$0, $$3, (dkk)$$4);
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
