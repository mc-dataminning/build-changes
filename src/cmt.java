import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmt extends cms {
   @Nullable
   private jh a;
   private boolean b;
   private boolean c;

   protected cmt(bvm<? extends cmt> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(4, new cmt.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.a != null) {
         $$0.a("patrol_target", vm.a(this.a));
      }

      $$0.a("PatrolLeader", this.b);
      $$0.a("Patrolling", this.c);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      vm.a($$0, "patrol_target").ifPresent($$0x -> this.a = $$0x);
      this.b = $$0.q("PatrolLeader");
      this.c = $$0.q("Patrolling");
   }

   public boolean gm() {
      return true;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      if ($$2 != bvl.p && $$2 != bvl.h && $$2 != bvl.d && $$0.H_().i() < 0.06F && this.gm()) {
         this.b = true;
      }

      if (this.gp()) {
         this.a(bvn.f, crf.a(this.dX().e(mb.d)));
         this.a(bvn.f, 2.0F);
      }

      if ($$2 == bvl.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bvm<? extends cmt> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a(dhj.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void h(jh $$0) {
      this.a = $$0;
      this.c = true;
   }

   public jh gn() {
      return this.a;
   }

   public boolean go() {
      return this.a != null;
   }

   public void x(boolean $$0) {
      this.b = $$0;
      this.c = true;
   }

   public boolean gp() {
      return this.b;
   }

   public boolean gs() {
      return true;
   }

   public void gt() {
      this.a = this.dv().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gu() {
      return this.c;
   }

   protected void y(boolean $$0) {
      this.c = $$0;
   }

   public static class a<T extends cmt> extends ccz {
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
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dV().ac() < this.e;
         return this.b.gu() && this.b.O_() == null && !this.b.cY() && this.b.go() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gp();
         cfn $$1 = this.b.L();
         if ($$1.m()) {
            List<cmt> $$2 = this.h();
            if (this.b.gu() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gn().a(this.b.dt(), 10.0)) {
               this.b.gt();
            } else {
               fbs $$3 = fbs.c(this.b.gn());
               fbs $$4 = this.b.dt();
               fbs $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fbs $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jh $$7 = jh.a((ka)$$6);
               $$7 = this.b.dV().a(edi.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dV().ac() + 200L;
               } else if ($$0) {
                  for (cmt $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cmt> h() {
         return this.b.dV().a(cmt.class, this.b.cR().g(16.0), $$0 -> $$0.gs() && !$$0.u(this.b));
      }

      private boolean i() {
         bam $$0 = this.b.dY();
         jh $$1 = this.b.dV().a(edi.a.f, this.b.dv().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
