import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class clz extends cly {
   @Nullable
   private ji a;
   private boolean b;
   private boolean c;

   protected clz(bus<? extends clz> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(4, new clz.a<>(this, 0.7, 0.595));
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

   public boolean gs() {
      return true;
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$2 != bur.p && $$2 != bur.h && $$2 != bur.d && $$0.H_().i() < 0.06F && this.gs()) {
         this.b = true;
      }

      if (this.gv()) {
         this.a(but.f, cqk.a(this.dX().e(mc.d)));
         this.a(but.f, 2.0F);
      }

      if ($$2 == bur.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bus<? extends clz> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.a(dgr.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void h(ji $$0) {
      this.a = $$0;
      this.c = true;
   }

   public ji gt() {
      return this.a;
   }

   public boolean gu() {
      return this.a != null;
   }

   public void x(boolean $$0) {
      this.b = $$0;
      this.c = true;
   }

   public boolean gv() {
      return this.b;
   }

   public boolean gy() {
      return true;
   }

   public void gz() {
      this.a = this.dv().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gA() {
      return this.c;
   }

   protected void y(boolean $$0) {
      this.c = $$0;
   }

   public static class a<T extends clz> extends ccf {
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
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dV().ad() < this.e;
         return this.b.gA() && this.b.O_() == null && !this.b.cX() && this.b.gu() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gv();
         cet $$1 = this.b.P();
         if ($$1.k()) {
            List<clz> $$2 = this.h();
            if (this.b.gA() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gt().a(this.b.dt(), 10.0)) {
               this.b.gz();
            } else {
               fba $$3 = fba.c(this.b.gt());
               fba $$4 = this.b.dt();
               fba $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fba $$6 = $$3.d($$4).d().c(10.0).e($$4);
               ji $$7 = ji.a((kb)$$6);
               $$7 = this.b.dV().a(ecs.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ad() + 200L;
               } else if ($$0) {
                  for (clz $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<clz> h() {
         return this.b.dV().a(clz.class, this.b.cR().g(16.0), $$0 -> $$0.gy() && !$$0.u(this.b));
      }

      private boolean i() {
         azh $$0 = this.b.dY();
         ji $$1 = this.b.dV().a(ecs.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
