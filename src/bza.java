import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class bza extends byz {
   @Nullable
   private gv b;
   private boolean c;
   private boolean d;

   protected bza(bik<? extends bza> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(4, new bza.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", re.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = re.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean ga() {
      return true;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$2 != bja.p && $$2 != bja.h && $$2 != bja.d && $$0.y_().i() < 0.06F && this.ga()) {
         this.c = true;
      }

      if (this.gd()) {
         this.a(bil.f, ccs.s());
         this.a(bil.f, 2.0F);
      }

      if ($$2 == bja.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bik<? extends bza> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a(cpt.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(gv $$0) {
      this.b = $$0;
      this.d = true;
   }

   public gv gb() {
      return this.b;
   }

   public boolean gc() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gd() {
      return this.c;
   }

   public boolean gg() {
      return true;
   }

   public void gh() {
      this.b = this.dk().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gi() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends bza> extends bps {
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
         this.a(EnumSet.of(bps.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dK().V() < this.e;
         return this.b.gi() && this.b.j() == null && !this.b.cO() && this.b.gc() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gd();
         bsg $$1 = this.b.H();
         if ($$1.l()) {
            List<bza> $$2 = this.h();
            if (this.b.gi() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gb().a(this.b.di(), 10.0)) {
               this.b.gh();
            } else {
               ehf $$3 = ehf.c(this.b.gb());
               ehf $$4 = this.b.di();
               ehf $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ehf $$6 = $$3.d($$4).d().a(10.0).e($$4);
               gv $$7 = gv.a($$6);
               $$7 = this.b.dK().a(dkh.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dK().V() + 200L;
               } else if ($$0) {
                  for (bza $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<bza> h() {
         return this.b.dK().a(bza.class, this.b.cG().g(16.0), $$0 -> $$0.gg() && !$$0.t(this.b));
      }

      private boolean i() {
         art $$0 = this.b.ee();
         gv $$1 = this.b.dK().a(dkh.a.f, this.b.dk().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.H().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
