import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class cbp extends cbe {
   private static final int bV = 5;
   @Nullable
   private gw bW;
   private int bX;

   public cbp(biw<? extends cbp> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpx(this));
      this.bO.a(0, new bro<>(this, clg.a(new cjh(cjk.rv), clh.i), apf.zn, $$0 -> this.dL().O() && !$$0.cd()));
      this.bO.a(0, new bro<>(this, new cjh(cjk.pQ), apf.zs, $$0 -> this.dL().N() && $$0.cd()));
      this.bO.a(1, new brm(this));
      this.bO.a(1, new bpk<>(this, cad.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpk<>(this, bzd.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpk<>(this, bzz.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpk<>(this, bzy.class, 8.0F, 0.5, 0.5));
      this.bO.a(1, new bpk<>(this, bzn.class, 15.0F, 0.5, 0.5));
      this.bO.a(1, new bpk<>(this, bzi.class, 12.0F, 0.5, 0.5));
      this.bO.a(1, new bpk<>(this, cac.class, 10.0F, 0.5, 0.5));
      this.bO.a(1, new bqw(this, 0.5));
      this.bO.a(1, new bqm(this));
      this.bO.a(2, new cbp.a(this, 2.0, 0.35));
      this.bO.a(4, new bqr(this, 0.35));
      this.bO.a(8, new brq(this, 0.35));
      this.bO.a(9, new bqg(this, cbw.class, 3.0F, 1.0F));
      this.bO.a(10, new bql(this, bjk.class, 8.0F));
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      return null;
   }

   @Override
   public boolean gg() {
      return false;
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if (!$$2.a(cjk.sR) && this.bv() && !this.ge() && !this.m_()) {
         if ($$1 == bgz.a) {
            $$0.a(app.S);
         }

         if (this.gf().isEmpty()) {
            return bha.a(this.dL().B);
         } else {
            if (!this.dL().B) {
               this.f($$0);
               this.a($$0, this.N_(), 1);
            }

            return bha.a(this.dL().B);
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gk() {
      if (this.dL().G().b(ceg.c)) {
         this.gn();
      } else {
         cbn.g[] $$0 = (cbn.g[])cbn.b.get(1);
         cbn.g[] $$1 = (cbn.g[])cbn.b.get(2);
         if ($$0 != null && $$1 != null) {
            cow $$2 = this.gf();
            this.a($$2, $$0, 5);
            int $$3 = this.ag.a($$1.length);
            cbn.g $$4 = $$1[$$3];
            cov $$5 = $$4.a(this, this.ag);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gn() {
      cow $$0 = this.gf();

      for (Pair<cbn.g[], Integer> $$1 : cbn.d) {
         cbn.g[] $$2 = (cbn.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.bX);
      if (this.bW != null) {
         $$0.a("WanderTarget", rl.a(this.bW));
      }
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.bX = $$0.h("DespawnDelay");
      }

      if ($$0.e("WanderTarget")) {
         this.bW = rl.b($$0.p("WanderTarget"));
      }

      this.c_(Math.max(0, this.h()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(cov $$0) {
      if ($$0.s()) {
         int $$1 = 3 + this.ag.a(4);
         this.dL().b(new biy(this.dL(), this.dq(), this.ds() + 0.5, this.dw(), $$1));
      }
   }

   @Override
   protected ape w() {
      return this.ge() ? apf.zt : apf.zl;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.zq;
   }

   @Override
   protected ape l_() {
      return apf.zm;
   }

   @Override
   protected ape c(cjh $$0) {
      return $$0.a(cjk.pQ) ? apf.zo : apf.zp;
   }

   @Override
   protected ape w(boolean $$0) {
      return $$0 ? apf.zu : apf.zr;
   }

   @Override
   public ape gh() {
      return apf.zu;
   }

   public void u(int $$0) {
      this.bX = $$0;
   }

   public int gm() {
      return this.bX;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B) {
         this.go();
      }
   }

   private void go() {
      if (this.bX > 0 && !this.ge() && --this.bX == 0) {
         this.ak();
      }
   }

   public void i(@Nullable gw $$0) {
      this.bW = $$0;
   }

   @Nullable
   gw gq() {
      return this.bW;
   }

   class a extends bqd {
      final cbp a;
      final double b;
      final double c;

      a(cbp $$0, double $$1, double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(bqd.a.a));
      }

      @Override
      public void d() {
         this.a.i(null);
         cbp.this.bN.n();
      }

      @Override
      public boolean a() {
         gw $$0 = this.a.gq();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void e() {
         gw $$0 = this.a.gq();
         if ($$0 != null && cbp.this.bN.l()) {
            if (this.a($$0, 10.0)) {
               ehp $$1 = new ehp((double)$$0.u() - this.a.dq(), (double)$$0.v() - this.a.ds(), (double)$$0.w() - this.a.dw()).d();
               ehp $$2 = $$1.a(10.0).b(this.a.dq(), this.a.ds(), this.a.dw());
               cbp.this.bN.a($$2.c, $$2.d, $$2.e, this.c);
            } else {
               cbp.this.bN.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(gw $$0, double $$1) {
         return !$$0.a(this.a.dj(), $$1);
      }
   }
}
