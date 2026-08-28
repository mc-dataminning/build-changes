import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cnk extends cnj {
   @Nullable
   private jj a;
   private boolean b;
   private boolean c;

   protected cnk(bwb<? extends cnk> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bB.a(4, new cnk.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      if (this.a != null) {
         $$0.a("patrol_target", ul.a(this.a));
      }

      $$0.a("PatrolLeader", this.b);
      $$0.a("Patrolling", this.c);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      ul.a($$0, "patrol_target").ifPresent($$0x -> this.a = $$0x);
      this.b = $$0.q("PatrolLeader");
      this.c = $$0.q("Patrolling");
   }

   public boolean t() {
      return true;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if ($$2 != bwa.p && $$2 != bwa.h && $$2 != bwa.d && $$0.C_().i() < 0.06F && this.t()) {
         this.b = true;
      }

      if (this.gr()) {
         this.a(bwc.f, crv.a(this.dX().f(me.d)));
         this.a(bwc.f, 2.0F);
      }

      if ($$2 == bwa.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bwb<? extends cnk> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a(dhy.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void i(jj $$0) {
      this.a = $$0;
      this.c = true;
   }

   public jj x() {
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

   public static class a<T extends cnk> extends cdn {
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
         this.a(EnumSet.of(cdn.a.a));
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
         cgb $$1 = this.b.O();
         if ($$1.k()) {
            List<cnk> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.x().a(this.b.dt(), 10.0)) {
               this.b.gv();
            } else {
               fcu $$3 = fcu.c(this.b.x());
               fcu $$4 = this.b.dt();
               fcu $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fcu $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jj $$7 = jj.a((kc)$$6);
               $$7 = this.b.dV().a(eel.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ae() + 200L;
               } else if ($$0) {
                  for (cnk $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<cnk> h() {
         return this.b.dV().a(cnk.class, this.b.cR().g(16.0), $$0 -> $$0.gu() && !$$0.u(this.b));
      }

      private boolean i() {
         azs $$0 = this.b.dY();
         jj $$1 = this.b.dV().a(eel.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.O().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
