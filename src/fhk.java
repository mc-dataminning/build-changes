import com.google.common.collect.ImmutableList;
import java.util.List;

public class fhk<T extends cbe> extends ffh<T> {
   private static final float o = 13.0F;
   private static final float p = 1.0F;
   private final fhx q;
   protected final fhx a;
   protected final fhx b;
   protected final fhx f;
   protected final fhx g;
   protected final fhx h;
   protected final fhx i;
   protected final fhx j;
   protected final fhx k;
   protected final fhx l;
   protected final fhx m;
   protected final fhx n;
   private final List<fhx> r;
   private final List<fhx> s;
   private final List<fhx> t;
   private final List<fhx> u;

   public fhk(fhx $$0) {
      super(foi::e);
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

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      fig $$2 = $$1.a("bone", fic.c(), fhz.a(0.0F, 24.0F, 0.0F));
      fig $$3 = $$2.a("body", fic.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), fhz.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", fic.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), fhz.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", fic.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), fhz.a(7.0F, -2.0F, -4.0F));
      fig $$4 = $$3.a("head", fic.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), fhz.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", fic.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fhz.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", fic.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fhz.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", fic.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fhz.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", fic.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fhz.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", fic.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fhz.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", fic.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fhz.a(5.9F, -13.0F, 0.0F));
      return fid.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhx::c);
      float $$6 = $$3 - (float)$$0.ah;
      this.a($$4, $$5);
      this.b($$1, $$2);
      this.a($$3);
      this.a($$0, $$3, $$6);
      this.a($$0.bT, erm.e, $$3);
      this.a($$0.bU, erm.f, $$3);
      this.a($$0.e, erm.b, $$3);
      this.a($$0.d, erm.a, $$3);
      this.a($$0.b, erm.c, $$3);
      this.a($$0.c, erm.d, $$3);
   }

   private void a(float $$0, float $$1) {
      this.f.e = $$1 * (float) (Math.PI / 180.0);
      this.f.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = asb.b($$1);
      float $$3 = asb.a($$1);
      this.f.g += 0.06F * $$2;
      this.f.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = asb.b($$3);
      float $$5 = asb.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.f.g += 0.3F * $$5 * $$2;
      this.f.e = this.f.e + 1.2F * asb.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.i.e = 1.0F * $$4 * $$2;
      this.m.e = 1.0F * asb.b($$3 + (float) Math.PI) * $$2;
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
   public fhx a() {
      return this.q;
   }

   public List<fhx> c() {
      return this.r;
   }

   public List<fhx> d() {
      return this.s;
   }

   public List<fhx> e() {
      return this.t;
   }

   public List<fhx> f() {
      return this.u;
   }
}
