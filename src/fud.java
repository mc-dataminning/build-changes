import com.google.common.collect.ImmutableList;
import java.util.List;

public class fud<T extends cjp> extends fsa<T> {
   private static final float o = 13.0F;
   private static final float p = 1.0F;
   private final fur q;
   protected final fur a;
   protected final fur b;
   protected final fur f;
   protected final fur g;
   protected final fur h;
   protected final fur i;
   protected final fur j;
   protected final fur k;
   protected final fur l;
   protected final fur m;
   protected final fur n;
   private final List<fur> r;
   private final List<fur> s;
   private final List<fur> t;
   private final List<fur> u;

   public fud(fur $$0) {
      super(gbm::e);
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

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      fva $$2 = $$1.a("bone", fuw.c(), fut.a(0.0F, 24.0F, 0.0F));
      fva $$3 = $$2.a("body", fuw.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), fut.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", fuw.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), fut.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", fuw.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), fut.a(7.0F, -2.0F, -4.0F));
      fva $$4 = $$3.a("head", fuw.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), fut.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", fuw.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fut.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", fuw.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fut.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", fuw.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fut.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", fuw.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fut.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", fuw.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fut.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", fuw.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fut.a(5.9F, -13.0F, 0.0F));
      return fux.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fur::c);
      float $$6 = $$3 - (float)$$0.ai;
      this.a($$4, $$5);
      this.b($$1, $$2);
      this.a($$3);
      this.a($$0, $$3, $$6);
      this.a($$0.bY, fdu.e, $$3);
      this.a($$0.bZ, fdu.f, $$3);
      this.a($$0.e, fdu.b, $$3);
      this.a($$0.d, fdu.a, $$3);
      this.a($$0.b, fdu.c, $$3);
      this.a($$0.c, fdu.d, $$3);
   }

   private void a(float $$0, float $$1) {
      this.f.e = $$1 * (float) (Math.PI / 180.0);
      this.f.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = axw.b($$1);
      float $$3 = axw.a($$1);
      this.f.g += 0.06F * $$2;
      this.f.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = axw.b($$3);
      float $$5 = axw.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.f.g += 0.3F * $$5 * $$2;
      this.f.e = this.f.e + 1.2F * axw.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.i.e = 1.0F * $$4 * $$2;
      this.m.e = 1.0F * axw.b($$3 + (float) Math.PI) * $$2;
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
      float $$3 = $$0.G($$2) * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.h.e = $$3;
      this.g.e = -$$3;
   }

   @Override
   public fur a() {
      return this.q;
   }

   public List<fur> c() {
      return this.r;
   }

   public List<fur> d() {
      return this.s;
   }

   public List<fur> e() {
      return this.t;
   }

   public List<fur> f() {
      return this.u;
   }
}
