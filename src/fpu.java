import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fpu implements fpg<dds> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = aro.h(16);
   private static final float d = 0.6666667F;
   private static final ehf e = new ehf(0.0, 0.33333334F, 0.046666667F);
   private final Map<dgl, fpu.a> f;
   private final erv g;

   public fpu(fph.a $$0) {
      this.f = dgl.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fpu.a($$0.a(fhi.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dds $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      dey $$6 = $$0.q();
      czk $$7 = (czk)$$6.b();
      dgl $$8 = czk.a($$7);
      fpu.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof daf;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dds $$0, elh $$1, fng $$2, int $$3, int $$4, dey $$5, czk $$6, dgl $$7, ffg $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(elh $$0, float $$1, dey $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof daf)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(elh $$0, fng $$1, int $$2, int $$3, dgl $$4, ffg $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gak $$7 = this.a($$4);
      ell $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(elh $$0, int $$1, int $$2, ffg $$3, ell $$4) {
      fpu.a $$5 = (fpu.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gak a(dgl $$0) {
      return fnu.a($$0);
   }

   void a(gv $$0, ddt $$1, elh $$2, fng $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      ara[] $$10 = $$1.a(eqn.N().aP(), $$1x -> {
         List<ara> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? ara.a : $$2x.get(0);
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
         ara $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, erv.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(elh $$0, boolean $$1, ehf $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ehf d() {
      return e;
   }

   static boolean a(gv $$0, int $$1) {
      if ($$1 == chk.p.g()) {
         return true;
      } else {
         eqn $$2 = eqn.N();
         fmi $$3 = $$2.t;
         if ($$3 != null && $$2.m.au().a() && $$3.go()) {
            return true;
         } else {
            big $$4 = $$2.al();
            return $$4 != null && $$4.e(ehf.b($$0)) < (double)c;
         }
      }
   }

   public static int a(ddt $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == chk.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)aqy.b.b($$1) * 0.4);
         int $$4 = (int)((double)aqy.b.c($$1) * 0.4);
         int $$5 = (int)((double)aqy.b.d($$1) * 0.4);
         return aqy.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fpu.a a(fhf $$0, dgl $$1) {
      return new fpu.a($$0.a(fhi.a($$1)));
   }

   public static fhp f() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("sign", fho.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fhl.a);
      $$1.a("stick", fho.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fhl.a);
      return fhp.a($$0, 64, 32);
   }

   public static final class a extends ffg {
      public final fhj a;
      public final fhj b;

      public a(fhj $$0) {
         super(fno::d);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(elh $$0, ell $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
