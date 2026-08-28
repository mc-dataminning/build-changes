import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends djy {
   public static final MapCodec<doj> a = b(doj::new);
   public static final dys<jm> b = dyl.R;
   public static final dym c = dyl.f;
   private static final fcs d = dkm.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcs e = dkm.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fcs f = fcp.a(e, d);
   private static final fcs g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fcs h = fcp.a(f, g, fcc.e);
   private static final fcs i = fcp.a(h, dkm.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fcs j = fcp.a(h, dkm.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fcs k = fcp.a(h, dkm.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fcs l = fcp.a(h, dkm.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fcs m = fcp.a(h, dkm.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fcs n = g;
   private static final fcs o = fcp.a(g, dkm.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fcs G = fcp.a(g, dkm.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fcs H = fcp.a(g, dkm.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fcs I = fcp.a(g, dkm.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   public doj(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      switch ((jm)$$0.c(b)) {
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
   protected fcs a(dxv $$0, dgn $$1, jh $$2) {
      switch ((jm)$$0.c(b)) {
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
   public dxv a(dbg $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dvz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dux> duy<T> a(dhi $$0, dxv $$1, duz<T> $$2) {
      return $$0.C ? null : a($$2, duz.s, dvz::a);
   }

   @Override
   protected void b(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvz $$5) {
         $$3.a($$5);
         $$3.a(axp.ad);
      }

      return btj.a;
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dkm $$3, @Nullable evf $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dhi $$0, jh $$1, dxv $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      btf.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      return ctc.a($$1.c_($$2));
   }

   @Override
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, bvk $$3) {
      dux $$4 = $$1.c_($$2);
      if ($$4 instanceof dvz) {
         dvz.a($$1, $$2, $$0, $$3, (dvz)$$4);
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
