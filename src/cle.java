import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cle extends cld {
   @Nullable
   private jf b;
   private boolean c;
   private boolean d;

   protected cle(bty<? extends cle> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(4, new cle.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("patrol_target", uv.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      uv.a($$0, "patrol_target").ifPresent($$0x -> this.b = $$0x);
      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean gp() {
      return true;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$2 != btx.p && $$2 != btx.h && $$2 != btx.d && $$0.D_().i() < 0.06F && this.gp()) {
         this.c = true;
      }

      if (this.gs()) {
         this.a(btz.f, cpl.a(this.dU().e(lw.d)));
         this.a(btz.f, 2.0F);
      }

      if ($$2 == btx.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean b(bty<? extends cle> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a(des.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void h(jf $$0) {
      this.b = $$0;
      this.d = true;
   }

   public jf gq() {
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

   public static class a<T extends cle> extends cbk {
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
         this.a(EnumSet.of(cbk.a.a));
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
         cdy $$1 = this.b.P();
         if ($$1.m()) {
            List<cle> $$2 = this.h();
            if (this.b.gx() && $$2.isEmpty()) {
               this.b.y(false);
            } else if ($$0 && this.b.gq().a(this.b.dq(), 10.0)) {
               this.b.gw();
            } else {
               eyw $$3 = eyw.c(this.b.gq());
               eyw $$4 = this.b.dq();
               eyw $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).c(0.4).e($$3);
               eyw $$6 = $$3.d($$4).d().c(10.0).e($$4);
               jf $$7 = jf.a((jy)$$6);
               $$7 = this.b.dS().a(eao.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dS().aa() + 200L;
               } else if ($$0) {
                  for (cle $$8 : $$2) {
                     $$8.h($$7);
                  }
               }
            }
         }
      }

      private List<cle> h() {
         return this.b.dS().a(cle.class, this.b.cO().g(16.0), $$0 -> $$0.gv() && !$$0.u(this.b));
      }

      private boolean i() {
         azn $$0 = this.b.dV();
         jf $$1 = this.b.dS().a(eao.a.f, this.b.ds().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.P().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
