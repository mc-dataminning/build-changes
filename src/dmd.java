import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmd extends dhv {
   public static final MapCodec<dmd> a = b(dmd::new);
   public static final dwl<jm> b = dwe.Q;
   public static final dwf c = dwe.f;
   private static final fal d = dij.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fal e = dij.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fal f = fai.a(e, d);
   private static final fal g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fal h = fai.a(f, g, ezv.e);
   private static final fal i = fai.a(h, dij.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fal j = fai.a(h, dij.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fal k = fai.a(h, dij.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fal l = fai.a(h, dij.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fal m = fai.a(h, dij.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fal n = g;
   private static final fal o = fai.a(g, dij.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fal G = fai.a(g, dij.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fal H = fai.a(g, dij.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fal I = fai.a(g, dij.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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
   protected fal a(dvo $$0, dek $$1, jh $$2) {
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
   public dvo a(czw $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dts($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? null : a($$2, dst.r, dts::a);
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dts $$5) {
         $$3.a($$5);
         $$3.a(awy.ad);
      }

      return bsh.a;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dff $$0, jh $$1, dvo $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.a($$1.c_($$2));
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      dsr $$4 = $$1.c_($$2);
      if ($$4 instanceof dts) {
         dts.a($$1, $$2, $$0, $$3, (dts)$$4);
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
