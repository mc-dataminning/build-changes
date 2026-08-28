import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dkj extends diq {
   public static final MapCodec<dkj> a = b(dkj::new);
   public static final dtr b = dtq.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final exp f = dfw.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final exp g = dfw.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final exp h = dfw.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final exp i = dfw.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final exp j = dfw.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final exp k = dfw.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final exp l = dfw.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final exp m = dfw.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ji.c).a(b, Boolean.valueOf(false)).a(K, dtl.b));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((dtl)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ji)$$0.c(aE)) {
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
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         dta $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bqq.a;
      } else {
         this.b($$0, $$1, $$2, null);
         return bqq.c;
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dcm $$3, BiConsumer<cuo, jd> $$4) {
      if ($$3.n()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dta $$0, dcu $$1, jd $$2, @Nullable cmv $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? dxw.a : dxw.e, $$2);
   }

   protected static void a(@Nullable cmv $$0, dcv $$1, jd $$2, dta $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, avo.nU, avp.e, 0.3F, $$4);
   }

   private static void a(dta $$0, dcv $$1, jd $$2, float $$3) {
      ji $$4 = $$0.c(aE).g();
      ji $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lh(lh.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dta $$0) {
      return true;
   }

   private void d(dta $$0, dcu $$1, jd $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(K, aE, b);
   }
}
