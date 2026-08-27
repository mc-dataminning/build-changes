import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cin extends cic {
   private static final int bZ = 5;
   @Nullable
   private ib ca;
   private int cb;

   public cin(bpd<? extends cin> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwg(this));
      this.bR.a(0, new bxx<>(this, csl.a(new cqm(cqp.sj), csm.i), aty.AY, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bR.a(0, new bxx<>(this, new cqm(cqp.qD), aty.Bd, $$0 -> this.dM().P() && $$0.ce()));
      this.bR.a(1, new bxv(this));
      this.bR.a(1, new bvt<>(this, cgt.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bvt<>(this, cft.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bvt<>(this, cgp.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bvt<>(this, cgo.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bvt<>(this, cgd.class, 15.0F, 0.5, 0.5));
      this.bR.a(1, new bvt<>(this, cfy.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bvt<>(this, cgs.class, 10.0F, 0.5, 0.5));
      this.bR.a(1, new bxf(this, 0.5));
      this.bR.a(1, new bwv(this));
      this.bR.a(2, new cin.a(this, 2.0, 0.35));
      this.bR.a(4, new bxa(this, 0.35));
      this.bR.a(8, new bxz(this, 0.35));
      this.bR.a(9, new bwp(this, ciu.class, 3.0F, 1.0F));
      this.bR.a(10, new bwu(this, bpr.class, 8.0F));
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      return null;
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (!$$2.a(cqp.tI) && this.bA() && !this.go() && !this.o_()) {
         if ($$1 == bnc.a) {
            $$0.a(aui.S);
         }

         if (this.gp().isEmpty()) {
            return bnd.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bnd.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gu() {
      if (this.dM().I().b(clj.d)) {
         this.gx();
      } else {
         cil.g[] $$0 = (cil.g[])cil.b.get(1);
         cil.g[] $$1 = (cil.g[])cil.b.get(2);
         if ($$0 != null && $$1 != null) {
            cwa $$2 = this.gp();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cil.g $$4 = $$1[$$3];
            cvz $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gx() {
      cwa $$0 = this.gp();

      for (Pair<cil.g[], Integer> $$1 : cil.d) {
         cil.g[] $$2 = (cil.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cb);
      if (this.ca != null) {
         $$0.a("wander_target", tp.a(this.ca));
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cb = $$0.h("DespawnDelay");
      }

      tp.a($$0, "wander_target").ifPresent($$0x -> this.ca = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cvz $$0) {
      if ($$0.t()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bpf(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected atx v() {
      return this.go() ? aty.Be : aty.AW;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.Bb;
   }

   @Override
   protected atx n_() {
      return aty.AX;
   }

   @Override
   protected atx c(cqm $$0) {
      return $$0.a(cqp.qD) ? aty.AZ : aty.Ba;
   }

   @Override
   protected atx w(boolean $$0) {
      return $$0 ? aty.Bf : aty.Bc;
   }

   @Override
   public atx gr() {
      return aty.Bf;
   }

   public void v(int $$0) {
      this.cb = $$0;
   }

   public int gw() {
      return this.cb;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dM().B) {
         this.gy();
      }
   }

   private void gy() {
      if (this.cb > 0 && !this.go() && --this.cb == 0) {
         this.am();
      }
   }

   public void i(@Nullable ib $$0) {
      this.ca = $$0;
   }

   @Nullable
   ib gA() {
      return this.ca;
   }

   class a extends bwm {
      final cin a;
      final double b;
      final double c;

      a(cin $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cin.this.bQ.n();
      }

      @Override
      public boolean a() {
         ib $$0 = this.a.gA();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ib $$0 = this.a.gA();
         if ($$0 != null && cin.this.bQ.l()) {
            if (this.a($$0, 10.0)) {
               ept $$1 = new ept((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               ept $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cin.this.bQ.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cin.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ib $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
