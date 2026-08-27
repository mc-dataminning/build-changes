import com.google.common.collect.ImmutableList;
import java.util.List;

public class fha<T extends car> extends fex<T> {
   private static final float o = 13.0F;
   private static final float p = 1.0F;
   private final fhn q;
   protected final fhn a;
   protected final fhn b;
   protected final fhn f;
   protected final fhn g;
   protected final fhn h;
   protected final fhn i;
   protected final fhn j;
   protected final fhn k;
   protected final fhn l;
   protected final fhn m;
   protected final fhn n;
   private final List<fhn> r;
   private final List<fhn> s;
   private final List<fhn> t;
   private final List<fhn> u;

   public fha(fhn $$0) {
      super(fnt::e);
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

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhw $$2 = $$1.a("bone", fhs.c(), fhp.a(0.0F, 24.0F, 0.0F));
      fhw $$3 = $$2.a("body", fhs.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), fhp.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", fhs.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), fhp.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", fhs.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), fhp.a(7.0F, -2.0F, -4.0F));
      fhw $$4 = $$3.a("head", fhs.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), fhp.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", fhs.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fhp.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", fhs.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fhp.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", fhs.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fhp.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", fhs.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fhp.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", fhs.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fhp.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", fhs.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fhp.a(5.9F, -13.0F, 0.0F));
      return fht.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhn::c);
      float $$6 = $$3 - (float)$$0.ah;
      this.a($$4, $$5);
      this.b($$1, $$2);
      this.a($$3);
      this.a($$0, $$3, $$6);
      this.a($$0.bT, erj.e, $$3);
      this.a($$0.bU, erj.f, $$3);
      this.a($$0.e, erj.b, $$3);
      this.a($$0.d, erj.a, $$3);
      this.a($$0.b, erj.c, $$3);
      this.a($$0.c, erj.d, $$3);
   }

   private void a(float $$0, float $$1) {
      this.f.e = $$1 * (float) (Math.PI / 180.0);
      this.f.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = arp.b($$1);
      float $$3 = arp.a($$1);
      this.f.g += 0.06F * $$2;
      this.f.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = arp.b($$3);
      float $$5 = arp.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.f.g += 0.3F * $$5 * $$2;
      this.f.e = this.f.e + 1.2F * arp.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.i.e = 1.0F * $$4 * $$2;
      this.m.e = 1.0F * arp.b($$3 + (float) Math.PI) * $$2;
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
   public fhn a() {
      return this.q;
   }

   public List<fhn> c() {
      return this.r;
   }

   public List<fhn> d() {
      return this.s;
   }

   public List<fhn> e() {
      return this.t;
   }

   public List<fhn> f() {
      return this.u;
   }
}
