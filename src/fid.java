import com.google.common.collect.ImmutableList;

public class fid<T extends bxj> extends fhv<T> {
   private static final float a = 19.0F;
   private static final String b = "bone";
   private static final String f = "stinger";
   private static final String g = "left_antenna";
   private static final String h = "right_antenna";
   private static final String i = "front_legs";
   private static final String j = "middle_legs";
   private static final String k = "back_legs";
   private final fly l;
   private final fly m;
   private final fly n;
   private final fly o;
   private final fly p;
   private final fly q;
   private final fly r;
   private final fly s;
   private final fly t;
   private float u;

   public fid(fly $$0) {
      super(false, 24.0F, 0.0F);
      this.l = $$0.b("bone");
      fly $$1 = this.l.b("body");
      this.r = $$1.b("stinger");
      this.s = $$1.b("left_antenna");
      this.t = $$1.b("right_antenna");
      this.m = this.l.b("right_wing");
      this.n = this.l.b("left_wing");
      this.o = this.l.b("front_legs");
      this.p = this.l.b("middle_legs");
      this.q = this.l.b("back_legs");
   }

   public static fme c() {
      float $$0 = 19.0F;
      fmg $$1 = new fmg();
      fmh $$2 = $$1.a();
      fmh $$3 = $$2.a("bone", fmd.c(), fma.a(0.0F, 19.0F, 0.0F));
      fmh $$4 = $$3.a("body", fmd.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), fma.a);
      $$4.a("stinger", fmd.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), fma.a);
      $$4.a("left_antenna", fmd.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fma.a(0.0F, -2.0F, -5.0F));
      $$4.a("right_antenna", fmd.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fma.a(0.0F, -2.0F, -5.0F));
      fmc $$5 = new fmc(0.001F);
      $$3.a("right_wing", fmd.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$5), fma.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$3.a("left_wing", fmd.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$5), fma.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$3.a("front_legs", fmd.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), fma.a(1.5F, 3.0F, -2.0F));
      $$3.a("middle_legs", fmd.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), fma.a(1.5F, 3.0F, 0.0F));
      $$3.a("back_legs", fmd.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), fma.a(1.5F, 3.0F, 2.0F));
      return fme.a($$1, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.u = $$0.E($$3);
      this.r.k = !$$0.gp();
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.m.e = 0.0F;
      this.s.e = 0.0F;
      this.t.e = 0.0F;
      this.l.e = 0.0F;
      boolean $$6 = $$0.aC() && $$0.dp().g() < 1.0E-7;
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
         this.m.g = aty.b($$7) * (float) Math.PI * 0.15F;
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

      if (!$$0.aa_()) {
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
         if (!$$6) {
            float $$8 = aty.b($$3 * 0.18F);
            this.l.e = 0.1F + $$8 * (float) Math.PI * 0.025F;
            this.s.e = $$8 * (float) Math.PI * 0.03F;
            this.t.e = $$8 * (float) Math.PI * 0.03F;
            this.o.e = -$$8 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.q.e = -$$8 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.l.c = 19.0F - aty.b($$3 * 0.18F) * 0.9F;
         }
      }

      if (this.u > 0.0F) {
         this.l.e = fjv.a(this.l.e, 3.0915928F, this.u);
      }
   }

   @Override
   protected Iterable<fly> a() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<fly> b() {
      return ImmutableList.of(this.l);
   }
}
