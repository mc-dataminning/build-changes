import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dls extends dhk {
   public static final MapCodec<dls> a = b(dls::new);
   public static final dvx b = dvt.Q;
   public static final dvu c = dvt.f;
   private static final fab d = dhy.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fab e = dhy.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fab f = ezy.a(e, d);
   private static final fab g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fab h = ezy.a(f, g, ezl.e);
   private static final fab i = ezy.a(h, dhy.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fab j = ezy.a(h, dhy.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fab k = ezy.a(h, dhy.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fab l = ezy.a(h, dhy.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fab m = ezy.a(h, dhy.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fab n = g;
   private static final fab o = ezy.a(g, dhy.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fab G = ezy.a(g, dhy.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fab H = ezy.a(g, dhy.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fab I = ezy.a(g, dhy.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jl.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      switch ((jl)$$0.c(b)) {
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
   protected fab a(dvd $$0, dea $$1, jg $$2) {
      switch ((jl)$$0.c(b)) {
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
   public dvd a(czm $$0) {
      jl $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jl.a.b ? jl.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dth($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? null : a($$2, dsi.r, dth::a);
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dth $$5) {
         $$3.a($$5);
         $$3.a(awu.ad);
      }

      return bry.a;
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dev $$0, jg $$1, dvd $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      bru.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.c;
   }

   @Override
   protected boolean c_(dvd $$0) {
      return true;
   }

   @Override
   protected int a(dvd $$0, dev $$1, jg $$2) {
      return crj.a($$1.c_($$2));
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      dsg $$4 = $$1.c_($$2);
      if ($$4 instanceof dth) {
         dth.a($$1, $$2, $$0, $$3, (dth)$$4);
      }
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
