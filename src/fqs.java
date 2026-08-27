import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fqs implements fqe<ded> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = arw.h(16);
   private static final float d = 0.6666667F;
   private static final ehn e = new ehn(0.0, 0.33333334F, 0.046666667F);
   private final Map<dgw, fqs.a> f;
   private final esd g;

   public fqs(fqf.a $$0) {
      this.f = dgw.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqs.a($$0.a(fib.a($$1)))));
      this.g = $$0.f();
   }

   public void a(ded $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      dfj $$6 = $$0.q();
      czv $$7 = (czv)$$6.b();
      dgw $$8 = czv.a($$7);
      fqs.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof daq;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(ded $$0, elp $$1, foe $$2, int $$3, int $$4, dfj $$5, czv $$6, dgw $$7, ffz $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(elp $$0, float $$1, dfj $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof daq)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(elp $$0, foe $$1, int $$2, int $$3, dgw $$4, ffz $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gbi $$7 = this.a($$4);
      elt $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(elp $$0, int $$1, int $$2, ffz $$3, elt $$4) {
      fqs.a $$5 = (fqs.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gbi a(dgw $$0) {
      return fot.a($$0);
   }

   void a(gw $$0, dee $$1, elp $$2, foe $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      arj[] $$10 = $$1.a(eqv.O().aQ(), $$1x -> {
         List<arj> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? arj.a : $$2x.get(0);
      });
      int $$11;
      boolean $$12;
      int $$13;
      if ($$1.a()) {
         $$11 = $$1.b().g();
         $$12 = a($$0, $$11);
         $$13 = 15728880;
      } else {
         $$11 = $$8;
         $$12 = false;
         $$13 = $$4;
      }

      for (int $$17 = 0; $$17 < 4; $$17++) {
         arj $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, esd.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(elp $$0, boolean $$1, ehn $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ehn d() {
      return e;
   }

   static boolean a(gw $$0, int $$1) {
      if ($$1 == cht.p.g()) {
         return true;
      } else {
         eqv $$2 = eqv.O();
         fng $$3 = $$2.s;
         if ($$3 != null && $$2.m.aw().a() && $$3.gp()) {
            return true;
         } else {
            biq $$4 = $$2.am();
            return $$4 != null && $$4.e(ehn.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dee $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cht.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)arh.b.b($$1) * 0.4);
         int $$4 = (int)((double)arh.b.c($$1) * 0.4);
         int $$5 = (int)((double)arh.b.d($$1) * 0.4);
         return arh.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fqs.a a(fhy $$0, dgw $$1) {
      return new fqs.a($$0.a(fib.a($$1)));
   }

   public static fii f() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("sign", fih.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fie.a);
      $$1.a("stick", fih.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fie.a);
      return fii.a($$0, 64, 32);
   }

   public static final class a extends ffz {
      public final fic a;
      public final fic b;

      public a(fic $$0) {
         super(fom::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
