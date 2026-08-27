import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dit extends dfm implements ddh {
   public static final MapCodec<dit> c = b(dit::new);
   public static final drh d = dqx.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eui h = dde.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eui i = dde.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eui j = dde.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eui k = dde.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eui[] l = new eui[]{dde.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eui[] m = new eui[]{j, dde.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dit> a() {
      return c;
   }

   public dit(dqg.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      return this.n();
   }

   @Override
   public eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return $$0.c(b) == drd.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == drd.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : ddg.a.n();
      }
   }

   @Override
   public boolean a(dqh $$0, dag $$1, in $$2) {
      return m($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return $$0.a(ddg.cC);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, brh $$3) {
      if ($$3 instanceof cis && $$1.aa().b(czz.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dqh $$0, cwi $$1) {
      return false;
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, bsa $$3, csz $$4) {
   }

   @Override
   public boolean d_(dqh $$0) {
      return $$0.c(b) == drd.b && !this.n($$0);
   }

   @Override
   public void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      float $$4 = dez.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aqh $$0, dqh $$1, in $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dqh $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, drd.a), 3);
         }
      }
   }

   private static boolean a(dag $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(ddg.kB);
   }

   private static boolean b(dag $$0, in $$1) {
      return dez.a($$0, $$1);
   }

   private static boolean m(dqh $$0) {
      return $$0.a(ddg.kB) && $$0.c(b) == drd.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dag $$0, in $$1, dqh $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dqh $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dit.a d(dag $$0, in $$1, dqh $$2) {
      if (m($$2)) {
         return new dit.a($$1, $$2);
      } else {
         in $$3 = $$1.d();
         dqh $$4 = $$0.a_($$3);
         return m($$4) ? new dit.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      dit.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      dit.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(in a, dqh b) {
   }
}
