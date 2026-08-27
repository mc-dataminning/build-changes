import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class fqo implements fqa<deh> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = asb.h(16);
   private static final float d = 0.6666667F;
   private static final ehh e = new ehh(0.0, 0.33333334F, 0.046666667F);
   private final Map<dgq, fqo.a> f;
   private final erx g;

   public fqo(fqb.a $$0) {
      this.f = dgq.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqo.a($$0.a(fhw.a($$1)))));
      this.g = $$0.f();
   }

   public void a(deh $$0, float $$1, elj $$2, foa $$3, int $$4, int $$5) {
      dfd $$6 = $$0.q();
      daa $$7 = (daa)$$6.b();
      dgq $$8 = daa.a($$7);
      fqo.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dav;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(deh $$0, elj $$1, foa $$2, int $$3, int $$4, dfd $$5, daa $$6, dgq $$7, ffu $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.p(), $$0.g(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.p(), $$0.i(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(elj $$0, float $$1, dfd $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dav)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(elj $$0, foa $$1, int $$2, int $$3, dgq $$4, ffu $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      gbe $$7 = this.a($$4);
      eln $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(elj $$0, int $$1, int $$2, ffu $$3, eln $$4) {
      fqo.a $$5 = (fqo.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   gbe a(dgq $$0) {
      return foo.a($$0);
   }

   void a(gw $$0, dei $$1, elj $$2, foa $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      arn[] $$10 = $$1.a(eqp.O().aQ(), $$1x -> {
         List<arn> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? arn.a : $$2x.get(0);
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
         arn $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, erx.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(elj $$0, boolean $$1, ehh $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ehh d() {
      return e;
   }

   static boolean a(gw $$0, int $$1) {
      if ($$1 == chz.p.g()) {
         return true;
      } else {
         eqp $$2 = eqp.O();
         fnc $$3 = $$2.s;
         if ($$3 != null && $$2.m.aw().a() && $$3.gq()) {
            return true;
         } else {
            biw $$4 = $$2.am();
            return $$4 != null && $$4.e(ehh.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dei $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == chz.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)arl.b.b($$1) * 0.4);
         int $$4 = (int)((double)arl.b.c($$1) * 0.4);
         int $$5 = (int)((double)arl.b.d($$1) * 0.4);
         return arl.b.a(0, $$3, $$4, $$5);
      }
   }

   public static fqo.a a(fht $$0, dgq $$1) {
      return new fqo.a($$0.a(fhw.a($$1)));
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
         super(foi::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(elj $$0, eln $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
