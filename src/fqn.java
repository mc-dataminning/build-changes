import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fqn implements fpz<ddy> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ars.h(16);
   private static final float d = 0.6666667F;
   private static final ehi e = new ehi(0.0, 0.33333334F, 0.046666667F);
   private final Map<dgr, fqn.a> f;
   private final ery g;

   public fqn(fqa.a $$0) {
      this.f = dgr.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqn.a($$0.a(fhw.a($$1)))));
      this.g = $$0.f();
   }

   public void a(ddy $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      dfe $$6 = $$0.q();
      czq $$7 = (czq)$$6.b();
      dgr $$8 = czq.a($$7);
      fqn.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dal;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(ddy $$0, elk $$1, fnz $$2, int $$3, int $$4, dfe $$5, czq $$6, dgr $$7, ffu $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(elk $$0, float $$1, dfe $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dal)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(elk $$0, fnz $$1, int $$2, int $$3, dgr $$4, ffu $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gbd $$7 = this.a($$4);
      elo $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(elk $$0, int $$1, int $$2, ffu $$3, elo $$4) {
      fqn.a $$5 = (fqn.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gbd a(dgr $$0) {
      return fon.a($$0);
   }

   void a(gw $$0, ddz $$1, elk $$2, fnz $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      arf[] $$10 = $$1.a(eqq.O().aQ(), $$1x -> {
         List<arf> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? arf.a : $$2x.get(0);
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
         arf $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, ery.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(elk $$0, boolean $$1, ehi $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ehi d() {
      return e;
   }

   static boolean a(gw $$0, int $$1) {
      if ($$1 == cho.p.g()) {
         return true;
      } else {
         eqq $$2 = eqq.O();
         fnb $$3 = $$2.s;
         if ($$3 != null && $$2.m.av().a() && $$3.go()) {
            return true;
         } else {
            bil $$4 = $$2.am();
            return $$4 != null && $$4.e(ehi.b($$0)) < (double)c;
         }
      }
   }

   public static int a(ddz $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cho.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ard.b.b($$1) * 0.4);
         int $$4 = (int)((double)ard.b.c($$1) * 0.4);
         int $$5 = (int)((double)ard.b.d($$1) * 0.4);
         return ard.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fqn.a a(fht $$0, dgr $$1) {
      return new fqn.a($$0.a(fhw.a($$1)));
   }

   public static fid f() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("sign", fic.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fhz.a);
      $$1.a("stick", fic.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fhz.a);
      return fid.a($$0, 64, 32);
   }

   public static final class a extends ffu {
      public final fhx a;
      public final fhx b;

      public a(fhx $$0) {
         super(foh::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(elk $$0, elo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
