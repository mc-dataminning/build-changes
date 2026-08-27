import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends dbt {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final dqc b = dpy.Q;
   public static final dpz c = dpy.f;
   private static final etc d = dch.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final etc e = dch.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final etc f = esz.a(e, d);
   private static final etc g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final etc h = esz.a(f, g, esn.e);
   private static final etc i = esz.a(h, dch.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final etc j = esz.a(h, dch.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final etc k = esz.a(h, dch.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final etc l = esz.a(h, dch.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final etc m = esz.a(h, dch.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final etc n = g;
   private static final etc o = esz.a(g, dch.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final etc F = esz.a(g, dch.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final etc G = esz.a(g, dch.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final etc H = esz.a(g, dch.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ij.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      switch ((ij)$$0.c(b)) {
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
   protected etc a(dpi $$0, cym $$1, id $$2) {
      switch ((ij)$$0.c(b)) {
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
   public dpi a(cux $$0) {
      ij $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == ij.a.b ? ij.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? null : a($$2, dmq.r, dnn::a);
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         dmo $$5 = $$1.c_($$2);
         if ($$5 instanceof dnn) {
            $$3.a((dnn)$$5);
            $$3.a(auz.ad);
         }

         return bof.b;
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(czg $$0, id $$1, dpi $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, bqa $$3) {
      dmo $$4 = $$1.c_($$2);
      if ($$4 instanceof dnn) {
         dnn.a($$1, $$2, $$0, $$3, (dnn)$$4);
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
