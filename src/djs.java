import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class djs extends dhz {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dsy b = dsx.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ews f = dff.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ews g = dff.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ews h = dff.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ews i = dff.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ews j = dff.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ews k = dff.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ews l = dff.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ews m = dff.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(K, dss.b));
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      switch ((dss)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jf)$$0.c(aE)) {
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
   protected bqd a(dsh $$0, dcd $$1, ja $$2, cmh $$3, evv $$4) {
      if ($$1.B) {
         dsh $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bqd.a;
      } else {
         this.b($$0, $$1, $$2, null);
         return bqd.c;
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dbv $$3, BiConsumer<cua, ja> $$4) {
      if ($$3.n()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dsh $$0, dcd $$1, ja $$2, @Nullable cmh $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? dxa.a : dxa.e, $$2);
   }

   protected static void a(@Nullable cmh $$0, dce $$1, ja $$2, dsh $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, avf.nU, avg.e, 0.3F, $$4);
   }

   private static void a(dsh $$0, dce $$1, ja $$2, float $$3) {
      jf $$4 = $$0.c(aE).g();
      jf $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new le(le.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dsh $$0, dcd $$1, ja $$2, aym $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsh $$0, dbj $$1, ja $$2, jf $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsh $$0) {
      return true;
   }

   private void d(dsh $$0, dcd $$1, ja $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(K, aE, b);
   }
}
