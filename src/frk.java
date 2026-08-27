import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class frk extends fro {
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
   private static final eif k = new eif(0.0, -0.32F, 0.073F);
   private final Map<dho, frk.a> l;

   public frk(frb.a $$0) {
      super($$0);
      this.l = dho.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new frk.a($$0.a(fiv.b($$1)))));
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
   public void a(dff $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      dgb $$6 = $$0.q();
      day $$7 = (day)$$6.b();
      dho $$8 = day.a($$7);
      frk.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(emh $$0, float $$1, dgb $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(emh $$0, int $$1, int $$2, fgt $$3, eml $$4) {
      frk.a $$5 = (frk.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   gce a(dho $$0) {
      return fpp.b($$0);
   }

   @Override
   eif d() {
      return k;
   }

   public static fjc e() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("board", fjb.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), fiy.a);
      $$1.a("plank", fjb.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), fiy.a);
      fjf $$2 = $$1.a("normalChains", fjb.c(), fiy.a);
      $$2.a("chainL1", fjb.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fiy.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fjb.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fiy.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fjb.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fiy.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fjb.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), fiy.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fjb.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), fiy.a);
      return fjc.a($$0, 64, 32);
   }

   public static final class a extends fgt {
      public final fiw a;
      public final fiw b;
      public final fiw c;
      public final fiw d;

      public a(fiw $$0) {
         super(fpj::e);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dgb $$0) {
         boolean $$1 = !($$0.b() instanceof cuz);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dgr.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(emh $$0, eml $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
