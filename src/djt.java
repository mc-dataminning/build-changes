import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class djt extends dhz {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dtt b = dts.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final exn f = dfc.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final exn g = dfc.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final exn h = dfc.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final exn i = dfc.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final exn j = dfc.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final exn k = dfc.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final exn l = dfc.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final exn m = dfc.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   protected djt(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, iw.c).a(b, Boolean.valueOf(false)).a(K, dtn.b));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      switch ((dtn)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((iw)$$0.c(aE)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aE).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$1.C) {
         dtc $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bqa.a;
      } else {
         dtc $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, avo.ok, avq.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dxv.a : dxv.e, $$2);
         return bqa.b;
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dbs $$3, BiConsumer<cuh, ir> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dtc d(dtc $$0, dca $$1, ir $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dtc $$0, dcb $$1, ir $$2, float $$3) {
      iw $$4 = $$0.c(aE).g();
      iw $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new kv(kv.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dtc $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dtc $$0, dbg $$1, ir $$2, iw $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dtc $$0) {
      return true;
   }

   private void e(dtc $$0, dca $$1, ir $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(K, aE, b);
   }
}
