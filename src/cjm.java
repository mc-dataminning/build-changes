import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cjm extends cjb {
   private static final int bZ = 5;
   @Nullable
   private ib ca;
   private int cb;

   public cjm(bqb<? extends cjm> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(0, new byw<>(this, cth.a(crm.sj, cti.g), aum.Bb, $$0 -> this.dM().R() && !$$0.ce()));
      this.bR.a(0, new byw<>(this, new crj(crm.qD), aum.Bg, $$0 -> this.dM().Q() && $$0.ce()));
      this.bR.a(1, new byu(this));
      this.bR.a(1, new bws<>(this, chs.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bws<>(this, cgs.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bws<>(this, cho.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bws<>(this, chn.class, 8.0F, 0.5, 0.5));
      this.bR.a(1, new bws<>(this, chc.class, 15.0F, 0.5, 0.5));
      this.bR.a(1, new bws<>(this, cgx.class, 12.0F, 0.5, 0.5));
      this.bR.a(1, new bws<>(this, chr.class, 10.0F, 0.5, 0.5));
      this.bR.a(1, new bye(this, 0.5));
      this.bR.a(1, new bxu(this));
      this.bR.a(2, new cjm.a(this, 2.0, 0.35));
      this.bR.a(4, new bxz(this, 0.35));
      this.bR.a(8, new byy(this, 0.35));
      this.bR.a(9, new bxo(this, cjt.class, 3.0F, 1.0F));
      this.bR.a(10, new bxt(this, bqq.class, 8.0F));
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return null;
   }

   @Override
   public boolean gq() {
      return false;
   }

   @Override
   public boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (!$$2.a(crm.tI) && this.bA() && !this.go() && !this.p_()) {
         if ($$1 == bnz.a) {
            $$0.a(auw.S);
         }

         if (this.gp().isEmpty()) {
            return boa.a(this.dM().B);
         } else {
            if (!this.dM().B) {
               this.f($$0);
               this.a($$0, this.O_(), 1);
            }

            return boa.a(this.dM().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gu() {
      if (this.dM().J().b(cmi.d)) {
         this.gx();
      } else {
         cjk.g[] $$0 = (cjk.g[])cjk.b.get(1);
         cjk.g[] $$1 = (cjk.g[])cjk.b.get(2);
         if ($$0 != null && $$1 != null) {
            cxw $$2 = this.gp();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cjk.g $$4 = $$1[$$3];
            cxv $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gx() {
      cxw $$0 = this.gp();

      for (Pair<cjk.g[], Integer> $$1 : cjk.d) {
         cjk.g[] $$2 = (cjk.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cb);
      if (this.ca != null) {
         $$0.a("wander_target", ub.a(this.ca));
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cb = $$0.h("DespawnDelay");
      }

      ub.a($$0, "wander_target").ifPresent($$0x -> this.ca = $$0x);
      this.c_(Math.max(0, this.g()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cxv $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ag.a(4);
         this.dM().b(new bqe(this.dM(), this.dr(), this.dt() + 0.5, this.dx(), $$1));
      }
   }

   @Override
   protected aul v() {
      return this.go() ? aum.Bh : aum.AZ;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.Be;
   }

   @Override
   protected aul o_() {
      return aum.Ba;
   }

   @Override
   protected aul c(crj $$0) {
      return $$0.a(crm.qD) ? aum.Bc : aum.Bd;
   }

   @Override
   protected aul w(boolean $$0) {
      return $$0 ? aum.Bi : aum.Bf;
   }

   @Override
   public aul gr() {
      return aum.Bi;
   }

   public void v(int $$0) {
      this.cb = $$0;
   }

   public int gw() {
      return this.cb;
   }

   @Override
   public void n_() {
      super.n_();
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

   class a extends bxl {
      final cjm a;
      final double b;
      final double c;

      a(cjm $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cjm.this.bQ.n();
      }

      @Override
      public boolean a() {
         ib $$0 = this.a.gA();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         ib $$0 = this.a.gA();
         if ($$0 != null && cjm.this.bQ.l()) {
            if (this.a($$0, 10.0)) {
               esa $$1 = new esa((double)$$0.u() - this.a.dr(), (double)$$0.v() - this.a.dt(), (double)$$0.w() - this.a.dx()).d();
               esa $$2 = $$1.a(10.0).b(this.a.dr(), this.a.dt(), this.a.dx());
               cjm.this.bQ.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cjm.this.bQ.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ib $$0, double $$1) {
         return !$$0.a(this.a.dk(), $$1);
      }
   }
}
