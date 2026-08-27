import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dgt extends dfb {
   public static final MapCodec<dgt> a = b(dgt::new);
   public static final dpz b = dpy.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final etc f = dch.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final etc g = dch.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final etc h = dch.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final etc i = dch.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final etc j = dch.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final etc k = dch.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final etc l = dch.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final etc m = dch.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   protected dgt(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ij.c).a(b, Boolean.valueOf(false)).a(K, dpt.b));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((dpt)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ij)$$0.c(aE)) {
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
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         dpi $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bof.a;
      } else {
         dpi $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, auo.nF, aup.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dub.a : dub.e, $$2);
         return bof.b;
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cyy $$3, BiConsumer<crs, id> $$4) {
      if ($$3.j() == cyy.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dpi d(dpi $$0, czg $$1, id $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dpi $$0, czh $$1, id $$2, float $$3) {
      ij $$4 = $$0.c(aE).g();
      ij $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new kh(kh.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   private void e(dpi $$0, czg $$1, id $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(K, aE, b);
   }
}
