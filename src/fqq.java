import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqq extends fqu {
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
   private static final ehp k = new ehp(0.0, -0.32F, 0.073F);
   private final Map<dgy, fqq.a> l;

   public fqq(fqh.a $$0) {
      super($$0);
      this.l = dgy.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqq.a($$0.a(fid.b($$1)))));
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
   public void a(def $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      dfl $$6 = $$0.q();
      czx $$7 = (czx)$$6.b();
      dgy $$8 = czx.a($$7);
      fqq.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(elr $$0, float $$1, dfl $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(elr $$0, int $$1, int $$2, fgb $$3, elv $$4) {
      fqq.a $$5 = (fqq.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gbk a(dgy $$0) {
      return fov.b($$0);
   }

   @Override
   ehp d() {
      return k;
   }

   public static fik e() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("board", fij.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fig.a);
      $$1.a("plank", fij.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fig.a);
      fin $$2 = $$1.a("normalChains", fij.c(), fig.a);
      $$2.a("chainL1", fij.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fig.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fij.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fig.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fij.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fig.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fij.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fig.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fij.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fig.a);
      return fik.a($$0, 64, 32);
   }

   public static final class a extends fgb {
      public final fie a;
      public final fie b;
      public final fie c;
      public final fie d;

      public a(fie $$0) {
         super(foo::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dfl $$0) {
         boolean $$1 = !($$0.b() instanceof ctv);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dgb.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(elr $$0, elv $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
