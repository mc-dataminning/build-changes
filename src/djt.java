import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djt extends dfk {
   public static final MapCodec<djt> a = b(djt::new);
   public static final dtw b = dts.Q;
   public static final dtt c = dts.f;
   private static final exv d = dfy.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final exv e = dfy.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final exv f = exs.a(e, d);
   private static final exv g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final exv h = exs.a(f, g, exg.e);
   private static final exv i = exs.a(h, dfy.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final exv j = exs.a(h, dfy.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final exv k = exs.a(h, dfy.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final exv l = exs.a(h, dfy.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final exv m = exs.a(h, dfy.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final exv n = g;
   private static final exv o = exs.a(g, dfy.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final exv F = exs.a(g, dfy.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final exv G = exs.a(g, dfy.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final exv H = exs.a(g, dfy.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<djt> a() {
      return a;
   }

   public djt(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      switch ((ji)$$0.c(b)) {
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
   protected exv a(dtc $$0, dcc $$1, jd $$2) {
      switch ((ji)$$0.c(b)) {
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
   public dtc a(cyd $$0) {
      ji $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ji.a.b ? ji.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0.B ? null : a($$2, dqj.r, drh::a);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         dqh $$5 = $$1.c_($$2);
         if ($$5 instanceof drh) {
            $$3.a((drh)$$5);
            $$3.a(avz.ad);
         }

         return bqr.c;
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dcw $$0, jd $$1, dtc $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      bqn.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return cpu.a($$1.c_($$2));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      dqh $$4 = $$1.c_($$2);
      if ($$4 instanceof drh) {
         drh.a($$1, $$2, $$0, $$3, (drh)$$4);
      }
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
