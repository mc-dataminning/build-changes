import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public abstract class bzj extends bzi {
   @Nullable
   private gw b;
   private boolean c;
   private boolean d;

   protected bzj(biu<? extends bzj> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(4, new bzj.a<>(this, 0.7, 0.595));
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      if (this.b != null) {
         $$0.a("PatrolTarget", rk.a(this.b));
      }

      $$0.a("PatrolLeader", this.c);
      $$0.a("Patrolling", this.d);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.e("PatrolTarget")) {
         this.b = rk.b($$0.p("PatrolTarget"));
      }

      this.c = $$0.q("PatrolLeader");
      this.d = $$0.q("Patrolling");
   }

   public boolean ge() {
      return true;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      if ($$2 != bjk.p && $$2 != bjk.h && $$2 != bjk.d && $$0.D_().i() < 0.06F && this.ge()) {
         this.c = true;
      }

      if (this.gh()) {
         this.a(biv.f, cdb.s());
         this.a(biv.f, 2.0F);
      }

      if ($$2 == bjk.p) {
         this.d = true;
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean b(biu<? extends bzj> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a(cqe.b, $$3) > 8 ? false : c($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean h(double $$0) {
      return !this.d || $$0 > 16384.0;
   }

   public void i(gw $$0) {
      this.b = $$0;
      this.d = true;
   }

   public gw gf() {
      return this.b;
   }

   public boolean gg() {
      return this.b != null;
   }

   public void w(boolean $$0) {
      this.c = $$0;
      this.d = true;
   }

   public boolean gh() {
      return this.c;
   }

   public boolean gk() {
      return true;
   }

   public void gl() {
      this.b = this.dl().b(-500 + this.ag.a(1000), 0, -500 + this.ag.a(1000));
      this.d = true;
   }

   protected boolean gm() {
      return this.d;
   }

   protected void x(boolean $$0) {
      this.d = $$0;
   }

   public static class a<T extends bzj> extends bqb {
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
         this.a(EnumSet.of(bqb.a.a));
      }

      @Override
      public boolean a() {
         boolean $$0 = this.b.dL().V() < this.e;
         return this.b.gm() && this.b.q() == null && !this.b.cO() && this.b.gg() && !$$0;
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         boolean $$0 = this.b.gh();
         bsp $$1 = this.b.L();
         if ($$1.l()) {
            List<bzj> $$2 = this.h();
            if (this.b.gm() && $$2.isEmpty()) {
               this.b.x(false);
            } else if ($$0 && this.b.gf().a(this.b.dj(), 10.0)) {
               this.b.gl();
            } else {
               ehn $$3 = ehn.c(this.b.gf());
               ehn $$4 = this.b.dj();
               ehn $$5 = $$4.d($$3);
               $$3 = $$5.b(90.0F).a(0.4).e($$3);
               ehn $$6 = $$3.d($$4).d().a(10.0).e($$4);
               gw $$7 = gw.a($$6);
               $$7 = this.b.dL().a(dks.a.f, $$7);
               if (!$$1.a((double)$$7.u(), (double)$$7.v(), (double)$$7.w(), $$0 ? this.d : this.c)) {
                  this.i();
                  this.e = this.b.dL().V() + 200L;
               } else if ($$0) {
                  for (bzj $$8 : $$2) {
                     $$8.i($$7);
                  }
               }
            }
         }
      }

      private List<bzj> h() {
         return this.b.dL().a(bzj.class, this.b.cG().g(16.0), $$0 -> $$0.gk() && !$$0.t(this.b));
      }

      private boolean i() {
         asc $$0 = this.b.ef();
         gw $$1 = this.b.dL().a(dks.a.f, this.b.dl().b(-8 + $$0.a(16), 0, -8 + $$0.a(16)));
         return this.b.L().a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), this.c);
      }
   }
}
