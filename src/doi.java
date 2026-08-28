import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doi extends djx {
   public static final MapCodec<doi> a = b(doi::new);
   public static final dyr<jm> b = dyk.R;
   public static final dyl c = dyk.f;
   private static final fcr d = dkl.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcr e = dkl.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fcr f = fco.a(e, d);
   private static final fcr g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fcr h = fco.a(f, g, fcb.e);
   private static final fcr i = fco.a(h, dkl.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fcr j = fco.a(h, dkl.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fcr k = fco.a(h, dkl.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fcr l = fco.a(h, dkl.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fcr m = fco.a(h, dkl.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fcr n = g;
   private static final fcr o = fco.a(g, dkl.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fcr G = fco.a(g, dkl.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fcr H = fco.a(g, dkl.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fcr I = fco.a(g, dkl.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
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
   protected fcr a(dxu $$0, dgm $$1, jh $$2) {
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
   public dxu a(dbf $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dvy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duw> dux<T> a(dhh $$0, dxu $$1, duy<T> $$2) {
      return $$0.C ? null : a($$2, duy.s, dvy::a);
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvy $$5) {
         $$3.a($$5);
         $$3.a(axp.ad);
      }

      return bti.a;
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dhh $$0, jh $$1, dxu $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      bte.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.c;
   }

   @Override
   protected boolean c_(dxu $$0) {
      return true;
   }

   @Override
   protected int a(dxu $$0, dhh $$1, jh $$2) {
      return ctb.a($$1.c_($$2));
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      duw $$4 = $$1.c_($$2);
      if ($$4 instanceof dvy) {
         dvy.a($$1, $$2, $$0, $$3, (dvy)$$4);
      }
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
