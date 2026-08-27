import com.google.common.collect.ImmutableList;

public class frt<T extends cdd> extends fqm<T> {
   public final fur a;
   private final fur b;
   private final fur f;
   private final fur g;
   private final fur h;
   private final fur i;
   private final fur j;
   private static final int k = 6;
   private static final float l = 16.5F;
   private static final float m = 17.5F;
   private float n;

   public frt(fur $$0) {
      super(true, 8.0F, 3.35F);
      this.a = $$0.b("head");
      this.b = $$0.b("body");
      this.f = $$0.b("right_hind_leg");
      this.g = $$0.b("left_hind_leg");
      this.h = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
      this.j = this.b.b("tail");
   }

   public static fux c() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("head", fuw.c().a(1, 5).a(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F), fut.a(-1.0F, 16.5F, -3.0F));
      $$2.a("right_ear", fuw.c().a(8, 1).a(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), fut.a);
      $$2.a("left_ear", fuw.c().a(15, 1).a(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), fut.a);
      $$2.a("nose", fuw.c().a(6, 18).a(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F), fut.a);
      fva $$3 = $$1.a("body", fuw.c().a(24, 15).a(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F), fut.a(0.0F, 16.0F, -6.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fuv $$4 = new fuv(0.001F);
      fuw $$5 = fuw.c().a(4, 24).a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, $$4);
      fuw $$6 = fuw.c().a(13, 24).a(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, $$4);
      $$1.a("right_hind_leg", $$6, fut.a(-5.0F, 17.5F, 7.0F));
      $$1.a("left_hind_leg", $$5, fut.a(-1.0F, 17.5F, 7.0F));
      $$1.a("right_front_leg", $$6, fut.a(-5.0F, 17.5F, 0.0F));
      $$1.a("left_front_leg", $$5, fut.a(-1.0F, 17.5F, 0.0F));
      $$3.a("tail", fuw.c().a(30, 0).a(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F), fut.a(-4.0F, 15.0F, -1.0F, -0.05235988F, 0.0F, 0.0F));
      return fux.a($$0, 48, 32);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.b.e = (float) (Math.PI / 2);
      this.j.e = -0.05235988F;
      this.f.e = axw.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = axw.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = axw.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = axw.b($$1 * 0.6662F) * 1.4F * $$2;
      this.a.a(-1.0F, 16.5F, -3.0F);
      this.a.f = 0.0F;
      this.a.g = $$0.G($$3);
      this.f.k = true;
      this.g.k = true;
      this.h.k = true;
      this.i.k = true;
      this.b.a(0.0F, 16.0F, -6.0F);
      this.b.g = 0.0F;
      this.f.a(-5.0F, 17.5F, 7.0F);
      this.g.a(-1.0F, 17.5F, 7.0F);
      if ($$0.bY()) {
         this.b.e = 1.6755161F;
         float $$4 = $$0.H($$3);
         this.b.a(0.0F, 16.0F + $$0.H($$3), -6.0F);
         this.a.a(-1.0F, 16.5F + $$4, -3.0F);
         this.a.f = 0.0F;
      } else if ($$0.fJ()) {
         this.b.g = (float) (-Math.PI / 2);
         this.b.a(0.0F, 21.0F, -6.0F);
         this.j.e = (float) (-Math.PI * 5.0 / 6.0);
         if (this.e) {
            this.j.e = -2.1816616F;
            this.b.a(0.0F, 21.0F, -2.0F);
         }

         this.a.a(1.0F, 19.49F, -3.0F);
         this.a.e = 0.0F;
         this.a.f = (float) (-Math.PI * 2.0 / 3.0);
         this.a.g = 0.0F;
         this.f.k = false;
         this.g.k = false;
         this.h.k = false;
         this.i.k = false;
      } else if ($$0.y()) {
         this.b.e = (float) (Math.PI / 6);
         this.b.a(0.0F, 9.0F, -3.0F);
         this.j.e = (float) (Math.PI / 4);
         this.j.a(-4.0F, 15.0F, -2.0F);
         this.a.a(-1.0F, 10.0F, -0.25F);
         this.a.e = 0.0F;
         this.a.f = 0.0F;
         if (this.e) {
            this.a.a(-1.0F, 13.0F, -3.75F);
         }

         this.f.e = (float) (-Math.PI * 5.0 / 12.0);
         this.f.a(-5.0F, 21.5F, 6.75F);
         this.g.e = (float) (-Math.PI * 5.0 / 12.0);
         this.g.a(-1.0F, 21.5F, 6.75F);
         this.h.e = (float) (-Math.PI / 12);
         this.i.e = (float) (-Math.PI / 12);
      }
   }

   @Override
   protected Iterable<fur> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fur> b() {
      return ImmutableList.of(this.b, this.f, this.g, this.h, this.i);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      if (!$$0.fJ() && !$$0.gp() && !$$0.bY()) {
         this.a.e = $$5 * (float) (Math.PI / 180.0);
         this.a.f = $$4 * (float) (Math.PI / 180.0);
      }

      if ($$0.fJ()) {
         this.a.e = 0.0F;
         this.a.f = (float) (-Math.PI * 2.0 / 3.0);
         this.a.g = axw.b($$3 * 0.027F) / 22.0F;
      }

      if ($$0.bY()) {
         float $$6 = axw.b($$3) * 0.01F;
         this.b.f = $$6;
         this.f.g = $$6;
         this.g.g = $$6;
         this.h.g = $$6 / 2.0F;
         this.i.g = $$6 / 2.0F;
      }

      if ($$0.gp()) {
         float $$7 = 0.1F;
         this.n += 0.67F;
         this.f.e = axw.b(this.n * 0.4662F) * 0.1F;
         this.g.e = axw.b(this.n * 0.4662F + (float) Math.PI) * 0.1F;
         this.h.e = axw.b(this.n * 0.4662F + (float) Math.PI) * 0.1F;
         this.i.e = axw.b(this.n * 0.4662F) * 0.1F;
      }
   }
}
