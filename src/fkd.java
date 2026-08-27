public class fkd<T extends blw> extends fks<T> {
   private final fnj a;
   private final fnj b;
   private final fnj f;
   private final fnj g;
   private final fnj h;
   private final fnj i;
   private static final int j = 6;

   public fkd(fnj $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fnp a(fnn $$0) {
      fnr $$1 = new fnr();
      fns $$2 = $$1.a();
      $$2.a("head", fno.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fnl.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fno.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fnl.a(0.0F, 6.0F, 0.0F));
      fno $$3 = fno.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fnl.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fnl.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fnl.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fnl.a(2.0F, 18.0F, -4.0F));
      return fnp.a($$1, 64, 32);
   }

   @Override
   public fnj a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = aup.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = aup.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = aup.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = aup.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
