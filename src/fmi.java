import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fmi implements flu<dav> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = apa.h(16);
   private static final float d = 0.6666667F;
   private static final eei e = new eei(0.0, 0.33333334F, 0.046666667F);
   private final Map<ddo, fmi.a> f;
   private final eov g;

   public fmi(flv.a $$0) {
      this.f = ddo.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fmi.a($$0.a(fed.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dav $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      dcb $$6 = $$0.q();
      cwn $$7 = (cwn)$$6.b();
      ddo $$8 = cwn.a($$7);
      fmi.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof cxi;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dav $$0, eij $$1, fjx $$2, int $$3, int $$4, dcb $$5, cwn $$6, ddo $$7, fcb $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(eij $$0, float $$1, dcb $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof cxi)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eij $$0, fjx $$1, int $$2, int $$3, ddo $$4, fcb $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      fwu $$7 = this.a($$4);
      ein $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eij $$0, int $$1, int $$2, fcb $$3, ein $$4) {
      fmi.a $$5 = (fmi.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   fwu a(ddo $$0) {
      return fkj.a($$0);
   }

   void a(gu $$0, daw $$1, eij $$2, fjx $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      aom[] $$10 = $$1.a(enn.N().aP(), $$1x -> {
         List<aom> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? aom.a : $$2x.get(0);
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
         aom $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, eov.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eij $$0, boolean $$1, eei $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   eei d() {
      return e;
   }

   static boolean a(gu $$0, int $$1) {
      if ($$1 == cen.p.g()) {
         return true;
      } else {
         enn $$2 = enn.N();
         fiy $$3 = $$2.t;
         if ($$3 != null && $$2.m.au().a() && $$3.gl()) {
            return true;
         } else {
            bfj $$4 = $$2.al();
            return $$4 != null && $$4.e(eei.b($$0)) < (double)c;
         }
      }
   }

   static int a(daw $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == cen.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)aok.b.b($$1) * 0.4);
         int $$4 = (int)((double)aok.b.c($$1) * 0.4);
         int $$5 = (int)((double)aok.b.d($$1) * 0.4);
         return aok.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fmi.a a(fea $$0, ddo $$1) {
      return new fmi.a($$0.a(fed.a($$1)));
   }

   public static fek f() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("sign", fej.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), feg.a);
      $$1.a("stick", fej.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), feg.a);
      return fek.a($$0, 64, 32);
   }

   public static final class a extends fcb {
      public final fee a;
      public final fee b;

      public a(fee $$0) {
         super(fkf::d);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
