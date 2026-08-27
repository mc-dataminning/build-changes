import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class bwd extends bwc {
   @Nullable
   private gu b;
   private boolean c;
   private boolean d;

   protected bwd(bfn<? extends bwd> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(4, new bwd.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", rd.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = rd.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   @Override
   public double bw() {
      return -0.45;
   }

   public boolean fZ() {
      return true;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      if ($$2 != bgd.p && $$2 != bgd.h && $$2 != bgd.d && $$0.y_().i() < 0.06F && this.fZ()) {
         this.c = true;
      }

      if (this.gc()) {
         this.a(bfo.f, bzv.s());
         this.a(bfo.f, 2.0F);
      }

      if ($$2 == bgd.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bfn<? extends bwd> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.a(cmv.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(gu $$0) {
      this.b = $$0;
      this.d = true;
   }

   public gu ga() {
      return this.b;
   }

   public boolean gb() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gc() {
      return this.c;
   }

   public boolean gf() {
      return true;
   }

   public void gg() {
      this.b = this.di().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gh() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends bwd> extends bmv {
      private static final int a = 200;
      private final T b;
      private final double c;
      private final double d;
      private long e;

      public a(T $$0, double $$1, double $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = -1L;
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dI().V() < this.e;
         return this.b.gh() && this.b.j() == null && !this.b.bN() && this.b.gb() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gc();
         bpj $$1 = this.b.J();
         if ($$1.l()) {
            List<bwd> $$2 = this.h();
            if (this.b.gh() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.ga().a(this.b.dg(), 10.0)) {
               this.b.gg();
            } else {
               eei $$3 = eei.c(this.b.ga());
               eei $$4 = this.b.dg();
               eei $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               eei $$6 = $$3.d($$4).d().a(10.0).e($$4);
               gu $$7 = gu.a($$6);
               $$7 = this.b.dI().a(dhk.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dI().V() + 200L;
               } else if ($$0) {
                  for (bwd $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<bwd> h() {
         return this.b.dI().a(bwd.class, this.b.cE().g(16.0), $$0 -> $$0.gf() && !$$0.q(this.b));
      }

      private boolean i() {
         apf $$0 = this.b.ec();
         gu $$1 = this.b.dI().a(dhk.a.f, this.b.di().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.J().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
