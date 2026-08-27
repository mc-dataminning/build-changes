import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fpz implements fpl<ddu> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = arp.h(16);
   private static final float d = 0.6666667F;
   private static final ehe e = new ehe(0.0, 0.33333334F, 0.046666667F);
   private final Map<dgn, fpz.a> f;
   private final eru g;

   public fpz(fpm.a $$0) {
      this.f = dgn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fpz.a($$0.a(fhm.a($$1)))));
      this.g = $$0.f();
   }

   public void a(ddu $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      dfa $$6 = $$0.q();
      czm $$7 = (czm)$$6.b();
      dgn $$8 = czm.a($$7);
      fpz.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dah;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(ddu $$0, elg $$1, fnl $$2, int $$3, int $$4, dfa $$5, czm $$6, dgn $$7, ffk $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(elg $$0, float $$1, dfa $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dah)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(elg $$0, fnl $$1, int $$2, int $$3, dgn $$4, ffk $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gap $$7 = this.a($$4);
      elk $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(elg $$0, int $$1, int $$2, ffk $$3, elk $$4) {
      fpz.a $$5 = (fpz.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gap a(dgn $$0) {
      return fnz.a($$0);
   }

   void a(gu $$0, ddv $$1, elg $$2, fnl $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      arc[] $$10 = $$1.a(eqm.O().aQ(), $$1x -> {
         List<arc> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? arc.a : $$2x.get(0);
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
         arc $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, eru.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(elg $$0, boolean $$1, ehe $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ehe d() {
      return e;
   }

   static boolean a(gu $$0, int $$1) {
      if ($$1 == chm.p.g()) {
         return true;
      } else {
         eqm $$2 = eqm.O();
         fmn $$3 = $$2.v;
         if ($$3 != null && $$2.m.au().a() && $$3.go()) {
            return true;
         } else {
            bii $$4 = $$2.am();
            return $$4 != null && $$4.e(ehe.b($$0)) < (double)c;
         }
      }
   }

   public static int a(ddv $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == chm.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ara.b.b($$1) * 0.4);
         int $$4 = (int)((double)ara.b.c($$1) * 0.4);
         int $$5 = (int)((double)ara.b.d($$1) * 0.4);
         return ara.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fpz.a a(fhj $$0, dgn $$1) {
      return new fpz.a($$0.a(fhm.a($$1)));
   }

   public static fht f() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("sign", fhs.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fhp.a);
      $$1.a("stick", fhs.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fhp.a);
      return fht.a($$0, 64, 32);
   }

   public static final class a extends ffk {
      public final fhn a;
      public final fhn b;

      public a(fhn $$0) {
         super(fnt::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(elg $$0, elk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
