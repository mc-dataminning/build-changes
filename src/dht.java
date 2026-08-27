import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dht extends ddk {
   public static final MapCodec<dht> a = b(dht::new);
   public static final drv b = drr.Q;
   public static final drs c = drr.f;
   private static final evd d = ddy.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final evd e = ddy.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final evd f = eva.a(e, d);
   private static final evd g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final evd h = eva.a(f, g, euo.e);
   private static final evd i = eva.a(h, ddy.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final evd j = eva.a(h, ddy.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final evd k = eva.a(h, ddy.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final evd l = eva.a(h, ddy.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final evd m = eva.a(h, ddy.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final evd n = g;
   private static final evd o = eva.a(g, ddy.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final evd F = eva.a(g, ddy.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final evd G = eva.a(g, ddy.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final evd H = eva.a(g, ddy.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2) {
      switch ((it)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public drb a(cwz $$0) {
      it $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == it.a.b ? it.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? null : a($$2, doi.r, dpf::a);
   }

   @Override
   protected void b(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         dog $$5 = $$1.c_($$2);
         if ($$5 instanceof dpf) {
            $$3.a((dpf)$$5);
            $$3.a(avr.ad);
         }

         return bpu.b;
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, ddy $$3, io $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dax $$0, io $$1, drb $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      bpq.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.c;
   }

   @Override
   protected boolean c_(drb $$0) {
      return true;
   }

   @Override
   protected int a(drb $$0, dax $$1, io $$2) {
      return cot.a($$1.c_($$2));
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      dog $$4 = $$1.c_($$2);
      if ($$4 instanceof dpf) {
         dpf.a($$1, $$2, $$0, $$3, (dpf)$$4);
      }
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }
}
