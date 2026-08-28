import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dli extends djp {
   public static final MapCodec<dli> a = b(dli::new);
   public static final dur b = duq.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final eyx f = dgv.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eyx g = dgv.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eyx h = dgv.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eyx i = dgv.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eyx j = dgv.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eyx k = dgv.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eyx l = dgv.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eyx m = dgv.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   protected dli(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(aE, jj.c).b(b, Boolean.valueOf(false)).b(K, dul.b));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      switch ((dul)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jj)$$0.c(aE)) {
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
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$1.B) {
         dua $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return brk.a;
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      if ($$3.f()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dua $$0, dds $$1, je $$2, @Nullable cnp $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? dyx.a : dyx.e, $$2);
   }

   protected static void a(@Nullable cnp $$0, ddt $$1, je $$2, dua $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awd.nV, awe.e, 0.3F, $$4);
   }

   private static void a(dua $$0, ddt $$1, je $$2, float $$3) {
      jj $$4 = $$0.c(aE).g();
      jj $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new li(li.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dua $$0, dcx $$1, je $$2, jj $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dua $$0) {
      return true;
   }

   private void d(dua $$0, dds $$1, je $$2) {
      jj $$3 = n($$0).g();
      erj $$4 = erf.a($$1, $$3, $$3.o().d() ? jj.b : null);
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(K, aE, b);
   }
}
