import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;

public class ftn implements fsz<dgr> {
   private static final String a = "stick";
   private static final int b = -988212;
   private static final int c = atq.h(16);
   private static final float d = 0.6666667F;
   private static final ejz e = new ejz(0.0, 0.33333334F, 0.046666667F);
   private final Map<dja, ftn.a> f;
   private final eur g;

   public ftn(fta.a $$0) {
      this.f = dja.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ftn.a($$0.a(fks.a($$1)))));
      this.g = $$0.f();
   }

   public void a(dgr $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      dhn $$6 = $$0.r();
      dce $$7 = (dce)$$6.b();
      dja $$8 = dce.a($$7);
      ftn.a $$9 = this.f.get($$8);
      $$9.b.k = $$6.b() instanceof dcz;
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public float b() {
      return 0.6666667F;
   }

   public float c() {
      return 0.6666667F;
   }

   void a(dgr $$0, eob $$1, fqz $$2, int $$3, int $$4, dhn $$5, dce $$6, dja $$7, fiq $$8) {
      $$1.a();
      this.a($$1, -$$6.g($$5), $$5);
      this.a($$1, $$2, $$3, $$4, $$7, $$8);
      this.a($$0.aC_(), $$0.k(), $$1, $$2, $$3, $$0.c(), $$0.d(), true);
      this.a($$0.aC_(), $$0.l(), $$1, $$2, $$3, $$0.c(), $$0.d(), false);
      $$1.b();
   }

   void a(eob $$0, float $$1, dhn $$2) {
      $$0.a(0.5F, 0.75F * this.b(), 0.5F);
      $$0.a(a.d.rotationDegrees($$1));
      if (!($$2.b() instanceof dcz)) {
         $$0.a(0.0F, -0.3125F, -0.4375F);
      }
   }

   void a(eob $$0, fqz $$1, int $$2, int $$3, dja $$4, fiq $$5) {
      $$0.a();
      float $$6 = this.b();
      $$0.b($$6, -$$6, -$$6);
      ged $$7 = this.a($$4);
      eof $$8 = $$7.a($$1, $$5::a);
      this.a($$0, $$2, $$3, $$5, $$8);
      $$0.b();
   }

   void a(eob $$0, int $$1, int $$2, fiq $$3, eof $$4) {
      ftn.a $$5 = (ftn.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   ged a(dja $$0) {
      return fro.a($$0);
   }

   void a(hx $$0, dgs $$1, eob $$2, fqz $$3, int $$4, int $$5, int $$6, boolean $$7) {
      $$2.a();
      this.a($$2, $$7, this.d());
      int $$8 = a($$1);
      int $$9 = 4 * $$5 / 2;
      atc[] $$10 = $$1.a(eti.N().aP(), $$1x -> {
         List<atc> $$2x = this.g.c($$1x, $$6);
         return $$2x.isEmpty() ? atc.a : $$2x.get(0);
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
         atc $$18 = $$10[$$17];
         float $$19 = (float)(-this.g.a($$18) / 2);
         if ($$12) {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, $$8, $$2.c().a(), $$3, $$13);
         } else {
            this.g.a($$18, $$19, (float)($$17 * $$5 - $$9), $$11, false, $$2.c().a(), $$3, eur.a.c, 0, $$13);
         }
      }

      $$2.b();
   }

   private void a(eob $$0, boolean $$1, ejz $$2) {
      if (!$$1) {
         $$0.a(a.d.rotationDegrees(180.0F));
      }

      float $$3 = 0.015625F * this.c();
      $$0.a($$2.c, $$2.d, $$2.e);
      $$0.b($$3, -$$3, $$3);
   }

   ejz d() {
      return e;
   }

   static boolean a(hx $$0, int $$1) {
      if ($$1 == ckc.p.g()) {
         return true;
      } else {
         eti $$2 = eti.N();
         fqb $$3 = $$2.s;
         if ($$3 != null && $$2.m.ax().a() && $$3.gr()) {
            return true;
         } else {
            bkv $$4 = $$2.al();
            return $$4 != null && $$4.f(ejz.b($$0)) < (double)c;
         }
      }
   }

   public static int a(dgs $$0) {
      int $$1 = $$0.b().g();
      if ($$1 == ckc.p.g() && $$0.a()) {
         return -988212;
      } else {
         double $$2 = 0.4;
         int $$3 = (int)((double)ata.b.b($$1) * 0.4);
         int $$4 = (int)((double)ata.b.c($$1) * 0.4);
         int $$5 = (int)((double)ata.b.d($$1) * 0.4);
         return ata.b.a(0, $$3, $$4, $$5);
      }
   }

   public static ftn.a a(fkp $$0, dja $$1) {
      return new ftn.a($$0.a(fks.a($$1)));
   }

   public static fkz f() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("sign", fky.c().a(0, 0).a(-12.0F, -14.0F, -1.0F, 24.0F, 12.0F, 2.0F), fkv.a);
      $$1.a("stick", fky.c().a(0, 14).a(-1.0F, -2.0F, -1.0F, 2.0F, 14.0F, 2.0F), fkv.a);
      return fkz.a($$0, 64, 32);
   }

   public static final class a extends fiq {
      public final fkt a;
      public final fkt b;

      public a(fkt $$0) {
         super(frh::e);
         this.a = $$0;
         this.b = $$0.b("stick");
      }

      @Override
      public void a(eob $$0, eof $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
