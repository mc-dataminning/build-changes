import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fsv implements fsh<dga> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ati.h(16);
   private static final float d = 0.6666667F;
   private static final eji e = new eji(0.0, 0.33333334F, 0.046666667F);
   private final Map<dij, fsv.a> f;
   private final etz g;

   public fsv(fsi.a $$0) {
      this.f = dij.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fsv.a($$0.a(fka.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dga $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      dgw $$6 = $$0.q();
      dbs $$7 = (dbs)$$6.b();
      dij $$8 = dbs.a($$7);
      fsv.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dcn;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dga $$0, enk $$1, fqh $$2, int $$3, int $$4, dgw $$5, dbs $$6, dij $$7, fhy $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.j(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(enk $$0, float $$1, dgw $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dcn)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(enk $$0, fqh $$1, int $$2, int $$3, dij $$4, fhy $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gdl $$7 = this.a($$4);
      eno $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(enk $$0, int $$1, int $$2, fhy $$3, eno $$4) {
      fsv.a $$5 = (fsv.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gdl a(dij $$0) {
      return fqw.a($$0);
   }

   void a(ht $$0, dgb $$1, enk $$2, fqh $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      asu[] $$10 = $$1.a(esr.N().aP(), $$1x -> {
         List<asu> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? asu.a : $$2x.get(0);
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
         asu $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, etz.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(enk $$0, boolean $$1, eji $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eji d() {
      return e;
   }

   static boolean a(ht $$0, int $$1) {
      if ($$1 == cjp.p.g()) {
         return true;
      } else {
         esr $$2 = esr.N();
         fpj $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gq()) {
            return true;
         } else {
            bki $$4 = $$2.al();
            return $$4 != null && $$4.e(eji.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dgb $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cjp.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ass.b.b($$1) * 0.4);
         int $$4 = (int)((double)ass.b.c($$1) * 0.4);
         int $$5 = (int)((double)ass.b.d($$1) * 0.4);
         return ass.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fsv.a a(fjx $$0, dij $$1) {
      return new fsv.a($$0.a(fka.a($$1)));
   }

   public static fkh f() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("sign", fkg.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fkd.a);
      $$1.a("stick", fkg.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fkd.a);
      return fkh.a($$0, 64, 32);
   }

   public static final class a extends fhy {
      public final fkb a;
      public final fkb b;

      public a(fkb $$0) {
         super(fqp::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(enk $$0, eno $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
