import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dlz extends dkg {
   public static final MapCodec<dlz> a = b(dlz::new);
   public static final dvj b = dvi.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ezq f = dhm.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ezq g = dhm.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ezq h = dhm.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ezq i = dhm.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ezq j = dhm.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ezq k = dhm.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ezq l = dhm.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ezq m = dhm.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jk.c).b(b, Boolean.valueOf(false)).b(L, dvd.b));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      switch ((dvd)$$0.c(L)) {
         case a:
            switch ($$0.c(aF).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jk)$$0.c(aF)) {
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
            switch ($$0.c(aF).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$1.B) {
         dus $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }
      } else {
         this.b($$0, $$1, $$2, null);
      }

      return brs.a;
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      if ($$3.f()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dus $$0, dej $$1, jf $$2, @Nullable cnx $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? dzp.a : dzp.e, $$2);
   }

   protected static void a(@Nullable cnx $$0, dek $$1, jf $$2, dus $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, awg.nV, awh.e, 0.3F, $$4);
   }

   private static void a(dus $$0, dek $$1, jf $$2, float $$3) {
      jk $$4 = $$0.c(aF).g();
      jk $$5 = n($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new lj(lj.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(b) && n($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   private void d(dus $$0, dej $$1, jf $$2) {
      jk $$3 = n($$0).g();
      esb $$4 = erx.a($$1, $$3, $$3.o().d() ? jk.b : $$0.c(aF));
      $$1.a($$2, this, $$4);
      $$1.a($$2.a($$3), this, $$4);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(L, aF, b);
   }
}
