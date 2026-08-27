import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fti implements fsu<dgm> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = atm.h(16);
   private static final float d = 0.6666667F;
   private static final eju e = new eju(0.0, 0.33333334F, 0.046666667F);
   private final Map<div, fti.a> f;
   private final eum g;

   public fti(fsv.a $$0) {
      this.f = div.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fti.a($$0.a(fkn.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dgm $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      dhi $$6 = $$0.q();
      dbz $$7 = (dbz)$$6.b();
      div $$8 = dbz.a($$7);
      fti.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dcu;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dgm $$0, enw $$1, fqu $$2, int $$3, int $$4, dhi $$5, dbz $$6, div $$7, fil $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.j(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(enw $$0, float $$1, dhi $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dcu)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(enw $$0, fqu $$1, int $$2, int $$3, div $$4, fil $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gdy $$7 = this.a($$4);
      eoa $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(enw $$0, int $$1, int $$2, fil $$3, eoa $$4) {
      fti.a $$5 = (fti.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gdy a(div $$0) {
      return frj.a($$0);
   }

   void a(ht $$0, dgn $$1, enw $$2, fqu $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      asy[] $$10 = $$1.a(etd.N().aP(), $$1x -> {
         List<asy> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? asy.a : $$2x.get(0);
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
         asy $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, eum.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(enw $$0, boolean $$1, eju $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eju d() {
      return e;
   }

   static boolean a(ht $$0, int $$1) {
      if ($$1 == cjx.p.g()) {
         return true;
      } else {
         etd $$2 = etd.N();
         fpw $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gr()) {
            return true;
         } else {
            bkq $$4 = $$2.al();
            return $$4 != null && $$4.f(eju.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dgn $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cjx.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)asw.b.b($$1) * 0.4);
         int $$4 = (int)((double)asw.b.c($$1) * 0.4);
         int $$5 = (int)((double)asw.b.d($$1) * 0.4);
         return asw.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fti.a a(fkk $$0, div $$1) {
      return new fti.a($$0.a(fkn.a($$1)));
   }

   public static fku f() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("sign", fkt.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fkq.a);
      $$1.a("stick", fkt.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fkq.a);
      return fku.a($$0, 64, 32);
   }

   public static final class a extends fil {
      public final fko a;
      public final fko b;

      public a(fko $$0) {
         super(frc::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(enw $$0, eoa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
