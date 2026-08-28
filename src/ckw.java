import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class ckw extends ckv {
   @Nullable
   private je b;
   private boolean c;
   private boolean d;

   protected ckw(btq<? extends ckw> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(4, new ckw.a<>(this, 0.7, 0.595));
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

   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$2 != btp.p && $$2 != btp.h && $$2 != btp.d && $$0.C_().i() < 0.06F && this.gp()) {
         this.c = true;
      }

      if (this.gs()) {
         this.a(btr.f, cpc.a(this.dU().b(lv.d)));
         this.a(btr.f, 2.0F);
      }

      if ($$2 == btp.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(btq<? extends ckw> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a(deb.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(je $$0) {
      this.b = $$0;
      this.d = true;
   }

   public je gq() {
      return this.b;
   }

   public boolean gr() {
      return this.b != null;
   }

   public void x(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gs() {
      return this.c;
   }

   public boolean gv() {
      return true;
   }

   public void gw() {
      this.b = this.ds().b(-500 + this.af.a(1000), 0, -500 + this.af.a(1000));
      this.d = true;
   }

   protected boolean gx() {
      return this.d;
   }

   protected void y(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends ckw> extends cbc {
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
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         boolean $$0 = this.b.dS().aa() < this.e;
         return this.b.gx() && this.b.m() == null && !this.b.cV() && this.b.gr() && !$$0;
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
      }

      @Override
      public void a() {
         boolean $$0 = this.b.gs();
         cdq $$1 = this.b.P();
         if ($$1.m()) {
            List<ckw> $$2 = this.h();
            if (this.b.gx() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gq().a(this.b.dq(), 10.0)) {
               this.b.gw();
            } else {
               eye $$3 = eye.c(this.b.gq());
               eye $$4 = this.b.dq();
               eye $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               eye $$6 = $$3.d($$4).d().c(10.0).e($$4);
               je $$7 = je.a((jx)$$6);
               $$7 = this.b.dS().a(dzw.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dS().aa() + 200L;
               } else if ($$0) {
                  for (ckw $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<ckw> h() {
         return this.b.dS().a(ckw.class, this.b.cO().g(16.0), $$0 -> $$0.gv() && !$$0.u(this.b));
      }

      private boolean i() {
         azk $$0 = this.b.dV();
         je $$1 = this.b.dS().a(dzw.a.f, this.b.ds().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
