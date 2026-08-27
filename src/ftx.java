import org.joml.Quaternionf;

public class ftx extends fuc<byj> {
   private static final afw a = new afw("textures/entity/end_crystal/end_crystal.png");
   private static final fpj f = fpj.e(a);
   private static final float g = (float)Math.sin(Math.PI / 4);
   private static final String h = "glass";
   private static final String i = "base";
   private final fiw j;
   private final fiw k;
   private final fiw l;

   public ftx(fud.a $$0) {
      super($$0);
      this.d = 0.5F;
      fiw $$1 = $$0.a(fiv.U);
      this.k = $$1.b("glass");
      this.j = $$1.b("cube");
      this.l = $$1.b("base");
   }

   public static fjc a() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("glass", fjb.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fiy.a);
      $$1.a("cube", fjb.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fiy.a);
      $$1.a("base", fjb.c().a(0, 16).a(-6.0F, 0.0F, -6.0F, 12.0F, 4.0F, 12.0F), fiy.a);
      return fjc.a($$0, 64, 32);
   }

   public void a(byj $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      float $$6 = a($$0, $$2);
      float $$7 = ((float)$$0.b + $$2) * 3.0F;
      eml $$8 = $$4.getBuffer(f);
      $$3.a();
      $$3.b(2.0F, 2.0F, 2.0F);
      $$3.a(0.0F, -0.5F, 0.0F);
      int $$9 = fzr.d;
      if ($$0.s()) {
         this.l.a($$3, $$8, $$5, $$9);
      }

      $$3.a(a.d.rotationDegrees($$7));
      $$3.a(0.0F, 1.5F + $$6 / 2.0F, 0.0F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      this.k.a($$3, $$8, $$5, $$9);
      float $$10 = 0.875F;
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      $$3.a(a.d.rotationDegrees($$7));
      this.k.a($$3, $$8, $$5, $$9);
      $$3.b(0.875F, 0.875F, 0.875F);
      $$3.a(new Quaternionf().setAngleAxis((float) (Math.PI / 3), g, 0.0F, g));
      $$3.a(a.d.rotationDegrees($$7));
      this.j.a($$3, $$8, $$5, $$9);
      $$3.b();
      $$3.b();
      ht $$11 = $$0.q();
      if ($$11 != null) {
         float $$12 = (float)$$11.u() + 0.5F;
         float $$13 = (float)$$11.v() + 0.5F;
         float $$14 = (float)$$11.w() + 0.5F;
         float $$15 = (float)((double)$$12 - $$0.dq());
         float $$16 = (float)((double)$$13 - $$0.ds());
         float $$17 = (float)((double)$$14 - $$0.dw());
         $$3.a($$15, $$16, $$17);
         fty.a(-$$15, -$$16 + $$6, -$$17, $$2, $$0.b, $$3, $$4, $$5);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static float a(byj $$0, float $$1) {
      float $$2 = (float)$$0.b + $$1;
      float $$3 = asy.a($$2 * 0.2F) / 2.0F + 0.5F;
      $$3 = ($$3 * $$3 + $$3) * 0.4F;
      return $$3 - 1.4F;
   }

   public afw a(byj $$0) {
      return a;
   }

   public boolean a(byj $$0, fsc $$1, double $$2, double $$3, double $$4) {
      return super.a($$0, $$1, $$2, $$3, $$4) || $$0.q() != null;
   }
}
