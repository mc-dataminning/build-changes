import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fsr extends fsv {
   private static final String a = "plank";
   private static final String b = "vChains";
   private static final String c = "normalChains";
   private static final String d = "chainL1";
   private static final String e = "chainL2";
   private static final String f = "chainR1";
   private static final String g = "chainR2";
   private static final String h = "board";
   private static final float i = 1.0F;
   private static final float j = 0.9F;
   private static final eji k = new eji(0.0, -0.32F, 0.073F);
   private final Map<dij, fsr.a> l;

   public fsr(fsi.a $$0) {
      super($$0);
      this.l = dij.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fsr.a($$0.a(fka.b($$1)))));
   }

   @Override
   public float b() {
      return 1.0F;
   }

   @Override
   public float c() {
      return 0.9F;
   }

   @Override
   public void a(dga $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      dgw $$6 = $$0.q();
      dbs $$7 = (dbs)$$6.b();
      dij $$8 = dbs.a($$7);
      fsr.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(enk $$0, float $$1, dgw $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(enk $$0, int $$1, int $$2, fhy $$3, eno $$4) {
      fsr.a $$5 = (fsr.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gdl a(dij $$0) {
      return fqw.b($$0);
   }

   @Override
   eji d() {
      return k;
   }

   public static fkh e() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      $$1.a("board", fkg.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fkd.a);
      $$1.a("plank", fkg.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fkd.a);
      fkk $$2 = $$1.a("normalChains", fkg.c(), fkd.a);
      $$2.a("chainL1", fkg.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkd.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fkg.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkd.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fkg.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkd.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fkg.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkd.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fkg.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fkd.a);
      return fkh.a($$0, 64, 32);
   }

   public static final class a extends fhy {
      public final fkb a;
      public final fkb b;
      public final fkb c;
      public final fkb d;

      public a(fkb $$0) {
         super(fqp::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dgw $$0) {
         boolean $$1 = !($$0.b() instanceof cvs);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dhm.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(enk $$0, eno $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
