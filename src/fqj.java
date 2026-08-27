import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqj extends fqn {
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
   private static final ehi k = new ehi(0.0, -0.32F, 0.073F);
   private final Map<dgr, fqj.a> l;

   public fqj(fqa.a $$0) {
      super($$0);
      this.l = dgr.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqj.a($$0.a(fhw.b($$1)))));
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
   public void a(ddy $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      dfe $$6 = $$0.q();
      czq $$7 = (czq)$$6.b();
      dgr $$8 = czq.a($$7);
      fqj.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(elk $$0, float $$1, dfe $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(elk $$0, int $$1, int $$2, ffu $$3, elo $$4) {
      fqj.a $$5 = (fqj.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gbd a(dgr $$0) {
      return fon.b($$0);
   }

   @Override
   ehi d() {
      return k;
   }

   public static fid e() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("board", fic.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fhz.a);
      $$1.a("plank", fic.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fhz.a);
      fig $$2 = $$1.a("normalChains", fic.c(), fhz.a);
      $$2.a("chainL1", fic.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhz.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fic.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhz.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fic.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhz.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fic.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhz.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fic.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fhz.a);
      return fid.a($$0, 64, 32);
   }

   public static final class a extends ffu {
      public final fhx a;
      public final fhx b;
      public final fhx c;
      public final fhx d;

      public a(fhx $$0) {
         super(foh::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dfe $$0) {
         boolean $$1 = !($$0.b() instanceof cto);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dfu.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(elk $$0, elo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
