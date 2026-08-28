import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cpl extends cpk {
   private static final boolean a = false;
   private static final boolean b = false;
   @Nullable
   private iw c;
   private boolean d = false;
   private boolean e = false;

   protected cpl(bxn<? extends cpl> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void C() {
      super.C();
      this.bF.a(4, new cpl.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.b("patrol_target", iw.a, this.c);
      $$0.a("PatrolLeader", this.d);
      $$0.a("Patrolling", this.e);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.c = $$0.<iw>a("patrol_target", iw.a).orElse(null);
      this.d = $$0.b("PatrolLeader", false);
      this.e = $$0.b("Patrolling", false);
   }

   public boolean gv() {
      return true;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      if ($$2 != bxm.p && $$2 != bxm.h && $$2 != bxm.d && $$0.G_().i() < 0.06F && this.gv()) {
         this.d = true;
      }

      if (this.gy()) {
         this.a(bxo.f, cty.a(this.dX().f(mi.aF)));
         this.a(bxo.f, 2.0F);
      }

      if ($$2 == bxm.p) {
         this.e = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bxn<? extends cpl> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a(dks.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.e || $$0 > 16384.0;
   }

   public void h(iw $$0) {
      this.c = $$0;
      this.e = true;
   }

   public iw gw() {
      return this.c;
   }

   public boolean gx() {
      return this.c != null;
   }

   public void w(boolean $$0) {
      this.d = $$0;
      this.e = true;
   }

   public boolean gy() {
      return this.d;
   }

   public boolean gB() {
      return true;
   }

   public void gC() {
      this.c = this.dv().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.e = true;
   }

   protected boolean gD() {
      return this.e;
   }

   protected void x(boolean $$0) {
      this.e = $$0;
   }

   public static class a<T extends cpl> extends cfb {
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
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dV().ae() < this.e;
         return this.b.gD() && this.b.e() == null && !this.b.cX() && this.b.gx() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gy();
         chp $$1 = this.b.N();
         if ($$1.k()) {
            List<cpl> $$2 = this.h();
            if (this.b.gD() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gw().a(this.b.dt(), 10.0)) {
               this.b.gC();
            } else {
               fgc $$3 = fgc.c(this.b.gw());
               fgc $$4 = this.b.dt();
               fgc $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fgc $$6 = $$3.d($$4).d().c(10.0).e($$4);
               iw $$7 = iw.a((jq)$$6);
               $$7 = this.b.dV().a(ehp.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ae() + 200L;
               } else if ($$0) {
                  for (cpl $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cpl> h() {
         return this.b.dV().a(cpl.class, this.b.cR().g(16.0), $$0 -> $$0.gB() && !$$0.u(this.b));
      }

      private boolean i() {
         bai $$0 = this.b.dY();
         iw $$1 = this.b.dV().a(ehp.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.N().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
