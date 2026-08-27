import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fme extends fmi {
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
   private static final eei k = new eei(0.0, -0.32F, 0.073F);
   private final Map<ddo, fme.a> l;

   public fme(flv.a $$0) {
      super($$0);
      this.l = ddo.a().collect(ImmutableMap.toImmutableMap($$0x -> $$0x, $$1 -> new fme.a($$0.a(fed.b($$1)))));
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
   public void a(dav $$0, float $$1, eij $$2, fjx $$3, int $$4, int $$5) {
      dcb $$6 = $$0.q();
      cwn $$7 = (cwn)$$6.b();
      ddo $$8 = cwn.a($$7);
      fme.a $$9 = this.l.get($$8);
      $$9.a($$6);
      this.a($$0, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   @Override
   void a(eij $$0, float $$1, dcb $$2) {
      $$0.a(0.5, 0.9375, 0.5);
      $$0.a(a.d.rotationDegrees($$1));
      $$0.a(0.0F, -0.3125F, 0.0F);
   }

   @Override
   void a(eij $$0, int $$1, int $$2, fcb $$3, ein $$4) {
      fme.a $$5 = (fme.a)$$3;
      $$5.a.a($$0, $$4, $$1, $$2);
   }

   @Override
   fwu a(ddo $$0) {
      return fkj.b($$0);
   }

   @Override
   eei d() {
      return k;
   }

   public static fek e() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      $$1.a("board", fej.c().a(0, 12).a(-7.0F, 0.0F, -1.0F, 14.0F, 10.0F, 2.0F), feg.a);
      $$1.a("plank", fej.c().a(0, 0).a(-8.0F, -6.0F, -2.0F, 16.0F, 2.0F, 4.0F), feg.a);
      fen $$2 = $$1.a("normalChains", fej.c(), feg.a);
      $$2.a("chainL1", fej.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), feg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainL2", fej.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), feg.a(-5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("chainR1", fej.c().a(0, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), feg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("chainR2", fej.c().a(6, 6).a(-1.5F, 0.0F, 0.0F, 3.0F, 6.0F, 0.0F), feg.a(5.0F, -6.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$1.a("vChains", fej.c().a(14, 6).a(-6.0F, -6.0F, 0.0F, 12.0F, 6.0F, 0.0F), feg.a);
      return fek.a($$0, 64, 32);
   }

   public static final class a extends fcb {
      public final fee a;
      public final fee b;
      public final fee c;
      public final fee d;

      public a(fee $$0) {
         super(fkf::d);
         this.a = $$0;
         this.b = $$0.b("plank");
         this.d = $$0.b("normalChains");
         this.c = $$0.b("vChains");
      }

      public void a(dcb $$0) {
         boolean $$1 = !($$0.b() instanceof cql);
         this.b.k = $$1;
         this.c.k = false;
         this.d.k = true;
         if (!$$1) {
            boolean $$2 = $$0.c(dcr.a);
            this.d.k = !$$2;
            this.c.k = $$2;
         }
      }

      @Override
      public void a(eij $$0, ein $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
