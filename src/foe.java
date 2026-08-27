public class foe<T extends cfa> extends fmk<T> {
   private static final String a = "right_bottom_bristle";
   private static final String b = "right_middle_bristle";
   private static final String f = "right_top_bristle";
   private static final String g = "left_top_bristle";
   private static final String h = "left_middle_bristle";
   private static final String i = "left_bottom_bristle";
   private final fpc j;
   private final fpc k;
   private final fpc l;
   private final fpc m;
   private final fpc n;
   private final fpc o;
   private final fpc p;
   private final fpc q;
   private final fpc r;
   private final fpc s;

   public foe(fpc $$0) {
      this.j = $$0;
      this.k = $$0.b("right_leg");
      this.l = $$0.b("left_leg");
      this.m = $$0.b("body");
      this.n = this.m.b("right_bottom_bristle");
      this.o = this.m.b("right_middle_bristle");
      this.p = this.m.b("right_top_bristle");
      this.q = this.m.b("left_top_bristle");
      this.r = this.m.b("left_middle_bristle");
      this.s = this.m.b("left_bottom_bristle");
   }

   public static fpi b() {
      fpk $$0 = new fpk();
      fpl $$1 = $$0.a();
      $$1.a("right_leg", fph.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), fpe.a(-4.0F, 8.0F, 0.0F));
      $$1.a("left_leg", fph.c().a(0, 55).a(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), fpe.a(4.0F, 8.0F, 0.0F));
      fpl $$2 = $$1.a("body", fph.c().a(0, 0).a(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F), fpe.a(0.0F, 1.0F, 0.0F));
      $$2.a("right_bottom_bristle", fph.c().a(16, 65).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), fpe.a(-8.0F, 4.0F, -8.0F, 0.0F, 0.0F, -1.2217305F));
      $$2.a("right_middle_bristle", fph.c().a(16, 49).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), fpe.a(-8.0F, -1.0F, -8.0F, 0.0F, 0.0F, -1.134464F));
      $$2.a("right_top_bristle", fph.c().a(16, 33).a(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true), fpe.a(-8.0F, -5.0F, -8.0F, 0.0F, 0.0F, -0.87266463F));
      $$2.a("left_top_bristle", fph.c().a(16, 33).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), fpe.a(8.0F, -6.0F, -8.0F, 0.0F, 0.0F, 0.87266463F));
      $$2.a("left_middle_bristle", fph.c().a(16, 49).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), fpe.a(8.0F, -2.0F, -8.0F, 0.0F, 0.0F, 1.134464F));
      $$2.a("left_bottom_bristle", fph.c().a(16, 65).a(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), fpe.a(8.0F, 3.0F, -8.0F, 0.0F, 0.0F, 1.2217305F));
      return fpi.a($$0, 64, 128);
   }

   public void a(cfa $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      $$2 = Math.min(0.25F, $$2);
      if (!$$0.bP()) {
         this.m.e = $$5 * (float) (Math.PI / 180.0);
         this.m.f = $$4 * (float) (Math.PI / 180.0);
      } else {
         this.m.e = 0.0F;
         this.m.f = 0.0F;
      }

      float $$6 = 1.5F;
      this.m.g = 0.1F * awh.a($$1 * 1.5F) * 4.0F * $$2;
      this.m.c = 2.0F;
      this.m.c = this.m.c - 2.0F * awh.b($$1 * 1.5F) * 2.0F * $$2;
      this.l.e = awh.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.k.e = awh.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.l.g = (float) (Math.PI / 18) * awh.b($$1 * 1.5F * 0.5F) * $$2;
      this.k.g = (float) (Math.PI / 18) * awh.b($$1 * 1.5F * 0.5F + (float) Math.PI) * $$2;
      this.l.c = 8.0F + 2.0F * awh.a($$1 * 1.5F * 0.5F + (float) Math.PI) * 2.0F * $$2;
      this.k.c = 8.0F + 2.0F * awh.a($$1 * 1.5F * 0.5F) * 2.0F * $$2;
      this.n.g = -1.2217305F;
      this.o.g = -1.134464F;
      this.p.g = -0.87266463F;
      this.q.g = 0.87266463F;
      this.r.g = 1.134464F;
      this.s.g = 1.2217305F;
      float $$7 = awh.b($$1 * 1.5F + (float) Math.PI) * $$2;
      this.n.g += $$7 * 1.3F;
      this.o.g += $$7 * 1.2F;
      this.p.g += $$7 * 0.6F;
      this.q.g += $$7 * 0.6F;
      this.r.g += $$7 * 1.2F;
      this.s.g += $$7 * 1.3F;
      float $$8 = 1.0F;
      float $$9 = 1.0F;
      this.n.g = this.n.g + 0.05F * awh.a($$3 * 1.0F * -0.4F);
      this.o.g = this.o.g + 0.1F * awh.a($$3 * 1.0F * 0.2F);
      this.p.g = this.p.g + 0.1F * awh.a($$3 * 1.0F * 0.4F);
      this.q.g = this.q.g + 0.1F * awh.a($$3 * 1.0F * 0.4F);
      this.r.g = this.r.g + 0.1F * awh.a($$3 * 1.0F * 0.2F);
      this.s.g = this.s.g + 0.05F * awh.a($$3 * 1.0F * -0.4F);
   }

   @Override
   public fpc a() {
      return this.j;
   }
}
