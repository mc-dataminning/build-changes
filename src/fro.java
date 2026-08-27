import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fro implements fra<dff> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = asy.h(16);
   private static final float d = 0.6666667F;
   private static final eif e = new eif(0.0, 0.33333334F, 0.046666667F);
   private final Map<dho, fro.a> f;
   private final esw g;

   public fro(frb.a $$0) {
      this.f = dho.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fro.a($$0.a(fiv.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dff $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      dgb $$6 = $$0.q();
      day $$7 = (day)$$6.b();
      dho $$8 = day.a($$7);
      fro.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dbt;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dff $$0, emh $$1, fpb $$2, int $$3, int $$4, dgb $$5, day $$6, dho $$7, fgt $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.j(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(emh $$0, float $$1, dgb $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dbt)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(emh $$0, fpb $$1, int $$2, int $$3, dho $$4, fgt $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gce $$7 = this.a($$4);
      eml $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(emh $$0, int $$1, int $$2, fgt $$3, eml $$4) {
      fro.a $$5 = (fro.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gce a(dho $$0) {
      return fpp.a($$0);
   }

   void a(ht $$0, dfg $$1, emh $$2, fpb $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ask[] $$10 = $$1.a(ero.O().aQ(), $$1x -> {
         List<ask> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? ask.a : $$2x.get(0);
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
         ask $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, esw.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(emh $$0, boolean $$1, eif $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eif d() {
      return e;
   }

   static boolean a(ht $$0, int $$1) {
      if ($$1 == cix.p.g()) {
         return true;
      } else {
         ero $$2 = ero.O();
         foc $$3 = $$2.s;
         if ($$3 != null && $$2.m.aw().a() && $$3.gq()) {
            return true;
         } else {
            bjt $$4 = $$2.am();
            return $$4 != null && $$4.e(eif.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dfg $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cix.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)asi.b.b($$1) * 0.4);
         int $$4 = (int)((double)asi.b.c($$1) * 0.4);
         int $$5 = (int)((double)asi.b.d($$1) * 0.4);
         return asi.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fro.a a(fis $$0, dho $$1) {
      return new fro.a($$0.a(fiv.a($$1)));
   }

   public static fjc f() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("sign", fjb.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fiy.a);
      $$1.a("stick", fjb.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fiy.a);
      return fjc.a($$0, 64, 32);
   }

   public static final class a extends fgt {
      public final fiw a;
      public final fiw b;

      public a(fiw $$0) {
         super(fpj::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(emh $$0, eml $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
