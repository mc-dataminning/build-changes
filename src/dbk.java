import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dbk extends czs {
   public static final MapCodec<dbk> a = b(dbk::new);
   public static final dkg b = dkf.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final emv f = cwy.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final emv g = cwy.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final emv h = cwy.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final emv i = cwy.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final emv j = cwy.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final emv k = cwy.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final emv l = cwy.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final emv m = cwy.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dbk> a() {
      return a;
   }

   protected dbk(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, dka.b));
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      switch ((dka)$$0.c(K)) {
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
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         djp $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bkc.a;
      } else {
         djp $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, art.nv, aru.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dnz.a : dnz.e, $$2);
         return bkc.b;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, ctp $$3, BiConsumer<cng, hx> $$4) {
      if ($$3.j() == ctp.a.d && !$$1.y_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public djp d(djp $$0, ctx $$1, hx $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(djp $$0, cty $$1, hx $$2, float $$3) {
      ic $$4 = $$0.c(aE).g();
      ic $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jr(jr.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   private void e(djp $$0, ctx $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(K, aE, b);
   }
}
