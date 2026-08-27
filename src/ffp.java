import com.google.common.collect.ImmutableList;

public class ffp<T extends bjk & cai> extends fed<T> {
   private static final float a = 0.87266463F;
   private static final float b = (float) (-Math.PI / 9);
   private final fie f;
   private final fie g;
   private final fie h;
   private final fie i;
   private final fie j;
   private final fie k;
   private final fie l;
   private final fie m;
   private final fie n;

   public ffp(fie $$0) {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.i = $$0.b("body");
      this.n = this.i.b("mane");
      this.f = $$0.b("head");
      this.g = this.f.b("right_ear");
      this.h = this.f.b("left_ear");
      this.j = $$0.b("right_front_leg");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_hind_leg");
      this.m = $$0.b("left_hind_leg");
   }

   public static fik c() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      fin $$2 = $$1.a("body", fij.c().a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), fig.a(0.0F, 7.0F, 0.0F));
      $$2.a("mane", fij.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new fii(0.001F)), fig.a(0.0F, -14.0F, -5.0F));
      fin $$3 = $$1.a("head", fij.c().a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), fig.a(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F));
      $$3.a("right_ear", fij.c().a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), fig.a(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0)));
      $$3.a("left_ear", fij.c().a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), fig.a(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0)));
      $$3.a("right_horn", fij.c().a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), fig.a(-7.0F, 2.0F, -12.0F));
      $$3.a("left_horn", fij.c().a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), fig.a(7.0F, 2.0F, -12.0F));
      int $$4 = 14;
      int $$5 = 11;
      $$1.a("right_front_leg", fij.c().a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), fig.a(-4.0F, 10.0F, -8.5F));
      $$1.a("left_front_leg", fij.c().a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), fig.a(4.0F, 10.0F, -8.5F));
      $$1.a("right_hind_leg", fij.c().a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), fig.a(-5.0F, 13.0F, 10.0F));
      $$1.a("left_hind_leg", fij.c().a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), fig.a(5.0F, 13.0F, 10.0F));
      return fik.a($$0, 128, 64);
   }

   @Override
   protected Iterable<fie> a() {
      return ImmutableList.of(this.f);
   }

   @Override
   protected Iterable<fie> b() {
      return ImmutableList.of(this.i, this.j, this.k, this.l, this.m);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.g = (float) (-Math.PI * 2.0 / 9.0) - $$2 * ary.a($$1);
      this.h.g = (float) (Math.PI * 2.0 / 9.0) + $$2 * ary.a($$1);
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      int $$6 = $$0.gd();
      float $$7 = 1.0F - (float)ary.a(10 - 2 * $$6) / 10.0F;
      this.f.e = ary.i($$7, 0.87266463F, (float) (-Math.PI / 9));
      if ($$0.m_()) {
         this.f.c = ary.i($$7, 2.0F, 5.0F);
         this.n.d = -3.0F;
      } else {
         this.f.c = 2.0F;
         this.n.d = -7.0F;
      }

      float $$8 = 1.2F;
      this.j.e = ary.b($$1) * 1.2F * $$2;
      this.k.e = ary.b($$1 + (float) Math.PI) * 1.2F * $$2;
      this.l.e = this.k.e;
      this.m.e = this.j.e;
   }
}
