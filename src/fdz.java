import com.google.common.collect.ImmutableList;

public class fdz<T extends buk> extends fdr<T> {
   private static final float a = 19.0F;
   private static final String b = "bone";
   private static final String f = "stinger";
   private static final String g = "left_antenna";
   private static final String h = "right_antenna";
   private static final String i = "front_legs";
   private static final String j = "middle_legs";
   private static final String k = "back_legs";
   private final fhs l;
   private final fhs m;
   private final fhs n;
   private final fhs o;
   private final fhs p;
   private final fhs q;
   private final fhs r;
   private final fhs s;
   private final fhs t;
   private float u;

   public fdz(fhs $$0) {
      super(false, 24.0F, 0.0F);
      this.l = $$0.b("bone");
      fhs $$1 = this.l.b("body");
      this.r = $$1.b("stinger");
      this.s = $$1.b("left_antenna");
      this.t = $$1.b("right_antenna");
      this.m = this.l.b("right_wing");
      this.n = this.l.b("left_wing");
      this.o = this.l.b("front_legs");
      this.p = this.l.b("middle_legs");
      this.q = this.l.b("back_legs");
   }

   public static fhy c() {
      float $$0 = 19.0F;
      fia $$1 = new fia();
      fib $$2 = $$1.a();
      fib $$3 = $$2.a("bone", fhx.c(), fhu.a(0.0F, 19.0F, 0.0F));
      fib $$4 = $$3.a("body", fhx.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), fhu.a);
      $$4.a("stinger", fhx.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), fhu.a);
      $$4.a("left_antenna", fhx.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fhu.a(0.0F, -2.0F, -5.0F));
      $$4.a("right_antenna", fhx.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fhu.a(0.0F, -2.0F, -5.0F));
      fhw $$5 = new fhw(0.001F);
      $$3.a("right_wing", fhx.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$5), fhu.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$3.a("left_wing", fhx.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$5), fhu.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$3.a("front_legs", fhx.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), fhu.a(1.5F, 3.0F, -2.0F));
      $$3.a("middle_legs", fhx.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), fhu.a(1.5F, 3.0F, 0.0F));
      $$3.a("back_legs", fhx.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), fhu.a(1.5F, 3.0F, 2.0F));
      return fhy.a($$1, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = $$0.E($$3);
      this.r.k = !$$0.gl();
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.m.e = 0.0F;
      this.s.e = 0.0F;
      this.t.e = 0.0F;
      this.l.e = 0.0F;
      boolean $$6 = $$0.aA() && $$0.dn().g() < 1.0E-7;
      if ($$6) {
         this.m.f = -0.2618F;
         this.m.g = 0.0F;
         this.n.e = 0.0F;
         this.n.f = 0.2618F;
         this.n.g = 0.0F;
         this.o.e = 0.0F;
         this.p.e = 0.0F;
         this.q.e = 0.0F;
      } else {
         float $$7 = $$3 * 120.32113F * (float) (Math.PI / 180.0);
         this.m.f = 0.0F;
         this.m.g = arp.b($$7) * (float) Math.PI * 0.15F;
         this.n.e = this.m.e;
         this.n.f = this.m.f;
         this.n.g = -this.m.g;
         this.o.e = (float) (Math.PI / 4);
         this.p.e = (float) (Math.PI / 4);
         this.q.e = (float) (Math.PI / 4);
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
      }

      if (!$$0.S_()) {
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
         if (!$$6) {
            float $$8 = arp.b($$3 * 0.18F);
            this.l.e = 0.1F + $$8 * (float) Math.PI * 0.025F;
            this.s.e = $$8 * (float) Math.PI * 0.03F;
            this.t.e = $$8 * (float) Math.PI * 0.03F;
            this.o.e = -$$8 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.q.e = -$$8 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.l.c = 19.0F - arp.b($$3 * 0.18F) * 0.9F;
         }
      }

      if (this.u > 0.0F) {
         this.l.e = ffq.a(this.l.e, 3.0915928F, this.u);
      }
   }

   @Override
   protected Iterable<fhs> a() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<fhs> b() {
      return ImmutableList.of(this.l);
   }
}
