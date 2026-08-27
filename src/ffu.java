public class ffu<T extends bzc> extends ffc<T> {
   private static final String a = "tail_base";
   private static final String b = "tail_tip";
   private final fhs f;
   private final fhs g;
   private final fhs h;
   private final fhs i;
   private final fhs j;
   private final fhs k;
   private final fhs l;

   public ffu(fhs $$0) {
      this.f = $$0;
      fhs $$1 = $$0.b("body");
      this.k = $$1.b("tail_base");
      this.l = this.k.b("tail_tip");
      this.g = $$1.b("left_wing_base");
      this.h = this.g.b("left_wing_tip");
      this.i = $$1.b("right_wing_base");
      this.j = this.i.b("right_wing_tip");
   }

   public static fhy b() {
      fia $$0 = new fia();
      fib $$1 = $$0.a();
      fib $$2 = $$1.a("body", fhx.c().a(0, 8).a(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), fhu.b(-0.1F, 0.0F, 0.0F));
      fib $$3 = $$2.a("tail_base", fhx.c().a(3, 20).a(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), fhu.a(0.0F, -2.0F, 1.0F));
      $$3.a("tail_tip", fhx.c().a(4, 29).a(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), fhu.a(0.0F, 0.5F, 6.0F));
      fib $$4 = $$2.a("left_wing_base", fhx.c().a(23, 12).a(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), fhu.a(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F));
      $$4.a("left_wing_tip", fhx.c().a(16, 24).a(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), fhu.a(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      fib $$5 = $$2.a("right_wing_base", fhx.c().a(23, 12).a().a(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), fhu.a(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F));
      $$5.a("right_wing_tip", fhx.c().a(16, 24).a().a(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), fhu.a(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      $$2.a("head", fhx.c().a(0, 0).a(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), fhu.a(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return fhy.a($$0, 64, 64);
   }

   @Override
   public fhs a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ((float)$$0.q() + $$3) * 7.448451F * (float) (Math.PI / 180.0);
      float $$7 = 16.0F;
      this.g.g = arp.b($$6) * 16.0F * (float) (Math.PI / 180.0);
      this.h.g = arp.b($$6) * 16.0F * (float) (Math.PI / 180.0);
      this.i.g = -this.g.g;
      this.j.g = -this.h.g;
      this.k.e = -(5.0F + arp.b($$6 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.l.e = -(5.0F + arp.b($$6 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
