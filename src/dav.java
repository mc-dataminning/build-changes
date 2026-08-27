import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dav extends czd {
   public static final MapCodec<dav> a = b(dav::new);
   public static final djr b = djq.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final emf f = cwj.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final emf g = cwj.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final emf h = cwj.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final emf i = cwj.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final emf j = cwj.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final emf k = cwj.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final emf l = cwj.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final emf m = cwj.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dav> a() {
      return a;
   }

   protected dav(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, djl.b));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      switch ((djl)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ic)$$0.c(aE)) {
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
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         dja $$6 = $$0.a(b);
         if ($$6.c(b)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bjv.a;
      } else {
         dja $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, arm.ng, arn.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(b) ? dnk.a : dnk.e, $$2);
         return bjv.b;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cta $$3, BiConsumer<cmr, hx> $$4) {
      if ($$3.j() == cta.a.d && !$$1.y_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dja d(dja $$0, cti $$1, hx $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dja $$0, ctj $$1, hx $$2, float $$3) {
      ic $$4 = $$0.c(aE).g();
      ic $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jr(jr.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, dja $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(dja $$0, cso $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(dja $$0) {
      return true;
   }

   private void e(dja $$0, cti $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(K, aE, b);
   }
}
