public class fmm extends foa {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final fqf e;
   private final fqf f;
   private final fqf g;
   private final fqf h;
   private final fqf i;
   private final fqf j;
   private final fqf k;

   public fmm(fqf $$0) {
      super(fwy::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static fql a() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      $$1.a("left_lid", fqk.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fqh.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", fqk.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fqh.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", fqk.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), fqh.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", fqk.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), fqh.a);
      $$1.a("right_pages", fqk.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), fqh.a);
      fqk $$2 = fqk.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, fqh.a);
      $$1.a("flip_page2", $$2, fqh.a);
      return fql.a($$0, 64, 32);
   }

   @Override
   public void a(etd $$0, eth $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void b(etd $$0, eth $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (awm.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = awm.a($$4);
      this.i.b = awm.a($$4);
      this.j.b = awm.a($$4);
      this.k.b = awm.a($$4);
   }
}
