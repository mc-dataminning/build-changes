import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fqu implements fqg<def> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = ary.h(16);
   private static final float d = 0.6666667F;
   private static final ehp e = new ehp(0.0, 0.33333334F, 0.046666667F);
   private final Map<dgy, fqu.a> f;
   private final esf g;

   public fqu(fqh.a $$0) {
      this.f = dgy.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqu.a($$0.a(fid.a($$1)))));
      this.g = $$0.f();
   }

   public void a(def $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      dfl $$6 = $$0.q();
      czx $$7 = (czx)$$6.b();
      dgy $$8 = czx.a($$7);
      fqu.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof das;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(def $$0, elr $$1, fog $$2, int $$3, int $$4, dfl $$5, czx $$6, dgy $$7, fgb $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(elr $$0, float $$1, dfl $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof das)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(elr $$0, fog $$1, int $$2, int $$3, dgy $$4, fgb $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gbk $$7 = this.a($$4);
      elv $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(elr $$0, int $$1, int $$2, fgb $$3, elv $$4) {
      fqu.a $$5 = (fqu.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gbk a(dgy $$0) {
      return fov.a($$0);
   }

   void a(gw $$0, deg $$1, elr $$2, fog $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      arl[] $$10 = $$1.a(eqx.O().aQ(), $$1x -> {
         List<arl> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? arl.a : $$2x.get(0);
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
         arl $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, esf.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(elr $$0, boolean $$1, ehp $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ehp d() {
      return e;
   }

   static boolean a(gw $$0, int $$1) {
      if ($$1 == chv.p.g()) {
         return true;
      } else {
         eqx $$2 = eqx.O();
         fni $$3 = $$2.s;
         if ($$3 != null && $$2.m.aw().a() && $$3.gp()) {
            return true;
         } else {
            bis $$4 = $$2.am();
            return $$4 != null && $$4.e(ehp.b($$0)) < (double)c;
         }
      }
   }

   public static int a(deg $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == chv.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)arj.b.b($$1) * 0.4);
         int $$4 = (int)((double)arj.b.c($$1) * 0.4);
         int $$5 = (int)((double)arj.b.d($$1) * 0.4);
         return arj.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fqu.a a(fia $$0, dgy $$1) {
      return new fqu.a($$0.a(fid.a($$1)));
   }

   public static fik f() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("sign", fij.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fig.a);
      $$1.a("stick", fij.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fig.a);
      return fik.a($$0, 64, 32);
   }

   public static final class a extends fgb {
      public final fie a;
      public final fie b;

      public a(fie $$0) {
         super(foo::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(elr $$0, elv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
