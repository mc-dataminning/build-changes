import com.google.common.collect.ImmutableList;
import java.util.List;

public class fth<T extends cje> extends fre<T> {
   private static final float o = 13.0F;
   private static final float p = 1.0F;
   private final ftv q;
   protected final ftv a;
   protected final ftv b;
   protected final ftv f;
   protected final ftv g;
   protected final ftv h;
   protected final ftv i;
   protected final ftv j;
   protected final ftv k;
   protected final ftv l;
   protected final ftv m;
   protected final ftv n;
   private final List<ftv> r;
   private final List<ftv> s;
   private final List<ftv> t;
   private final List<ftv> u;

   public fth(ftv $$0) {
      super(gaq::e);
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

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fue $$2 = $$1.a("bone", fua.c(), ftx.a(0.0F, 24.0F, 0.0F));
      fue $$3 = $$2.a("body", fua.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), ftx.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", fua.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), ftx.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", fua.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), ftx.a(7.0F, -2.0F, -4.0F));
      fue $$4 = $$3.a("head", fua.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), ftx.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", fua.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), ftx.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", fua.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), ftx.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", fua.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), ftx.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", fua.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), ftx.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", fua.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), ftx.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", fua.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), ftx.a(5.9F, -13.0F, 0.0F));
      return fub.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftv::c);
      float $$6 = $$3 - (float)$$0.ah;
      this.a($$4, $$5);
      this.b($$1, $$2);
      this.a($$3);
      this.a($$0, $$3, $$6);
      this.a($$0.bX, fcy.e, $$3);
      this.a($$0.bY, fcy.f, $$3);
      this.a($$0.e, fcy.b, $$3);
      this.a($$0.d, fcy.a, $$3);
      this.a($$0.b, fcy.c, $$3);
      this.a($$0.c, fcy.d, $$3);
   }

   private void a(float $$0, float $$1) {
      this.f.e = $$1 * (float) (Math.PI / 180.0);
      this.f.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = axm.b($$1);
      float $$3 = axm.a($$1);
      this.f.g += 0.06F * $$2;
      this.f.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = axm.b($$3);
      float $$5 = axm.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.f.g += 0.3F * $$5 * $$2;
      this.f.e = this.f.e + 1.2F * axm.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.i.e = 1.0F * $$4 * $$2;
      this.m.e = 1.0F * axm.b($$3 + (float) Math.PI) * $$2;
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
   public ftv a() {
      return this.q;
   }

   public List<ftv> c() {
      return this.r;
   }

   public List<ftv> d() {
      return this.s;
   }

   public List<ftv> e() {
      return this.t;
   }

   public List<ftv> f() {
      return this.u;
   }
}
