public class fem extends ffz {
   private static final String a = "left_pages";
   private static final String b = "right_pages";
   private static final String c = "flip_page1";
   private static final String d = "flip_page2";
   private final fic e;
   private final fic f;
   private final fic g;
   private final fic h;
   private final fic i;
   private final fic j;
   private final fic k;

   public fem(fic $$0) {
      super(fom::c);
      this.e = $$0;
      this.f = $$0.b("left_lid");
      this.g = $$0.b("right_lid");
      this.h = $$0.b("left_pages");
      this.i = $$0.b("right_pages");
      this.j = $$0.b("flip_page1");
      this.k = $$0.b("flip_page2");
   }

   public static fii a() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      $$1.a("left_lid", fih.c().a(0, 0).a(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fie.a(0.0F, 0.0F, -1.0F));
      $$1.a("right_lid", fih.c().a(16, 0).a(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F), fie.a(0.0F, 0.0F, 1.0F));
      $$1.a("seam", fih.c().a(12, 0).a(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F), fie.b(0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left_pages", fih.c().a(0, 10).a(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F), fie.a);
      $$1.a("right_pages", fih.c().a(12, 10).a(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F), fie.a);
      fih $$2 = fih.c().a(24, 10).a(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      $$1.a("flip_page1", $$2, fie.a);
      $$1.a("flip_page2", $$2, fie.a);
      return fii.a($$0, 64, 32);
   }

   @Override
   public void a(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void b(elp $$0, elt $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.e.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      float $$4 = (arw.a($$0 * 0.02F) * 0.1F + 1.25F) * $$3;
      this.f.f = (float) Math.PI + $$4;
      this.g.f = -$$4;
      this.h.f = $$4;
      this.i.f = -$$4;
      this.j.f = $$4 - $$4 * 2.0F * $$1;
      this.k.f = $$4 - $$4 * 2.0F * $$2;
      this.h.b = arw.a($$4);
      this.i.b = arw.a($$4);
      this.j.b = arw.a($$4);
      this.k.b = arw.a($$4);
   }
}
