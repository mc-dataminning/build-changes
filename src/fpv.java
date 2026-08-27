import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fpv extends fpz {
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
   private static final ehe k = new ehe(0.0, -0.32F, 0.073F);
   private final Map<dgn, fpv.a> l;

   public fpv(fpm.a $$0) {
      super($$0);
      this.l = dgn.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fpv.a($$0.a(fhm.b($$1)))));
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
   public void a(ddu $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      dfa $$6 = $$0.q();
      czm $$7 = (czm)$$6.b();
      dgn $$8 = czm.a($$7);
      fpv.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(elg $$0, float $$1, dfa $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(elg $$0, int $$1, int $$2, ffk $$3, elk $$4) {
      fpv.a $$5 = (fpv.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gap a(dgn $$0) {
      return fnz.b($$0);
   }

   @Override
   ehe d() {
      return k;
   }

   public static fht e() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      $$1.a("board", fhs.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fhp.a);
      $$1.a("plank", fhs.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fhp.a);
      fhw $$2 = $$1.a("normalChains", fhs.c(), fhp.a);
      $$2.a("chainL1", fhs.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhp.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fhs.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhp.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fhs.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhp.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fhs.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhp.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fhs.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fhp.a);
      return fht.a($$0, 64, 32);
   }

   public static final class a extends ffk {
      public final fhn a;
      public final fhn b;
      public final fhn c;
      public final fhn d;

      public a(fhn $$0) {
         super(fnt::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dfa $$0) {
         boolean $$1 = !($$0.b() instanceof ctk);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dfq.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(elg $$0, elk $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
