import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqo extends fqs {
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
   private static final ehn k = new ehn(0.0, -0.32F, 0.073F);
   private final Map<dgw, fqo.a> l;

   public fqo(fqf.a $$0) {
      super($$0);
      this.l = dgw.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqo.a($$0.a(fib.b($$1)))));
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
   public void a(ded $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      dfj $$6 = $$0.q();
      czv $$7 = (czv)$$6.b();
      dgw $$8 = czv.a($$7);
      fqo.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(elp $$0, float $$1, dfj $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(elp $$0, int $$1, int $$2, ffz $$3, elt $$4) {
      fqo.a $$5 = (fqo.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gbi a(dgw $$0) {
      return fot.b($$0);
   }

   @Override
   ehn d() {
      return k;
   }

   public static fii e() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("board", fih.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fie.a);
      $$1.a("plank", fih.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fie.a);
      fil $$2 = $$1.a("normalChains", fih.c(), fie.a);
      $$2.a("chainL1", fih.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fie.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fih.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fie.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fih.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fie.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fih.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fie.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fih.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fie.a);
      return fii.a($$0, 64, 32);
   }

   public static final class a extends ffz {
      public final fic a;
      public final fic b;
      public final fic c;
      public final fic d;

      public a(fic $$0) {
         super(fom::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dfj $$0) {
         boolean $$1 = !($$0.b() instanceof ctt);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dfz.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
