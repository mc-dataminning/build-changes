import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmt extends cms {
   @Nullable
   private ji a;
   private boolean b;
   private boolean c;

   protected cmt(bvi<? extends cmt> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(4, new cmt.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.a != null) {
         $$0.a("patrol_target", uf.a(this.a));
      }

      $$0.a("PatrolLeader", this.b);
      $$0.a("Patrolling", this.c);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      uf.a($$0, "patrol_target").ifPresent($$0x -> this.a = $$0x);
      this.b = $$0.q("PatrolLeader");
      this.c = $$0.q("Patrolling");
   }

   public boolean t() {
      return true;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$2 != bvh.p && $$2 != bvh.h && $$2 != bvh.d && $$0.C_().i() < 0.06F && this.t()) {
         this.b = true;
      }

      if (this.gt()) {
         this.a(bvj.f, cre.a(this.dW().e(mc.d)));
         this.a(bvj.f, 2.0F);
      }

      if ($$2 == bvh.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bvi<? extends cmt> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a(dhi.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void i(ji $$0) {
      this.a = $$0;
      this.c = true;
   }

   public ji x() {
      return this.a;
   }

   public boolean gs() {
      return this.a != null;
   }

   public void w(boolean $$0) {
      this.b = $$0;
      this.c = true;
   }

   public boolean gt() {
      return this.b;
   }

   public boolean gw() {
      return true;
   }

   public void gx() {
      this.a = this.du().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gy() {
      return this.c;
   }

   protected void x(boolean $$0) {
      this.c = $$0;
   }

   public static class a<T extends cmt> extends ccw {
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
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dU().ae() < this.e;
         return this.b.gy() && this.b.f() == null && !this.b.cW() && this.b.gs() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gt();
         cfk $$1 = this.b.O();
         if ($$1.k()) {
            List<cmt> $$2 = this.h();
            if (this.b.gy() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.x().a(this.b.ds(), 10.0)) {
               this.b.gx();
            } else {
               fbx $$3 = fbx.c(this.b.x());
               fbx $$4 = this.b.ds();
               fbx $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fbx $$6 = $$3.d($$4).d().c(10.0).e($$4);
               ji $$7 = ji.a((kb)$$6);
               $$7 = this.b.dU().a(edo.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dU().ae() + 200L;
               } else if ($$0) {
                  for (cmt $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cmt> h() {
         return this.b.dU().a(cmt.class, this.b.cQ().g(16.0), $$0 -> $$0.gw() && !$$0.u(this.b));
      }

      private boolean i() {
         azh $$0 = this.b.dX();
         ji $$1 = this.b.dU().a(edo.a.f, this.b.du().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
