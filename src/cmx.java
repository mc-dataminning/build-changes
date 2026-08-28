import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmx extends cmw {
   @Nullable
   private jh a;
   private boolean b;
   private boolean c;

   protected cmx(bvq<? extends cmx> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(4, new cmx.a<>(this, 0.7, 0.595));
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

   public boolean go() {
      return true;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$2 != bvp.p && $$2 != bvp.h && $$2 != bvp.d && $$0.H_().i() < 0.06F && this.go()) {
         this.b = true;
      }

      if (this.gr()) {
         this.a(bvr.f, crj.a(this.dY().e(mb.d)));
         this.a(bvr.f, 2.0F);
      }

      if ($$2 == bvp.p) {
         this.c = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bvq<? extends cmx> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a(dhq.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.c || $$0 > 16384.0;
   }

   public void h(jh $$0) {
      this.a = $$0;
      this.c = true;
   }

   public jh gp() {
      return this.a;
   }

   public boolean gq() {
      return this.a != null;
   }

   public void x(boolean $$0) {
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
      this.a = this.dw().b(-500 + this.ae.a(1000), 0, -500 + this.ae.a(1000));
      this.c = true;
   }

   protected boolean gw() {
      return this.c;
   }

   protected void y(boolean $$0) {
      this.c = $$0;
   }

   public static class a<T extends cmx> extends cdd {
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
         this.a(EnumSet.of(cdd.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dW().ac() < this.e;
         return this.b.gw() && this.b.O_() == null && !this.b.cY() && this.b.gq() && !$$0;
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
         cfr $$1 = this.b.L();
         if ($$1.m()) {
            List<cmx> $$2 = this.h();
            if (this.b.gw() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gp().a(this.b.du(), 10.0)) {
               this.b.gv();
            } else {
               fbx $$3 = fbx.c(this.b.gp());
               fbx $$4 = this.b.du();
               fbx $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               fbx $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jh $$7 = jh.a((ka)$$6);
               $$7 = this.b.dW().a(edp.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dW().ac() + 200L;
               } else if ($$0) {
                  for (cmx $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cmx> h() {
         return this.b.dW().a(cmx.class, this.b.cR().g(16.0), $$0 -> $$0.gu() && !$$0.u(this.b));
      }

      private boolean i() {
         bam $$0 = this.b.dZ();
         jh $$1 = this.b.dW().a(edp.a.f, this.b.dw().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
