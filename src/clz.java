import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class clz extends cly {
   @Nullable
   private jh a;
   private boolean b;
   private boolean c;

   protected clz(bus<? extends clz> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(4, new clz.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.a != null) {
         $$0.a("patrol_target", va.a(this.a));
      }

      $$0.a("PatrolLeader", this.b);
      $$0.a("Patrolling", this.c);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      va.a($$0, "patrol_target").ifPresent($$0x -> this.a = $$0x);
      this.b = $$0.q("PatrolLeader");
      this.c = $$0.q("Patrolling");
   }

   public boolean gn() {
      return true;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$2 != bur.p && $$2 != bur.h && $$2 != bur.d && $$0.G_().i() < 0.06F && this.gn()) {
         this.b = true;
      }

      if (this.gq()) {
         this.a(but.f, cqh.a(this.dX().e(ma.d)));
         this.a(but.f, 2.0F);
      }

      if ($$2 == bur.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bus<? extends clz> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a(dfv.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void h(jh $$0) {
      this.a = $$0;
      this.c = true;
   }

   public jh go() {
      return this.a;
   }

   public boolean gp() {
      return this.a != null;
   }

   public void x(boolean $$0) {
      this.b = $$0;
      this.c = true;
   }

   public boolean gq() {
      return this.b;
   }

   public boolean gt() {
      return true;
   }

   public void gu() {
      this.a = this.dv().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gv() {
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
         boolean $$0 = this.b.dV().ab() < this.e;
         return this.b.gv() && this.b.aa_() == null && !this.b.cY() && this.b.gp() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gq();
         cet $$1 = this.b.L();
         if ($$1.m()) {
            List<clz> $$2 = this.h();
            if (this.b.gv() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.go().a(this.b.dt(), 10.0)) {
               this.b.gu();
            } else {
               ezy $$3 = ezy.c(this.b.go());
               ezy $$4 = this.b.dt();
               ezy $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               ezy $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jh $$7 = jh.a((ka)$$6);
               $$7 = this.b.dV().a(ebq.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ab() + 200L;
               } else if ($$0) {
                  for (clz $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<clz> h() {
         return this.b.dV().a(clz.class, this.b.cR().g(16.0), $$0 -> $$0.gt() && !$$0.u(this.b));
      }

      private boolean i() {
         azu $$0 = this.b.dY();
         jh $$1 = this.b.dV().a(ebq.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
