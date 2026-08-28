import java.util.EnumSet;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class coq extends coe implements cyw.b {
   private static final int ca = 5;
   @Nullable
   private ji cb;
   private int cc;

   public coq(but<? extends coq> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.bS.a(0, new cca(this));
      this.bS.a(0, new cdr<>(this, cyp.a(cwu.ti, cyq.g), awa.Cm, $$0 -> this.dV().W() && !$$0.cp()));
      this.bS.a(0, new cdr<>(this, new cwq(cwu.rl), awa.Cr, $$0 -> this.dV().V() && $$0.cp()));
      this.bS.a(1, new cdp(this));
      this.bS.a(1, new cbn<>(this, cms.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbn<>(this, cls.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbn<>(this, cmo.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbn<>(this, cmn.class, 8.0F, 0.5, 0.5));
      this.bS.a(1, new cbn<>(this, cmc.class, 15.0F, 0.5, 0.5));
      this.bS.a(1, new cbn<>(this, clx.class, 12.0F, 0.5, 0.5));
      this.bS.a(1, new cbn<>(this, cmr.class, 10.0F, 0.5, 0.5));
      this.bS.a(1, new ccz(this, 0.5));
      this.bS.a(1, new ccp(this));
      this.bS.a(2, new coq.a(this, 2.0, 0.35));
      this.bS.a(4, new ccu(this, 0.35));
      this.bS.a(8, new cdt(this, 0.35));
      this.bS.a(9, new ccj(this, coy.class, 3.0F, 1.0F));
      this.bS.a(10, new cco(this, bvk.class, 8.0F));
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      return null;
   }

   @Override
   public boolean gv() {
      return false;
   }

   @Override
   public bsl b(coy $$0, bsk $$1) {
      cwq $$2 = $$0.b($$1);
      if (!$$2.a(cwu.uG) && this.bL() && !this.gt() && !this.e_()) {
         if ($$1 == bsk.a) {
            $$0.a(awk.S);
         }

         if (!this.dV().C) {
            if (this.gu().isEmpty()) {
               return bsl.c;
            }

            this.a($$0);
            this.a($$0, this.p_(), 1);
         }

         return bsl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected void gz() {
      if (this.dV().K().b(crw.b)) {
         this.gC();
      } else {
         coo.g[] $$0 = (coo.g[])coo.b.get(1);
         coo.g[] $$1 = (coo.g[])coo.b.get(2);
         if ($$0 != null && $$1 != null) {
            dfh $$2 = this.gu();
            this.a($$2, $$0, 5);
            int $$3 = this.ae.a($$1.length);
            coo.g $$4 = $$1[$$3];
            dfg $$5 = $$4.a(this, this.ae);
            if ($$5 != null) {
               $$2.add($$5);
            }
         }
      }
   }

   private void gC() {
      dfh $$0 = this.gu();

      for (Pair<coo.g[], Integer> $$1 : coo.d) {
         coo.g[] $$2 = (coo.g[])$$1.getLeft();
         this.a($$0, $$2, (Integer)$$1.getRight());
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("DespawnDelay", this.cc);
      if (this.cb != null) {
         $$0.a("wander_target", uf.a(this.cb));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("DespawnDelay", 99)) {
         this.cc = $$0.h("DespawnDelay");
      }

      uf.a($$0, "wander_target").ifPresent($$0x -> this.cb = $$0x);
      this.c_(Math.max(0, this.Y_()));
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected void b(dfg $$0) {
      if ($$0.u()) {
         int $$1 = 3 + this.ae.a(4);
         this.dV().b(new buy(this.dV(), this.dA(), this.dC() + 0.5, this.dG(), $$1));
      }
   }

   @Override
   protected avz u() {
      return this.gt() ? awa.Cs : awa.Ck;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.Cp;
   }

   @Override
   protected avz o_() {
      return awa.Cl;
   }

   @Override
   public avz j(cwq $$0) {
      return $$0.a(cwu.rl) ? awa.Cn : awa.Co;
   }

   @Override
   protected avz x(boolean $$0) {
      return $$0 ? awa.Ct : awa.Cq;
   }

   @Override
   public avz gw() {
      return awa.Ct;
   }

   public void t(int $$0) {
      this.cc = $$0;
   }

   public int gB() {
      return this.cc;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dV().C) {
         this.gD();
      }
   }

   private void gD() {
      if (this.cc > 0 && !this.gt() && --this.cc == 0) {
         this.at();
      }
   }

   public void h(@Nullable ji $$0) {
      this.cb = $$0;
   }

   @Nullable
   ji gF() {
      return this.cb;
   }

   class a extends ccg {
      final coq a;
      final double b;
      final double c;

      a(final coq $$0, final double $$1, final double $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public void e() {
         this.a.h(null);
         coq.this.bR.m();
      }

      @Override
      public boolean b() {
         ji $$0 = this.a.gF();
         return $$0 != null && this.a($$0, this.b);
      }

      @Override
      public void a() {
         ji $$0 = this.a.gF();
         if ($$0 != null && coq.this.bR.k()) {
            if (this.a($$0, 10.0)) {
               fbb $$1 = new fbb((double)$$0.u() - this.a.dA(), (double)$$0.v() - this.a.dC(), (double)$$0.w() - this.a.dG()).d();
               fbb $$2 = $$1.c(10.0).b(this.a.dA(), this.a.dC(), this.a.dG());
               coq.this.bR.a($$2.d, $$2.e, $$2.f, this.c);
            } else {
               coq.this.bR.a((double)$$0.u(), (double)$$0.v(), (double)$$0.w(), this.c);
            }
         }
      }

      private boolean a(ji $$0, double $$1) {
         return !$$0.a(this.a.dt(), $$1);
      }
   }
}
