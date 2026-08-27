import com.google.common.collect.ImmutableList;
import java.util.List;

public class flk<T extends cdv> extends fjh<T> {
   private static final float o = 13.0F;
   private static final float p = 1.0F;
   private final fly q;
   protected final fly a;
   protected final fly b;
   protected final fly f;
   protected final fly g;
   protected final fly h;
   protected final fly i;
   protected final fly j;
   protected final fly k;
   protected final fly l;
   protected final fly m;
   protected final fly n;
   private final List<fly> r;
   private final List<fly> s;
   private final List<fly> t;
   private final List<fly> u;

   public flk(fly $$0) {
      super(fsq::e);
      this.q = $$0;
      this.a = $$0.b("bone");
      this.b = this.a.b("body");
      this.f = this.b.b("head");
      this.m = this.a.b("right_leg");
      this.i = this.a.b("left_leg");
      this.l = this.b.b("right_arm");
      this.j = this.b.b("left_arm");
      this.g = this.f.b("right_tendril");
      this.h = this.f.b("left_tendril");
      this.n = this.b.b("right_ribcage");
      this.k = this.b.b("left_ribcage");
      this.r = ImmutableList.of(this.h, this.g);
      this.s = ImmutableList.of(this.b);
      this.t = ImmutableList.of(this.f, this.j, this.l, this.i, this.m);
      this.u = ImmutableList.of(this.b, this.f, this.j, this.l, this.i, this.m);
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("bone", fmd.c(), fma.a(0.0F, 24.0F, 0.0F));
      fmh $$3 = $$2.a("body", fmd.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), fma.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", fmd.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), fma.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", fmd.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), fma.a(7.0F, -2.0F, -4.0F));
      fmh $$4 = $$3.a("head", fmd.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), fma.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", fmd.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fma.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", fmd.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fma.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", fmd.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fma.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", fmd.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fma.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", fmd.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fma.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", fmd.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fma.a(5.9F, -13.0F, 0.0F));
      return fme.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fly::c);
      float $$6 = $$3 - (float)$$0.ah;
      this.a($$4, $$5);
      this.b($$1, $$2);
      this.a($$3);
      this.a($$0, $$3, $$6);
      this.a($$0.bT, evj.e, $$3);
      this.a($$0.bU, evj.f, $$3);
      this.a($$0.e, evj.b, $$3);
      this.a($$0.d, evj.a, $$3);
      this.a($$0.b, evj.c, $$3);
      this.a($$0.c, evj.d, $$3);
   }

   private void a(float $$0, float $$1) {
      this.f.e = $$1 * (float) (Math.PI / 180.0);
      this.f.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = aty.b($$1);
      float $$3 = aty.a($$1);
      this.f.g += 0.06F * $$2;
      this.f.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = aty.b($$3);
      float $$5 = aty.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.f.g += 0.3F * $$5 * $$2;
      this.f.e = this.f.e + 1.2F * aty.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.i.e = 1.0F * $$4 * $$2;
      this.m.e = 1.0F * aty.b($$3 + (float) Math.PI) * $$2;
      this.j.e = -(0.8F * $$4 * $$2);
      this.j.g = 0.0F;
      this.l.e = -(0.8F * $$5 * $$2);
      this.l.g = 0.0F;
      this.g();
   }

   private void g() {
      this.j.f = 0.0F;
      this.j.d = 1.0F;
      this.j.b = 13.0F;
      this.j.c = -13.0F;
      this.l.f = 0.0F;
      this.l.d = 1.0F;
      this.l.b = -13.0F;
      this.l.c = -13.0F;
   }

   private void a(T $$0, float $$1, float $$2) {
      float $$3 = $$0.E($$2) * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.h.e = $$3;
      this.g.e = -$$3;
   }

   @Override
   public fly a() {
      return this.q;
   }

   public List<fly> c() {
      return this.r;
   }

   public List<fly> d() {
      return this.s;
   }

   public List<fly> e() {
      return this.t;
   }

   public List<fly> f() {
      return this.u;
   }
}
