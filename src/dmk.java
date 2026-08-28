import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmk extends dic {
   public static final MapCodec<dmk> a = b(dmk::new);
   public static final dws<jm> b = dwl.Q;
   public static final dwm c = dwl.f;
   private static final fas d = diq.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fas e = diq.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fas f = fap.a(e, d);
   private static final fas g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fas h = fap.a(f, g, fac.e);
   private static final fas i = fap.a(h, diq.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fas j = fap.a(h, diq.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fas k = fap.a(h, diq.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fas l = fap.a(h, diq.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fas m = fap.a(h, diq.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fas n = g;
   private static final fas o = fap.a(g, diq.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fas G = fap.a(g, diq.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fas H = fap.a(g, diq.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fas I = fap.a(g, diq.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dmk> a() {
      return a;
   }

   public dmk(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
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
   protected fas a(dvv $$0, der $$1, jh $$2) {
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
   public dvv a(dad $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dtz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return $$0.C ? null : a($$2, dta.r, dtz::a);
   }

   @Override
   protected void b(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtz $$5) {
         $$3.a($$5);
         $$3.a(awx.ad);
      }

      return bsk.a;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dfm $$0, jh $$1, dvv $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, dvv $$3, boolean $$4) {
      bsg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.c;
   }

   @Override
   protected boolean c_(dvv $$0) {
      return true;
   }

   @Override
   protected int a(dvv $$0, dfm $$1, jh $$2) {
      return crz.a($$1.c_($$2));
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvv a(dvv $$0, dnm $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      dsy $$4 = $$1.c_($$2);
      if ($$4 instanceof dtz) {
         dtz.a($$1, $$2, $$0, $$3, (dtz)$$4);
      }
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
