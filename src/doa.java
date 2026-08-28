import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doa extends djp {
   public static final MapCodec<doa> a = b(doa::new);
   public static final dyl<jm> b = dye.T;
   public static final dyf c = dye.j;
   private static final fcl d = dkd.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcl e = dkd.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fcl f = fci.a(e, d);
   private static final fcl g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fcl h = fci.a(f, g, fbv.e);
   private static final fcl i = fci.a(h, dkd.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fcl j = fci.a(h, dkd.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fcl k = fci.a(h, dkd.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fcl l = fci.a(h, dkd.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fcl m = fci.a(h, dkd.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fcl n = g;
   private static final fcl o = fci.a(g, dkd.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fcl G = fci.a(g, dkd.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fcl H = fci.a(g, dkd.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fcl I = fci.a(g, dkd.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<doa> a() {
      return a;
   }

   public doa(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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
   protected fcl a(dxo $$0, dge $$1, jh $$2) {
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
   public dxo a(dax $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? null : a($$2, dus.s, dvs::a);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvs $$5) {
         $$3.a($$5);
         $$3.a(axf.ad);
      }

      return bta.a;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dgz $$0, jh $$1, dxo $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      bsw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.c;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return cst.a($$1.c_($$2));
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      duq $$4 = $$1.c_($$2);
      if ($$4 instanceof dvs) {
         dvs.a($$1, $$2, $$0, $$3, (dvs)$$4);
      }
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
