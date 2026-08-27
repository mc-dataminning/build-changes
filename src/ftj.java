import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class ftj extends ftn {
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
   private static final ejz k = new ejz(0.0, -0.32F, 0.073F);
   private final Map<dja, ftj.a> l;

   public ftj(fta.a $$0) {
      super($$0);
      this.l = dja.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new ftj.a($$0.a(fks.b($$1)))));
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
   public void a(dgr $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      dhn $$6 = $$0.r();
      dce $$7 = (dce)$$6.b();
      dja $$8 = dce.a($$7);
      ftj.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(eob $$0, float $$1, dhn $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(eob $$0, int $$1, int $$2, fiq $$3, eof $$4) {
      ftj.a $$5 = (ftj.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   ged a(dja $$0) {
      return fro.b($$0);
   }

   @Override
   ejz d() {
      return k;
   }

   public static fkz e() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("board", fky.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fkv.a);
      $$1.a("plank", fky.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fkv.a);
      flc $$2 = $$1.a("normalChains", fky.c(), fkv.a);
      $$2.a("chainL1", fky.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkv.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fky.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkv.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fky.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkv.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fky.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fkv.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fky.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fkv.a);
      return fkz.a($$0, 64, 32);
   }

   public static final class a extends fiq {
      public final fkt a;
      public final fkt b;
      public final fkt c;
      public final fkt d;

      public a(fkt $$0) {
         super(frh::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dhn $$0) {
         boolean $$1 = !($$0.b() instanceof cwe);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(did.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(eob $$0, eof $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
