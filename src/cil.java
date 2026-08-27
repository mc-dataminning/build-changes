import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cil extends cia {
   private static final int bZ = 5;
   @Nullable
   private ib ca;
   private int cb;

   public cil(bpc<? extends cil> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwf(this));
      this.bR.a(0, new bxw<>(this, csj.a(new cqk(cqn.sj), csk.i), aty.AT, $$0 -> this.dM().Q() && !$$0.ce()));
      this.bR.a(0, new bxw<>(this, new cqk(cqn.qD), aty.AY, $$0 -> this.dM().P() && $$0.ce()));
      this.bR.a(1, new bxu(this));
      this.bR.a(1, new bvs<>(this, cgr.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bvs<>(this, cfr.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bvs<>(this, cgn.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bvs<>(this, cgm.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bvs<>(this, cgb.class, 15.0F, 0.5, 0.5));
      this.bR.a(1, new bvs<>(this, cfw.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bvs<>(this, cgq.class, 10.0F, 0.5, 0.5));
      this.bR.a(1, new bxe(this, 0.5));
      this.bR.a(1, new bwu(this));
      this.bR.a(2, new cil.a(this, 2.0, 0.35));
      this.bR.a(4, new bwz(this, 0.35));
      this.bR.a(8, new bxy(this, 0.35));
      this.bR.a(9, new bwo(this, cis.class, 3.0F, 1.0F));
      this.bR.a(10, new bwt(this, bpq.class, 8.0F));
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      return null;
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if (!$$2.a(cqn.tH) && this.bA() && !this.go() && !this.o_()) {
         if ($$1 == bnb.a) {
            $$0.a(aui.S);
         }

         if (this.gp().isEmpty()) {
            return bnc.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return bnc.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gu() {
      if (this.dM().I().b(clh.d)) {
         this.gx();
      } else {
         cij.g[] $$0 = (cij.g[])cij.b.get(1);
         cij.g[] $$1 = (cij.g[])cij.b.get(2);
         if ($$0 != null && $$1 != null) {
            cvy $$2 = this.gp();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cij.g $$4 = $$1[$$3];
            cvx $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gx() {
      cvy $$0 = this.gp();

      for (Pair<cij.g[], Integer> $$1 : cij.d) {
         cij.g[] $$2 = (cij.g[])$$1.getLeft();
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
   protected void b(cvx $$0) {
      if ($$0.t()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bpe(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected atx v() {
      return this.go() ? aty.AZ : aty.AR;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.AW;
   }

   @Override
   protected atx n_() {
      return aty.AS;
   }

   @Override
   protected atx c(cqk $$0) {
      return $$0.a(cqn.qD) ? aty.AU : aty.AV;
   }

   @Override
   protected atx w(boolean $$0) {
      return $$0 ? aty.Ba : aty.AX;
   }

   @Override
   public atx gr() {
      return aty.Ba;
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

   class a extends bwl {
      final cil a;
      final double b;
      final double c;

      a(cil $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cil.this.bQ.n();
      }

      @Override
      public boolean a() {
         ib $$0 = this.a.gA();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ib $$0 = this.a.gA();
         if ($$0 != null && cil.this.bQ.l()) {
            if (this.a($$0, 10.0)) {
               epr $$1 = new epr((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               epr $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cil.this.bQ.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cil.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ib $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
