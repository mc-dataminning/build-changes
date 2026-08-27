import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dal extends cyt {
   public static final MapCodec<dal> a = b(dal::new);
   public static final djg b = djf.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final elu f = cvz.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final elu g = cvz.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final elu h = cvz.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final elu i = cvz.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final elu j = cvz.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final elu k = cvz.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final elu l = cvz.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final elu m = cvz.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   protected dal(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ia.c).a(b, Boolean.valueOf(false)).a(K, dja.b));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((dja)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ia)$$0.c(aE)) {
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
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         dip $$6 = $$0.a(b);
         if ($$6.c(b)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bjl.a;
      } else {
         dip $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, arc.ng, ard.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(b) ? dmz.a : dmz.e, $$2);
         return bjl.b;
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, csq $$3, BiConsumer<cmh, hv> $$4) {
      if ($$3.j() == csq.a.d && !$$1.y_() && !$$0.c(b)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dip d(dip $$0, csy $$1, hv $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dip $$0, csz $$1, hv $$2, float $$3) {
      ia $$4 = $$0.c(aE).g();
      ia $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jp(jp.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dip $$0, cse $$1, hv $$2, ia $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dip $$0) {
      return true;
   }

   private void e(dip $$0, csy $$1, hv $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(K, aE, b);
   }
}
