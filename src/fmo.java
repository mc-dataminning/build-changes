import com.google.common.collect.ImmutableList;

public class fmo<T extends bzb> extends fjo<T> {
   private static final String a = "real_head";
   private static final String b = "upper_body";
   private static final String f = "real_tail";
   private final fmx g;
   private final fmx h;
   private final fmx i;
   private final fmx j;
   private final fmx k;
   private final fmx l;
   private final fmx m;
   private final fmx n;
   private final fmx o;
   private final fmx p;
   private static final int q = 8;

   public fmo(fmx $$0) {
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

   public static fnd c() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      float $$2 = 13.5F;
      fng $$3 = $$1.a("head", fnc.c(), fmz.a(-1.0F, 13.5F, -7.0F));
      $$3.a(
         "real_head",
         fnc.c()
            .a(0, 0)
            .a(-2.0F, -3.0F, -2.0F, 6.0F, 6.0F, 4.0F)
            .a(16, 14)
            .a(-2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F)
            .a(16, 14)
            .a(2.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F)
            .a(0, 10)
            .a(-0.5F, -0.001F, -5.0F, 3.0F, 3.0F, 4.0F),
         fmz.a
      );
      $$1.a("body", fnc.c().a(18, 14).a(-3.0F, -2.0F, -3.0F, 6.0F, 9.0F, 6.0F), fmz.a(0.0F, 14.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("upper_body", fnc.c().a(21, 0).a(-3.0F, -3.0F, -3.0F, 8.0F, 6.0F, 7.0F), fmz.a(-1.0F, 14.0F, -3.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fnc $$4 = fnc.c().a(0, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F);
      $$1.a("right_hind_leg", $$4, fmz.a(-2.5F, 16.0F, 7.0F));
      $$1.a("left_hind_leg", $$4, fmz.a(0.5F, 16.0F, 7.0F));
      $$1.a("right_front_leg", $$4, fmz.a(-2.5F, 16.0F, -4.0F));
      $$1.a("left_front_leg", $$4, fmz.a(0.5F, 16.0F, -4.0F));
      fng $$5 = $$1.a("tail", fnc.c(), fmz.a(-1.0F, 12.0F, 8.0F, (float) (Math.PI / 5), 0.0F, 0.0F));
      $$5.a("real_tail", fnc.c().a(9, 18).a(0.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F), fmz.a);
      return fnd.a($$0, 64, 32);
   }

   @Override
   protected Iterable<fmx> a() {
      return ImmutableList.of(this.g);
   }

   @Override
   protected Iterable<fmx> b() {
      return ImmutableList.of(this.i, this.j, this.k, this.l, this.m, this.n, this.p);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      if ($$0.aa_()) {
         this.n.f = 0.0F;
      } else {
         this.n.f = auo.b($$1 * 0.6662F) * 1.4F * $$2;
      }

      if ($$0.A()) {
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
         this.j.e = auo.b($$1 * 0.6662F) * 1.4F * $$2;
         this.k.e = auo.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.l.e = auo.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
         this.m.e = auo.b($$1 * 0.6662F) * 1.4F * $$2;
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
