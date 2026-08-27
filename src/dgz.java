import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgz extends dcq {
   public static final MapCodec<dgz> a = b(dgz::new);
   public static final drb b = dqx.Q;
   public static final dqy c = dqx.f;
   private static final eui d = dde.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eui e = dde.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eui f = euf.a(e, d);
   private static final eui g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final eui h = euf.a(f, g, ett.e);
   private static final eui i = euf.a(h, dde.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eui j = euf.a(h, dde.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eui k = euf.a(h, dde.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eui l = euf.a(h, dde.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eui m = euf.a(h, dde.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eui n = g;
   private static final eui o = euf.a(g, dde.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eui F = euf.a(g, dde.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eui G = euf.a(g, dde.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eui H = euf.a(g, dde.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<dgz> a() {
      return a;
   }

   public dgz(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((is)$$0.c(b)) {
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
   protected eui a(dqh $$0, czj $$1, in $$2) {
      switch ((is)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dqh a(cwi $$0) {
      is $$1 = $$0.k().g();
      return this.n().a(b, $$1.o() == is.a.b ? is.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dol($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0.B ? null : a($$2, dno.r, dol::a);
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.a;
      } else {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dol) {
            $$3.a((dol)$$5);
            $$3.a(avm.ad);
         }

         return bpm.b;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dad $$0, in $$1, dqh $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      bpi.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Override
   protected boolean c_(dqh $$0) {
      return true;
   }

   @Override
   protected int a(dqh $$0, dad $$1, in $$2) {
      return cod.a($$1.c_($$2));
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      dnm $$4 = $$1.c_($$2);
      if ($$4 instanceof dol) {
         dol.a($$1, $$2, $$0, $$3, (dol)$$4);
      }
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
