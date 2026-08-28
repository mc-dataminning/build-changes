import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class clb extends cla {
   @Nullable
   private je b;
   private boolean c;
   private boolean d;

   protected clb(btv<? extends clb> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(4, new clb.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", uu.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      uu.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gq() {
      return true;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$2 != btu.p && $$2 != btu.h && $$2 != btu.d && $$0.C_().i() < 0.06F && this.gq()) {
         this.c = true;
      }

      if (this.gt()) {
         this.a(btw.f, cpi.a(this.dU().b(lv.d)));
         this.a(btw.f, 2.0F);
      }

      if ($$2 == btu.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(btv<? extends clb> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a(dep.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(je $$0) {
      this.b = $$0;
      this.d = true;
   }

   public je gr() {
      return this.b;
   }

   public boolean gs() {
      return this.b != null;
   }

   public void x(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gt() {
      return this.c;
   }

   public boolean gw() {
      return true;
   }

   public void gx() {
      this.b = this.ds().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gy() {
      return this.d;
   }

   protected void y(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends clb> extends cbh {
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
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dS().aa() < this.e;
         return this.b.gy() && this.b.m() == null && !this.b.cV() && this.b.gs() && !$$0;
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
         cdv $$1 = this.b.P();
         if ($$1.m()) {
            List<clb> $$2 = this.h();
            if (this.b.gy() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gr().a(this.b.dq(), 10.0)) {
               this.b.gx();
            } else {
               eys $$3 = eys.c(this.b.gr());
               eys $$4 = this.b.dq();
               eys $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               eys $$6 = $$3.d($$4).d().c(10.0).e($$4);
               je $$7 = je.a((jx)$$6);
               $$7 = this.b.dS().a(eak.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dS().aa() + 200L;
               } else if ($$0) {
                  for (clb $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<clb> h() {
         return this.b.dS().a(clb.class, this.b.cO().g(16.0), $$0 -> $$0.gw() && !$$0.u(this.b));
      }

      private boolean i() {
         azl $$0 = this.b.dV();
         je $$1 = this.b.dS().a(eak.a.f, this.b.ds().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
