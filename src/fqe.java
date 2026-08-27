import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqe extends fqi {
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
   private static final ehd k = new ehd(0.0, -0.32F, 0.073F);
   private final Map<dgm, fqe.a> l;

   public fqe(fpv.a $$0) {
      super($$0);
      this.l = dgm.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqe.a($$0.a(fhr.b($$1)))));
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
   public void a(ddt $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      dez $$6 = $$0.q();
      czl $$7 = (czl)$$6.b();
      dgm $$8 = czl.a($$7);
      fqe.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(elf $$0, float $$1, dez $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(elf $$0, int $$1, int $$2, ffp $$3, elj $$4) {
      fqe.a $$5 = (fqe.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gay a(dgm $$0) {
      return foi.b($$0);
   }

   @Override
   ehd d() {
      return k;
   }

   public static fhy e() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      $$1.a("board", fhx.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fhu.a);
      $$1.a("plank", fhx.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fhu.a);
      fib $$2 = $$1.a("normalChains", fhx.c(), fhu.a);
      $$2.a("chainL1", fhx.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhu.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fhx.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhu.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fhx.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhu.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fhx.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fhu.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fhx.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fhu.a);
      return fhy.a($$0, 64, 32);
   }

   public static final class a extends ffp {
      public final fhs a;
      public final fhs b;
      public final fhs c;
      public final fhs d;

      public a(fhs $$0) {
         super(foc::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dez $$0) {
         boolean $$1 = !($$0.b() instanceof ctj);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dfp.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(elf $$0, elj $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
