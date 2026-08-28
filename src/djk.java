import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djk extends del {
   public static final MapCodec<djk> a = b(djk::new);
   public static final dsw b = div.aE;
   public static final dst c = dss.w;
   public static final dst d = dss.o;
   public static final ewk e = dez.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ewk f = dez.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ewk g = ewh.a(e, f);
   public static final ewk h = dez.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ewk i = ewh.a(g, h);
   public static final ewk j = ewh.a(
      dez.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dez.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dez.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ewk k = ewh.a(
      dez.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dez.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dez.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ewk l = ewh.a(
      dez.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dez.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dez.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ewk m = ewh.a(
      dez.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dez.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dez.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, je.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.c;
   }

   @Override
   protected ewk f(dsc $$0, dbe $$1, iz $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsc $$0) {
      return true;
   }

   @Override
   public dsc a(cya $$0) {
      dby $$1 = $$0.q();
      cup $$2 = $$0.n();
      cmx $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gz()) {
         cxe $$5 = $$2.a(km.O, cxe.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return i;
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      switch ((je)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dph a(iz $$0, dsc $$1) {
      return new dqj($$0, $$1);
   }

   public static boolean a(@Nullable bsu $$0, dby $$1, iz $$2, dsc $$3, cup $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bsu $$0, dby $$1, iz $$2, dsc $$3, cup $$4) {
      if ($$1.c_($$2) instanceof dqj $$6) {
         $$6.b($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awa.cz, awb.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsu $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      dsc $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dwv.c, $$2, dwv.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dby $$0, iz $$1, dsc $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dby $$0, iz $$1, dsc $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dby $$0, iz $$1, dsc $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dsc $$0, dby $$1, iz $$2) {
      if ($$1.c_($$2) instanceof dqj $$4) {
         je $$5 = $$0.c(b);
         cup $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cjh $$9 = new cjh($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$3 == je.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsc $$0) {
      return true;
   }

   @Override
   protected int a(dsc $$0, dby $$1, iz $$2) {
      if ($$0.c(d)) {
         dph $$3 = $$1.c_($$2);
         if ($$3 instanceof dqj) {
            return ((dqj)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqw a(cup $$0, dsc $$1, dby $$2, iz $$3, cmx $$4, bqt $$5, evn $$6) {
      if ($$1.c(d)) {
         return bqw.d;
      } else if ($$0.a(awy.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqw.a($$2.B) : bqw.e;
      } else {
         return $$0.e() && $$5 == bqt.a ? bqw.e : bqw.d;
      }
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqu.a($$1.B);
      } else {
         return bqu.c;
      }
   }

   @Nullable
   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dby $$0, iz $$1, cmx $$2) {
      dph $$3 = $$0.c_($$1);
      if ($$3 instanceof dqj) {
         $$2.a((dqj)$$3);
         $$2.a(awk.au);
      }
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
