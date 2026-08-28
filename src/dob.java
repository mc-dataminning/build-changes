import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dob extends djq {
   public static final MapCodec<dob> a = b(dob::new);
   public static final dyk<jm> b = dyd.R;
   public static final dye c = dyd.f;
   private static final fcm d = dke.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fcm e = dke.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fcm f = fcj.a(e, d);
   private static final fcm g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fcm h = fcj.a(f, g, fbw.e);
   private static final fcm i = fcj.a(h, dke.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fcm j = fcj.a(h, dke.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fcm k = fcj.a(h, dke.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fcm l = fcj.a(h, dke.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fcm m = fcj.a(h, dke.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fcm n = g;
   private static final fcm o = fcj.a(g, dke.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fcm G = fcj.a(g, dke.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fcm H = fcj.a(g, dke.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fcm I = fcj.a(g, dke.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dob> a() {
      return a;
   }

   public dob(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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
   protected fcm a(dxn $$0, dgf $$1, jh $$2) {
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
   public dxn a(dbb $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dvr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return $$0.C ? null : a($$2, dur.s, dvr::a);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dvr $$5) {
         $$3.a($$5);
         $$3.a(axp.ad);
      }

      return bte.a;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dha $$0, jh $$1, dxn $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      bta.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.c;
   }

   @Override
   protected boolean c_(dxn $$0) {
      return true;
   }

   @Override
   protected int a(dxn $$0, dha $$1, jh $$2) {
      return csx.a($$1.c_($$2));
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      dup $$4 = $$1.c_($$2);
      if ($$4 instanceof dvr) {
         dvr.a($$1, $$2, $$0, $$3, (dvr)$$4);
      }
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
