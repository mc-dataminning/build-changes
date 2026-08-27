import com.google.common.collect.ImmutableList;

public class ffd<T extends bvv> extends fev<T> {
   private static final float a = 19.0F;
   private static final String b = "bone";
   private static final String f = "stinger";
   private static final String g = "left_antenna";
   private static final String h = "right_antenna";
   private static final String i = "front_legs";
   private static final String j = "middle_legs";
   private static final String k = "back_legs";
   private final fiw l;
   private final fiw m;
   private final fiw n;
   private final fiw o;
   private final fiw p;
   private final fiw q;
   private final fiw r;
   private final fiw s;
   private final fiw t;
   private float u;

   public ffd(fiw $$0) {
      super(false, 24.0F, 0.0F);
      this.l = $$0.b("bone");
      fiw $$1 = this.l.b("body");
      this.r = $$1.b("stinger");
      this.s = $$1.b("left_antenna");
      this.t = $$1.b("right_antenna");
      this.m = this.l.b("right_wing");
      this.n = this.l.b("left_wing");
      this.o = this.l.b("front_legs");
      this.p = this.l.b("middle_legs");
      this.q = this.l.b("back_legs");
   }

   public static fjc c() {
      float $$0 = 19.0F;
      fje $$1 = new fje();
      fjf $$2 = $$1.a();
      fjf $$3 = $$2.a("bone", fjb.c(), fiy.a(0.0F, 19.0F, 0.0F));
      fjf $$4 = $$3.a("body", fjb.c().a(0, 0).a(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), fiy.a);
      $$4.a("stinger", fjb.c().a(26, 7).a(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), fiy.a);
      $$4.a("left_antenna", fjb.c().a(2, 0).a(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fiy.a(0.0F, -2.0F, -5.0F));
      $$4.a("right_antenna", fjb.c().a(2, 3).a(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), fiy.a(0.0F, -2.0F, -5.0F));
      fja $$5 = new fja(0.001F);
      $$3.a("right_wing", fjb.c().a(0, 18).a(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$5), fiy.a(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
      $$3.a("left_wing", fjb.c().a(0, 18).a().a(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, $$5), fiy.a(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
      $$3.a("front_legs", fjb.c().a("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), fiy.a(1.5F, 3.0F, -2.0F));
      $$3.a("middle_legs", fjb.c().a("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), fiy.a(1.5F, 3.0F, 0.0F));
      $$3.a("back_legs", fjb.c().a("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), fiy.a(1.5F, 3.0F, 2.0F));
      return fjc.a($$1, 64, 64);
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
      boolean $$6 = $$0.aA() && $$0.do().g() < 1.0E-7;
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
         this.m.g = asy.b($$7) * (float) Math.PI * 0.15F;
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

      if (!$$0.Y_()) {
         this.l.e = 0.0F;
         this.l.f = 0.0F;
         this.l.g = 0.0F;
         if (!$$6) {
            float $$8 = asy.b($$3 * 0.18F);
            this.l.e = 0.1F + $$8 * (float) Math.PI * 0.025F;
            this.s.e = $$8 * (float) Math.PI * 0.03F;
            this.t.e = $$8 * (float) Math.PI * 0.03F;
            this.o.e = -$$8 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.q.e = -$$8 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.l.c = 19.0F - asy.b($$3 * 0.18F) * 0.9F;
         }
      }

      if (this.u > 0.0F) {
         this.l.e = fgu.a(this.l.e, 3.0915928F, this.u);
      }
   }

   @Override
   protected Iterable<fiw> a() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<fiw> b() {
      return ImmutableList.of(this.l);
   }
}
