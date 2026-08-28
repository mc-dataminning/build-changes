import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnk extends diz {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final dxv<jn> b = dxo.T;
   public static final dxp c = dxo.j;
   private static final fbv d = djn.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv e = djn.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fbv f = fbs.a(e, d);
   private static final fbv g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fbv h = fbs.a(f, g, fbf.e);
   private static final fbv i = fbs.a(h, djn.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fbv j = fbs.a(h, djn.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fbv k = fbs.a(h, djn.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fbv l = fbs.a(h, djn.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fbv m = fbs.a(h, djn.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fbv n = g;
   private static final fbv o = fbs.a(g, djn.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fbv G = fbs.a(g, djn.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fbv H = fbs.a(g, djn.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fbv I = fbs.a(g, djn.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
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
   protected fbv a(dwy $$0, dfo $$1, ji $$2) {
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
   public dwy a(dah $$0) {
      jn $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jn.a.b ? jn.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dvc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dua> dub<T> a(dgj $$0, dwy $$1, duc<T> $$2) {
      return $$0.C ? null : a($$2, duc.s, dvc::a);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvc $$5) {
         $$3.a($$5);
         $$3.a(awk.ad);
      }

      return bsl.a;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dgj $$0, ji $$1, dwy $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      bsh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return csd.a($$1.c_($$2));
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, bum $$3) {
      dua $$4 = $$1.c_($$2);
      if ($$4 instanceof dvc) {
         dvc.a($$1, $$2, $$0, $$3, (dvc)$$4);
      }
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
