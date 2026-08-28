import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnj extends diy {
   public static final MapCodec<dnj> a = b(dnj::new);
   public static final dxu<jn> b = dxn.T;
   public static final dxo c = dxn.j;
   private static final fbu d = djm.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu e = djm.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fbu f = fbr.a(e, d);
   private static final fbu g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fbu h = fbr.a(f, g, fbe.e);
   private static final fbu i = fbr.a(h, djm.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fbu j = fbr.a(h, djm.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fbu k = fbr.a(h, djm.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fbu l = fbr.a(h, djm.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fbu m = fbr.a(h, djm.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fbu n = g;
   private static final fbu o = fbr.a(g, djm.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fbu G = fbr.a(g, djm.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fbu H = fbr.a(g, djm.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fbu I = fbr.a(g, djm.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dnj> a() {
      return a;
   }

   public dnj(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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
   protected fbu a(dwx $$0, dfn $$1, ji $$2) {
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
   public dwx a(dag $$0) {
      jn $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jn.a.b ? jn.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dvb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dtz> dua<T> a(dgi $$0, dwx $$1, dub<T> $$2) {
      return $$0.C ? null : a($$2, dub.s, dvb::a);
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvb $$5) {
         $$3.a($$5);
         $$3.a(awk.ad);
      }

      return bsk.a;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dgi $$0, ji $$1, dwx $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dwx $$0) {
      return true;
   }

   @Override
   protected int a(dwx $$0, dgi $$1, ji $$2) {
      return csc.a($$1.c_($$2));
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, bul $$3) {
      dtz $$4 = $$1.c_($$2);
      if ($$4 instanceof dvb) {
         dvb.a($$1, $$2, $$0, $$3, (dvb)$$4);
      }
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
