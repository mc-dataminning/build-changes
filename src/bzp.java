import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class bzp extends bzo {
   @Nullable
   private gw b;
   private boolean c;
   private boolean d;

   protected bzp(bja<? extends bzp> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(4, new bzp.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", rj.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = rj.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gf() {
      return true;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if ($$2 != bjq.p && $$2 != bjq.h && $$2 != bjq.d && $$0.D_().i() < 0.06F && this.gf()) {
         this.c = true;
      }

      if (this.gi()) {
         this.a(bjb.f, cdh.s());
         this.a(bjb.f, 2.0F);
      }

      if ($$2 == bjq.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(bja<? extends bzp> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a(cqk.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(gw $$0) {
      this.b = $$0;
      this.d = true;
   }

   public gw gg() {
      return this.b;
   }

   public boolean gh() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gi() {
      return this.c;
   }

   public boolean gl() {
      return true;
   }

   public void gm() {
      this.b = this.dl().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gn() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends bzp> extends bqh {
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
         this.a(EnumSet.of(bqh.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dL().V() < this.e;
         return this.b.gn() && this.b.q() == null && !this.b.cO() && this.b.gh() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gi();
         bsv $$1 = this.b.L();
         if ($$1.l()) {
            List<bzp> $$2 = this.h();
            if (this.b.gn() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gg().a(this.b.dj(), 10.0)) {
               this.b.gm();
            } else {
               ehh $$3 = ehh.c(this.b.gg());
               ehh $$4 = this.b.dj();
               ehh $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ehh $$6 = $$3.d($$4).d().a(10.0).e($$4);
               gw $$7 = gw.a($$6);
               $$7 = this.b.dL().a(dkm.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dL().V() + 200L;
               } else if ($$0) {
                  for (bzp $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<bzp> h() {
         return this.b.dL().a(bzp.class, this.b.cG().g(16.0), $$0 -> $$0.gl() && !$$0.t(this.b));
      }

      private boolean i() {
         ash $$0 = this.b.ef();
         gw $$1 = this.b.dL().a(dkm.a.f, this.b.dl().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
