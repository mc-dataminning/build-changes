import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnh extends diw {
   public static final MapCodec<dnh> a = b(dnh::new);
   public static final dxs<jn> b = dxl.T;
   public static final dxm c = dxl.j;
   private static final fbs d = djk.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbs e = djk.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fbs f = fbp.a(e, d);
   private static final fbs g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fbs h = fbp.a(f, g, fbc.e);
   private static final fbs i = fbp.a(h, djk.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fbs j = fbp.a(h, djk.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fbs k = fbp.a(h, djk.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fbs l = fbp.a(h, djk.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fbs m = fbp.a(h, djk.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fbs n = g;
   private static final fbs o = fbp.a(g, djk.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fbs G = fbp.a(g, djk.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fbs H = fbp.a(g, djk.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fbs I = fbp.a(g, djk.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   public dnh(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ((jn)$$0.c(b)) {
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
   protected fbs a(dwv $$0, dfl $$1, ji $$2) {
      switch ((jn)$$0.c(b)) {
         case a:
            return n;
         case c:
            return G;
         case d:
            return H;
         case e:
            return I;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dwv a(dae $$0) {
      jn $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jn.a.b ? jn.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new duz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtx> dty<T> a(dgg $$0, dwv $$1, dtz<T> $$2) {
      return $$0.C ? null : a($$2, dtz.s, duz::a);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof duz $$5) {
         $$3.a($$5);
         $$3.a(awj.ad);
      }

      return bsi.a;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dgg $$0, ji $$1, dwv $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      dtx $$4 = $$1.c_($$2);
      if ($$4 instanceof duz) {
         duz.a($$1, $$2, $$0, $$3, (duz)$$4);
      }
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
