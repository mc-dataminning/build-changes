import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class coa extends cnz {
   @Nullable
   private iu a;
   private boolean b;
   private boolean c;

   protected coa(bwm<? extends coa> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(4, new coa.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (this.a != null) {
         $$0.a("patrol_target", uo.a(this.a));
      }

      $$0.a("PatrolLeader", this.b);
      $$0.a("Patrolling", this.c);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      uo.a($$0, "patrol_target").ifPresent($$0x -> this.a = $$0x);
      this.b = $$0.q("PatrolLeader");
      this.c = $$0.q("Patrolling");
   }

   public boolean t() {
      return true;
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$2 != bwl.p && $$2 != bwl.h && $$2 != bwl.d && $$0.C_().i() < 0.06F && this.t()) {
         this.b = true;
      }

      if (this.gr()) {
         this.a(bwn.f, csn.a(this.dX().f(mg.aF)));
         this.a(bwn.f, 2.0F);
      }

      if ($$2 == bwl.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bwm<? extends coa> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a(dje.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void h(iu $$0) {
      this.a = $$0;
      this.c = true;
   }

   public iu x() {
      return this.a;
   }

   public boolean gq() {
      return this.a != null;
   }

   public void w(boolean $$0) {
      this.b = $$0;
      this.c = true;
   }

   public boolean gr() {
      return this.b;
   }

   public boolean gu() {
      return true;
   }

   public void gv() {
      this.a = this.dv().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gw() {
      return this.c;
   }

   protected void x(boolean $$0) {
      this.c = $$0;
   }

   public static class a<T extends coa> extends cdy {
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
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dV().ae() < this.e;
         return this.b.gw() && this.b.f() == null && !this.b.cX() && this.b.gq() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gr();
         cgm $$1 = this.b.O();
         if ($$1.k()) {
            List<coa> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.x().a(this.b.dt(), 10.0)) {
               this.b.gv();
            } else {
               fei $$3 = fei.c(this.b.x());
               fei $$4 = this.b.dt();
               fei $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fei $$6 = $$3.d($$4).d().c(10.0).e($$4);
               iu $$7 = iu.a((jo)$$6);
               $$7 = this.b.dV().a(efy.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ae() + 200L;
               } else if ($$0) {
                  for (coa $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<coa> h() {
         return this.b.dV().a(coa.class, this.b.cR().g(16.0), $$0 -> $$0.gu() && !$$0.u(this.b));
      }

      private boolean i() {
         azv $$0 = this.b.dY();
         iu $$1 = this.b.dV().a(efy.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
