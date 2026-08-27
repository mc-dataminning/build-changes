public class fev extends fex<byx> {
   private static final float[] a = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] b = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] f = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] g = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] h = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] i = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private static final String j = "eye";
   private static final String k = "tail0";
   private static final String l = "tail1";
   private static final String m = "tail2";
   private final fhn n;
   private final fhn o;
   private final fhn p;
   private final fhn[] q;
   private final fhn[] r;

   public fev(fhn $$0) {
      this.n = $$0;
      this.q = new fhn[12];
      this.o = $$0.b("head");

      for (int $$1 = 0; $$1 < this.q.length; $$1++) {
         this.q[$$1] = this.o.b(a($$1));
      }

      this.p = this.o.b("eye");
      this.r = new fhn[3];
      this.r[0] = this.o.b("tail0");
      this.r[1] = this.r[0].b("tail1");
      this.r[2] = this.r[1].b("tail2");
   }

   private static String a(int $$0) {
      return "spike" + $$0;
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhw $$2 = $$1.a(
         "head",
         fhs.c()
            .a(0, 0)
            .a(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F)
            .a(0, 28)
            .a(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F)
            .a(0, 28)
            .a(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true)
            .a(16, 40)
            .a(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F)
            .a(16, 40)
            .a(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F),
         fhp.a
      );
      fhs $$3 = fhs.c().a(0, 0).a(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);

      for (int $$4 = 0; $$4 < 12; $$4++) {
         float $$5 = b($$4, 0.0F, 0.0F);
         float $$6 = c($$4, 0.0F, 0.0F);
         float $$7 = d($$4, 0.0F, 0.0F);
         float $$8 = (float) Math.PI * a[$$4];
         float $$9 = (float) Math.PI * b[$$4];
         float $$10 = (float) Math.PI * f[$$4];
         $$2.a(a($$4), $$3, fhp.a($$5, $$6, $$7, $$8, $$9, $$10));
      }

      $$2.a("eye", fhs.c().a(8, 0).a(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F), fhp.a(0.0F, 0.0F, -8.25F));
      fhw $$11 = $$2.a("tail0", fhs.c().a(40, 0).a(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F), fhp.a);
      fhw $$12 = $$11.a("tail1", fhs.c().a(0, 54).a(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F), fhp.a(-1.5F, 0.5F, 14.0F));
      $$12.a("tail2", fhs.c().a(41, 32).a(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F).a(25, 19).a(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F), fhp.a(0.5F, 0.5F, 6.0F));
      return fht.a($$0, 64, 64);
   }

   @Override
   public fhn a() {
      return this.n;
   }

   public void a(byx $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = $$3 - (float)$$0.ah;
      this.o.f = $$4 * (float) (Math.PI / 180.0);
      this.o.e = $$5 * (float) (Math.PI / 180.0);
      float $$7 = (1.0F - $$0.F($$6)) * 0.55F;
      this.a($$3, $$7);
      bii $$8 = eqm.O().am();
      if ($$0.gb()) {
         $$8 = $$0.gc();
      }

      if ($$8 != null) {
         ehe $$9 = $$8.j(0.0F);
         ehe $$10 = $$0.j(0.0F);
         double $$11 = $$9.d - $$10.d;
         if ($$11 > 0.0) {
            this.p.c = 0.0F;
         } else {
            this.p.c = 1.0F;
         }

         ehe $$12 = $$0.f(0.0F);
         $$12 = new ehe($$12.c, 0.0, $$12.e);
         ehe $$13 = new ehe($$10.c - $$9.c, 0.0, $$10.e - $$9.e).d().b((float) (Math.PI / 2));
         double $$14 = $$12.b($$13);
         this.p.b = arp.c((float)Math.abs($$14)) * 2.0F * (float)Math.signum($$14);
      }

      this.p.k = true;
      float $$15 = $$0.E($$6);
      this.r[0].f = arp.a($$15) * (float) Math.PI * 0.05F;
      this.r[1].f = arp.a($$15) * (float) Math.PI * 0.1F;
      this.r[2].f = arp.a($$15) * (float) Math.PI * 0.15F;
   }

   private void a(float $$0, float $$1) {
      for (int $$2 = 0; $$2 < 12; $$2++) {
         this.q[$$2].b = b($$2, $$0, $$1);
         this.q[$$2].c = c($$2, $$0, $$1);
         this.q[$$2].d = d($$2, $$0, $$1);
      }
   }

   private static float a(int $$0, float $$1, float $$2) {
      return 1.0F + arp.b($$1 * 1.5F + (float)$$0) * 0.01F - $$2;
   }

   private static float b(int $$0, float $$1, float $$2) {
      return g[$$0] * a($$0, $$1, $$2);
   }

   private static float c(int $$0, float $$1, float $$2) {
      return 16.0F + h[$$0] * a($$0, $$1, $$2);
   }

   private static float d(int $$0, float $$1, float $$2) {
      return i[$$0] * a($$0, $$1, $$2);
   }
}
