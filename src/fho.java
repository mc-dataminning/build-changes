import com.google.common.collect.ImmutableList;

public class fho<T extends bvp> extends fep<T> {
   private static final String a = "real_head";
   private static final String b = "upper_body";
   private static final String f = "real_tail";
   private final fhx g;
   private final fhx h;
   private final fhx i;
   private final fhx j;
   private final fhx k;
   private final fhx l;
   private final fhx m;
   private final fhx n;
   private final fhx o;
   private final fhx p;
   private static final int q = 8;

   public fho(fhx $$0) {
      this.g = $$0.b("head");
      this.h = this.g.b("real_head");
      this.i = $$0.b("body");
      this.p = $$0.b("upper_body");
      this.j = $$0.b("right_hind_leg");
      this.k = $$0.b("left_hind_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("left_front_leg");
      this.n = $$0.b("tail");
      this.o = this.n.b("real_tail");
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      float $$2 = 13.5F;
      fig $$3 = $$1.a("head", fic.c(), fhz.a(-1.0F, 13.5F, -7.0F));
      $$3.a(
         "real_head",
         fic.c()
            .a(0, 0)
            .a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F)
            .a(16, 14)
            .a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F)
            .a(16, 14)
            .a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F)
            .a(0, 10)
            .a(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F),
         fhz.a
      );
      $$1.a("body", fic.c().a(18, 14).a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F), fhz.a(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("upper_body", fic.c().a(21, 0).a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F), fhz.a(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fic $$4 = fic.c().a(0, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F);
      $$1.a("right_hind_leg", $$4, fhz.a(-2.5F, 16.0F, 7.0F));
      $$1.a("left_hind_leg", $$4, fhz.a(0.5F, 16.0F, 7.0F));
      $$1.a("right_front_leg", $$4, fhz.a(-2.5F, 16.0F, -4.0F));
      $$1.a("left_front_leg", $$4, fhz.a(0.5F, 16.0F, -4.0F));
      fig $$5 = $$1.a("tail", fic.c(), fhz.a(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F));
      $$5.a("real_tail", fic.c().a(9, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F), fhz.a);
      return fid.a($$0, 64, 32);
   }

   @Override
   protected Iterable<fhx> a() {
      return ImmutableList.of(this.g);
   }

   @Override
   protected Iterable<fhx> b() {
      return ImmutableList.of(this.i, this.j, this.k, this.l, this.m, this.n, this.p);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      if ($$0.S_()) {
         this.n.f = 0.0F;
      } else {
         this.n.f = ars.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      if ($$0.t()) {
         this.p.a(-1.0F, 16.0F, -3.0F);
         this.p.e = (float) (Math.PI * 2.0 / 5.0);
         this.p.f = 0.0F;
         this.i.a(0.0F, 18.0F, 0.0F);
         this.i.e = (float) (Math.PI / 4);
         this.n.a(-1.0F, 21.0F, 6.0F);
         this.j.a(-2.5F, 22.7F, 2.0F);
         this.j.e = (float) (Math.PI * 3.0 / 2.0);
         this.k.a(0.5F, 22.7F, 2.0F);
         this.k.e = (float) (Math.PI * 3.0 / 2.0);
         this.l.e = 5.811947F;
         this.l.a(-2.49F, 17.0F, -4.0F);
         this.m.e = 5.811947F;
         this.m.a(0.51F, 17.0F, -4.0F);
      } else {
         this.i.a(0.0F, 14.0F, 2.0F);
         this.i.e = (float) (Math.PI / 2);
         this.p.a(-1.0F, 14.0F, -3.0F);
         this.p.e = this.i.e;
         this.n.a(-1.0F, 12.0F, 8.0F);
         this.j.a(-2.5F, 16.0F, 7.0F);
         this.k.a(0.5F, 16.0F, 7.0F);
         this.l.a(-2.5F, 16.0F, -4.0F);
         this.m.a(0.5F, 16.0F, -4.0F);
         this.j.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
         this.k.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.l.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.m.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      this.h.g = $$0.F($$3) + $$0.f($$3, 0.0F);
      this.p.g = $$0.f($$3, -0.08F);
      this.i.g = $$0.f($$3, -0.16F);
      this.o.g = $$0.f($$3, -0.2F);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.e = $$5 * (float) (Math.PI / 180.0);
      this.g.f = $$4 * (float) (Math.PI / 180.0);
      this.n.e = $$3;
   }
}
