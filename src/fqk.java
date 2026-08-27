import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fqk extends fqo {
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
   private static final ehh k = new ehh(0.0, -0.32F, 0.073F);
   private final Map<dgq, fqk.a> l;

   public fqk(fqb.a $$0) {
      super($$0);
      this.l = dgq.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fqk.a($$0.a(fhw.b($$1)))));
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
   public void a(deh $$0, float $$1, elj $$2, foa $$3, int $$4, int $$5) {
      dfd $$6 = $$0.q();
      daa $$7 = (daa)$$6.b();
      dgq $$8 = daa.a($$7);
      fqk.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(elj $$0, float $$1, dfd $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(elj $$0, int $$1, int $$2, ffu $$3, eln $$4) {
      fqk.a $$5 = (fqk.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gbe a(dgq $$0) {
      return foo.b($$0);
   }

   @Override
   ehh d() {
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
         super(foi::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dfd $$0) {
         boolean $$1 = !($$0.b() instanceof cub);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dft.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(elj $$0, eln $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
