import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dem extends dcu {
   public static final MapCodec<dem> a = b(dem::new);
   public static final dnq b = dnp.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final eqk f = daa.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eqk g = daa.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eqk h = daa.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eqk i = daa.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eqk j = daa.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eqk k = daa.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eqk l = daa.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eqk m = daa.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   protected dem(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(K, dnk.b));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      switch ((dnk)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ih)$$0.c(aE)) {
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
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         dmz $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bnc.a;
      } else {
         dmz $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aty.nz, atz.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? drn.a : drn.e, $$2);
         return bnc.b;
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, cwr $$3, BiConsumer<cqk, ib> $$4) {
      if ($$3.j() == cwr.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dmz d(dmz $$0, cwz $$1, ib $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dmz $$0, cxa $$1, ib $$2, float $$3) {
      ih $$4 = $$0.c(aE).g();
      ih $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jw(jw.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   private void e(dmz $$0, cwz $$1, ib $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(K, aE, b);
   }
}
