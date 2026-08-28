import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class clw extends clv {
   @Nullable
   private jh b;
   private boolean c;
   private boolean d;

   protected clw(bup<? extends clw> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(4, new clw.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", vc.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      vc.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gw() {
      return true;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      if ($$2 != buo.p && $$2 != buo.h && $$2 != buo.d && $$0.E_().i() < 0.06F && this.gw()) {
         this.c = true;
      }

      if (this.gz()) {
         this.a(buq.f, cqe.a(this.ea().e(ma.d)));
         this.a(buq.f, 2.0F);
      }

      if ($$2 == buo.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bup<? extends clw> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a(dfo.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(jh $$0) {
      this.b = $$0;
      this.d = true;
   }

   public jh gx() {
      return this.b;
   }

   public boolean gy() {
      return this.b != null;
   }

   public void x(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gz() {
      return this.c;
   }

   public boolean gC() {
      return true;
   }

   public void gD() {
      this.b = this.dy().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gE() {
      return this.d;
   }

   protected void y(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends clw> extends ccc {
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
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dY().aa() < this.e;
         return this.b.gE() && this.b.m() == null && !this.b.da() && this.b.gy() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gz();
         ceq $$1 = this.b.P();
         if ($$1.m()) {
            List<clw> $$2 = this.h();
            if (this.b.gE() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gx().a(this.b.dw(), 10.0)) {
               this.b.gD();
            } else {
               ezr $$3 = ezr.c(this.b.gx());
               ezr $$4 = this.b.dw();
               ezr $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               ezr $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jh $$7 = jh.a((ka)$$6);
               $$7 = this.b.dY().a(ebj.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dY().aa() + 200L;
               } else if ($$0) {
                  for (clw $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<clw> h() {
         return this.b.dY().a(clw.class, this.b.cT().g(16.0), $$0 -> $$0.gC() && !$$0.u(this.b));
      }

      private boolean i() {
         azv $$0 = this.b.eb();
         jh $$1 = this.b.dY().a(ebj.a.f, this.b.dy().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
