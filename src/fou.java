public class fou<T extends bnq> extends fmr<T> implements fmq, fot {
   private final fpj b;
   private final fpj f;
   private final fpj g;
   private final fpj h;
   private final fpj i;
   private final fpj j;
   protected final fpj a;

   public fou(fpj $$0) {
      this.b = $$0;
      this.f = $$0.b("head");
      this.g = this.f.b("hat");
      this.h = this.g.b("hat_rim");
      this.a = this.f.b("nose");
      this.i = $$0.b("right_leg");
      this.j = $$0.b("left_leg");
   }

   public static fpr b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      float $$2 = 0.5F;
      fps $$3 = $$1.a("head", fpo.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fpl.a);
      fps $$4 = $$3.a("hat", fpo.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fpn(0.51F)), fpl.a);
      $$4.a("hat_rim", fpo.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fpl.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", fpo.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), fpl.a(0.0F, -2.0F, 0.0F));
      fps $$5 = $$1.a("body", fpo.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), fpl.a);
      $$5.a("jacket", fpo.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fpn(0.5F)), fpl.a);
      $$1.a(
         "arms",
         fpo.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         fpl.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", fpo.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpl.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fpo.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fpl.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   @Override
   public fpj a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      boolean $$6 = false;
      if ($$0 instanceof cgt) {
         $$6 = ((cgt)$$0).u() > 0;
      }

      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
      if ($$6) {
         this.f.g = 0.3F * awi.a(0.45F * $$3);
         this.f.e = 0.4F;
      } else {
         this.f.g = 0.0F;
      }

      this.i.e = awi.b($$1 * 0.6662F) * 1.4F * $$2 * 0.5F;
      this.j.e = awi.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2 * 0.5F;
      this.i.f = 0.0F;
      this.j.f = 0.0F;
   }

   @Override
   public fpj d() {
      return this.f;
   }

   @Override
   public void a(boolean $$0) {
      this.f.k = $$0;
      this.g.k = $$0;
      this.h.k = $$0;
   }
}
