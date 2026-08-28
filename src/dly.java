import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dly extends dhq {
   public static final MapCodec<dly> a = b(dly::new);
   public static final dwd b = dvz.Q;
   public static final dwa c = dvz.f;
   private static final fah d = die.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final fah e = die.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final fah f = fae.a(e, d);
   private static final fah g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final fah h = fae.a(f, g, ezr.e);
   private static final fah i = fae.a(h, die.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final fah j = fae.a(h, die.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final fah k = fae.a(h, die.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final fah l = fae.a(h, die.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final fah m = fae.a(h, die.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final fah n = g;
   private static final fah o = fae.a(g, die.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final fah G = fae.a(g, die.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final fah H = fae.a(g, die.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final fah I = fae.a(g, die.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a).b(c, Boolean.valueOf(true)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
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
   protected fah a(dvj $$0, deg $$1, jh $$2) {
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
   public dvj a(czs $$0) {
      jm $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jm.a.b ? jm.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? null : a($$2, dso.r, dtn::a);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dtn $$5) {
         $$3.a($$5);
         $$3.a(awv.ad);
      }

      return bsd.a;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dfb $$0, jh $$1, dvj $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      brz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.c;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return cro.a($$1.c_($$2));
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      dsm $$4 = $$1.c_($$2);
      if ($$4 instanceof dtn) {
         dtn.a($$1, $$2, $$0, $$3, (dtn)$$4);
      }
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
